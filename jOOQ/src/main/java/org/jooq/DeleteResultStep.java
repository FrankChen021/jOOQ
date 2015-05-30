/**
 * Copyright (c) 2009-2015, Data Geekery GmbH (http://www.datageekery.com)
 * All rights reserved.
 *
 * This work is dual-licensed
 * - under the Apache Software License 2.0 (the "ASL")
 * - under the jOOQ License and Maintenance Agreement (the "jOOQ License")
 * =============================================================================
 * You may choose which license applies to you:
 *
 * - If you're using this work with Open Source databases, you may choose
 *   either ASL or jOOQ License.
 * - If you're using this work with at least one commercial database, you must
 *   choose jOOQ License
 *
 * For more information, please visit http://www.jooq.org/licenses
 *
 * Apache Software License 2.0:
 * -----------------------------------------------------------------------------
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * jOOQ License and Maintenance Agreement:
 * -----------------------------------------------------------------------------
 * Data Geekery grants the Customer the non-exclusive, timely limited and
 * non-transferable license to install and use the Software under the terms of
 * the jOOQ License and Maintenance Agreement.
 *
 * This library is distributed with a LIMITED WARRANTY. See the jOOQ License
 * and Maintenance Agreement for more details: http://www.jooq.org/licensing
 */
package org.jooq;

import static org.jooq.SQLDialect.DB2;
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.POSTGRES;

import java.util.Optional;

import org.jooq.exception.DataAccessException;

/**
 * This type is used for the {@link Delete}'s DSL API.
 * <p>
 * Example: <code><pre>
 * DSLContext create = DSL.using(configuration);
 *
 * create.delete(table)
 *       .where(field1.greaterThan(100))
 *       .execute();
 * </pre></code>
 * <p>
 * This implemented differently for every dialect:
 * <ul>
 * <li>Firebird and Postgres have native support for
 * <code>UPDATE .. RETURNING</code> clauses</li>
 * <li>DB2 allows to execute
 * <code>SELECT .. FROM FINAL TABLE (DELETE ...)</code></li>
 * </ul>
 *
 * @author Lukas Eder
 */
public interface DeleteResultStep<R extends Record> extends Delete<R> {

    /**
     * The result holding returned values as specified by the
     * {@link UpdateReturningStep}.
     *
     * @return The returned values as specified by the
     *         {@link UpdateReturningStep}. Note:
     *         <ul>
     *         <li>Not all databases / JDBC drivers support returning several
     *         values on multi-row inserts!</li>
     *         <li>This may return an empty <code>Result</code> in case jOOQ
     *         could not retrieve any generated keys from the JDBC driver.</li>
     *         </ul>
     * @throws DataAccessException if something went wrong executing the query
     * @see UpdateQuery#getReturnedRecords()
     */
    @Support({ DB2, FIREBIRD, POSTGRES })
    Result<R> fetch() throws DataAccessException;

    /**
     * The record holding returned values as specified by the
     * {@link UpdateReturningStep}.
     *
     * @return The returned value as specified by the
     *         {@link UpdateReturningStep}. This may return <code>null</code> in
     *         case jOOQ could not retrieve any generated keys from the JDBC
     *         driver.
     * @throws DataAccessException if something went wrong executing the query
     * @see UpdateQuery#getReturnedRecord()
     */
    @Support({ DB2, FIREBIRD, POSTGRES })
    R fetchOne() throws DataAccessException;

    /* [java-8] */
    /**
     * The record holding returned values as specified by the
     * {@link UpdateReturningStep}.
     *
     * @return The returned value as specified by the
     *         {@link UpdateReturningStep}
     * @throws DataAccessException if something went wrong executing the query
     * @see UpdateQuery#getReturnedRecord()
     */
    @Support({ DB2, FIREBIRD, POSTGRES })
    Optional<R> fetchOptional() throws DataAccessException;
    /* [/java-8] */
}
