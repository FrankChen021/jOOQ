/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * Apache-2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq;

import java.util.Collection;
import java.util.function.Function;

import org.jetbrains.annotations.NotNull;

/**
 * This type is used for the {@link Insert}'s DSL API.
 * <p>
 * Example: <pre><code>
 * using(configuration)
 *       .insertInto(table, fields)
 *       .values(fields)
 *       .values(fields)
 *       .onDuplicateKeyUpdate()
 *       .set(field1, value1)
 *       .set(field2, value2)
 *       .execute();
 * </code></pre>
 *
 * @author Lukas Eder
 */
public interface InsertValuesStepN<R extends Record> extends InsertOnDuplicateStep<R> {

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> values(Object... values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> values(Field<?>... values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> values(Collection<?> values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> values(RowN values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> values(Record values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     *
     * @see Rows#toRowArray(Function, Function)
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> valuesOfRows(RowN... values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     *
     * @see Rows#toRowList(Function, Function)
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> valuesOfRows(Collection<? extends RowN> values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     * <p>
     * <strong>Note</strong>: Irrespective of individual {@link Record#changed()}
     * flag values, all record values are copied to the <code>VALUES</code> clause
     * using {@link Record#intoArray()}, to match insert columns by position, not
     * by name. If you prefer omitting unchanged values and adding values by field
     * name rather than by index, use {@link InsertSetStep#set(Record...)} instead.
     * That syntax is available only if you omit the explicit insert columns list.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> valuesOfRecords(Record... values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     * <p>
     * <strong>Note</strong>: Irrespective of individual {@link Record#changed()}
     * flag values, all record values are copied to the <code>VALUES</code> clause
     * using {@link Record#intoArray()}, to match insert columns by position, not
     * by name. If you prefer omitting unchanged values and adding values by field
     * name rather than by index, use {@link InsertSetStep#set(Record...)} instead.
     * That syntax is available only if you omit the explicit insert columns list.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStepN<R> valuesOfRecords(Collection<? extends Record> values);

    /**
     * Use a <code>SELECT</code> statement as the source of values for the
     * <code>INSERT</code> statement
     * <p>
     * This variant of the <code>INSERT … SELECT</code> statement expects a
     * select returning exactly as many fields as specified previously in the
     * <code>INTO</code> clause:
     * {@link DSLContext#insertInto(Table)}
     */
    @NotNull @CheckReturnValue
    @Support
    InsertOnDuplicateStep<R> select(Select<? extends Record> select);
}
