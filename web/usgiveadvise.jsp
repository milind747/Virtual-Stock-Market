<%@page import="model.SharedetailNew"%>
<%@page import="java.util.ArrayList"%>
<%@page import="model.Stock"%>
<%@page import="model.Registration"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Trade Market a Corporate Business Category Flat Bootstrap Responsive Website Template | Equity :: w3layouts</title>
        <!-- for-mobile-apps -->
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
        <meta name="keywords" content="Trade Market Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
            function hideURLbar(){ window.scrollTo(0,1); } </script>
        <!-- //for-mobile-apps -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
        <link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
        <!-- font-awesome icons -->
        <link rel="stylesheet" href="css/font-awesome.min.css" />
        <!-- //font-awesome icons -->
        <!-- js -->
        <script src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/jquery.marquee.min.js"></script>
        <!-- //js -->
        <link href="//fonts.googleapis.com/css?family=Muli:300,300i,400,400i" rel="stylesheet">
        <!-- start-smoth-scrolling -->
        <script type="text/javascript" src="js/move-top.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript">
jQuery(document).ready(function ($) {
    $(".scroll").click(function (event) {
        event.preventDefault();
        $('html,body').animate({scrollTop: $(this.hash).offset().top}, 1000);
    });
});


        </script>

       
        <!-- start-smoth-scrolling -->
    </head>

    <body>
        <!-- header -->
        <%@include file="usheader.jsp" %>
        <!-- //navigation -->
        <!-- banner-bottom -->
        <div class="banner-bottom">
            <div class="panel panel-default agile_panel">
                <div class="panel-body agile_panel_body">
                    <ul class="demo1">
                        <li class="news-item">
                            <table class="w3_table_trade">
                                <tr>
                                    <td class="w3_agileits_td demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">NIFTY 50</td>
                                            </tr>
                                            <tr>
                                                <td>8,638.23<i><span class="caret"></span>-8.35(-0.10%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">SILVER</td>
                                            </tr>
                                            <tr>
                                                <td>46,343.56<i><span class="caret"></span>-186.00(-0.40%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;">Dollar-Rupee</td>
                                            </tr>
                                            <tr>
                                                <td>66.8650<i class="wthree_i"><span class="caret caret1"></span>0.00(0.00%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">CRUDEOIL</td>
                                            </tr>
                                            <tr>
                                                <td>3,097.00<i><span class="caret"></span>-7.00(-0.23%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>
                        </li>
                        <li class="news-item">
                            <table class="w3_table_trade">
                                <tr>
                                    <td class="w3_agileits_td demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">gold</td>
                                            </tr>
                                            <tr>
                                                <td>31,350.23<i><span class="caret"></span>-117.00(-0.37%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">ftsc</td>
                                            </tr>
                                            <tr>
                                                <td>6.887.93<i><span class="caret"></span>-5.99(-0.09%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">cac</td>
                                            </tr>
                                            <tr>
                                                <td>4,436.70<i><span class="caret"></span>-23.00(0.54%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">dax</td>
                                            </tr>
                                            <tr>
                                                <td>10,596.00<i><span class="caret"></span>-79.89(-0.75%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>
                        </li>
                        <li class="news-item">
                            <table class="w3_table_trade">
                                <tr>
                                    <td class="w3_agileits_td demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">sensex</td>
                                            </tr>
                                            <tr>
                                                <td>2,7993.64<i><span class="caret"></span>-66.59(-0.24%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">nhai</td>
                                            </tr>
                                            <tr>
                                                <td>1,256.00<i style="color:#00AA00"><span class="caret caret1"></span>16.20(1.31%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;">Euro-Rupee</td>
                                            </tr>
                                            <tr>
                                                <td>75.42<i class="wthree_i"><span class="caret caret1"></span>0.03(0.04%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                    <td class="demo1_w3_table_trade">
                                        <table class="agileits_w3layouts_table">
                                            <tr>
                                                <td style="color:#01A9CE;text-transform:uppercase;">iifl</td>
                                            </tr>
                                            <tr>
                                                <td>1,006.51<i><span class="caret"></span>-1.25(-0.12%)</i></td>
                                            </tr>
                                        </table>
                                    </td>
                                </tr>
                            </table>							
                        </li>
                    </ul>
                </div>
                <div class="panel-footer"> </div>
            </div>
            <script type="text/javascript">
                $(function () {
                    $(".demo1").bootstrapNews({
                        newsPerPage: 1,
                        autoplay: true,
                        pauseOnHover: true,
                        direction: 'up',
                        newsTickerInterval: 3000,
                        onToDo: function () {
                            //console.log(this);
                        }
                    });

                    $(".demo2").bootstrapNews({
                        newsPerPage: 3,
                        autoplay: true,
                        pauseOnHover: true,
                        navigation: false,
                        direction: 'up',
                        newsTickerInterval: 2500,
                        onToDo: function () {
                            //console.log(this);
                        }
                    });
                });
            </script>
            <script src="js/jquery.bootstrap.newsbox.min.js" type="text/javascript"></script>
            <div class='agileinfo_marquee'>
                <div data-speed="10" class="marquee">
                    <ul>
                        <li><a href="single.html">NPAs of associate banks to weigh on SBI: Religare Capital<span>\</span></a></li>
                        <li><a href="single.html">Julius Baer analyst sees opportunities in despised China market</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <!-- //banner-bottom -->
        <!-- equity -->

        
        <div class="w3l_your_stocks">
						<h3><i class="fa fa-stack-exchange" aria-hidden="true"></i>Give Advise</h3>
						<form action="finaladviseServ" method="post">
                                                    
                                                     <%
                                                        ArrayList<SharedetailNew> al;
                                                        if (request.getAttribute("al1") != null) {
                                                        al = (ArrayList<SharedetailNew>) request.getAttribute("al1");
                                                        for (SharedetailNew s : al) {%>
                                                        
                                                        <span>
								<label>Stock Name</label>
								<input type="text" name="stockname" value=" <%=s.getName()%>" readonly="">
							</span>
							<span>
								<label>Current Price</label>
								<input type="text" name="" value="<%=s.getPrice()%>" readonly="">
							</span>
                                                        <span>
								<label>User Name </label>
								<input type="text" name="username" value="" required="">
							</span>
                                                        <span>
								<label>Email ID</label>
								<input type="text" name="emailid" value="" required="">
							</span>
                                                        <span>
								<label>Advise</label>
								<input type="text" name="advise" value="" required="">
							</span>
                                                        <br>
							<input style="height:40px;width:200px" type="submit" value="Submit"><br>
						<% }

                                                     }
                                                %>
                                                
                                                </form>
                                                </br></br></br>
					</div>
        <%--
        <br><br>
        <form action="finaladviseServ" method="post">
          
            <%
                ArrayList<SharedetailNew> al;
                if (request.getAttribute("al1") != null) {
                    al = (ArrayList<SharedetailNew>) request.getAttribute("al1");
                    for (SharedetailNew s : al) {%>

            Stock name : <input type="text" name="stockname" value=" <%=s.getName()%>" readonly=""><br>
            Current price : <input type="text" name="" value="<%=s.getPrice()%>" readonly=""><br>
            User Name : <input type="text" name="username" value="" required=""><br>
            Email ID : <input type="text" name="emailid" value="" required=""><br>
            Advise : <input type="text" name="advise" value="" required=""><br><br>
           
            <input style="height:40px;width:200px" type="submit" value="Submit"><br>


            <% }

                }
            %>
        </form>


        </br></br></br>
        --%>
        <!-- //equity -->
        <!-- footer -->

        <%@include file="footer.jsp" %>

        <!-- //footer -->
        <!-- stacked-graph -->
        <script type="text/javascript" src="js/raphael.js"></script>
        <script type="text/javascript" src="js/jquery.enumerable.js"></script>
        <script type="text/javascript" src="js/jquery.tufte-graph.js"></script>
        <script type="text/javascript">
                $(document).ready(function () {

                    jQuery('#stacked-graph').tufteBar({
                        data: [
                            [[1.5, 1.0, 0.51], {label: '2013'}],
                            [[2.0, 1.03, 0.6], {label: '2014'}],
                            [[2.4, 0.9, 2.0], {label: '2015'}],
                            [[1.5, 2.6, 0.45], {label: '2016'}]
                        ],
                        barLabel: function (index) {
                            amount = ($(this[0]).sum() * 10000).toFixed(0);
                            return '$' + $.tufteBar.formatNumber(amount);
                        },
                        axisLabel: function (index) {
                            return this[1].label
                        },
                        legend: {
                            data: ["Finance", "Metal", "Telecom"]
                        }
                    });
                });
        </script>
        <!-- //stacked-graph -->
        <!-- script for marque -->
        <script>
            $('.marquee').marquee({
                gap: 100,
                delayBeforeStart: 0,
                direction: 'left',
                duplicated: true,
                pauseOnHover: true
            });
        </script>

        <!-- //script for marque -->
        <!-- Bootstrap Core JavaScript -->
        <script src="js/bootstrap.min.js"></script>
        <script>
            $(document).ready(function () {
                $(".dropdown").hover(
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideDown("fast");
                            $(this).toggleClass('open');
                        },
                        function () {
                            $('.dropdown-menu', this).stop(true, true).slideUp("fast");
                            $(this).toggleClass('open');
                        }
                );
            });
        </script>
        <!-- //Bootstrap Core JavaScript -->
        <!-- here stars scrolling icon -->
        <script type="text/javascript">
            $(document).ready(function () {
                /*
                 var defaults = {
                 containerID: 'toTop', // fading element id
                 containerHoverID: 'toTopHover', // fading element hover id
                 scrollSpeed: 1200,
                 easingType: 'linear' 
                 };
                 */

                $().UItoTop({easingType: 'easeOutQuart'});

            });
        </script>
        <!-- //here ends scrolling icon -->
    </body>
</html>