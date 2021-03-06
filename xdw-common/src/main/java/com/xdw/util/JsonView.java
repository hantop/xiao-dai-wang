package com.xdw.util;

public class JsonView {

  public static final int SUCCESS = 200;
  public static final int ERROR = 1001;
  public static final int EXPIRED = 1002;
  public static final String DEFAULT_SUCCESS_MESSAGE = "访问成功";
  public static final String DEFAULT_FAIL_MESSAGE = "访问失败";

  private int code = SUCCESS;
  private int todoCount;
  private String message = DEFAULT_SUCCESS_MESSAGE;
  private Object data;


  public int getCode() {
    return code;
  }

  public void setCode(int code) {
    this.code = code;
  }

  public int getTodoCount() {
    return todoCount;
  }

  public void setTodoCount(int todoCount) {
    this.todoCount = todoCount;
  }

  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Object getData() {
    return data;
  }

  public void setData(Object data) {
    this.data = data;
  }

  public static JsonView success() {
    JsonView view = new JsonView();
    view.setMessage(DEFAULT_SUCCESS_MESSAGE);
    return view;
  }

  public static JsonView success(Object data) {
    JsonView view = new JsonView();
    view.setData(data);
    return view;
  }



  public static JsonView success(String message) {
    JsonView view = new JsonView();
    view.setMessage(message);
    return view;
  }

  public static JsonView fail() {
    return fail(ERROR, DEFAULT_FAIL_MESSAGE);
  }

  public static JsonView fail(String message) {
    return fail(ERROR, message);
  }

  public static JsonView fail(int code, String message) {
    JsonView view = new JsonView();
    view.setCode(code);
    view.setMessage(message);
    return view;
  }
}