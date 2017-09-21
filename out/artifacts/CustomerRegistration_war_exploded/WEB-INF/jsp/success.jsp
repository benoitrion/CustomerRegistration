<%--
  Created by IntelliJ IDEA.
  User: benny
  Date: 13.09.17
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Successfully registered</title>
</head>
<body>
    <h2>You have successfully registered with the bank</h2>
    <table>
        <tr>
            <td>Customer name :</td>
            <td><c:out value="${customer.customerName}"></c:out></td>
        </tr>
        <tr>
            <td>State :</td>
            <td><c:out value="${customer.state}"></c:out></td>
        </tr>
        <tr>
            <td>Date of Birth :</td>
            <td><c:out value="${customer.dateOfBirth}"></c:out></td>
        </tr>
        <tr>
            <td>Gender :</td>
            <td><c:out value="${customer.gender}"></c:out></td>
        </tr>
    </table>
</body>
</html>
