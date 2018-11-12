<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
String[] words = (String[]) request.getAttribute("words");
%>
<!DOCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
    </head>
    <body>
        <% for(String word:words) { %>
            <p><%= word %></p>
        <% } %>
    </body>
</html>