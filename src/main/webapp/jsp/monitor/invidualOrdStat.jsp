
<div class="col-sm-12" ng-app id="loadingId">
	<div class="page-header">
		<h3>Individual order statistics</h3>
		<ul class="breadcrumb">
			<li><a href="/" title=""><i class="icon-home"></i> Home</a> <span
				class="divider"></span></li>
			<li><a href="/monitoring/" title="">Monitoring</a> <span
				class="divider"></span></li>
			<li class="active"><a href="" title="">Individual order
					statistics</a></li>
		</ul>
	</div>
	<!-- /page-header -->
	<form class="form-horizontal" role="form"
		ng-controller="individualOrderCtrl">
		<div class="row">
			<div class="col-sm-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<div class="pull-left">
							<h3 class="panel-title pull-left">Order information</h3>
						</div>
						<div class="pull-right" id="order-info-btn-normal">
							<i class="toprightHeaderIcons icon-edit" id="edit-order-info-btn"></i>
							<i class="toprightHeaderIcons icon-chevron-up"></i>
						</div>
						<div class="pull-right" id="order-info-btn-editable"
							style="display: none">
							<i class="toprightHeaderIcons icon-save" id="save-order-info-btn"></i>
							<i class="toprightHeaderIcons icon-refresh"
								id="normal-order-info-btn"></i>
						</div>
						<div class="clearfix"></div>
					</div>
					<!--/panel-heading-->

					<div class="panel-body" id="order-info-form-edit">
						<input type="hidden" name="ordId"
							value="{{ord.orderInforVO.ordId}}" />
						<div id="order-info-message"></div>
						<div class="row" style="margin: 0px;">
							<div class="col-xs-12 col-md-8">
								<div class="form-group">
									<label for="inputOrderNumber" class="col-lg-2 control-label">Order
										Number</label>
									<div class="col-lg-4 input-group">
										<input type="text" class="form-control input-sm"
											id="inputOrderNumber" placeholder="Order Number"> <span
											class="input-group-btn">
											<button class="btn btn-default input-sm"
												ng-click="searchOrder()" type="button">
												<i class="icon-search"></i>
											</button>
										</span>
									</div>
									<!-- /input-group -->
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label">Description</label>
									<div class="col-lg-10">
										<p class="form-control-static"
											id="panel-order-info-view-ordDes">
											<input type="text" ng-model="ord.orderInforVO.ordDes"
												class="form-input-view-label" id="input-order-info-ordDes"
												disabled="disabled" />
										</p>
										<p class="form-control-static"
											id="panel-order-info-edit-ordDes" style="display: none;">
											<input type="text" name="ordDes"
												class="form-control input-sm"
												id="edit-input-order-info-ordDes" value="" />
										</p>
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Order Type</label>
									<div class="col-lg-4">
										<p class="form-control-static">{{ord.orderInforVO.ordTypDes}}</p>
									</div>
									<label class="col-lg-2 control-label">Status</label>
									<div class="col-lg-4">
										<p class="form-control-static">{{ord.orderInforVO.ordStatDes}}</p>
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Source</label>
									<div class="col-lg-4">
										<p class="form-control-static">{{ord.orderInforVO.ordSrcDes}}</p>
									</div>
									<label class="col-lg-2 control-label">Sub-orders</label>
									<div class="col-lg-1">
										<p class="form-control-static">
											2 <i class="icon-zoom-in"></i>
										</p>
									</div>
								</div>

								<div class="form-group">
									<label class="col-lg-2 control-label">Created by</label>
									<div class="col-lg-4">
										<p class="form-control-static">{{ord.orderInforVO.cre8Uid}}
											{{ord.orderInforVO.cre8Ts}}</p>
									</div>
									<label class="col-lg-2 control-label">Updated by</label>
									<div class="col-lg-4">
										<p class="form-control-static">{{ord.orderInforVO.updtUid}}
											{{ord.orderInforVO.updtTs}}</p>
									</div>
								</div>
							</div>
							<div class="col-xs-11 col-md-4 well">
								<small>
									<p />
									<p /> <legend>Summary</legend>
									<div class="col-xs-6">
										<div class="form-group">
											<label class="col-xs-9 control-label">Total Discount</label>
											<div class="col-xs-2 control-label">
												<p>{{addCurrency(ord.ordTotDiscAmt)}}</p>
											</div>
										</div>
									</div>
									<div class="col-xs-6">
										<div class="form-group">
											<label class="col-xs-9 control-label">Order Total</label>
											<div class="col-xs-2 control-label">
												<p class="pull-right">{{addCurrency(ord.totPymtAmt)}}</p>
											</div>
											<label class="col-xs-9 control-label">Shipping</label>
											<div class="col-xs-2 control-label">
												<p class="pull-right">{{addCurrency(ord.ordTotShpngAmt)}}</p>
											</div>
											<label class="col-xs-9 control-label">Tax</label>
											<div class="col-xs-2 control-label">
												<p class="pull-right">{{addCurrency(ord.ordEstTaxAmt)}}</p>
											</div>
											<label class="col-xs-9 control-label">Subtotal <small>({{ord.itmCnt}}
													items)</small></label>
											<div class="col-xs-2 control-label">
												<p class="pull-right">{{addCurrency(ord.ordSubTotAmt)}}</p>
											</div>
											<label class="col-xs-9 control-label">Net Total</label>
											<div class="col-xs-2 control-label">
												<p class="pull-right">{{addCurrency(ord.ordNetAmt)}}</p>
											</div>
										</div>

									</div>
								</small>
							</div>
							<!-- well -->
						</div>
						<!--/row-->
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
							<h3 class="panel-title pull-left">Customer Information</h3>
						</div>
						<div class="pull-right" id="cust-info-btn-normal">
							<i class="toprightHeaderIcons icon-edit" id="edit-cust-info-btn"></i>
							<i class="toprightHeaderIcons icon-chevron-up"></i>
						</div>
						<div class="pull-right" id="cust-info-btn-editable"
							style="display: none">
							<i class="toprightHeaderIcons icon-save" id="save-cust-info-btn"></i>
							<i class="toprightHeaderIcons icon-refresh"
								id="normal-cust-info-btn"></i>
						</div>
						<div class="clearfix"></div>
					</div>
					<!--/panel-heading-->

					<div class="panel-body" id="cust-info-form-edit">
						<input type="hidden" name="ordId"
							value="{{ord.orderInforVO.ordId}}" />
						<div id="cust-info-message"></div>
						<div class="row" style="margin: 0px;">
							<div class="form-group">
								<label class="col-lg-2 control-label">First Name</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-custFrstNm">
										<input type="text" ng-model="ord.custInforVO.custFrstNm"
											class="form-input-view-label" id="input-cust-info-custFrstNm"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-custFrstNm" style="display: none;">
										<input type="text" name="custFrstNm"
											class="form-control input-sm"
											id="edit-input-cust-info-custFrstNm" />
									</p>
								</div>
								<label class="col-lg-2 control-label">Middle Name</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-custMidNm">
										<input type="text" ng-model="ord.custInforVO.custMidNm"
											class="form-input-view-label" id="input-cust-info-custMidNm"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-custMidNm" style="display: none;">
										<input type="text" name="custMidNm"
											class="form-control input-sm"
											id="edit-input-cust-info-custMidNm" maxlength="2" />
									</p>
								</div>
								<label class="col-lg-2 control-label">Last Name</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-custLstNm">
										<input type="text" ng-model="ord.custInforVO.custLstNm"
											class="form-input-view-label" id="input-cust-info-custLstNm"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-custLstNm" style="display: none;">
										<input type="text" name="custLstNm"
											class="form-control input-sm"
											id="edit-input-cust-info-custLstNm" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Email</label>
								<div class="col-lg-2">
									<p class="form-control-static" id="panel-cust-info-view-email">
										<input type="text" ng-model="ord.custInforVO.email"
											class="form-input-view-label" id="input-cust-info-email"
											disabled="disabled" />
									</p>
									<p class="form-control-static" id="panel-cust-info-edit-email"
										style="display: none;">
										<input type="text" name="email" class="form-control input-sm"
											id="edit-input-cust-info-email" />
									</p>
								</div>
								<div ng-repeat="phone in ord.custInforVO.custPhnNbrs">
									<label class="col-lg-2 control-label">{{phone.phnTypDes}}
										Phone </label>
									<div class="col-lg-2">
										<p class="form-control-static"
											id="panel-cust-info-view-{{phone.phnTypDes}}">
											(<input type="text" ng-model="phone.phnCntryCd"
												class="form-input-view-label-3"
												id="input-cust-info-phnCntryCd{{phone.phnTypDes}}"
												disabled="disabled" />) <input type="text"
												ng-model="phone.phnAreaCd" class="form-input-view-label-3"
												id="input-cust-info-phnAreaCd{{phone.phnTypDes}}"
												disabled="disabled" /> - <input type="text"
												ng-model="phone.phnNbr" class="form-input-view-label-4"
												id="input-cust-info-phnNbr{{phone.phnTypDes}}"
												disabled="disabled" /> - <input type="text"
												ng-model="phone.phnExtnNbr" class="form-input-view-label-4"
												id="input-cust-info-phnExtnNbr{{phone.phnTypDes}}"
												disabled="disabled" />
										</p>
										<p class="form-control-static"
											id="panel-cust-info-edit-{{phone.phnTypDes}}"
											style="display: none;">
											<input type="hidden" name="phones[{{$index}}].phnTypCd"
												value="{{phone.phnTypDes}}" /> (<input type="text"
												name="phones[{{$index}}].phnCntryCd"
												class="form-control-boostrap-small-size3" maxlength="3"
												id="edit-input-cust-info-phnCntryCd{{phone.phnTypDes}}"
												onfocus="renderEventControl('{{phone.phnTypDes}}')" />) <input
												type="text" name="phones[{{$index}}].phnAreaCd"
												class="form-control-boostrap-small-size3" maxlength="3"
												id="edit-input-cust-info-phnAreaCd{{phone.phnTypDes}}" /> -
											<input type="text" name="phones[{{$index}}].phnNbr"
												class="form-control-boostrap-small-size4" maxlength="4"
												id="edit-input-cust-info-phnNbr{{phone.phnTypDes}}" /> - <input
												type="text" name="phones[{{$index}}].phnExtnNbr"
												class="form-control-boostrap-small-size4" maxlength="4"
												id="edit-input-cust-info-phnExtnNbr{{phone.phnTypDes}}" />
										</p>
									</div>
								</div>

							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Address 1</label>
								<div class="col-lg-10">
									<p class="form-control-static"
										id="panel-cust-info-view-addTxt1">
										<input type="text" ng-model="ord.custInforVO.addTxt1"
											class="form-input-view-label" id="input-cust-info-addTxt1"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-addTxt1" style="display: none;">
										<input type="text" name="addTxt1"
											class="form-control input-sm"
											id="edit-input-cust-info-addTxt1" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Address 2</label>
								<div class="col-lg-10">
									<p class="form-control-static"
										id="panel-cust-info-view-addTxt2">
										<input type="text" ng-model="ord.custInforVO.addTxt2"
											class="form-input-view-label" id="input-cust-info-addTxt2"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-addTxt2" style="display: none;">
										<input type="text" name="addTxt2"
											class="form-control input-sm"
											id="edit-input-cust-info-addTxt2" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Address 3</label>
								<div class="col-lg-10">
									<p class="form-control-static"
										id="panel-cust-info-view-addTxt3">
										<input type="text" ng-model="ord.custInforVO.addTxt3"
											class="form-input-view-label" id="input-cust-info-addTxt3"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-addTxt3" style="display: none;">
										<input type="text" name="addTxt3"
											class="form-control input-sm"
											id="edit-input-cust-info-addTxt3" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Address 4</label>
								<div class="col-lg-10">
									<p class="form-control-static"
										id="panel-cust-info-view-addTxt4">
										<input type="text" ng-model="ord.custInforVO.addTxt4"
											class="form-input-view-label" id="input-cust-info-addTxt4"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-addTxt4" style="display: none;">
										<input type="text" name="addTxt4"
											class="form-control input-sm"
											id="edit-input-cust-info-addTxt4" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">City</label>
								<div class="col-lg-2">
									<p class="form-control-static" id="panel-cust-info-view-ctyTxt">
										<input type="text" ng-model="ord.custInforVO.ctyTxt"
											class="form-input-view-label" id="input-cust-info-ctyTxt"
											disabled="disabled" />
									</p>
									<p class="form-control-static" id="panel-cust-info-edit-ctyTxt"
										style="display: none;">
										<input type="text" name="ctyTxt" class="form-control input-sm"
											id="edit-input-cust-info-ctyTxt" />
									</p>
								</div>
								<label class="col-lg-2 control-label">State</label>
								<div class="col-lg-2">
									<p class="form-control-static" id="panel-cust-info-view-stAbb">
										<input type="text" ng-model="ord.custInforVO.stAbb"
											class="form-input-view-label" id="input-cust-info-stAbb"
											disabled="disabled" />
									</p>
									<p class="form-control-static" id="panel-cust-info-edit-stAbb"
										style="display: none;">
										<select name="stAbb" class="form-control input-sm"
											id="edit-input-cust-info-stAbb">
										</select>
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">ZipCode</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-zipCode">
										<input type="text" ng-model="ord.custInforVO.zipCode"
											class="form-input-view-label-small"
											id="input-cust-info-zipCode" disabled="disabled" /> - <input
											type="text" ng-model="ord.custInforVO.zipCodeExt"
											class="form-input-view-label-small"
											id="input-cust-info-zipCodeExt" disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-zipCode" style="display: none;">
										<input type="text" name="zipCode"
											class="form-control-boostrap-small"
											id="edit-input-cust-info-zipCode" /> - <input type="text"
											name="zipCodeExt" class="form-control-boostrap-small"
											id="edit-input-cust-info-zipCodeExt" />
									</p>
								</div>
								<label class="col-lg-2 control-label">Country</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-country">
										<input type="text" ng-model="ord.custInforVO.country"
											class="form-input-view-label" id="input-cust-info-country"
											disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-country" style="display: none;">
										<select name="country" class="form-control input-sm"
											id="edit-input-cust-info-country">
										</select>
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Billing Address</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-billAddress">
										<input type="checkbox" ng-model="ord.custInforVO.billAddress"
											id="input-cust-info-billAddress" disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-billAddress" style="display: none;">
										<input type="checkbox" name="billAddress"
											id="edit-input-cust-info-billAddress" />
									</p>
								</div>
								<label class="col-lg-2 control-label">Shipping Address</label>
								<div class="col-lg-2">
									<p class="form-control-static"
										id="panel-cust-info-view-shipAddress">
										<input type="checkbox" ng-model="ord.custInforVO.shipAddress"
											id="input-cust-info-shipAddress" disabled="disabled" />
									</p>
									<p class="form-control-static"
										id="panel-cust-info-edit-shipAddress" style="display: none;">
										<input type="checkbox" name="shipAddress"
											id="edit-input-cust-info-shipAddress" />
									</p>
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-2 control-label">Created by</label>
								<div class="col-lg-2">
									<p class="form-control-static">{{ord.custInforVO.cre8Uid}}
										{{ord.custInforVO.cre8Ts}}</p>
								</div>
								<label class="col-lg-2 control-label">Updated by</label>
								<div class="col-lg-2">
									<p class="form-control-static">{{ord.custInforVO.updtUid}}
										{{ord.custInforVO.updtTs}}</p>
								</div>
							</div>
						</div>
						<!-- row -->
					</div>
					<!--/panel-body-->
				</div>
				<!--/panel-primary-->
			</div>
			<!--/span-->
			<div class="col-sm-12">
				<div class="panel panel-primary">
					<div class="panel-heading">
						<div class="pull-left">
							<h3 class="panel-title pull-left">
								Payment Information <span class="badge">{{ord.billInforVOs.length}}</span>
							</h3>
						</div>
						<div class="pull-right">
							<i class="toprightHeaderIcons icon-edit"></i> <i
								class="toprightHeaderIcons icon-chevron-up"></i>
						</div>
						<div class="clearfix"></div>
					</div>
					<!--/panel-heading-->


					<div class="panel-body">

						<div id="carousel-example-generic" class="carousel slide">
							<!-- Indicators -->
							<!-- 								<ol class="carousel-indicators"> -->
							<!-- 								  <li data-target="#carousel-example-generic" data-slide-to="0" class="active"></li> -->
							<!-- 								  <li data-target="#carousel-example-generic" data-slide-to="1">xxxxxx</li> -->
							<!-- 								  <li data-target="#carousel-example-generic" data-slide-to="2">xxxxxx</li> -->
							<!-- 								</ol> -->
							<!-- Wrapper for slides -->
							<div class="carousel-inner">
								<div class="item active">
									<h3></h3>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<label class="col-lg-4 control-label">Sequence Number</label>
											<div class="col-lg-6">
												<p class="form-control-static">{{billActive.authnNbr}}</p>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Status </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtStatDes}}
														@ {{billActive.paymtStatTs}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Method </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtMethDes}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Record Id</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRecId}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">TimeStamp</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtTs}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Amount </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtAmt}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardTypCd}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Ref No</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardRefNum}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Hash</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardRefHash}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card MSKD No </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardMskdNum}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card TNDR Type
												</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtTndrTyp}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Protocol Type
												</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtProcTypCd}}</p>
												</div>
											</div>

											<div class="form-group">
												<label class="col-lg-4 control-label">Account Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtActnCd}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													No</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													Amt</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRspnCd}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response Meg</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRspnMsg}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<label class="col-lg-4 control-label">Fraud Check</label>
											<div class="col-lg-2">
												<p class="form-control-static">{{billActive.paymtFrdChkCd}}</p>
											</div>
											<label class="col-lg-2 control-label">Response </label>
											<div class="col-lg-2">
												<p class="form-control-static">{{billActive.paymtFrdRspnCd}}</p>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response Msg </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtFrdRspnMsg}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">First Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingFrstNm}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Middle Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingMidNm}}
														{{billActive.billingLstNm}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Last Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingLstNm}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 1</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr1Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 2</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr2Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 3</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr3Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 4</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr4Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">City</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingCtyTxt}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">State</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingStAbb}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Zip Code</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingZipCd}}
														{{billActive.billingZipExtnCd}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Country</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingCntryNm}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Created by</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.cre8Uid}}
														{{billActive.cre8Ts}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Updated by</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.updtUid}}
														{{billActive.updtTs}}</p>
												</div>
											</div>
										</div>
									</div>
								</div>
								<div class="item" ng-repeat="billActive in billList">
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<label class="col-lg-4 control-label">Sequence Number</label>
											<div class="col-lg-6">
												<p class="form-control-static">{{billActive.authnNbr}}</p>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Status </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtStatDes}}
														@ {{billActive.paymtStatTs}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Method </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtMethDes}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Record Id</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRecId}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">TimeStamp</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtTs}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Amount </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtAmt}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardTypCd}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Ref No</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardRefNum}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card Hash</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardRefHash}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card MSKD No </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtCardMskdNum}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Card TNDR Type
												</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtTndrTyp}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Protocol Type
												</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtProcTypCd}}</p>
												</div>
											</div>

											<div class="form-group">
												<label class="col-lg-4 control-label">Account Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtActnCd}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													Type</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													No</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
											<div class="form-group">
												<label class="col-lg-4 control-label">Authenticate
													Amt</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.authnNbr}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRspnCd}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response Meg</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtRspnMsg}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<label class="col-lg-4 control-label">Fraud Check</label>
											<div class="col-lg-2">
												<p class="form-control-static">{{billActive.paymtFrdChkCd}}</p>
											</div>
											<label class="col-lg-2 control-label">Response </label>
											<div class="col-lg-2">
												<p class="form-control-static">{{billActive.paymtFrdRspnCd}}</p>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Response Msg </label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.paymtFrdRspnMsg}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">First Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingFrstNm}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Middle Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingMidNm}}
														{{billActive.billingLstNm}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Last Name</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingLstNm}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 1</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr1Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 2</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr2Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 3</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr3Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Address Line 4</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingAdr4Txt}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">City</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingCtyTxt}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">State</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingStAbb}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Zip Code</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingZipCd}}
														{{billActive.billingZipExtnCd}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Country</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.billingCntryNm}}</p>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Created by</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.cre8Uid}}
														{{billActive.cre8Ts}}</p>
												</div>
											</div>
										</div>
										<div class="col-xs-12 col-md-4">
											<div class="form-group">
												<label class="col-lg-4 control-label">Updated by</label>
												<div class="col-lg-6">
													<p class="form-control-static">{{billActive.updtUid}}
														{{billActive.updtTs}}</p>
												</div>
											</div>
										</div>
									</div>
								</div>
							</div>

							<!-- Controls #carousel-example-generic -->
							<a class="left carousel-control" href="#" data-slide="prev"
								id="leftCarouselId"
								style="width: 40px; height: 40px; margin-left: -10px; margin-top: -10px; display: none;">
								<span class="icon-prev"></span>
							</a> <a class="right carousel-control" href="#" data-slide="next"
								id="rightCarouselId"
								style="width: 40px; height: 40px; margin-right: -10px; margin-top: -10px; display: none;">
								<span class="icon-next"></span>
							</a>
						</div>

					</div>
					<!--/panel-body-->
				</div>
				<!--/panel-primary-->
			</div>
		</div>
		<!--/row-->
		<div class="col-sm-12">

			<div class="tabbable" id="tabTableId">
				<ul class="nav nav-pills nav-tabs">
					<li id="orddtl" class="active"><a href="#orderdetails"
						data-toggle="tab">Order Details</a></li>
					<li id="orddtlTrx"><a href="#ordertracking" data-toggle="tab">Order
							Tracking</a></li>
					<li id="orddtlCom" ng-click="getOrderCmts()"><a
						href="#comments" data-toggle="tab">Comments</a></li>
					<li id="orddtlHis" ng-click="getStatHistory()"><a
						href="#history" data-toggle="tab">Status History</a></li>
					<div id="funcAction" class="pull-right" style="padding: 10px 15px;">
						<i id="icon-check" class="icon-check-empty icon-2x"></i> <i
							id="icon-delete" class="icon-remove-sign icon-2x"></i>
						<!-- 						<i id="icon-add" class="icon-plus-sign icon-2x"></i> -->
					</div>
				</ul>
				<div class="tab-content">
					<div id="orderdetails" class="tab-pane active">
						<h4></h4>
						<div id="dynamic" style="width: 100%; margin-right: 20px;">
						</div>
					</div>
					<div id="ordertracking" class="tab-pane">
						<h4>Order Tracking Content</h4>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
						<p>aaa</p>
					</div>
					<div id="comments" class="tab-pane">
						<h4></h4>
						<ul class="list-group">
							<li class="list-group-item" ng-repeat="cmt in ord.orderCmtVOs">
								<p>
									<span class="label label-info">{{cmt.ordCmtCd}}</span> Created
									by {{cmt.cre8Uid}} {{cmt.cre8Ts}} <i
										class="pull-right icon-edit"></i>
								</p>
								<p class="well">{{cmt.ordCmtTxt}}</p>
								<p>Last Updated by {{cmt.lstUpdtUid}} {{cmt.lstUpdtTs}}</p>
							</li>
						</ul>
					</div>
					<div id="history" class="tab-pane">
						<h4></h4>
						<table class="table">
							<tbody>
								<tr ng-repeat="hist in ord.orderStatHistVOs">
									<td>{{hist.ordHdrStatDes}}&nbsp;&nbsp;<i class="icon-user"></i>
										{{hist.cre8Uid}} made changes - {{hist.cre8Ts}}
									</td>
								</tr>
							</tbody>

						</table>


					</div>
				</div>
				<!-- /.tab-content -->
			</div>
			<!-- /.tabbable -->
		</div>
		<!--/row-->
		<!-- Modal -->
		<div class="modal fade" id="modalAddNew" tabindex="-1" role="dialog"
			aria-labelledby="myModalLabel" aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true">&times;</button>
						<h4 class="modal-title">Create new entry</h4>
					</div>
					<div class="modal-body" style="height: 250px;">
						<form class="form-horizontal" role="form">
							<div class="form-group">
								<label class="col-lg-3 control-label">Item Type:</label>
								<div class="col-lg-8">
									<input type="text" class="form-control input-sm"
										ng-model="item.ordDtlEntyTypCd">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Item:</label>
								<div class="col-lg-8">
									<input type="text" class="form-control input-sm"
										ng-model="item.ordDtlKey">
								</div>
							</div>
							<div class="form-group">
								<label class="col-lg-3 control-label">Quantity:</label>
								<div class="col-lg-8">
									<input type="text" class="form-control input-sm"
										ng-model="item.ordQty">
								</div>
							</div>

							<div class="form-group">
								<label class="col-lg-3 control-label">Amount</label>
								<div class="col-lg-8">
									<input type="text" class="form-control input-sm"
										ng-model="item.totNetAmt">
								</div>
							</div>
						</form>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" id="closeAddNew"
							data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary" id="saveAddNew"
							ng-click="saveOrderItem()">Save</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div>
			<!-- /.modal-dialog -->
		</div>
		<!-- /.modal -->
