<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<@% taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<@%page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<h2>Locations</h2>
<table>
<tr>
<th>id</th>
<th>code</th>
<th>name</th>
<th>type</th>
<tr>
<c:forEach items="${locations}" var ="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?${location.id}">Delete</a></td>
<td><a href="showUpdate?${location.id}">Edit</a></td>
</tr>
</c:forEach>
</table>
<a href="showCreate">Add locations</a>


</body>
</html>