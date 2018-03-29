 
package org.apache.struts.helloworld.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
*/
 
public class Words {

    Connection con;
    String filter, sortField, sortOrder;
    ArrayList<Word> words;

    public void setFilter(String filter){
        this.filter = filter;
    }

    public void setSortField(String sortField){
        this.sortField = sortField;
    }

    public void setSortOrder(String sortOrder){
        this.sortOrder = sortOrder;
    }

    public void populateWordList() throws Exception{
        this.words = new ArrayList<Word>();

        Class.forName("com.mysql.jdbc.Driver");
        this.con = DriverManager.getConnection(
                System.getenv("DB_CONN"),
                System.getenv("DB_USER"),
                System.getenv("DB_PASS")
        );

        Statement statement = this.con.createStatement();

        String query = "select * from TestTable";
        if (this.filter != null){
            query += " " + filter;
        }

        ResultSet resultSet = statement.executeQuery(query);

        //loop thru the resultSet fetching each record
        while (resultSet.next()) {
            this.words.add(
                new Word(
                    resultSet.getInt("id"),
                    resultSet.getString("word")
                )
            );
        }
    }

    public ArrayList<Word> getWords() {
        return this.words;
    }
}

