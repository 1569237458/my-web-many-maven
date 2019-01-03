package com.niecl.utils.day20181224.pojo;

/**
 * @authar nieChenLiang
 * @date 2018-12-24 15:18
 */
public class Todo {
    private String todoId;
    private String todoCode;
    private String userName;
    private String uId;

    public Todo() {
    }

    public Todo(String todoId, String todoCode, String userName, String uId) {
        this.todoId = todoId;
        this.todoCode = todoCode;
        this.userName = userName;
        this.uId = uId;

    }
    public String getTodoId() {
        return todoId;
    }

    public void setTodoId(String todoId) {
        this.todoId = todoId;
    }

    public String getTodoCode() {
        return todoCode;
    }

    public void setTodoCode(String todoCode) {
        this.todoCode = todoCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
