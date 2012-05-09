/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 *                          Christopher Deckers, chrriis@gmail.com
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
package org.jooq.debug;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * @author Christopher Deckers
 */
@SuppressWarnings("serial")
public class QueryLoggingData extends StatementInfo {

    private static AtomicInteger nextID = new AtomicInteger();

    private int id;
    private Long preparationDuration;
    private Long bindingDuration;
    private long executionDuration;
    private StackTraceElement[] callerStackTraceElements;

    public QueryLoggingData(SqlQueryType queryType, String[] queries, String parameterDescription, Long preparationDuration, Long bindingDuration, long executionDuration) {
        super(queryType, queries, parameterDescription);
        this.id = nextID.getAndIncrement();
        this.callerStackTraceElements = new Exception().getStackTrace();
        this.preparationDuration = preparationDuration;
        this.bindingDuration = bindingDuration;
        this.executionDuration = executionDuration;
    }

    public int getID() {
        return id;
    }

    public StackTraceElement[] getCallerStackTraceElements() {
        return callerStackTraceElements;
    }

    public Long getPreparedStatementPreparationDuration() {
        return preparationDuration;
    }

    public Long getPreparedStatementBindingDuration() {
        return bindingDuration;
    }

    public long getExecutionDuration() {
        return executionDuration;
    }

}
