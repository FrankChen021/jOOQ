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
package org.jooq.meta;

import org.jooq.Parameter;

/**
 * An interface defining a parameter of a stored procedure or stored function.
 *
 * @author Lukas Eder
 */
public interface ParameterDefinition extends TypedElementDefinition<RoutineDefinition>, PositionedDefinition {

    /**
     * Whether the parameter has a default value.
     * <p>
     * @see Parameter#isDefaulted()
     */
    boolean isDefaulted();

    /**
     * Whether the parameter has a name.
     * <p>
     * @see Parameter#isUnnamed()
     */
    boolean isUnnamed();

    /**
     * Whether the parameter is synthetic.
     */
    @Override
    boolean isSynthetic();
}
