 
package org.apache.struts.helloworld.model;

import org.apache.struts2.ServletActionContext;
import java.sql.*;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
*/
 
public class Word {

    Connection con;

    int wordId;
    String wordValue;

    public Word() throws Exception{
    	Class.forName("com.mysql.jdbc.Driver");

        this.con = DriverManager.getConnection(
                System.getenv("DB_CONN"),
                System.getenv("DB_USER"),
                System.getenv("DB_PASS")
        );  	
    }
    
    public Word(int id) throws Exception{
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
        this.wordId = resultSet.getInt(1);
        this.wordValue = resultSet.getString(2);
    }

    public Word(int id, String value){
        this.wordId = id;
        this.wordValue = value;
    }
    

    public int getWordId() {
        return this.wordId;
    }

    public String getWordValue(){
        return this.wordValue;
    }
    
    public void setWordId(int wordId) {
    	this.wordId = wordId;  
    }
    
    public void setWordValue(String wordValue) {
    	this.wordValue = wordValue;
    }
    
    public void save() throws Exception {
    	String qwerty = "INSERT INTO `TestTable` (`word`) VALUES ('" + wordValue + "')";
    	System.out.println(qwerty);
    	Statement statement = this.con.createStatement();
        statement.executeUpdate(qwerty);
    }
    
    
    
    
}

