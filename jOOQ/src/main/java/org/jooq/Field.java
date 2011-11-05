/**
 * Copyright (c) 2009-2011, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */

package org.jooq;

import java.util.Collection;
import java.util.Map;

import org.jooq.impl.Factory;

/**
 * A field used in tables and conditions
 *
 * @param <T> The field type
 * @author Lukas Eder
 */
public interface Field<T> extends NamedTypeProviderQueryPart<T>, AliasProvider<Field<T>> {

    // ------------------------------------------------------------------------
    // API
    // ------------------------------------------------------------------------

    /**
     * The name of the field.
     * <p>
     * The name is any of these:
     * <ul>
     * <li>The formal name of the field, if it is a <i>physical table/view field</i></li>
     * <li>The alias of an <i>aliased field</i></li>
     * <li>A generated / unspecified value for any other <i>expression</i></li>
     * </ul>
     */
    @Override
    String getName();

    /**
     * The Java type of the field.
     */
    @Override
    Class<? extends T> getType();

    /**
     * Create an alias for this field
     *
     * @param alias The alias name
     * @return The field alias
     */
    @Override
    Field<T> as(String alias);

    /**
     * Watch out! This is {@link Object#equals(Object)}, not a jOOQ feature! :-)
     */
    @Override
    boolean equals(Object other);

    /**
     * Whether this field represents a <code>null</code> literal.
     * <p>
     * This method is for JOOQ INTERNAL USE only!
     * <p>
     * This method was added to be able to recognise <code>null</code> literals
     * within jOOQ and handle them specially, as some SQL dialects have a rather
     * un-intuitive way of handling <code>null</code> values.
     */
    boolean isNullLiteral();

    // ------------------------------------------------------------------------
    // Type casts
    // ------------------------------------------------------------------------

    /**
     * Cast this field to the type of another field.
     * <p>
     * This results in the same as casting this field to
     * {@link DataType#getCastTypeName()}
     *
     * @param <Z> The generic type of the cast field
     * @param field The field whose type is used for the cast
     * @return The cast field
     * @see #cast(DataType)
     */
    <Z> Field<Z> cast(Field<Z> field);

    /**
     * Cast this field to a dialect-specific data type.
     *
     * @param <Z> The generic type of the cast field
     * @param type
     */
    <Z> Field<Z> cast(DataType<Z> type);

    /**
     * Cast this field to another type
     * <p>
     * The actual cast may not be accurate as the {@link DataType} has to be
     * "guessed" from the jOOQ-configured data types. Use
     * {@link #cast(DataType)} for more accurate casts.
     *
     * @param <Z> The generic type of the cast field
     * @param type The type that is used for the cast
     * @return The cast field
     * @see #cast(DataType)
     */
    <Z> Field<Z> cast(Class<? extends Z> type);

    // ------------------------------------------------------------------------
    // Conversion of field into a sort field
    // ------------------------------------------------------------------------

    /**
     * Create an ascending sort field from this field
     *
     * @return This field as an ascending sort field
     */
    SortField<T> asc();

    /**
     * Create a descending sort field from this field
     *
     * @return This field as a descending sort field
     */
    SortField<T> desc();

    /**
     * Create a sort field of the form <code><pre>
     * CASE [this] WHEN [sortList.get(0)] THEN 0
     *             WHEN [sortList.get(1)] THEN 1
     *             ...
     *             WHEN [sortList.get(n)] THEN n
     *                                    ELSE null
     * END ASC
     * </pre></code>
     * <p>
     * Note: You can use this in combination with {@link SortField#nullsFirst()}
     * or {@link SortField#nullsLast()} to specify whether the default should
     * have highest or lowest priority.
     *
     * @param sortList The list containing sort value preferences
     * @return The sort field
     */
    SortField<Integer> sortAsc(Collection<T> sortList);

