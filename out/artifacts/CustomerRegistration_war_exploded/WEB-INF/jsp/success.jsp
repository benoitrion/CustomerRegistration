<%--
  Created by IntelliJ IDEA.
  User: benny
  Date: 13.09.17
  Time: 23:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <td><spring:message code="translation.successTitle" text="Successfully registered" /></td>
</head>
<body>
    <td><spring:message code="translation.successMessage" text="You have successfully registered with the bank" /></td>
    <table>
        <tr>
            <td><spring:message code="translation.customerName" text="Customer Name" /></td>
            <td><c:out value="${customerVO.customerName}"></c:out></td>
        </tr>
        <tr>
            <td><spring:message code="translation.address.street" text="Address" /></td>
            <td><c:out value="${customerVO.address.state}"></c:out></td>
        </tr>
        <tr>
            <td><spring:message code="translation.dateOfBirth" text="Date of Birth" /></td>
            <td><c:out value="${customerVO.dateOfBirth}"></c:out></td>
        </tr>
        <tr>
            <td><spring:message code="translation.gender" text="Gender" /></td>
            <td><c:out value="${customerVO.gender}"></c:out></td>
        </tr>
    </table>
    <spring:message code="translation.clientIpAddress" text="You are accessing the application from :" /> <c:out value="${clientIpAddress}"></c:out>
</body>
</html>
