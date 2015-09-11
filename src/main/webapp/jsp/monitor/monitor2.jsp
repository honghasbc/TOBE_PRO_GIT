<style>
 .leftTree{    
	background-color: #e1efbb;
} 
</style>

<div class="col-md-12" >
	<div class="page-header">
	<div class ="row">
		<div class ="col-md-4">
				<h3>Project Management</h3>
		</div>
		
		<div class ="col-md-8">
			<ul class="nav navbar-nav navbar-right">
				<li><a href="#"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
				<li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Login</a></li>
			  </ul>
		</div>
	</div>
	</div>
	<div class ="row">
	<nav class="navbar navbar-default">
	  <div class="container-fluid">		
		<div>
		  <ul class="nav navbar-nav">
			<li class="active"><a href="#">Home</a></li>			
			<li><a href="#">Code Table</a></li>
			<li><a href="#">Product Group</a></li>
			<li><a href="#">Image</a></li>
			<li class="dropdown">
				 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Hierarchy<span class="caret"></span></a>
				 <ul class="dropdown-menu">
					<li><a href="#">Customer Hierchy</a></li>
					<li><a href="#">GS1 Hierarchy</a></li>
					<li><a href="#">Product Hierarchy</a></li>					
				 </ul>
			</li>
			<li class="dropdown">
				 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Utilities<span class="caret"></span></a>
				 <ul class="dropdown-menu">
					<li><a href="#">Excel Upload</a></li>
					<li><a href="#">Excel Upload By brick</a></li>
					<li><a href="#">Excel Upload By Primo Pick</a></li>					
					<li><a href="#">Excel Upload By Assortment</a></li>
					<li><a href="#">Case UPC Generator</a></li>
					<li><a href="#">Check Digit Calculator</a></li>					
					<li><a href="#">Check Status</a></li>
				 </ul>
			</li>
			
			<li class="dropdown">
				 <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Admin<span class="caret"></span></a>
				 <ul class="dropdown-menu">
					<li><a href="#">Source Priority</a></li>
					<li><a href="#">Attribute Meta Data</a></li>
					<li><a href="#">Attribute Rule Management</a></li>										
				 </ul>
			</li>
		  </ul>
		</div>
	 </div>
	</nav>
	</div>
	
	<div class="row" >
		<div class="col-sm-3 col-md-2 sidebar leftTree">
          <ul class="nav nav-sidebar">
			<a href="#">Product</a>
				<li>
						<ul class="nav nav-sidebar">
							<li><a href="#">Product Infor</a></li>
							<li><a href="#">Shelf Attributes</a></li>
							<li><a href="#">Rating/ Rating Restriction</a></li>
							<li><a href="#">Special Attributes</a></li>
							<li><a href="#">Heb.com Attributes</a></li>
							<li><a href="#">Break Pack</a></li>
							<li><a href="#">eCommerce View</a></li>
							<li><a href="#">Variants</a></li>
						  </ul>	
				</li>	            
          </ul>
          <ul class="nav nav-sidebar">
			<a href="#">Case Pack</a>
				<li>
						<ul class="nav nav-sidebar">
							<li><a href="#">Case pack Infor</a></li>
							<li><a href="#">Ware House</a></li>
							<li><a href="#">Vendor</a></li>
							<li><a href="#">Item Subtitution</a></li>
							<li><a href="#">Department</a></li>
							<li><a href="#">Item-Upc</a></li>
							<li><a href="#">DRU</a></li>
							<li><a href="#">Import</a></li>
							<li><a href="#">MRT</a></li>
						  </ul>	
				</li>	            
          </ul>
          <ul class="nav nav-sidebar">
			<a href="#">Selling Unit</a>
				<li>
						<ul class="nav nav-sidebar">
							<li><a href="#">UPC Infor</a></li>
							<li><a href="#">Selling Unit UPC-Item</a></li>
							<li><a href="#">Product Catalog</a></li>
							<li><a href="#">GS1 Attributes</a></li>
							<li><a href="#">Image Infor</a></li>							
						  </ul>	
				</li>	            
          </ul>
        </div>
		<div class="col-sm-9">
		<div class="row placeholders">
            <div class="col-sm-6 placeholder">
				<table class="table table-striped table-bordered ">
				<thead>
				  <tr class="success">
					<th>Item Code</th>
					<th>Channel</th>
					<th>Case Pack Description</th>
					<th>Pack</th>
					<th>MRT?</th>
				  </tr>
				</thead>
				<tbody>
				  <tr>
					<td>550</td>
					<td>DSD</td>
					<td>Case pack Description 1</td>
					<td>40</td>
					<td>N</td>
				  </tr>
				  <tr>
					<td>550</td>
					<td>DSD</td>
					<td>Case pack Description 1</td>
					<td>40</td>
					<td>N</td>
				  </tr>
				  <tr>
					<td>550</td>
					<td>DSD</td>
					<td>Case pack Description 1</td>
					<td>40</td>
					<td>N</td>
				  </tr>
				</tbody>
			  </table>
            </div>
            <div class="col-sm-6 placeholder">
				<table class="table table-striped table-bordered ">
				<thead>
				  <tr class="success">
					<th>Selling Unit UPC</th>
					<th>Bonus</th>
					<th>Size</th>
					<th>Product Primary UPC</th>					
				  </tr>
				</thead>
				<tbody>
				  <tr>
					<td>550</td>
					<td>No</td>
					<td>50 LB</td>
					<td>						
						<input type="radio" name="optradio" select ="true">						
					</td>
					
				  </tr>
				  <tr>
					<td>550</td>
					<td>No</td>
					<td>50 LB</td>
					<td>
						
							<input type="radio" name="optradio" select ="false">
						
					</td>
				  </tr>
				  <tr>
					<td>550</td>
					<td>No</td>
					<td>50 LB</td>
					<td>
						
						<input type="radio" name="optradio" select ="false">
						
					</td>
				  </tr>
				</tbody>
			  </table>
            </div>
            
          </div>
		 <div class="row placeholders">		
			<h2 class="sub-header">Section title</h2>
          <div class="table-responsive">
            <table class="table table-striped table-bordered">
              <thead>
                <tr>
                  <th>#</th>
                  <th>Header</th>
                  <th>Header</th>
                  <th>Header</th>
                  <th>Header</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>1,001</td>
                  <td>Lorem</td>
                  <td>ipsum</td>
                  <td>dolor</td>
                  <td>sit</td>
                </tr>
                <tr>
                  <td>1,002</td>
                  <td>amet</td>
                  <td>consectetur</td>
                  <td>adipiscing</td>
                  <td>elit</td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>Integer</td>
                  <td>nec</td>
                  <td>odio</td>
                  <td>Praesent</td>
                </tr>
                <tr>
                  <td>1,003</td>
                  <td>libero</td>
                  <td>Sed</td>
                  <td>cursus</td>
                  <td>ante</td>
                </tr>
                <tr>
                  <td>1,004</td>
                  <td>dapibus</td>
                  <td>diam</td>
                  <td>Sed</td>
                  <td>nisi</td>
                </tr>
                <tr>
                  <td>1,005</td>
                  <td>Nulla</td>
                  <td>quis</td>
                  <td>sem</td>
                  <td>at</td>
                </tr>
                <tr>
                  <td>1,006</td>
                  <td>nibh</td>
                  <td>elementum</td>
                  <td>imperdiet</td>
                  <td>Duis</td>
                </tr>
                <tr>
                  <td>1,007</td>
                  <td>sagittis</td>
                  <td>ipsum</td>
                  <td>Praesent</td>
                  <td>mauris</td>
                </tr>
                <tr>
                  <td>1,008</td>
                  <td>Fusce</td>
                  <td>nec</td>
                  <td>tellus</td>
                  <td>sed</td>
                </tr>
                <tr>
                  <td>1,009</td>
                  <td>augue</td>
                  <td>semper</td>
                  <td>porta</td>
                  <td>Mauris</td>
                </tr>
                <tr>
                  <td>1,010</td>
                  <td>massa</td>
                  <td>Vestibulum</td>
                  <td>lacinia</td>
                  <td>arcu</td>
                </tr>
                <tr>
                  <td>1,011</td>
                  <td>eget</td>
                  <td>nulla</td>
                  <td>Class</td>
                  <td>aptent</td>
                </tr>
                <tr>
                  <td>1,012</td>
                  <td>taciti</td>
                  <td>sociosqu</td>
                  <td>ad</td>
                  <td>litora</td>
                </tr>
                <tr>
                  <td>1,013</td>
                  <td>torquent</td>
                  <td>per</td>
                  <td>conubia</td>
                  <td>nostra</td>
                </tr>
                <tr>
                  <td>1,014</td>
                  <td>per</td>
                  <td>inceptos</td>
                  <td>himenaeos</td>
                  <td>Curabitur</td>
                </tr>
                <tr>
                  <td>1,015</td>
                  <td>sodales</td>
                  <td>ligula</td>
                  <td>in</td>
                  <td>libero</td>
                </tr>
              </tbody>
            </table>
          </div>
		</div> 
		</div>	
		
	</div>
	
</div>
