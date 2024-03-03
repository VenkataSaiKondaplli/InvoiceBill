<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>
    <form action="/invoice" method="get">
        <label>Enter Item Number</label>
        <input type="text" name="itemid"> <br>

        <label>Enter Item Name</label>
        <input type="text" name="itemname"> <br>

        <label>Enter Item Qunatity</label>
        <input type="text" name="quantity"> <br>

        <label>Enter Item Cost</label>
        <input type="text" name="cost"> <br>

        <input type="submit" value="Print Invoice">
    </form>
</body>
</html>