    /**
     * Create a sort field of the form <code><pre>
     * CASE [this] WHEN [sortList[0]] THEN 0
     *             WHEN [sortList[1]] THEN 1
     *             ...
     *             WHEN [sortList[n]] THEN n
     *                                ELSE null
     * END ASC
     * </pre></code>
     * <p>
     * Note: You can use this in combination with {@link SortField#nullsFirst()}
     * or {@link SortField#nullsLast()} to specify whether the default should
     * have highest or lowest priority.
     *
     * @param sortList The list containing sort value preferences
     * @return The sort field
     */
    SortField<Integer> sortAsc(T... sortList);

    /**
     * Create a sort field of the form <code><pre>
     * CASE [this] WHEN [sortList.get(0)] THEN 0
     *             WHEN [sortList.get(1)] THEN 1
     *             ...
     *             WHEN [sortList.get(n)] THEN n
     *                                    ELSE null
     * END DESC
     * </pre></code>
     * <p>
     * Note: You can use this in combination with {@link SortField#nullsFirst()}
     * or {@link SortField#nullsLast()} to specify whether the default should
     * have highest or lowest priority.
     *
     * @param sortList The list containing sort value preferences
     * @return The sort field
     */
    SortField<Integer> sortDesc(Collection<T> sortList);

    /**
     * Create a sort field of the form <code><pre>
     * CASE [this] WHEN [sortList[0]] THEN 0
     *             WHEN [sortList[1]] THEN 1
     *             ...
     *             WHEN [sortList[n]] THEN n
     *                                    ELSE null
     * END DESC
     * </pre></code>
     * <p>
     * Note: You can use this in combination with {@link SortField#nullsFirst()}
     * or {@link SortField#nullsLast()} to specify whether the default should
     * have highest or lowest priority.
     *
     * @param sortList The list containing sort value preferences
     * @return The sort field
     */
    SortField<Integer> sortDesc(T... sortList);

    /**
     * Create a sort field of the form (in pseudo code)<code><pre>
     * CASE [this] WHEN [sortMap.key(0)] THEN sortMap.value(0)
     *             WHEN [sortMap.key(1)] THEN sortMap.value(1)
     *             ...
     *             WHEN [sortMap.key(n)] THEN sortMap.value(n)
     *                                   ELSE null
     * END DESC
     * </pre></code>
     * <p>
     * Note: You can use this in combination with {@link SortField#nullsFirst()}
     * or {@link SortField#nullsLast()} to specify whether the default should
     * have highest or lowest priority.
     *
     * @param sortMap The list containing sort value preferences
     * @return The sort field
     */
    <Z> SortField<Z> sort(Map<T, Z> sortMap);

    // ------------------------------------------------------------------------
    // Arithmetic operations
    // ------------------------------------------------------------------------

    /**
     * Negate this field to get its negative value.
     * <p>
     * This renders the same on all dialects:
     * <code><pre>-[this]</pre></code>
     */
    Field<T> neg();

    /**
     * An arithmetic expression adding this to value.
     * <p>
     * <ul>
     * <li>If this is a numeric field, then the value is added arithmetically</li>
     * <li>If this is a date time field, then [value] days are added to this date</li>
     * </ul>
     */
    Field<T> add(Number value);

    /**
     * An arithmetic expression adding this to value
     */
    Field<T> add(Field<? extends Number> value);

    /**
     * An arithmetic expression subtracting value from this.
     * <p>
     * <ul>
     * <li>If this is a numeric field, then the value is subtracted
     * arithmetically</li>
     * <li>If this is a date time field, then [value] days are subtracted to
     * this date</li>
     * </ul>
     */
    Field<T> sub(Number value);

    /**
     * An arithmetic expression subtracting value from this
     */
    Field<T> sub(Field<? extends Number> value);

    /**
     * An arithmetic expression multiplying this with value
     */
    Field<T> mul(Number value);

    /**
     * An arithmetic expression multiplying this with value
     */
    Field<T> mul(Field<? extends Number> value);

    /**
     * An arithmetic expression dividing this by value
     */
    Field<T> div(Number value);

    /**
     * An arithmetic expression dividing this by value
     */
    Field<T> div(Field<? extends Number> value);

    /**
     * An arithmetic expression getting the modulo of this divided by value
     * <p>
     * This renders the modulo operation where available:
     * <code><pre>[this] % [value]</pre></code>
     * ... or the modulo function elsewhere:
     * <code><pre>mod([this], [value])</pre></code>
     */
    Field<T> mod(Number value);

