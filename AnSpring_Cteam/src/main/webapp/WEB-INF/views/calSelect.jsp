<%@page import="com.cteam.app.dto.CalDTO"%>
<%@page import="com.google.gson.Gson"%>
<%@page import="com.google.gson.JsonObject"%>

<%@page import="org.springframework.ui.Model"%>
<%@page import="java.sql.*, java.sql.Date, javax.sql.*, javax.naming.*, 
					java.util.*, java.io.PrintWriter" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<%		
Gson gson = new Gson();
String json = gson.toJson((ArrayList<CalDTO>)request.getAttribute("calSelect"));

out.println(json);	
%>