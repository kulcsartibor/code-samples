package com.kdev.pattern.creational.objectpool;

import java.sql.Connection;

/**
 * @author trovo.st@gmail.com
 * 2018-01-20
 */
public class ObjectPoolPatternDemo {
    public static void main(String args[]) {
        // Do something...

        // Create the ConnectionPool:
        JDBCConnectionPool pool = new JDBCConnectionPool(
                "org.hsqldb.jdbcDriver", "jdbc:hsqldb://localhost/mydb",
                "sa", "secret");

        // Get a connection:
        Connection con = pool.checkOut();

        // Use the connection


        // Return the connection:
        pool.checkIn(con);

    }
}
