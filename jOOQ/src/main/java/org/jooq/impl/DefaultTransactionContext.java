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

import org.jooq.Configuration;
import org.jooq.Transaction;
import org.jooq.TransactionContext;

/**
 * @author Lukas Eder
 */
class DefaultTransactionContext extends AbstractScope implements TransactionContext {

    static final String DATA_KEY = "org.jooq.transaction-context";

    Transaction         transaction;
    Throwable           cause;
    Object              result;

    DefaultTransactionContext(Configuration configuration) {
        super(configuration);
    }

    @Override
    public final Transaction transaction() {
        return transaction;
    }

    @Override
    public final TransactionContext transaction(Transaction t) {
        transaction = t;
        return this;
    }

    @Override
    public final Object result() {
        return result;
    }

    @Override
    public final TransactionContext result(Object r) {
        this.result = r;
        return this;
    }

    @Override
    public final Exception cause() {
        return cause instanceof Exception e ? e : null;
    }

    @Override
    public final TransactionContext cause(Exception c) {
        cause = c;
        return this;
    }

    @Override
    public final Throwable causeThrowable() {
        return cause;
    }

    @Override
    public final TransactionContext causeThrowable(Throwable c) {
        cause = c;
        return this;
    }
}
