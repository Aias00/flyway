/*
 * Copyright 2010-2019 Boxfuse GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.flywaydb.core.internal.database.postgresql;

import org.flywaydb.core.api.configuration.Configuration;
import org.flywaydb.core.internal.parser.Parser;
import org.flywaydb.core.internal.placeholder.PlaceholderReplacer;
import org.flywaydb.core.internal.sqlscript.AbstractSqlStatementBuilderFactory;
import org.flywaydb.core.internal.sqlscript.SqlStatementBuilder;

class PostgreSQLSqlStatementBuilderFactory extends AbstractSqlStatementBuilderFactory {
    private final Configuration configuration;

    PostgreSQLSqlStatementBuilderFactory(PlaceholderReplacer placeholderReplacer, Configuration configuration) {
        super(placeholderReplacer);
        this.configuration = configuration;
    }

    @Override
    public SqlStatementBuilder createSqlStatementBuilder() {
        return null;
    }

    @Override
    public Parser createParser() {
        return new PostgreSQLParser(configuration);
    }
}