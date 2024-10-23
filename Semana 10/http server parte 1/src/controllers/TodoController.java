package controllers;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;

import database.DB;
import models.Todo;
import org.json.JSONArray;
import org.json.JSONObject;

public class TodoController implements HttpHandler {

    @Override
    public void handle(HttpExchange exchange) throws IOException{
        System.out.println(exchange.getRequestURI());
        System.out.println(exchange.getRequestMethod());

        String requestURI = exchange.getRequestURI().toString();

        if (requestURI.equals("/api/todos/create")){
            ArrayList<Todo> todos = new ArrayList<Todo>();
            JSONArray jsonArray = DB.data.getJSONArray("todos");
            for (int i = 0; i < jsonArray.length(); i++) {
                todos.add(new Gson().fromJson(jsonArray.get(i).toString(), Todo.class));
            }
            Todo newTodo = new Todo("","TodoNuevoCreado",false);
            todos.add(newTodo);
            DB.data.put("todos", todos);
            DB.saveData();
        }else{

            String response = listTodos().toString();
            exchange.sendResponseHeaders(200, response.length());
            OutputStream os = exchange.getResponseBody();
            os.write(response.getBytes());
            os.close();
        }
    }

    public JSONObject listTodos() {
        JSONObject response = new JSONObject();
        response.put("data", DB.data.getJSONArray("todos"));
        response.put("result", "successful");
        return response;
    }
}
