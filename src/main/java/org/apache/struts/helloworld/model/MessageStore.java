package org.apache.struts.helloworld.model;
import java.util.ArrayList;

/**
 * Model class that stores a message.
 * @author Bruce Phillips
 *
 */
public class MessageStore {
    
    private String message;
    private ArrayList<String> users;
    
    public MessageStore() {

        message = "Hello Struts USer";
        users = new ArrayList<String>();

        for (int i=0;i<10;i++){
            users.add("User " + i);
        }
    }

    public void setMessage(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

}
