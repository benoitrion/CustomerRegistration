<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Registration</title>
</head>
<body>

    <form:form method="post" modelAttribute="customer" action="/register">
        Language : <a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
        Current Locale : ${pageContext.response.locale}
        <table>
            <tr>
                <td><spring:message code="translation.customerName" text="Customer Name" /></td>
                <td><form:input path="customerName" /></td>
                <td><form:errors path="customerName" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:password path="password" id="password" /></td>
                <td><form:errors path="password" /></td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><form:password path="confirmPassword" id="confirmPassword"/>
                <td><form:errors path="confirmPassword" /></td>
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:textarea path="address" id="address" placeholder="address.toString()" /></td>
                <td><form:errors path="address" /></td>
            </tr>
            <tr>
                <td>State</td>
                <td>
                    <form:select path="state">
                        <form:option value="0" label="Select" />
                        <form:options items="${stateList}" />
                     </form:select>

                </td>
                <td><form:errors path="state" /></td>
            </tr>
            <tr>
                <td>Date of Birth</td>
                <td><form:input path="dateOfBirth" /></td>
                <td><form:errors path="dateOfBirth" /></td>
            </tr>
            <tr>
                <td>
                    <form:radiobuttons path="gender" items="${genderList}" />
                </td>
                <td><form:errors path="gender" /></td>
            </tr>
            <tr>
                <td><form:checkbox path="agreed" id="agreed" label="I understand the terms and conditions and agree to it" /></td>
                <td><form:errors path="agreed" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
                <td><input type="button" value="Cancel"></td>
            </tr>
            <tr>
                <td>You are accessing the application from : </td>
                <td><c:out value="${customer.clientIpAddress}"></c:out></td>
            </tr>
        </table>

    </form:form>

</body>
</html>
