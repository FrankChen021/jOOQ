/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq;


import java.util.Arrays;
import java.util.List;

import org.jooq.Catalog;
import org.jooq.Table;
import org.jooq.example.jpa.jooq.tables.Actor;
import org.jooq.example.jpa.jooq.tables.Film;
import org.jooq.example.jpa.jooq.tables.FilmActor;
import org.jooq.example.jpa.jooq.tables.Language;
import org.jooq.impl.SchemaImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DefaultSchema extends SchemaImpl {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>DEFAULT_SCHEMA</code>
     */
    public static final DefaultSchema DEFAULT_SCHEMA = new DefaultSchema();

    /**
     * The table <code>ACTOR</code>.
     */
    public final Actor ACTOR = Actor.ACTOR;

    /**
     * The table <code>FILM</code>.
     */
    public final Film FILM = Film.FILM;

    /**
     * The table <code>FILM_ACTOR</code>.
     */
    public final FilmActor FILM_ACTOR = FilmActor.FILM_ACTOR;

    /**
     * The table <code>LANGUAGE</code>.
     */
    public final Language LANGUAGE = Language.LANGUAGE;

    /**
     * No further instances allowed
     */
    private DefaultSchema() {
        super("", null);
    }


    @Override
    public Catalog getCatalog() {
        return DefaultCatalog.DEFAULT_CATALOG;
    }

    @Override
    public final List<Table<?>> getTables() {
        return Arrays.<Table<?>>asList(
            Actor.ACTOR,
            Film.FILM,
            FilmActor.FILM_ACTOR,
            Language.LANGUAGE);
    }
}
