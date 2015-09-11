<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!-- This clearing element should immediately follow the #mainContent div in order to force the #container div to
contain all child floats -->
<div class="messageBar">
	<div align="center">
		<span class="pageTitle">Standard Login Page</span>
	</div>
</div>

<c:if test="${showLogout}">
	<div class="infoBox ui-state-highlight">
		<p>
			<span class="floatLeft ui-icon ui-icon-info"></span> You have been
			successfully logged out.
		</p>
	</div>
</c:if>

<!-- If login has failed for any number of reasons the user will return to the login screen and an error message will
display -->
<c:if test="${showFailure}">
	<div class="infoBox ui-state-error">
		<p>
			<span class="floatLeft ui-icon ui-icon-alert"></span> Your login
			attempt was unsuccessful. Please try again.<br /> Cause:
			<c:out
				value='${sessionScope["SPRING_SECURITY_LAST_EXCEPTION"].message}' />
		</p>
	</div>
</c:if>

<!-- The login form is two text boxes and a button and the text boxes are connected to ldap through Spring Security -->
<form name="f" action="<c:url value='/j_spring_security_check' />"
	method="POST">
	<div align="center">
		<table>
			<tr>
				<td class="label">User Name:</td>
				<td><input type="text" id="j_username" name="j_username"
					value="<c:out value='${sessionScope["SPRING_SECURITY_LAST_USERNAME"]}' />"></td>
			</tr>
			<tr>
				<td class="label">Password:</td>
				<td><input type="password" id="j_password" name="j_password" /></td>
				<td colspan="2"><input name="submit" type="submit"
					value="Log In" class="button" /></td>
			</tr>
		</table>
	</div>
</form>

<!-- HEB legal content that is displayed below the login form -->
<div class="messageBar" id="messageContainer">
	<div id="messageContent">
		<div>
			<p class="loginLegalPara">This system and all related equipment
				is for official HEB business only. All systems are subject to
				monitoring for management, unauthorized access and verification of
				security procedures. Use of this system constitutes consent to
				monitoring for this purpose. Unauthorized use of this system may
				subject you to criminal prosecution and penalties.</p>
		</div>

		<!-- A link to the onepass site is available for the user to change there password -->
		<div align="center">
			<a href="https://onepass.heb.com/onepass/login.jsp">Change
				Password</a>
		</div>

		<br class="clearfloat" />
	</div>
</div>