    /**
     * An arithmetic expression getting the modulo of this divided by value
     * <p>
     * This renders the modulo operation where available:
     * <code><pre>[this] % [value]</pre></code>
     * ... or the modulo function elsewhere:
     * <code><pre>mod([this], [value])</pre></code>
     */
    Field<T> mod(Field<? extends Number> value);

    // ------------------------------------------------------------------------
    // Bitwise operations
    // ------------------------------------------------------------------------

    /**
     * The MySQL <code>BIT_COUNT(field)</code> function, counting the number of
     * bits that are set in this number.
     * <p>
     * This function is simulated in most other databases like this (for a
     * TINYINT field): <code><pre>
     * (my_field &   1) +
     * (my_field &   2) >> 1 +
     * (my_field &   4) >> 2 +
     * (my_field &   8) >> 3 +
     * (my_field &  16) >> 4 +
     *  ...
     * (my_field & 128) >> 7
     * </pre></code>
     * <p>
     * More efficient algorithms are very welcome
     */
    Field<Integer> bitCount();

    /**
     * The bitwise not operator.
     * <p>
     * Most dialects natively support this using <code>~[this]</code>. jOOQ
     * simulates this operator in some dialects using <code>-[this] - 1</code>
     */
    Field<T> bitNot();

    /**
     * The bitwise and operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the and operation where available:
     * <code><pre>[this] & [value]</pre></code>
     * ... or the and function elsewhere:
     * <code><pre>bitand([this], [value])</pre></code>
     */
    Field<T> bitAnd(Number value);

    /**
     * The bitwise and operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the and operation where available:
     * <code><pre>[this] & [value]</pre></code>
     * ... or the and function elsewhere:
     * <code><pre>bitand([this], [value])</pre></code>
     */
    Field<T> bitAnd(Field<? extends Number> value);

    /**
     * The bitwise not and operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the not and operation where available:
     * <code><pre>~([this] & [value])</pre></code>
     * ... or the not and function elsewhere:
     * <code><pre>bitnot(bitand([this], [value]))</pre></code>
     *
     * @see #bitNot()
     */
    Field<T> bitNand(Number value);

    /**
     * The bitwise not and operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the not and operation where available:
     * <code><pre>~([this] & [value])</pre></code>
     * ... or the not and function elsewhere:
     * <code><pre>bitnot(bitand([this], [value]))</pre></code>
     *
     * @see #bitNot()
     */
    Field<T> bitNand(Field<? extends Number> value);

    /**
     * The bitwise or operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>[this] | [value]</pre></code>
     * ... or the or function elsewhere:
     * <code><pre>bitor([this], [value])</pre></code>
     */
    Field<T> bitOr(Number value);

    /**
     * The bitwise or operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>[this] | [value]</pre></code>
     * ... or the or function elsewhere:
     * <code><pre>bitor([this], [value])</pre></code>
     */
    Field<T> bitOr(Field<? extends Number> value);

    /**
     * The bitwise not or operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the not or operation where available:
     * <code><pre>~([this] | [value])</pre></code>
     * ... or the not or function elsewhere:
     * <code><pre>bitnot(bitor([this], [value]))</pre></code>
     *
     * @see #bitNot()
     */
    Field<T> bitNor(Number value);

    /**
     * The bitwise not or operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the not or operation where available:
     * <code><pre>~([this] | [value])</pre></code>
     * ... or the not or function elsewhere:
     * <code><pre>bitnot(bitor([this], [value]))</pre></code>
     *
     * @see #bitNot()
     */
    Field<T> bitNor(Field<? extends Number> value);

    /**
     * The bitwise xor operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>[this] ^ [value]</pre></code>
     * ... or the xor function elsewhere:
     * <code><pre>bitxor([this], [value])</pre></code>
     */
    Field<T> bitXor(Number value);

    /**
     * The bitwise xor operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>[this] ^ [value]</pre></code>
     * ... or the xor function elsewhere:
     * <code><pre>bitxor([this], [value])</pre></code>
     */
    Field<T> bitXor(Field<? extends Number> value);

