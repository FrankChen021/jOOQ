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
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
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

// ...
// ...
import static org.jooq.SQLDialect.CLICKHOUSE;
// ...
import static org.jooq.SQLDialect.CUBRID;
// ...
// ...
import static org.jooq.SQLDialect.DERBY;
import static org.jooq.SQLDialect.DUCKDB;
// ...
import static org.jooq.SQLDialect.FIREBIRD;
import static org.jooq.SQLDialect.H2;
// ...
import static org.jooq.SQLDialect.HSQLDB;
// ...
import static org.jooq.SQLDialect.MARIADB;
// ...
import static org.jooq.SQLDialect.MYSQL;
// ...
import static org.jooq.SQLDialect.POSTGRES;
// ...
// ...
// ...
import static org.jooq.SQLDialect.SQLITE;
// ...
// ...
// ...
import static org.jooq.SQLDialect.TRINO;
// ...
import static org.jooq.SQLDialect.YUGABYTEDB;

import org.jetbrains.annotations.NotNull;

/**
 * This type is used for the window function DSL API.
 * <p>
 * Example: <pre><code>
 * field.firstValue()
 *      .ignoreNulls()
 *      .over()
 *      .partitionBy(AUTHOR_ID)
 *      .orderBy(PUBLISHED_IN.asc())
 *      .rowsBetweenUnboundedPreceding()
 *      .andUnboundedFollowing()
 * </code></pre>
 * <p>
 * Unlike in {@link WindowBeforeOverStep}, <code>OVER()</code> is a mandatory
 * clause.
 *
 * @param <T> The function return type
 * @author Lukas Eder
 */
public interface WindowOverStep<T> {

    /**
     * Turn this aggregate function into a window function.
     * <p>
     * An example: <pre><code>
     * MAX(id) OVER (PARTITION BY 1)
     * </code></pre>
     */
    @NotNull
    @Support({ CLICKHOUSE, CUBRID, DERBY, DUCKDB, FIREBIRD, H2, HSQLDB, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowPartitionByStep<T> over();

    /**
     * Turn this aggregate function into a window function referencing a window
     * name.
     * <p>
     * An example: <pre><code>
     * MAX(id) OVER my_window
     * </code></pre>
     * <p>
     * If the <code>WINDOW</code> clause is not supported (see
     * {@link SelectWindowStep#window(WindowDefinition...)}, then referenced
     * windows will be inlined.
     */
    @NotNull
    @Support({ CLICKHOUSE, CUBRID, DUCKDB, FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowFinalStep<T> over(Name name);

    /**
     * Turn this aggregate function into a window function referencing a window
     * name.
     * <p>
     * An example: <pre><code>
     * MAX(id) OVER my_window
     * </code></pre>
     * <p>
     * If the <code>WINDOW</code> clause is not supported (see
     * {@link SelectWindowStep#window(WindowDefinition...)}, then referenced
     * windows will be inlined.
     */
    @NotNull
    @Support({ CLICKHOUSE, CUBRID, DUCKDB, FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowFinalStep<T> over(String name);

    /**
     * Turn this aggregate function into a window function.
     * <p>
     * An example: <pre><code>
     * MAX(id) OVER (PARTITION BY 1)
     * </code></pre>
     */
    @NotNull
    @Support({ CLICKHOUSE, CUBRID, DUCKDB, FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowFinalStep<T> over(WindowSpecification specification);

    /**
     * Turn this aggregate function into a window function referencing a window
     * definition.
     * <p>
     * An example: <pre><code>
     * MAX(id) OVER my_window
     * </code></pre>
     * <p>
     * If the <code>WINDOW</code> clause is not supported (see
     * {@link SelectWindowStep#window(WindowDefinition...)}, then referenced
     * windows will be inlined.
     */
    @NotNull
    @Support({ CLICKHOUSE, CUBRID, DUCKDB, FIREBIRD, H2, MARIADB, MYSQL, POSTGRES, SQLITE, TRINO, YUGABYTEDB })
    WindowFinalStep<T> over(WindowDefinition definition);

}
