package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.Word;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class WordAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private String id;

    private Word word;

    // helpers for request arguments
    public void setId(String id){
        this.id = id;
    }

    // these should all be routes
    public String create() throws Exception  {
        throw new NotImplementedException();
    }

    public String get() throws Exception  {
        word = new Word(this.id);
        return SUCCESS;
    }

    public String edit() throws Exception  {
        throw new NotImplementedException();
    }

    public String delete() throws Exception  {
        throw new NotImplementedException();
    }

    // getter
    public Word getWord(){ return word; }

}
