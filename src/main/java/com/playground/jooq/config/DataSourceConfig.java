package com.playground.jooq.config;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;

public class DataSourceConfig {

  private DataSourceConfig() {

  }

  public static DataSource createDataSource() {
    HikariConfig config = new HikariConfig();
    config.setJdbcUrl("jdbc:postgresql://localhost:5432/library");
    config.setUsername("postgres");
    config.setPassword("postgres");
    config.setAutoCommit(true);
    config.setMaximumPoolSize(32);
    return new HikariDataSource(config);
  }
}
