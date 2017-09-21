<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Customer Registration</title>
</head>
<body>

    <spring:url value="/submitRegister" var="userActionUrl" />

    <form:form method="post" modelAttribute="registration" action="${userActionUrl}">
        Language : <a href="?language=en">English</a>|<a href="?language=es">Spanish</a>
        Current Locale : ${pageContext.response.locale}
        <table>
            <tr>
                <td><spring:message code="translation.customerName" text="Customer Name" /></td>
                <td><form:input path="customerName" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:password path="password" id="password" />
                </td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><form:password path="confirmPassword" id="confirmPassword"/>
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:textarea path="address" id="address" placeholder="address.toString()" /></td>
            </tr>
            <tr>
                <td>State</td>
                <td>
                    <form:select path="state">
                        <form:option value="0" label="Select" />
                        <form:options items="${stateList}" />
                     </form:select>

                </td>
            </tr>
            <tr>
                <td>Date of Birth</td>
                <td><form:input path="dateOfBirth" /></td>
            </tr>
            <tr>
                <td>
                    <form:radiobuttons path="gender" items="${genderList}" />
                </td>
            </tr>
            <tr>
                <td><form:checkbox path="agreed" id="agreed" label="I understand the terms and conditions and agree to it" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
                <td><input type="button" value="Cancel"></td>
            </tr>
        </table>

    </form:form>

</body>
</html>
