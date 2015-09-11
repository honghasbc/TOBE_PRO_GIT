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
		<div class="col-sm-12">
			<label for="inputCustomerIdSearch" class="col-lg-2 control-label">Customer
				ID: </label>
			<div class="col-lg-4 input-group">
				<input type="text" class="form-control input-sm"
					id="inputCustomerIdSearch" placeholder="Customer ID"> <span
					class="input-group-btn">
					<button class="btn btn-default input-sm"
						ng-click="searchCustomer()" type="button">
						<i class="icon-search"></i>
					</button>
				</span>
			</div>
		</div>
		<!--/span-->
	</div>

	<div id="body_detail" class="row">
		<table cellpadding="0" cellspacing="0" border="0"
			class="table table-hover table-striped table-bordered"
			id="customerSearchList"></table>
	</div>
</div>