/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appenglish;

/**
 *
 * @author Bui
 */
//The class containt the properties of the specified word
public class Word {
    private String word;
    private String meaning;
    private String subject;
    private int dueDate;
    public Word()
    {
        
    }
    public Word(String word, String meaning, String subject, String dueDate)
    {
        this.word = word;
        this.meaning = meaning;
        this.subject = subject;
        this.dueDate = this.dueDate;
    }
    public void setword(String word)
    {
        this.word = word;
    }
    public String getWord()
    {
        return this.word;
    }
    
    public void setMeaning(String meaning)
    {
        this.meaning = meaning;
    }
    public String getMeaning()
    {
        return this.meaning;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
    public String getSubect()
    {
        return this.subject;
    }
    public void setDueDate(int dueDate)
    {
        this.dueDate = dueDate;
    }
    public int getDueDate()
    {
        return this.dueDate;
    }
}
