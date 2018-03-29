package org.apache.struts.helloworld.action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts.helloworld.model.Word;
import org.apache.struts.helloworld.model.Words;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import java.util.ArrayList;

public class WordAction extends ActionSupport {

    private static final long serialVersionUID = 1L;
    private int id;

    private Word word;
    private Words words;

    // helpers for request arguments
    public void setId(int id){
        this.id = id;
    }

    // these should all be routes
    public String add() throws Exception  {
        Word w = new Word();
        w.setWordValue("asdf");
        w.save();
        return SUCCESS;
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

    public String getAll() throws Exception {
        words = new Words();
        words.populateWordList();

        return SUCCESS;
    }

    // getter
    public Word getWord(){ return word; }
    public ArrayList<Word> getWords(){ return words.getWords(); }

}
