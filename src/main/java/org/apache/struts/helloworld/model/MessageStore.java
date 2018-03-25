 
package org.apache.struts.helloworld.model;


/**
 * Model class that stores a message.
 * @author Bruce Phillips
*/
 
public class MessageStore {
    
    private String message;
    
    public void setMessage(String s) {
        this.message = s;
    }

    public String getMessage() {
        return message;
    }

}

