package org.apache.struts.helloworld.action;

import org.apache.struts.helloworld.model.MessageStore;
import com.opensymphony.xwork2.ActionSupport;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

/**
 * Acts as a Struts 2 controller that responds
 * to a user action by setting the value
 * of the MessageStore model class, and returns a String 
 * result.
 * @author Bruce Phillips
 *
 */
public class HelloWorldAction extends ActionSupport {

    private static final long serialVersionUID = 1L;

    /**
     * The model class that stores the message
     * to display in the view.
     */
    private MessageStore messageStore;

    /*
     * Creates the MessageStore model object and 
     * returns success.  The MessageStore model
     * object will be available to the view.
     * (non-Javadoc)
     * @see com.opensymphony.xwork2.ActionSupport#execute()
     */
    public String testMessage() {
        messageStore = new MessageStore();
        messageStore.setMessage("Message stored in testMessage method");
        return SUCCESS;
    }
    
    public String testButtonClicked() {
    	messageStore = new MessageStore();
        messageStore.setMessage("Test Success!!! message stored in testButtonClicked method");
    	return SUCCESS;
    }
    

    
    public String dbConnect() throws Exception  {
    	String driver = "com.mysql.jdbc.Driver";
        String connection = System.getenv("DB_CONN");
        String user = System.getenv("DB_USER");
        String password = System.getenv("DB_PASS");
        String qwerty;
        ResultSet resultSet = null;
        Statement statement = null;
        messageStore = new MessageStore();

        Class.forName(driver);
        Connection con = DriverManager.getConnection(connection, user, password);
        statement = con.createStatement();
        resultSet = statement.executeQuery("select * from TestTable");
        resultSet.next();
        qwerty = resultSet.getString("word");
        messageStore.setMessage(qwerty);
        if (!con.isClosed()) {
          con.close();
        }
        return SUCCESS;
    }

    public MessageStore getMessageStore() {
        return messageStore;
    }
}

