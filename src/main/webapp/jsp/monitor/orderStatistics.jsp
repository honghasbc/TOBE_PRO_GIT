<div class="col-sm-12">


	<div class="page-header">
		<h3>Order statistics</h3>
		<ul class="breadcrumb">
			<li><a href="/" title=""><i class="icon-home"></i> Home</a> <span
				class="divider"></span></li>
			<li><a href="/monitoring/" title="">Monitoring</a> <span
				class="divider"></span></li>
			<li class="active"><a href="" title="">Order Statistics</a></li>
		</ul>
	</div>
	<!-- /page-header -->
	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Order Throughput</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->

				<div id="orderthroughput_loading" class="panel-body">

					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-min"
								id="orderthroughput_min_btn">Min</button>
							<button type="button" class="btn btn-default coms-hour"
								id="orderthroughput_hour_btn">Hour</button>
							<button type="button" class="btn btn-default coms-day"
								id="orderthroughput_day_btn">Day</button>
							<button type="button" class="btn btn-default coms-month"
								id="orderthroughput_mon_btn">1M</button>
						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="orderthroughput-daterange"
								name="orderthroughput-daterange" placeholder="From - To">
						</div>
					</div>
					<div id="orderthroughput" class="table-responsive"></div>
				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Order Status</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->
				<div id="orderstatus_loading" class="panel-body">
					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-day">Day</button>
							<button type="button" class="btn btn-default coms-month">1M</button>
							<button type="button" class="btn btn-default coms-quarter">3M</button>
						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="orderstatus-daterange"
								name="orderstatus-daterange">
						</div>
					</div>
					<div id="orderstatus" class="table-responsive"></div>
				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Order Types</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->

				<div id="ordertypes_loading" class="panel-body">

					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-day">Day</button>
							<button type="button" class="btn btn-default coms-month">1M</button>
							<button type="button" class="btn btn-default coms-quarter">3M</button>

						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="ordertypes-daterange"
								name="ordertypes-daterange">
						</div>
					</div>
					<div id="ordertypes" class="table-responsive"></div>
				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
	</div>
	<div class="row">
		<div class="col-sm-12">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Order Basket Size</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->

				<div id="orderbasketsize_loading" class="panel-body">
					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-day">Day</button>
							<button type="button" class="btn btn-default coms-month">1M</button>
							<button type="button" class="btn btn-default coms-quarter">3M</button>

						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="orderbasketsize-daterange"
								name="orderbasketsize-daterange">
						</div>
					</div>
					<div id="orderbasketsize" class="table-responsive"></div>
				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Status of Fulfillment
							Systems</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->


				<div id="fulfillmentsystem_loading" class="panel-body">
					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-day">Day</button>
							<button type="button" class="btn btn-default coms-month">1M</button>
							<button type="button" class="btn btn-default coms-quarter">3M</button>


						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="fulfillmentsystem-daterange"
								name="fulfillmentsystem-daterange">
						</div>
					</div>
					<div id="fulfillmentsystem" class="table-responsive"></div>
				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
		<div class="col-sm-6">
			<div class="panel panel-primary">

				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">Status of Ordering Systems</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-zoom-in"></i> <i
							class="toprightHeaderIcons icon-chevron-up"></i>
					</div>


					<div class="clearfix"></div>
				</div>
				<!--/panel-heading-->

				<div id="orderingsystem_loading" class="panel-body">
					<div class="reportSchedule">
						<div class="btn-group btn-group-xs">
							<button type="button" class="btn btn-default coms-day">Day</button>
							<button type="button" class="btn btn-default coms-month">1M</button>
							<button type="button" class="btn btn-default coms-quarter">3M</button>


						</div>
						<div class="input-prepend pull-right">
							<span class="add-on"><i class="icon-calendar"></i> </span><input
								type="text" id="orderingsystem-daterange"
								name="orderingsystem-daterange">
						</div>
					</div>
					<div id="orderingsystem" class="table-responsive"></div>

				</div>
				<!--/panel-body-->
			</div>
			<!--/panel-primary-->
		</div>
		<!--/span-->
	</div>
	<!--/row-->
</div>
<!--/.bodycontainer-->