    /**
     * The bitwise not xor operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>~([this] ^ [value])</pre></code>
     * ... or the not xor function elsewhere:
     * <code><pre>bitnot(bitxor([this], [value]))</pre></code>
     */
    Field<T> bitXNor(Number value);

    /**
     * The bitwise not xor operator.
     * <p>
     * This is not supported by Derby, Ingres
     * <p>
     * This renders the or operation where available:
     * <code><pre>~([this] ^ [value])</pre></code>
     * ... or the not xor function elsewhere:
     * <code><pre>bitnot(bitxor([this], [value]))</pre></code>
     */
    Field<T> bitXNor(Field<? extends Number> value);

    /**
     * The bitwise left shift operator.
     * <p>
     * Some dialects natively support this using <code>[this] << [value]</code>.
     * jOOQ simulates this operator in some dialects using
     * <code>[this] * power(2, [value])</code>, where power might also be simulated.
     *
     * @see Factory#power(Field, Number)
     */
    Field<T> shl(Number value);

    /**
     * The bitwise left shift operator.
     * <p>
     * Some dialects natively support this using <code>[this] << [value]</code>.
     * jOOQ simulates this operator in some dialects using
     * <code>[this] * power(2, [value])</code>, where power might also be simulated.
     *
     * @see Factory#power(Field, Field)
     */
    Field<T> shl(Field<? extends Number> value);

    /**
     * The bitwise right shift operator.
     * <p>
     * Some dialects natively support this using <code>[this] >> [value]</code>.
     * jOOQ simulates this operator in some dialects using
     * <code>[this] / power(2, [value])</code>, where power might also be simulated.
     *
     * @see Factory#power(Field, Number)
     */
    Field<T> shr(Number value);

    /**
     * The bitwise right shift operator.
     * <p>
     * Some dialects natively support this using <code>[this] >> [value]</code>.
     * jOOQ simulates this operator in some dialects using
     * <code>[this] / power(2, [value])</code>, where power might also be simulated.
     *
     * @see Factory#power(Field, Field)
     */
    Field<T> shr(Field<? extends Number> value);

    /**
     * Get the extract(field, datePart) function
     * <p>
     * This translates into any dialect
     */
    Field<Integer> extract(DatePart datePart);

    // ------------------------------------------------------------------------
    // General functions created from this field
    // ------------------------------------------------------------------------

    /**
     * Find the greatest among all values
     * <p>
     * This function has no equivalent in Adaptive Server, Derby, SQL Server and
     * Sybase SQL Anywhere. Its current simulation implementation has
     * <code>O(2^n)</code> complexity and should be avoided for
     * <code>n &gt; 5</code>! Better implementation suggestions are very
     * welcome.
     *
     * @see #greatest(Field...)
     */
    Field<T> greatest(T... others);

    /**
     * Find the greatest among all values
     * <p>
     * This function has no equivalent in Adaptive Server, Derby, SQL Server and
     * Sybase SQL Anywhere. Its current simulation implementation has
     * <code>O(2^n)</code> complexity and should be avoided for
     * <code>n &gt; 5</code>! Better implementation suggestions are very
     * welcome.
     */
    Field<T> greatest(Field<?>... others);

    /**
     * Find the least among all values
     * <p>
     * This function has no equivalent in Adaptive Server, Derby, SQL Server and
     * Sybase SQL Anywhere. Its current simulation implementation has
     * <code>O(2^n)</code> complexity and should be avoided for
     * <code>n &gt; 5</code>! Better implementation suggestions are very
     * welcome.
     *
     * @see #least(Field...)
     */
    Field<T> least(T... others);

    /**
     * Find the least among all values
     * <p>
     * This function has no equivalent in Adaptive Server, Derby, SQL Server and
     * Sybase SQL Anywhere. Its current simulation implementation has
     * <code>O(2^n)</code> complexity and should be avoided for
     * <code>n &gt; 5</code>! Better implementation suggestions are very
     * welcome.
     */
    Field<T> least(Field<?>... others);

