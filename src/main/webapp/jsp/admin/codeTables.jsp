<%@page import="com.heb.enterprise.coms.model.vo.DynamicDataVO"%>
<%@page import="java.util.Map"%>
<%@page import="com.heb.enterprise.coms.model.vo.MetaDataVO"%>
<%@page import="com.heb.enterprise.coms.utils.ConstantsWeb"%>
<%@page import="java.util.List"%>
<div class="col-sm-12">
	<div class="page-header">
		<h3>Code Tables</h3>
		<ul class="breadcrumb">
			<li><a title="" href="/"><i class="icon-home"></i> Home</a> <span
				class="divider"></span></li>
			<li><a title="" href="/">TOBEPRO Administrative UI</a> <span
				class="divider"></span></li>
			<li class="active"><a title="Alerting" href="">Enterprise
					Event Model </a></li>
		</ul>
	</div>


	<div class="row">

		<!-- 	starting block Viewing active alerts -->

		<div class="col-sm-3">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">
							<i class="icon-th-list"></i> Code Tables
						</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="panel-body">
					<%
					if(request.getAttribute(ConstantsWeb.LIST_META_DATA_TABLES_ATTR) != null){
						List<DynamicDataVO> lstDynamicVO = (List<DynamicDataVO>) request.getAttribute(ConstantsWeb.LIST_META_DATA_TABLES_ATTR) ;
					%>
					<ul id="leftMenu" class="nav nav-pills nav-stacked">
						<%
							String tableLabel = null;
							for (DynamicDataVO dynamic2 : lstDynamicVO) {
								tableLabel = (dynamic2.getTableLabel() != null && !dynamic2.getTableLabel().trim().isEmpty()) ? dynamic2.getTableLabel() : dynamic2.getTableName();
						%>
						<li><a href="#" id="<%= dynamic2.getTableName() %>"><%=tableLabel%></a></li>
						<%
							}
						%>
					</ul>
					<%
						}
					%>
				</div>
			</div>
		</div>
		<!-- 	end block Viewing active alerts -->

		<!-- 	start block Alert details -->
		<div class="col-sm-9">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">
							<i class="icon-th-list"></i><span id="tableTitle"> Details</span>
						</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="panel-body">
					<div id="rowIconAction" class="nav nav-pills nav-tabs"
						style="display: none;">
						<div class="pull-right">
							<i id="btnAddCdTbl" class="icon-plus-sign icon-2x" id="icon-add"></i>
						</div>
					</div>
					<div id="bodyDetail">Please select Code Table !</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 	end block Alert details -->
</div>

<div class="modal fade" id="dialogDelete" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Confirm Message</h4>
			</div>
			<div id="bodyDelete" class="modal-body"></div>
			<div class="modal-footer">
				<button type="button" class="btn btn-primary" id="btnYesDelete">Yes</button>
				<button type="button" class="btn btn-default" id="confirmFalse"
					data-dismiss="modal">No</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->


<div id="dialogEdit" class="modal fade" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 id="titleEdit" class="modal-title"></h4>
			</div>
			<div id="bodyEdit" class="modal-body"></div>
			<div class="modal-footer">
				<button id="btnSaveEdit" type="button" class="btn btn-primary">Save</button>
				<button type="button" class="btn btn-default" data-dismiss="modal">Cancel</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<!-- ================================================================================ -->
<script type="text/javascript">
<%
	if(request.getAttribute(ConstantsWeb.LIST_META_DATA_TABLES_ATTR) != null){
		String strColumns = null;
		List<DynamicDataVO> lstDynamicVO = (List<DynamicDataVO>) request.getAttribute(ConstantsWeb.LIST_META_DATA_TABLES_ATTR) ;
		for (DynamicDataVO dynamic : lstDynamicVO) {
			strColumns = "";
			for(MetaDataVO metaData : dynamic.getData()){
				if(metaData.getColumnDesc() == null || metaData.getColumnDesc().trim().isEmpty()){
					metaData.setColumnDesc(metaData.getColumnName());
				}
				strColumns += "{'sName' : '"+ metaData.getColumnName() + "', 'sTitle': '"+metaData.getColumnDesc()+"', 'sConstraint' : '"+ metaData.getConstraintTyp() + "', 'sDataLength' : '"+ metaData.getDataLength() + "','sClass': 'center'},";
			}
			if(!strColumns.trim().isEmpty()){
				strColumns += "{ 'sTitle': 'Action',  'sClass': 'center', 'sWidth': '5%' },";
				strColumns = "[" + strColumns.substring(0, strColumns.length() - 1) + "]";
				%>
				var <%= dynamic.getTableName() %>_columns = <%=strColumns + "\n"%>;
				<%
			}
		}
	}
%>
</script>
