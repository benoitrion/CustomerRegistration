<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customer Registration</title>
</head>
<body>

    <form:form method="post" action="/register" commandName="customerVO">
        Language : <a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
        Current Locale : ${pageContext.response.locale}
        <table>
            <tr>
                <td><spring:message code="translation.customerName" text="Customer Name" /></td>
                <td><form:input path="customerName" id="customerName" name="customerName" placeholder="Customer Name"/></td>
                <td><form:errors path="customerName" /></td>
            </tr>
            <tr>
                <td><spring:message code="translation.password" text="Password" /></td>
                <td><form:password path="password" id="password" placeholder="Password" /></td>
                <td><form:errors path="password" /></td>
            </tr>
            <tr>
                <td><spring:message code="translation.confirmPassword" text="Confirm Password" /></td>
                <td><form:password path="confirmPassword" id="confirmPassword" placeholder="Confirm Password"/>
                <td><form:errors path="confirmPassword" /></td>
                </td>
            </tr>
            <tr>
                <td><spring:message code="translation.address.street" text="Address" /></td>
                <td><form:textarea path="address.street" id="address" placeholder="Address" /></td>
                <td><form:errors path="address.street" /></td>
            </tr>
            <tr>
                <td><spring:message code="translation.address.state" text="State" /></td>
                <td>
                    <form:select path="address.state">
                        <form:option value="0" label="Select" />
                        <form:options items="${stateList}" />
                     </form:select>

                </td>
                <td><form:errors path="address.state" /></td>
            </tr>
            <tr>
                <td><spring:message code="translation.dateOfBirth" text="Date of Birth" /></td>
                <td><form:input path="dateOfBirth" placeholder="Date of Birth" /></td>
                <td><form:errors path="dateOfBirth" /></td>
            </tr>
            <tr>
                <td>
                    <form:radiobuttons path="gender" items="${genderList}" />
                </td>
                <td><form:errors path="gender" /></td>
            </tr>
            <tr>
                <td><form:checkbox path="agreed" id="agreed" />
                <td><spring:message code="translation.terms" text="I understand the terms and conditions and agree to it" /></td>
                <td><form:errors path="agreed" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
                <td><input type="button" value="Cancel"></td>
            </tr>
        </table>

    </form:form>
    <spring:message code="translation.clientIpAddress" text="You are accessing the application from :" /> <c:out value="${clientIpAddress}"></c:out>
</body>
</html>
