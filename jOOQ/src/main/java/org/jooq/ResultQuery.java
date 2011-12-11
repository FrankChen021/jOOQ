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

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;

import org.jooq.exception.DataAccessException;
import org.jooq.exception.DataTypeException;
import org.jooq.exception.MappingException;

/**
 * A query that can return results. Mostly, this is a {@link Select} query used
 * for a <code>SELECT</code> statement.
 * <p>
 * However, some RDBMS also allow for other constructs, such as Postgres'
 * <code>FETCH ALL IN {cursor-name}</code>. The easiest way to execute such a
 * query is by using <code><pre>
 * Factory create = new PostgresFactory(connection);
 * Result&lt;Record&gt; result = create.fetch("FETCH ALL IN \"&lt;unnamed cursor 1&gt;\"");
 * </pre></code> Another example (for SQLite): <code><pre>
 * Result&lt;Record&gt; result = create.fetch("pragma table_info('my_table')");
 * </pre></code>
 *
 * @author Lukas Eder
 */
public interface ResultQuery<R extends Record> extends Query {

    /**
     * Return the result generated by a previous call to execute();
     *
     * @return The result or <code>null</code> if no call to execute() was done
     *         previously.
     */
    Result<R> getResult();

    /**
     * Execute the query and return the generated result
     * <p>
     * This is the same as calling {@link #execute()} and then
     * {@link #getResult()}
     *
     * @return The result.
     * @throws DataAccessException if something went wrong executing the query
     */
    Result<R> fetch() throws DataAccessException;

    /**
     * Execute the query and return the generated result
     * <p>
     * The returned {@link Cursor} holds a reference to the executed
     * {@link PreparedStatement} and the associated {@link ResultSet}. Data can
     * be fetched (or iterated over) lazily, fetching records from the
     * {@link ResultSet} one by one.
     * <p>
     * Client code is responsible for closing the cursor after use.
     *
     * @return The resulting cursor.
     * @throws DataAccessException if something went wrong executing the query
     */
    Cursor<R> fetchLazy() throws DataAccessException;

    /**
     * Execute a query, possibly returning several result sets.
     * <p>
     * Example (Sybase ASE):
     * <p>
     * <code><pre>
     * String sql = "sp_help 'my_table'";</pre></code>
     *
     * @return The resulting records
     * @throws DataAccessException if something went wrong executing the query
     */
    List<Result<Record>> fetchMany() throws DataAccessException;

