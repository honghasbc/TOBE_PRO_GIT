<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<div id="header">
	<div class="headerTop" style="height: 28px">
		<img border="0" style="float: left"
			src="<c:url value="/image/heb_logo.gif" />" alt="" width="83"
			height="28" hspace="5" />

		<div id="headerTitle">JATS Template Project</div>

		<div id="helpFloater">
			<sec:authorize access="isAuthenticated()">
                You are logged in as <sec:authentication
					property="principal.displayName" /> &nbsp;|&nbsp;
                <a href="<c:url value='/j_spring_security_logout' />">Log
					Out</a> &nbsp;|&nbsp;
                <a
					href="https://partnernet.heb.com/HR/MyLearning/Pages/default.aspx">Help</a>
			</sec:authorize>
		</div>

		<div id="currentLocationStyleContainer" class="currentLocationStyle"></div>
	</div>
</div>