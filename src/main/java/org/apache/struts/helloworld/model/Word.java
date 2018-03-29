 
package org.apache.struts.helloworld.model;

import org.apache.struts2.ServletActionContext;
import java.sql.*;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
*/
 
public class Word {

    Connection con;

    String wordId;
    String wordValue;

    public Word(String id) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        this.con = DriverManager.getConnection(
                System.getenv("DB_CONN"),
                System.getenv("DB_USER"),
                System.getenv("DB_PASS")
        );

        this.wordId = id;

        Statement statement = this.con.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from TestTable WHERE id=" + this.wordId);
        resultSet.next();

        // set up our object from the database
        this.wordId = resultSet.getString(1);
        this.wordValue = resultSet.getString(2);
    }

    public String getWordId() {
        return this.wordId;
    }

    public String getWordValue(){
        return this.wordValue;
    }
}

