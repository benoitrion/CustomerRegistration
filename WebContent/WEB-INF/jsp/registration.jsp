<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Customer Registration</title>
</head>
<body>
    <form:form method="post" modelAttribute="registration" action="/register">
        <table>
            <tr>
                <td><a href="/lang_en">English</a><td>
                <td><a href="/lang_es">Spanish</a><td>
            <tr>
                <td>Customer Name</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Password</td>
                <td><form:password path="password" id="password"
                                    placeholder="password" />
                </td>
                <td>
                    <form:errors path="confirmPassword" />
                </td>
            </tr>
            <tr>
                <td>Confirm Password</td>
                <td><form:password path="confirmPassword" id="confirmPassword"
                                   placeholder="password" />
                </td>
            </tr>
            <tr>
                <td>Address</td>
                <td><form:textarea path="address" id="address" placeholder="address" /></td>
                <td>
                    <form:errors path="address" />
                </td>
            </tr>
            <tr>
                <td>State</td>
                <td>
                    <form:select path="state">
                    <form:option value="0" label="Select" />
                        <form:options items="${stateList}" itemValue="stateId" itemLabel="stateName" />
                     </form:select>

                </td>
            </tr>
            <tr>
                <td>Date of Birth</td>
                <td><form:input path="dateOfBirth" /></td>
                <td>
                    <form:errors path="dateOfBirth" />
                </td>
            </tr>
            <tr>
                <td>Gender</td>
                <td><form:radiobutton path="gender" value="M" /> Male </td>
                <td><form:radiobutton path="gender" value="F" /> Female </td>
            </tr>
            <tr>
                <td><form:checkbox path="terms" id="terms" label="I understand the terms and conditions and agree to it" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Register"></td>
                <td><input type="button" value="Cancel"></td>
            </tr>
        </table>

    </form:form>

</body>
</html>
