<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>
<form action="saveLoc" method="post">
Id:<input type="text" name="id"/>
Code:<input type="text" name="code"/>
Name:<input type="text" name="name"/>
Type:Urban<input type="radio" name="type"/>
     Rural<input type="radio" name="=type"/>
<input type="submit" name="save" value="Save"/>

</form>
${msg}
< a href="displayLocations">View all</a>


</body>
</html>