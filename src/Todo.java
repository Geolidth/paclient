/*
* File: Todo.java
* Author: Csajbók-Reményi László
* Copyright: 2024, Csajbók-Reményi László
* Group: Szoft II/I/E
* Date: 2024/01/14
* Github: https://github.com/Geolidth/paclient.git
* Licenc: GNU GPL
*/

public class Todo {
    Integer userId;
    Integer id;
    String title;
    String body;
    public Todo() {
    }
    public Todo(Integer userId, Integer id, String title, String body) {
        this.userId = userId;
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getBody() {
        return body;
    }
    public void setBody(String body) {
        this.body = body;
    }
    

}
