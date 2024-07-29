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
package org.jooq.impl;

// ...
import static org.jooq.SQLDialect.CLICKHOUSE;
// ...
// ...
import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.SQLDialect.SQLITE;
import static org.jooq.impl.DSL.falseCondition;
import static org.jooq.impl.DSL.inline;
import static org.jooq.impl.DSL.select;
import static org.jooq.impl.DSL.selectFrom;
import static org.jooq.impl.Keywords.K_AS;
import static org.jooq.impl.Keywords.K_MATERIALIZED;
import static org.jooq.impl.Keywords.K_NOT;
import static org.jooq.impl.SubqueryCharacteristics.DERIVED_TABLE;
import static org.jooq.impl.Tools.map;
import static org.jooq.impl.Tools.visitSubquery;

import java.util.Set;

import org.jooq.CommonTableExpression;
import org.jooq.Context;
import org.jooq.DataType;
import org.jooq.DerivedColumnList;
import org.jooq.Field;
// ...
import org.jooq.QueryPart;
import org.jooq.Record;
// ...
import org.jooq.ResultQuery;
import org.jooq.SQLDialect;
import org.jooq.Select;
import org.jooq.Table;
import org.jooq.TableOptions;
// ...
import org.jooq.impl.QOM.Materialized;
import org.jooq.impl.Tools.SimpleDataKey;

/**
 * @author Lukas Eder
 */
final class CommonTableExpressionImpl<R extends Record> extends AbstractTable<R> implements CommonTableExpression<R> {

    static final Set<SQLDialect> SUPPORT_MATERIALIZED   = SQLDialect.supportedBy(POSTGRES, SQLITE);
    static final Set<SQLDialect> NO_SUPPORT_COLUMN_LIST = SQLDialect.supportedBy(CLICKHOUSE);





    private final DerivedColumnListImpl  name;
    private final ResultQuery<R>         query;
    private final FieldsImpl<R>          fields;
    private final Materialized           materialized;

    CommonTableExpressionImpl(DerivedColumnListImpl name, ResultQuery<R> query, Materialized materialized) {
        super(TableOptions.expression(), name.name);

        this.name = name;
        this.query = query;
        this.fields = fields1();
        this.materialized = materialized;
    }

    @Override
    public final Class<? extends R> getRecordType() {
        return query.getRecordType();
    }

    @Override
    public final boolean declaresCTE() {
        return true;
    }

    @Override
    public final boolean declaresTables() {
        return true;
    }

    @Override
    public final void accept(Context<?> ctx) {





        if (ctx.declareCTE()) {
            QueryPart s = query;

            // [#4474] [#16629] Support this for ResultQuery as well
            if (NO_SUPPORT_COLUMN_LIST.contains(ctx.dialect())) {
                ctx.visit(name.name);

                if (query instanceof Select<R> q)
                    s = new AliasedSelect<>(q, false, true, false, name.fieldNames);
                else
                    s = DSL.resultQuery("{0} union all {1}",
                            select(map(name.fieldNames, n -> inline((Object) null).as(n))).where(falseCondition()),
                            query
                        );
            }
            else
                ctx.visit(name);

            ctx.sql(' ').visit(K_AS).sql(' ');

            Object previous = null;
            if (materialized != null) {
                if (SUPPORT_MATERIALIZED.contains(ctx.dialect())) {
                    if (materialized == Materialized.MATERIALIZED)
                        ctx.visit(K_MATERIALIZED).sql(' ');
                    else
                        ctx.visit(K_NOT).sql(' ').visit(K_MATERIALIZED).sql(' ');
                }




            }

            visitSubquery(ctx, s, DERIVED_TABLE);





        }

        else if (ctx.declareTables()
                && query instanceof Select
                && Transformations.transformInlineCTE(ctx.configuration())) {









        }

        else
            ctx.visit(name.name);


    }
















    @Override
    final FieldsImpl<R> fields0() {
        return fields;
    }

    final FieldsImpl<R> fields1() {
        Field<?>[] s = FieldsImpl.internalFieldsRow0((FieldsTrait) query).fields();

        // [#10565] Can't reuse s.length, see explanation below
        Field<?>[] f = new Field[Tools.degree(query)];

        for (int i = 0; i < f.length; i++) {
            f[i] = DSL.field(
                DSL.name(
                    name.name,

                    // If the CTE has no explicit column names, inherit those of the subquery
                    name.fieldNames.length > 0
                        ? name.fieldNames[i]
                        : s[i].getUnqualifiedName()),

                // [#10565] The "scalar type" can be different for a query than the first column's type
                //          e.g. when projecting FOR XML or FOR JSON
                (DataType<?>) (f.length == 1 ? Tools.scalarType(query) : s[i].getDataType())
            );
        }

        return new FieldsImpl<>(f);
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final DerivedColumnList $derivedColumnList() {
        return name;
    }

    @Override
    public final ResultQuery<R> $query() {
        return query;
    }

    @Override
    public final Materialized $materialized() {
        return materialized;
    }














}
