<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
                      "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles"%>

<html>
<head>
<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<title><tiles:insertAttribute name="title" /></title>

<tiles:importAttribute name="stylesInherit" />
<c:forEach items="${stylesInherit}" var="style">
	<link href="<c:url value='${style}' />" rel="stylesheet"
		type="text/css" />
</c:forEach>
<tiles:importAttribute name="styles" />
<c:forEach items="${styles}" var="style">
	<link href="<c:url value='${style}' />" rel="stylesheet"
		type="text/css" />
</c:forEach>
</head>

<body>
	<div id="wrap">
		<tiles:insertAttribute name="header" />

		<tiles:insertAttribute name="body" ignore="true" />

		<!-- Modal -->
		<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog" style="width: 90%;">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title">Details</h4>
					</div>
					<div id="modal-body" class="modal-body"></div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->

	</div>

	<tiles:insertAttribute name="footer" />
	<span class="totop"><a href="#"><i
			class="icon-circle-arrow-up"></i></a></span>
</body>
<tiles:importAttribute name="scriptsInherit" />
<c:forEach items="${scriptsInherit}" var="script">
	<script type="text/javascript" src="<c:url value='${script}' />"></script>
</c:forEach>
<tiles:importAttribute name="scripts" />
<c:forEach items="${scripts}" var="script">
	<script type="text/javascript" src="<c:url value='${script}' />"></script>
</c:forEach>
<script>
	// very simple to use!
	$(document).ready(function() {
		$('.js-activated').dropdownHover().dropdown();
	});
</script>
</html>
