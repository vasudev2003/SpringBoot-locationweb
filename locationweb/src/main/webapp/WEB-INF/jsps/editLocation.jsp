<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<@% taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<@%page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<body>
<form action="updateLocation" method="post">
Id:<input type="text" name="id" value="${location.id}" readonly="true"/>
Code:<input type="text" name="code" value="${location.code}"/>
Name:<input type="text" name="name" value="${location.name}"/>
Type:Urban<input type="radio" name="type"${location.type=='URBAN'?'checked':''}/>
     Rural<input type="radio" name="=type" location.type=='RURAL'?'checked':''}/>
<input type="submit" name="update" value="Update"/>

</form>
${msg}
< a href="displayLocations">View all</a>


</body>
</html>