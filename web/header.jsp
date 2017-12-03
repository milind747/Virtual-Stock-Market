<div class="header">
		<div class="w3ls_header_top">
			<div class="container">
				<div class="w3l_header_left">
					<ul class="w3layouts_header">
						<li class="w3layouts_header_list">
							<ul>
								<li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Language<span class="caret"></span></a>
									<div class="mega-dropdown-menu">
										<ul class="dropdown-menu w3_dropdown">
											<li><a href="#">English</a></li> 
											<li><a href="#">Hindi</a></li>
										</ul>              
									</div>	
								</li>
								<li>
									<i>|</i>
								</li>
							</ul>
						</li>
                                                
						<li class="w3layouts_header_list">
							<a href="login.jsp">Login To Trade</a><i>|</i>
						</li>
                                                	<li class="w3layouts_header_list">
							<a href="faq.jsp">FAQ</a><i>|</i>
						</li>
						<li class="w3layouts_header_list">
							<a href="contact.jsp">Contact Us</a>
						</li>
                                                
					</ul>
				</div>
                                <%--	<div class="w3l_header_right">
					<h2><i class="glyphicon glyphicon-earphone" aria-hidden="true"></i>+(000) 123 456 678</h2>
				</div>
                                --%>
				<div class="clearfix"> </div>
			</div>
		</div>
		<div class="w3ls_header_middle">
			<div class="container">
				<div class="agileits_logo">
					<h1><a href="index.jsp"><span>Virtual Stock Market</span><i>Trade anytime anywhere</i></a></h1>
				</div>
				<div class="agileits_search">
					<form action="#" method="post">
						<input name="Search" type="text" placeholder="Search" required="">
						<select id="agileinfo_search" name="agileinfo_search">
							<option value="commodities">Commodities</option>
							<option value="navs">NAVs</option>
							<option value="quotes">Quotes</option>
							<option value="videos">Videos</option>
							<option value="news">News</option>
							<option value="notices">Notices</option>
							<option value="all">All</option>
						</select>
						<input type="submit" value="Search">
					</form>
				</div>
				<div class="clearfix"> </div>
			</div>
		</div>
	</div>
<!-- //header -->
<!-- navigation -->
<% /*	<div class="trade_navigation">
		<div class="container">
			<nav class="navbar nav_bottom">
			 <!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
				  <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				</div> 
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<nav class="wthree_nav">
						<ul class="nav navbar-nav nav_1">
							<li class="act"><a href="index.html">Home</a></li>
							<li><a href="equity.jsp">Equity</a></li>
							<li><a href="commodities.jsp">Commodities</a></li>
							<li><a href="news.jsp">News</a></li>
							<li><a href="products.jsp">Products</a></li>
                                                        
						
							<li><a href="portfolio.jsp">Portfolio</a></li>
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>  */ %>
        
        <div class="trade_navigation">
		<div class="container">
			<nav class="navbar nav_bottom">
			 <!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header nav_2">
				  <button type="button" class="navbar-toggle collapsed navbar-toggle1" data-toggle="collapse" data-target="#bs-megadropdown-tabs">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
				</div> 
			   <!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-megadropdown-tabs">
					<nav class="wthree_nav">
						<ul class="nav navbar-nav nav_1">
							<li class="act"><a href="index.jsp">Home</a></li>
                                                        <li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Manage Stocks<span class="caret"></span></a>
									<div class="mega-dropdown-menu">
										<ul class="dropdown-menu w3_dropdown">
                                                                                        <li><a href="stockServ">View Stocks</a></li>
                                                                                        <li><a href="portfolioServ">Portfolio</a></li>
											<li><a href="transacServ">Transactions</a></li> 
										</ul>              
									</div>	
                                                        </li>
                                                        
                                                        <li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Leaderboard<span class="caret"></span></a>
									<div class="mega-dropdown-menu">
										<ul class="dropdown-menu w3_dropdown">
                                                                                        <li><a href="topgainServ">Top Gainers</a></li>
                                                                                        <li><a href="toploseServ">Top Losers</a></li>
										</ul>              
									</div>	
                                                        </li>
                                                        
                                                        <li><a href="graph.jsp">Graphical Analysis</a></li>
                                                        <li><a href="displaywlServ">Watchlist</a></li>
                                                        
                                                        <li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Feedback<span class="caret"></span></a>
									<div class="mega-dropdown-menu">
										<ul class="dropdown-menu w3_dropdown">
											<li><a href="addfeedServ">Give Feedback</a></li> 
											<li><a href="viewfeedServ">View Feedback</a></li>
										</ul>              
									</div>	
                                                        </li>
                                                        <li class="dropdown">
									<a href="#" class="dropdown-toggle" data-toggle="dropdown">Expert Advise<span class="caret"></span></a>
									<div class="mega-dropdown-menu">
										<ul class="dropdown-menu w3_dropdown">
											<li><a href="adviseaddServ">Give Advise</a></li> 
											<li><a href="adviseviewServ">View Advise</a></li>
										</ul>              
									</div>	
                                                        </li>
                                                        <li><a href="viewpriceServ">Shop</a></li>
                                                        
							
						</ul>
					</nav>
				</div>
			</nav>
		</div>
	</div>
<!-- //navigation -->