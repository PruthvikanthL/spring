<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html xmlns:form="http://www.w3.org/1999/xhtml">
<head><title>Order Ice Cream</title></head>
<body>
<h2>Order Ice Cream</h2>
<form:form method="post" modelAttribute="order" action="order">
    Name: <form:input path="name"/><br/>
    Flavour:
    <form:select path="flavour">
        <form:option value="Vanilla" label="Vanilla"/>
        <form:option value="Chocolate" label="Chocolate"/>
        <form:option value="Strawberry" label="Strawberry"/>
    </form:select><br/>
    Quantity: <form:input path="quantity"/><br/>
    Take Away: <form:checkbox path="takeAway"/> <br/>
    Add Ons: <form:checkbox path="addOns"/> <br/>
    Coupon: <form:input path="coupon"/><br/>
    <input type="submit" value="ORDER"/>
</form:form>
</body>
</html>
