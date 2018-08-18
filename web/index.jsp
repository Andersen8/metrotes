
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Metro Test</title>
  </head>
  <body>
  <form method="post" action="/customer">
    To Send Data:
    <p>Enter your name: </p><p><input type="text" name="name"/></p>
    <p>Enter your age:</p><p><input type="number" name="age"/></p>
    <p>Enter your mobile №:</p><p><input type="number" name="mobile"/></p>
    <button type="submit">Save</button>
  </form>
  <form method="get" action="/customer">
    To get Data:<input name="customer" type="number"/>
    <button type="submit">Find</button>
  </form>
  </body>
</html>
