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
package org.jooq.impl;

// ...
import static org.jooq.SQLDialect.CLICKHOUSE;
import static org.jooq.SQLDialect.IGNITE;
import static org.jooq.SQLDialect.TRINO;
import static org.jooq.impl.Keywords.K_UNIQUE;
import static org.jooq.impl.QueryPartListView.wrap;
import static org.jooq.impl.Tools.EMPTY_FIELD;

import java.util.Set;

import org.jooq.Context;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.QueryPart;
// ...
import org.jooq.SQLDialect;
import org.jooq.Table;
// ...
import org.jooq.impl.QOM.PrimaryKey;
import org.jooq.impl.QOM.UniqueKey;
import org.jooq.impl.QOM.UnmodifiableList;

/**
 * @author Lukas Eder
 */
final class UniqueConstraintImpl
extends
    AbstractConstraint
implements
    QOM.UniqueKey
{
    static final Set<SQLDialect> NO_SUPPORT_UK = SQLDialect.supportedBy(CLICKHOUSE, IGNITE, TRINO);

    private Field<?>[]           fields;

    UniqueConstraintImpl(Name name, Field<?>[] fields) {
        this(name, fields, true);
    }

    private UniqueConstraintImpl(Name name, Field<?>[] fields, boolean enforced) {
        super(name, enforced);

        this.fields = fields;
    }

    // ------------------------------------------------------------------------
    // XXX: QueryPart API
    // ------------------------------------------------------------------------

    @Override
    public final void accept0(Context<?> ctx) {
        ctx.visit(K_UNIQUE)
           .sql(" (").visit(wrap(fields).qualify(false)).sql(')');
    }

    @Override
    final boolean supported(Context<?> ctx, Table<?> onTable) {
        return !NO_SUPPORT_UK.contains(ctx.dialect());
    }

    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final UnmodifiableList<? extends Field<?>> $fields() {
        return QOM.unmodifiable(fields);
    }

    @Override
    public final UniqueKey $fields(UnmodifiableList<? extends Field<?>> newFields) {
        return new UniqueConstraintImpl($name(), newFields.toArray(EMPTY_FIELD));
    }

    @Override
    public final UniqueKey $name(Name newName) {
        return new UniqueConstraintImpl(newName, fields, $enforced());
    }

    @Override
    public final UniqueKey $enforced(boolean newEnforced) {
        return new UniqueConstraintImpl($name(), fields, newEnforced);
    }


















}