    /**
     * Gets the Oracle-style
     * <code>DECODE(expression, search, result[, search , result]... [, default])</code>
     * function
     *
     * @see #decode(Field, Field, Field[])
     */
    <Z> Field<Z> decode(T search, Z result);

    /**
     * Gets the Oracle-style
     * <code>DECODE(expression, search, result[, search , result]... [, default])</code>
     * function
     *
     * @see #decode(Field, Field, Field[])
     */
    <Z> Field<Z> decode(T search, Z result, Object... more);

    /**
     * Gets the Oracle-style
     * <code>DECODE(expression, search, result[, search , result]... [, default])</code>
     * function
     *
     * @see #decode(Field, Field, Field[])
     */
    <Z> Field<Z> decode(Field<T> search, Field<Z> result);

    /**
     * Gets the Oracle-style
     * <code>DECODE(expression, search, result[, search , result]... [, default])</code>
     * function
     * <p>
     * Returns the dialect's equivalent to DECODE:
     * <ul>
     * <li>Oracle <a
     * href="http://www.techonthenet.com/oracle/functions/decode.php">DECODE</a></li>
     * </ul>
     * <p>
     * Other dialects: <code><pre>
     * CASE WHEN [this = search] THEN [result],
     *     [WHEN more...         THEN more...]
     *     [ELSE more...]
     * END
     * </pre></code>
     *
     * @param search the mandatory first search parameter
     * @param result the mandatory first result parameter
     * @param more the optional parameters. If <code>more.length</code> is even,
     *            then it is assumed that it contains more search/result pairs.
     *            If <code>more.length</code> is odd, then it is assumed that it
     *            contains more search/result pairs plus a default at the end.
     */
    <Z> Field<Z> decode(Field<T> search, Field<Z> result, Field<?>... more);

    /**
     * Gets the Oracle-style <code>COALESCE(expr1, expr2, ... , exprn)</code>
     * function
     *
     * @see #coalesce(Field, Field...)
     */
    Field<T> coalesce(T option, T... options);

    /**
     * Gets the Oracle-style <code>COALESCE(expr1, expr2, ... , exprn)</code>
     * function
     * <p>
     * Returns the dialect's equivalent to COALESCE:
     * <ul>
     * <li>Oracle <a
     * href="http://www.techonthenet.com/oracle/functions/coalesce.php">COALESCE</a>
     * </li>
     * </ul>
     */
    Field<T> coalesce(Field<T> option, Field<?>... options);

    // ------------------------------------------------------------------------
    // Conditions created from this field
    // ------------------------------------------------------------------------

    /**
     * <code>this is null</code>
     */
    Condition isNull();

    /**
     * <code>this is not null</code>
     */
    Condition isNotNull();

    /**
     * <code>lcase(this) in ("1", "y", "yes", "true", "on", "enabled")</code>
     */
    Condition isTrue();

    /**
     * <code>lcase(this) in ("0", "n", "no", "false", "off", "disabled")</code>
     */
    Condition isFalse();

    /**
     * <code>this like value</code>
     */
    Condition like(Field<T> value);

    /**
     * <code>this like value</code>
     */
    Condition like(T value);

    /**
     * <code>this not like value</code>
     */
    Condition notLike(Field<T> value);

    /**
     * <code>this not like value</code>
     */
    Condition notLike(T value);

    /**
     * <code>this in (values...)</code>
     */
    Condition in(Collection<T> values);

    /**
     * <code>this in (values...)</code>
     */
    Condition in(T... values);

    /**
     * <code>this in (values...)</code>
     */
    Condition in(Field<?>... values);

    /**
     * <code>this in (select...)</code>
     */
    Condition in(Select<?> query);

    /**
     * <code>this not in (values...)</code>
     */
    Condition notIn(Collection<T> values);

    /**
     * <code>this not in (values...)</code>
     */
    Condition notIn(T... values);

    /**
     * <code>this not in (values...)</code>
     */
    Condition notIn(Field<?>... values);

    /**
     * <code>this not in (select...)</code>
     */
    Condition notIn(Select<?> query);

    /**
     * <code>this between minValue and maxValue</code>
     */
    Condition between(T minValue, T maxValue);

