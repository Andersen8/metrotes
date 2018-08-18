
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Data List</title>
</head>
<body>
    <table align="center" border="2" cellspacing="2" cellpadding="2">
        <th>ID</th>
        <th>NAME</th>
        <th>AGE</th>
        <th>MOBILE NUMBER</th>
        <tr>
            <td>${model.id}</td>
            <td>${model.name}</td>
            <td>${model.age}</td>
            <td>${model.mobile_no}</td>
        </tr>
    </table>
</body>
</html>
