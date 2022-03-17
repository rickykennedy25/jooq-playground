package com.playground.jooq;

import com.playground.jooq.config.DataSourceConfig;
import lombok.extern.slf4j.Slf4j;

import org.jooq.Result;
import org.jooq.impl.*;

import static org.jooq.SQLDialect.POSTGRES;
import static org.jooq.sources.tables.Author.AUTHOR;

import org.jooq.sources.tables.records.AuthorRecord;

import javax.sql.DataSource;

@Slf4j
public class Main {

  public static void main(String[] args) {
    DataSource dataSource = DataSourceConfig.createDataSource();


    AuthorRecord authorRecord = DSL.using(dataSource, POSTGRES)
      .selectFrom(AUTHOR)
      .where(AUTHOR.FIRST_NAME.eq("first_name"))
      .fetchAny();

    log.info("Author fetch one : \n {} ", authorRecord);

    Result<AuthorRecord> authorRecords = DSL.using(dataSource, POSTGRES)
      .selectFrom(AUTHOR)
        .where(AUTHOR.FIRST_NAME.eq("first_name"))
        .limit(2)
      .fetch();

    log.info("Author fetch all : \n {}", authorRecords);
  }
}
