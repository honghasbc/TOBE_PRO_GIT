<div class="col-sm-12">
	<div class="page-header">
		<h3>Alerting</h3>
		<ul class="breadcrumb">
			<li><a title="" href="/"><i class="icon-home"></i> Home</a> <span
				class="divider"></span></li>
			<li class="active"><a title="Alerting" href="">Alerting</a></li>
		</ul>
	</div>


	<div class="row">

		<!-- 	starting block Viewing active alerts -->

		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">
							<i class="icon-bell"></i>&nbsp; Viewing active alerts
						</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="panel-body">
					<div class="col-xs-12">
						<div class="row">
							<i class="icon-desktop"></i> Mornitoring Overview
						</div>

						<div class="row">
							<div class="col-md-5 col-md-offset-1">
								<i class="icon-gear"></i> New:
							</div>
							<div class="col-md-1">12</div>

						</div>

						<div class="row">
							<div class="col-md-5 col-md-offset-1">
								<i class="icon-check-empty"></i> Uncheck:
							</div>
							<div class="col-md-1">2</div>
						</div>

						<div class="row">
							<div class="col-md-5 col-md-offset-1">
								<i class="icon-refresh"></i> In progress:
							</div>
							<div class="col-md-1">10</div>
						</div>

						<div class="row">
							<div class="col-md-5 col-md-offset-1">
								<i class="icon-check"></i> Recently Resolved (24 hours):
							</div>
							<div class="col-md-1">20</div>
						</div>

						<div class="row">
							<i class="icon-bell"></i> Active Alerts (30)
						</div>
					</div>

					<div class="row">&nbsp</div>

					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="pull-left">
								<h4 class="panel-title pull-left">
									<i class="icon-gear"></i>&nbsp; New <span class="badge">12</span>
								</h4>
							</div>
							<div class="pull-right">
								<i class="toprightHeaderIcons icon-chevron-up"></i>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="panel-body">

							<table class="table table-hover table-striped table-bordered">
								<thead>
									<tr>
										<th>Type</th>
										<th>Order #</th>
										<th>Description</th>
										<th>Created</th>
										<th>Age</th>
									</tr>
								</thead>
								<tbody>
									<tr>
										<td>1</td>
										<td>Mark</td>
										<td>Otto</td>
										<td>@mdo</td>
										<td>30</td>
									</tr>
									<tr>
										<td>2</td>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@fat</td>
										<td>30</td>
									</tr>
									<tr>
										<td>3</td>
										<td>Jacob</td>
										<td>Thornton</td>
										<td>@twitter</td>
										<td>52</td>
									</tr>
								</tbody>
							</table>

						</div>
					</div>

					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="pull-left">
								<h4 class="panel-title pull-left">
									<i class="icon-refresh"></i> In progress <span class="badge">5</span>
								</h4>
							</div>
							<div class="pull-right">
								<i class="toprightHeaderIcons icon-chevron-up"></i>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="panel-body">Body In progress(5)</div>
					</div>


					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="pull-left">
								<h4 class="panel-title pull-left">
									<i class="icon-check"></i> Resolved <span class="badge">20</span>
								</h4>
							</div>
							<div class="pull-right">
								<i class="toprightHeaderIcons icon-chevron-up"></i>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="panel-body">Body Resolved(20)</div>
					</div>


					<div class="panel panel-info">
						<div class="panel-heading">
							<div class="pull-left">
								<h4 class="panel-title pull-left">
									<i class="icon-warning-sign"></i> Abandoned <span class="badge">15</span>
								</h4>
							</div>
							<div class="pull-right">
								<i class="toprightHeaderIcons icon-chevron-up"></i>
							</div>
							<div class="clearfix"></div>
						</div>
						<div class="panel-body">Body Abandoned(15)</div>
					</div>



				</div>
			</div>
		</div>
		<!-- 	end block Viewing active alerts -->

		<!-- 	start block Alert details -->
		<div class="col-sm-6">
			<div class="panel panel-primary">
				<div class="panel-heading">
					<div class="pull-left">
						<h3 class="panel-title pull-left">
							<i class="icon-bell"></i>&nbsp; Alert details
						</h3>
					</div>
					<div class="pull-right">
						<i class="toprightHeaderIcons icon-chevron-up"></i>
					</div>
					<div class="clearfix"></div>
				</div>

				<div class="panel-body">
					<form class="form-horizontal" role="form">
						<div class="col-xs-12">
							<div class="row">
								<div class="form-group">

									<label for="inputAlertID" class="col-lg-3 control-label">Alert
										ID</label>
									<div class="col-lg-3 input-group">
										<input type="text" class="form-control input-sm"
											id="inputAlertID" placeholder="Aler ID"> <span
											class="input-group-btn">
											<button id="btnSearchAlertID"
												class="btn btn-default input-sm" type="button">
												<i class="icon-search"></i>
											</button>
										</span>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Current Status</label>
									<div class="col-lg-9">
										<p class="form-control-static">New</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Order Number</label>
									<div class="col-lg-9">
										<p class="form-control-static">442233</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Alert Type</label>
									<div class="col-lg-9">
										<p class="form-control-static">Order Alert</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Created</label>
									<div class="col-lg-9">
										<p class="form-control-static">9/25/2013 10:10:25</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Last Update</label>
									<div class="col-lg-9">
										<p class="form-control-static">9/25/2013 11:10:25</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Description</label>
									<div class="col-lg-9">
										<p class="form-control-static">A description of alert</p>
									</div>
								</div>
							</div>
							<div class="row">
								<div class="form-group">
									<label class="col-lg-3 control-label">Notes</label>
									<div class="col-lg-9">
										<p class="form-control-static">Giambi drove a 1-1 pitch
											from Addison Reed (5-4) deep into the lower deck in right
											field to prevent a potentially devastating loss for the
											Indians, who haven't been to the postseason since 2007.
											Giambi's heart-pounding shot bailed out controversial closer
											Chris Perez, who gave up two homers in the top of the ninth
											and nearly blew a game Cleveland had to have.</p>
									</div>

								</div>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
	<!-- 	end block Alert details -->
</div>
<!-- ================================================================================ -->