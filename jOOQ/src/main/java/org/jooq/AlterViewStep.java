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

import static org.jooq.SQLDialect.*;
import static org.jooq.impl.DSL.*;

import java.util.*;

import org.jooq.impl.DSL;

import org.jetbrains.annotations.*;

/**
 * A step in the construction of the <code>ALTER VIEW</code> statement.
 * <p>
 * <h3>Referencing <code>XYZ*Step</code> types directly from client code</h3>
 * <p>
 * It is usually not recommended to reference any <code>XYZ*Step</code> types
 * directly from client code, or assign them to local variables. When writing
 * dynamic SQL, creating a statement's components dynamically, and passing them
 * to the DSL API statically is usually a better choice. See the manual's
 * section about dynamic SQL for details: <a href=
 * "https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql">https://www.jooq.org/doc/latest/manual/sql-building/dynamic-sql</a>.
 * <p>
 * Drawbacks of referencing the <code>XYZ*Step</code> types directly:
 * <ul>
 * <li>They're operating on mutable implementations (as of jOOQ 3.x)</li>
 * <li>They're less composable and not easy to get right when dynamic SQL gets
 * complex</li>
 * <li>They're less readable</li>
 * <li>They might have binary incompatible changes between minor releases</li>
 * </ul>
 */
@SuppressWarnings({ "unused" })
public interface AlterViewStep {

    /**
     * Add the <code>COMMENT</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ CLICKHOUSE, DUCKDB, FIREBIRD, H2, HSQLDB, POSTGRES, TRINO, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep comment(@Stringly.Comment String comment);

    /**
     * Add the <code>COMMENT</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ CLICKHOUSE, DUCKDB, FIREBIRD, H2, HSQLDB, POSTGRES, TRINO, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep comment(Comment comment);

    /**
     * Add the <code>RENAME TO</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ CLICKHOUSE, DUCKDB, H2, HSQLDB, POSTGRES, TRINO, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep renameTo(@Stringly.Name String renameTo);

    /**
     * Add the <code>RENAME TO</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ CLICKHOUSE, DUCKDB, H2, HSQLDB, POSTGRES, TRINO, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep renameTo(Name renameTo);

    /**
     * Add the <code>RENAME TO</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ CLICKHOUSE, DUCKDB, H2, HSQLDB, POSTGRES, TRINO, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep renameTo(Table<?> renameTo);

    /**
     * Add the <code>AS</code> clause to the <code>ALTER VIEW</code> statement.
     */
    @Support({ FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, YUGABYTEDB })
    @NotNull @CheckReturnValue
    AlterViewFinalStep as(Select<?> as);
}