</div>
</form>
</div>
<!--/.bodycontainer-->
<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal"
					aria-hidden="true">&times;</button>
				<h4 class="modal-title">Confirm Message</h4>
			</div>
			<div class="modal-body">Are you sure you want to delete it !</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" id="confirmFalse"
					data-dismiss="modal">No</button>
				<button type="button" class="btn btn-primary" id="confirmTrue">Yes</button>
			</div>
		</div>
		<!-- /.modal-content -->
	</div>
	<!-- /.modal-dialog -->
</div>
<!-- /.modal -->
<style>
<!--
-->
.carousel-control.right,.carousel-control.left {
	background-image: none;
}

.carousel-control {
	color: #428BCA;
	border: 3px solid #428BCA;
	border-radius: 23px 23px 23px 23px;
	font-size: 60px;
	line-height: 30px;
	opacity: 1;
	background: none repeat scroll 0 0;
}

.carousel-control .icon-prev,.carousel-control .icon-next {
	font-size: 60px;
	margin-right: -15px;
	margin-top: -24px;
}

.carousel-control .icon-prev,.carousel-control .icon-next,.carousel-control .glyphicon-chevron-left,.carousel-control .glyphicon-chevron-right
	{
	position: static;
}

table.display td.right {
	text-align: right;
}
</style>
