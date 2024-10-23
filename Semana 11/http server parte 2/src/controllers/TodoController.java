package controllers;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.util.ArrayList;

import database.DB;
import models.Todo;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONObject;

public class TodoController implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        System.out.println(exchange.getRequestMethod());
        String response = "";
        String requestMethod = exchange.getRequestMethod();
        if (exchange.getRequestMethod().equals("GET")){
            response = listTodos().toString();
        }else if (requestMethod.equals("POST")){
            response = addTodo(exchange.getRequestBody()).toString();
        }else if (requestMethod.equals("DELETE")){
            String[] paths = exchange.getRequestURI().getPath().split("/");
            String todoId = paths[paths.length - 1];
            response = deleteTodo(todoId).toString();
            deleteTodo(todoId);
        }
        exchange.sendResponseHeaders(200, response.length());
        OutputStream os = exchange.getResponseBody();
        os.write(response.getBytes());
        os.close();
    }

    public JSONObject addTodo(InputStream todoBody) throws IOException {
        StringWriter sw = new StringWriter();
        IOUtils.copy(todoBody, sw);
        String body = sw.toString();
        JSONObject jsonBody = new JSONObject(body);
        String title = jsonBody.getString("title");
        Todo newTodo = new Todo("",title,false);
        JSONObject newTodoJsonObject = new JSONObject(newTodo);
        DB.data.getJSONArray("todos").put(newTodoJsonObject);
        DB.saveData();
        JSONObject response = new JSONObject();
        response.put("result", "successful");
        response.put("data", newTodoJsonObject);
        return response;
    }
    public JSONObject deleteTodo(String todoId) throws IOException{
        JSONObject response = new JSONObject();
        JSONArray todos = DB.data.getJSONArray("todos");
        int index = -1;
        for (int i = 0; i < todos.length(); i++) {
            JSONObject todo = todos.getJSONObject(i);
            if (todo.getString("id").equals(todoId)) {
                index = i;
                break;
            }
        }
        if (index!= -1) {
            todos.remove(index);
            DB.saveData();
            response.put("result", "successful");
        } else {
            response.put("result", "error");
            response.put("message", "Todo not found");
        }
        return response;
    }
    public JSONObject listTodos() {
        JSONObject response = new JSONObject();
        response.put("data", DB.data.getJSONArray("todos"));
        response.put("result", "successful");
        return response;
    }
}