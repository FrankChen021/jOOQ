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

import java.sql.Timestamp;

import org.jooq.ConverterContext;

/**
 * @author Lukas Eder
 */
final class TimestampToJavaUtilDateConverter extends AbstractContextConverter<Timestamp, java.util.Date> {

    static final TimestampToJavaUtilDateConverter INSTANCE = new TimestampToJavaUtilDateConverter();

    private TimestampToJavaUtilDateConverter () {
        super(Timestamp.class, java.util.Date.class);
    }

    @Override
    public final java.util.Date from(Timestamp t, ConverterContext scope) {
        return t == null ? null : new java.util.Date(t.getTime());
    }

    @Override
    public final Timestamp to(java.util.Date u, ConverterContext scope) {
        return u == null ? null : new Timestamp(u.getTime());
    }
}