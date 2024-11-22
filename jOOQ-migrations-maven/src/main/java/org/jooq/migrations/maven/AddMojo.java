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
package org.jooq.migrations.maven;

import static java.lang.Boolean.TRUE;
import static org.apache.maven.plugins.annotations.LifecyclePhase.GENERATE_SOURCES;
import static org.apache.maven.plugins.annotations.ResolutionScope.TEST;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.EnumSet;

import org.jooq.Commit;
import org.jooq.DDLExportConfiguration;
import org.jooq.DDLFlag;
import org.jooq.History;
import org.jooq.HistoryVersion;
import org.jooq.Meta;
import org.jooq.Migration;
import org.jooq.Queries;

import org.apache.maven.plugins.annotations.Mojo;

/**
 * Add objects from the configured database schemas to the migration.
 *
 * @author Lukas Eder
 */
@Mojo(
    name = "add",
    defaultPhase = GENERATE_SOURCES,
    requiresDependencyResolution = TEST,
    threadSafe = true
)
public class AddMojo extends AbstractMigrateMojo {

    @Override
    final void execute1(Migration migration) throws Exception {
        Queries untracked = migration.untracked();

        if (untracked.queries().length > 0) {
            History history = migration.dsl().migrations().history();
            String id = history.available() ? history.current().version().id() : migration.from().id();

            File file = new File(file(directory), id + "/increments/" + id + "-added.sql");
            file.getParentFile().mkdirs();

            try (FileWriter f = new FileWriter(file);
                PrintWriter w = new PrintWriter(f)
            ) {
                if (getLog().isInfoEnabled())
                    getLog().info("Writing untracked objects to: " + file + "\n" + untracked);

                w.println("-- Untracked objects of version: " + id);

                if (Commit.ROOT.equals(id)) {
                    w.println("-- Objects that were present before the root version will not be created during migration on any databases.");
                    w.println("-- They are added to this file only as a baseline.");
                }

                w.println(untracked);
                w.flush();
            }
        }
    }
}