    /**
     * Execute the query and return all values for a field from the generated
     * result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(Field)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    <T> List<T> fetch(Field<T> field) throws DataAccessException;

    /**
     * Execute the query and return all values for a field from the generated
     * result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(Field)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     * @see Record#getValue(Field, Class)
     */
    <T> List<T> fetch(Field<?> field, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return all values for a field index from the
     * generated result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(int)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    List<?> fetch(int fieldIndex) throws DataAccessException;

    /**
     * Execute the query and return all values for a field index from the
     * generated result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(int, Class)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     * @see Record#getValue(int, Class)
     */
    <T> List<T> fetch(int fieldIndex, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return all values for a field name from the
     * generated result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(String)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    List<?> fetch(String fieldName) throws DataAccessException;

    /**
     * Execute the query and return all values for a field name from the
     * generated result.
     * <p>
     * This is the same as calling {@link #fetch()} and then
     * {@link Result#getValues(String, Class)}
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     * @see Record#getValue(String, Class)
     */
    <T> List<T> fetch(String fieldName, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return return at most one resulting value for a
     * field from the generated result.
     * <p>
     * This is the same as calling {@link #fetchOne()} and then
     * {@link Record#getValue(Field)}
     *
     * @return The resulting value or <code>null</code> if the query returned no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one value</li>
     *             </ul>
     */
    <T> T fetchOne(Field<T> field) throws DataAccessException;

    /**
     * Execute the query and return return at most one resulting value for a
     * field index from the generated result.
     * <p>
     * This is the same as calling {@link #fetchOne()} and then
     * {@link Record#getValue(int)}
     *
     * @return The resulting value or <code>null</code> if the query returned no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one value</li>
     *             </ul>
     */
    Object fetchOne(int fieldIndex) throws DataAccessException;

    /**
     * Execute the query and return return at most one resulting value for a
     * field index from the generated result.
     * <p>
     * This is the same as calling {@link #fetchOne()} and then
     * {@link Record#getValue(int, Class)}
     *
     * @return The resulting value or <code>null</code> if the query returned no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one value</li>
     *             </ul>
     */
    <T> T fetchOne(int fieldIndex, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return return at most one resulting value for a
     * field name from the generated result.
     * <p>
     * This is the same as calling {@link #fetchOne()} and then
     * {@link Record#getValue(int)}
     *
     * @return The resulting value or <code>null</code> if the query returned no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one value</li>
     *             </ul>
     */
    Object fetchOne(String fieldName) throws DataAccessException;

    /**
     * Execute the query and return return at most one resulting value for a
     * field name from the generated result.
     * <p>
     * This is the same as calling {@link #fetchOne()} and then
     * {@link Record#getValue(String, Class)}
     *
     * @return The resulting value or <code>null</code> if the query returned no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one value</li>
     *             </ul>
     */
    <T> T fetchOne(String fieldName, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return at most one resulting record.
     *
     * @return The resulting record or <code>null</code> if the query returns no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li>
     *             <li>if the query returned more than one record</li>
     *             </ul>
     */
    R fetchOne() throws DataAccessException;

    /**
     * Execute the query and return at most one resulting record.
     *
     * @return The first resulting record or <code>null</code> if the query
     *         returns no records.
     * @throws DataAccessException if something went wrong executing the query
     */
    R fetchAny() throws DataAccessException;

    /**
     * Execute the query and return the generated result as a list of name/value
     * maps.
     *
     * @return The result.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li>
     *             <li>if several fields share the same name</li>
     *             </ul>
     */
    List<Map<String, Object>> fetchMaps() throws DataAccessException;

    /**
     * Execute the query and return at most one resulting record as a name/value
     * map.
     *
     * @return The resulting record or <code>null</code> if the query returns no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li>
     *             <li>if the query returned more than one record</li>
     *             <li>if several fields share the same name</li>
     *             </ul>
     */
    Map<String, Object> fetchOneMap() throws DataAccessException;

    /**
     * Execute the query and return a {@link Map} with one of the result's
     * columns as key and the corresponding records as value.
     * <p>
     * An exception is thrown, if the key turns out to be non-unique in the
     * result set.
     *
     * @param <K> The key's generic field type
     * @param key The key field. Client code must assure that this field is
     *            unique in the result set.
     * @return A Map containing the results
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the key field returned two or more equal values from the
     *             result set.</li>
     *             </ul>
     */
    <K> Map<K, R> fetchMap(Field<K> key) throws DataAccessException;

    /**
     * Execute the query and return a {@link Map} with one of the result's
     * columns as key and another one of the result's columns as value
     * <p>
     * An exception is thrown, if the key turns out to be non-unique in the
     * result set.
     *
     * @param <K> The key's generic field type
     * @param <V> The value's generic field type
     * @param key The key field. Client code must assure that this field is
     *            unique in the result set.
     * @param value The value field
     * @return A Map containing the results
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the key field returned two or more equal values from the
     *             result set.</li>
     *             </ul>
     */
    <K, V> Map<K, V> fetchMap(Field<K> key, Field<V> value) throws DataAccessException;

    /**
     * Execute the query and return the generated result as an Object matrix
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray()[recordIndex][fieldIndex]</pre></code>
     *
     * @return The result.
     * @throws DataAccessException if something went wrong executing the query
     */
    Object[][] fetchArrays() throws DataAccessException;

    /**
     * Execute the query and return all values for a field index from the
     * generated result.
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray(fieldIndex)[recordIndex]</pre></code>
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    Object[] fetchArray(int fieldIndex) throws DataAccessException;

    /**
     * Execute the query and return all values for a field index from the
     * generated result.
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray(fieldIndex)[recordIndex]</pre></code>
     *
     * @return The resulting values.
     */
    <T> T[] fetchArray(int fieldIndex, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return all values for a field name from the
     * generated result.
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray(fieldName)[recordIndex]</pre></code>
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    Object[] fetchArray(String fieldName) throws DataAccessException;

    /**
     * Execute the query and return all values for a field name from the
     * generated result.
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray(fieldName)[recordIndex]</pre></code>
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    <T> T[] fetchArray(String fieldName, Class<? extends T> type) throws DataAccessException;

    /**
     * Execute the query and return all values for a field from the generated
     * result.
     * <p>
     * You can access data like this
     * <code><pre>query.fetchArray(field)[recordIndex]</pre></code>
     *
     * @return The resulting values.
     * @throws DataAccessException if something went wrong executing the query
     */
    <T> T[] fetchArray(Field<T> field) throws DataAccessException;

    /**
     * Execute the query and return at most one resulting record as an array
     * <p>
     * You can access data like this
     * <code><pre>query.fetchOneArray()[fieldIndex]</pre></code>
     *
     * @return The resulting record or <code>null</code> if the query returns no
     *         records.
     * @throws DataAccessException This exception is thrown
     *             <ul>
     *             <li>if something went wrong executing the query</li> <li>if
     *             the query returned more than one record</li>
     *             </ul>
     */
    Object[] fetchOneArray() throws DataAccessException;

    /**
     * Map resulting records onto a custom type.
     * <p>
     * This is the same as calling <code>fetch().into(type)</code>. See
     * {@link Record#into(Class)} for more details
     *
     * @param <E> The generic entity type.
     * @param type The entity type.
     * @see Record#into(Class)
     * @see Result#into(Class)
     * @throws DataAccessException if something went wrong executing the query
     * @throws MappingException wrapping any reflection or data type conversion
     *             exception that might have occurred while mapping records
     */
    <E> List<E> fetchInto(Class<? extends E> type) throws DataAccessException, MappingException;

    /**
     * Map resulting records onto a custom record.
     * <p>
     * This is the same as calling <code>fetch().into(table)</code>. See
     * {@link Record#into(Table)} for more details
     *
     * @param <Z> The generic table record type.
     * @param table The table type.
     * @see Record#into(Table)
     * @see Result#into(Table)
     * @throws DataAccessException if something went wrong executing the query
     */
    <Z extends Record> Result<Z> fetchInto(Table<Z> table) throws DataAccessException;

    /**
     * Fetch results into a custom handler callback
     *
     * @param handler The handler callback
     * @return Convenience result, returning the parameter handler itself
     * @throws DataAccessException if something went wrong executing the query
     */
    <H extends RecordHandler<R>> H fetchInto(H handler) throws DataAccessException;

    /**
     * Fetch results asynchronously.
     * <p>
     * This method wraps fetching of records in a
     * {@link java.util.concurrent.Future}, such that you can access the actual
     * records at a future instant. This is especially useful when
     * <ul>
     * <li>You want to load heavy data in the background, for instance when the
     * user logs in and accesses a pre-calculated dashboard screen, before they
     * access the heavy data.</li>
     * <li>You want to parallelise several independent OLAP queries before
     * merging all data into a single report</li>
     * <li>...</li>
     * </ul>
     * <p>
     * This will internally create a "single thread executor", that is shut down
     * at the end of the {@link FutureResult}'s lifecycle. Use
     * {@link #fetchLater(ExecutorService)} instead, if you want control over
     * your executing threads.
     *
     * @return A future result
     * @throws DataAccessException if something went wrong executing the query
     */
    FutureResult<R> fetchLater() throws DataAccessException;

    /**
     * Fetch results asynchronously.
     * <p>
     * This method wraps fetching of records in a
     * {@link java.util.concurrent.Future}, such that you can access the actual
     * records at a future instant. This is especially useful when
     * <ul>
     * <li>You want to load heavy data in the background, for instance when the
     * user logs in and accesses a pre-calculated dashboard screen, before they
     * access the heavy data.</li>
     * <li>You want to parallelise several independent OLAP queries before
     * merging all data into a single report</li>
     * <li>...</li>
     * </ul>
     * <p>
     * Use this method rather than {@link #fetchLater()}, in order to keep
     * control over thread lifecycles, if you manage threads in a J2EE container
     * or with Spring, for instance.
     *
     * @param executor A custom executor
     * @return A future result
     * @throws DataAccessException if something went wrong executing the query
     */
    FutureResult<R> fetchLater(ExecutorService executor) throws DataAccessException;

    /**
     * The record type produced by this query
     */
    Class<? extends R> getRecordType();

    /**
     * {@inheritDoc}
     */
    @Override
    ResultQuery<R> bind(String param, Object value) throws IllegalArgumentException, DataTypeException;

    /**
     * {@inheritDoc}
     */
    @Override
    ResultQuery<R> bind(int index, Object value) throws IllegalArgumentException, DataTypeException;

}