    /**
     * <code>this between minValue and maxValue</code>
     */
    Condition between(Field<T> minValue, Field<T> maxValue);

    /**
     * <code>this = value</code>
     */
    Condition equal(T value);

    /**
     * <code>this = field</code>
     */
    Condition equal(Field<T> field);

    /**
     * <code>this = (Select<?> ...)</code>
     */
    Condition equal(Select<?> query);

    /**
     * <code>this = any (Select<?> ...)</code>
     */
    Condition equalAny(Select<?> query);

    /**
     * <code>this = some (Select<?> ...)</code>
     */
    Condition equalSome(Select<?> query);

    /**
     * <code>this = all (Select<?> ...)</code>
     */
    Condition equalAll(Select<?> query);

    /**
     * <code>this != value</code>
     */
    Condition notEqual(T value);

    /**
     * <code>this != field</code>
     */
    Condition notEqual(Field<T> field);

    /**
     * <code>this != (Select<?> ...)</code>
     */
    Condition notEqual(Select<?> query);

    /**
     * <code>this != any (Select<?> ...)</code>
     */
    Condition notEqualAny(Select<?> query);

    /**
     * <code>this != some (Select<?> ...)</code>
     */
    Condition notEqualSome(Select<?> query);

    /**
     * <code>this != all (Select<?> ...)</code>
     */
    Condition notEqualAll(Select<?> query);

    /**
     * <code>this < value</code>
     */
    Condition lessThan(T value);

    /**
     * <code>this < field</code>
     */
    Condition lessThan(Field<T> field);

    /**
     * <code>this < (Select<?> ...)</code>
     */
    Condition lessThan(Select<?> query);

    /**
     * <code>this < any (Select<?> ...)</code>
     */
    Condition lessThanAny(Select<?> query);

    /**
     * <code>this < some (Select<?> ...)</code>
     */
    Condition lessThanSome(Select<?> query);

    /**
     * <code>this < all (Select<?> ...)</code>
     */
    Condition lessThanAll(Select<?> query);

    /**
     * <code>this <= value</code>
     */
    Condition lessOrEqual(T value);

    /**
     * <code>this <= field</code>
     */
    Condition lessOrEqual(Field<T> field);

    /**
     * <code>this <= (Select<?> ...)</code>
     */
    Condition lessOrEqual(Select<?> query);

    /**
     * <code>this <= any (Select<?> ...)</code>
     */
    Condition lessOrEqualAny(Select<?> query);

    /**
     * <code>this <= some (Select<?> ...)</code>
     */
    Condition lessOrEqualSome(Select<?> query);

    /**
     * <code>this <= all (Select<?> ...)</code>
     */
    Condition lessOrEqualAll(Select<?> query);

    /**
     * <code>this > value</code>
     */
    Condition greaterThan(T value);

    /**
     * <code>this > field</code>
     */
    Condition greaterThan(Field<T> field);

    /**
     * <code>this > (Select<?> ...)</code>
     */
    Condition greaterThan(Select<?> query);

    /**
     * <code>this > any (Select<?> ...)</code>
     */
    Condition greaterThanAny(Select<?> query);

    /**
     * <code>this > some (Select<?> ...)</code>
     */
    Condition greaterThanSome(Select<?> query);

    /**
     * <code>this > all (Select<?> ...)</code>
     */
    Condition greaterThanAll(Select<?> query);

    /**
     * <code>this >= value</code>
     */
    Condition greaterOrEqual(T value);

    /**
     * <code>this >= field</code>
     */
    Condition greaterOrEqual(Field<T> field);

    /**
     * <code>this >= (Select<?> ...)</code>
     */
    Condition greaterOrEqual(Select<?> query);

    /**
     * <code>this >= any (Select<?> ...)</code>
     */
    Condition greaterOrEqualAny(Select<?> query);

    /**
     * <code>this >= some (Select<?> ...)</code>
     */
    Condition greaterOrEqualSome(Select<?> query);

    /**
     * <code>this >= all (Select<?> ...)</code>
     */
    Condition greaterOrEqualAll(Select<?> query);

}
