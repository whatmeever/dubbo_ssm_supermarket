<%@ page language="java" contentType="text/html; charset=UTF-8"
		 pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="zxx">

<head>
	<title>主页-${goodType.gtname}</title>
	<!--/tags -->
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta name="keywords" content="" />
	<style>
		.goodsImg{
			width: 120px;
			height: 160px;
		}
		.goodsHref{
			max-width: 180px;
			overflow: hidden;
			white-space: nowrap;
			text-overflow: ellipsis;
			display:block;

		}
		a{
			white-space: nowrap;
			overflow: hidden;display:block;
		}
		h3{white-space: nowrap; overflow: hidden;display:block;}
        #bianJu{
            margin-top: 20px;
        }

	</style>
	<script>
		addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
	<!--//tags -->
	<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
	<link href="css/font-awesome.css" rel="stylesheet">
	<!--pop-up-box-->
	<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all" />
	<!--//pop-up-box-->
	<!-- price range -->
	<link rel="stylesheet" type="text/css" href="css/jquery-ui1.css">
	<!-- fonts -->
	<link href="http://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800" rel="stylesheet">
</head>

<body>
<% int i = 0;%>
	<!-- top-header -->
	<div class="header-most-top">
		<p>杂货优惠区优惠和折扣</p>
	</div>
	<!-- //top-header -->
	<!-- header-bot-->
	<div class="header-bot">
		<div class="header-bot_inner_wthreeinfo_header_mid">
			<!-- header-bot-->
			<div class="col-md-4 logo_agile">
				<h1>
					<a href="index.jsp">
						<span>G</span>rocery
						<span>S</span>hoppy
						<img src="images/logo2.png" alt=" ">
					</a>
				</h1>
			</div>
			<!-- header-bot -->
			<div class="col-md-8 header">
				<!-- header lists -->
				<ul>
					<li>
						<a class="play-icon popup-with-zoom-anim" href="#small-dialog1">
							<span class="fa fa-map-marker" aria-hidden="true"></span>商店定位</a>
					</li>
					<li>
						<a href="#" data-toggle="modal" data-target="#myModal1">
							<span class="fa fa-truck" aria-hidden="true"></span>跟踪订单</a>
					</li>
					<li>
						<span class="fa fa-phone" aria-hidden="true"></span> 18966836506
					</li>
                    <c:choose>
                        <c:when test="${sessionScope.users == null}">
                            <li>
                                <a href="#" data-toggle="modal" data-target="#myModal1">
                                    <span class="fa fa-unlock-alt" aria-hidden="true"></span> 登录 </a>
                            </li>
                            <li>
                                <a href="#" data-toggle="modal" data-target="#myModal2">
                                    <span class="fa fa-pencil-square-o" aria-hidden="true"></span> 注册 </a>
                            </li>
                        </c:when>
                        <c:otherwise>
                            <li>
                                <a href="#" id="logout">
                                    <span class="fa fa-unlock-alt" aria-hidden="true"></span> 注销 </a>
                            </li>
                        </c:otherwise>
                    </c:choose>
				</ul>
				<!-- //header lists -->
				<!-- search -->
				<div class="agileits_search">
					<form action="#" method="post">
						<input name="Search" type="search" placeholder="How can we help you today?" required="">
						<button type="submit" class="btn btn-default" aria-label="Left Align">
							<span class="fa fa-search" aria-hidden="true"> </span>
						</button>
					</form>
				</div>
				<!-- //search -->
				<!-- cart details -->
				<div class="top_nav_right">
					<div class="wthreecartaits wthreecartaits2 cart cart box_1">
						<form action="#" method="post" class="last">
							<input type="hidden" name="cmd" value="_cart">
							<input type="hidden" name="display" value="1">
							<button class="w3view-cart" type="submit" name="submit" value="">
								<i class="fa fa-cart-arrow-down" aria-hidden="true"></i>
							</button>
						</form>
					</div>
				</div>
				<!-- //cart details -->
				<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- shop locator (popup) -->
	<!-- Button trigger modal(shop-locator) -->
	<div id="small-dialog1" class="mfp-hide">
		<div class="select-city">
			<h3>请选择您的位置</h3>
			<select class="list_of_cities">
				<optgroup label="Popular Cities">
					<option selected style="display:none;color:#eee;">请选择城市</option>
					<option>Birmingham</option>
					<option>Anchorage</option>
					<option>Phoenix</option>
					<option>Little Rock</option>
					<option>Los Angeles</option>
					<option>Denver</option>
					<option>Bridgeport</option>
					<option>Wilmington</option>
					<option>Jacksonville</option>
					<option>Atlanta</option>
					<option>Honolulu</option>
					<option>Boise</option>
					<option>Chicago</option>
					<option>Indianapolis</option>
				</optgroup>
			</select>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //shop locator (popup) -->
	<!-- signin Model -->
	<!-- Modal1 -->
	<div class="modal fade" id="myModal1" tabindex="-1" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body modal-body-sub_agile">
					<div class="main-mailposi">
						<span class="fa fa-envelope-o" aria-hidden="true"></span>
					</div>
					<div class="modal_body_left modal_body_left1">
						<h3 class="agileinfo_sign">登录 </h3>
						<p>
							现在，让我们开始您的杂货店购物。没有帐户?
							<a href="#" data-toggle="modal" data-target="#myModal2">
								立即注册</a>
						</p>
						<form action="#" method="post">
							<div class="styled-input agile-styled-input-top">
								<input type="text" placeholder="用户名" name="Name" required="">
							</div>
							<div class="styled-input">
								<input type="password" placeholder="密码" name="password" required="">
							</div>
							<input type="submit" value="登录">
						</form>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<!-- //Modal content-->
		</div>
	</div>
	<!-- //Modal1 -->
	<!-- //signin Model -->
	<!-- signup Model -->
	<!-- Modal2 -->
	<div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
		<div class="modal-dialog">
			<!-- Modal content-->
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">&times;</button>
				</div>
				<div class="modal-body modal-body-sub_agile">
					<div class="main-mailposi">
						<span class="fa fa-envelope-o" aria-hidden="true"></span>
					</div>
					<div class="modal_body_left modal_body_left1">
						<h3 class="agileinfo_sign">注册</h3>
						<p>
							快来加入杂货店吧！请设置您的帐户。
						</p>
						<form action="#" method="post">
							<div class="styled-input agile-styled-input-top">
								<input type="text" placeholder="用户名" name="Name" required="">
							</div>
							<div class="styled-input">
								<input type="email" placeholder="E-mail" name="Email" required="">
							</div>
							<div class="styled-input">
								<input type="password" placeholder="密码" name="password" id="password1" required="">
							</div>
							<div class="styled-input">
								<input type="password" placeholder="确认密码" name="Confirm Password" id="password2" required="">
							</div>
							<input type="submit" value="注册">
						</form>
						<p>
							<a href="#">点击注册即表示我同意您的条款</a>
						</p>
					</div>
				</div>
			</div>
			<!-- //Modal content-->
		</div>
	</div>
	<!-- //Modal2 -->
	<!-- //signup Model -->
	<!-- //header-bot -->
	<!-- navigation -->
	<div class="ban-top">
		<div class="container">
			<div class="agileits-navi_search">
				<form action="#" method="post">
					<select id="agileinfo-nav_search" name="agileinfo_search" required="" class="goodTypes">
						<%--<option value="">All Categories</option>
						<option value="Kitchen">Kitchen</option>
						<option value="Household">Household</option>
						<option value="Snacks &amp; Beverages">Snacks & Beverages</option>
						<option value="Personal Care">Personal Care</option>
						<option value="Gift Hampers">Gift Hampers</option>
						<option value="Fruits &amp; Vegetables">Fruits & Vegetables</option>
						<option value="Baby Care">Baby Care</option>
						<option value="Soft Drinks &amp; Juices">Soft Drinks & Juices</option>
						<option value="Frozen Food">Frozen Food</option>
						<option value="Bread &amp; Bakery">Bread & Bakery</option>
						<option value="Sweets">Sweets</option>--%>
					</select>
				</form>
			</div>
			<div class="top_nav_left">
				<nav class="navbar navbar-default">
					<div class="container-fluid">
						<!-- Brand and toggle get grouped for better mobile display -->
						<div class="navbar-header">
							<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"
							    aria-expanded="false">
								<span class="sr-only">Toggle navigation</span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
								<span class="icon-bar"></span>
							</button>
						</div>
						<!-- Collect the nav links, forms, and other content for toggling -->
						<div class="collapse navbar-collapse menu--shylock" id="bs-example-navbar-collapse-1">
							<ul class="nav navbar-nav menu__list">
								<li>
									<a class="nav-stylehead" href="index.jsp">主页
										<span class="sr-only">(current)</span>
									</a>
								</li>
								<li class="">
									<a class="nav-stylehead" href="about.jsp">关于我们</a>
								</li>

								</li>
								<li class="">
									<a class="nav-stylehead" href="faqs.jsp">常见问题解答</a>
								</li>

								<li>
									<a class="" href="contact.jsp">联系我们</a>
								</li>
							</ul>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>
	<!-- //navigation -->
	<!-- banner-2 -->
	<div class="page-head_agile_info_w3l">

	</div>
	<!-- //banner-2 -->
	<!-- page -->
	<div class="services-breadcrumb">
		<div class="agile_inner_breadcrumb">
			<div class="container">
				<ul class="w3_short">
					<li>
						<a href="index.jsp">主页</a>
						<i>|</i>
					</li>
					<li>${goodType.gtname} </li>
				</ul>
			</div>

		</div>
	</div>
	<!-- //page -->
	<!-- top Products -->
	<div class="ads-grid">
		<div class="container">
			<!-- tittle heading -->
			<h3 class="tittle-w3l">${goodType.gtname}
				<span class="heading-style">
					<i></i>
					<i></i>
					<i></i>
				</span>
			</h3>
			<!-- //tittle heading -->
			<!-- product left -->
			<div class="side-bar col-md-3">
				<div class="search-hotel">
					<h3 class="agileits-sear-head">搜索</h3>
					<form action="#" method="post">
						<input type="search" placeholder="物品名字" name="search" required="">
						<input type="submit" value=" ">
					</form>
				</div>
				<!-- price range -->
				<div class="range">
					<h3 class="agileits-sear-head">价格范围</h3>
					<ul class="dropdown-menu6">
						<li>

							<div id="slider-range"></div>
							<input type="text" id="amount" style="border: 0; color: #ffffff; font-weight: normal;" />
						</li>
					</ul>
				</div>
				<!-- //price range -->
				<!-- food preference -->
				<div class="left-side" id="preference">
					<h3 class="agileits-sear-head">食物偏好</h3>
					<ul>
						<li>
							<input type="radio" name="pre" value="1" >
							<span class="span">其他</span>
						</li>
						<li>
							<input type="radio" name="pre" value="2" >
							<span class="span">素食主义</span>
						</li>
						<li>
							<input type="radio" name="pre" value="3" >
							<span class="span">荤食主义</span>
						</li>
					</ul>
				</div>
				<!-- //food preference -->
				<!-- discounts -->
				<div class="left-side">
					<h3 class="agileits-sear-head">折扣</h3>
					<ul>
						<li>
							<input type="radio" class="checked" >
							<span class="span">5% or More</span>
						</li>
						<li>
							<input type="radio" class="checked">
							<span class="span">10% or More</span>
						</li>
						<li>
							<input type="radio" class="checked">
							<span class="span">20% or More</span>
						</li>
						<li>
							<input type="radio" class="checked">
							<span class="span">30% or More</span>
						</li>
						<li>
							<input type="radio" class="checked">
							<span class="span">50% or More</span>
						</li>
						<li>
							<input type="radio" class="checked">
							<span class="span">60% or More</span>
						</li>
					</ul>
				</div>
				<!-- //discounts -->
				<!-- reviews -->
				<div class="customer-rev left-side">
					<h3 class="agileits-sear-head">顾客评价</h3>
					<ul>
						<li>
							<a href="#">
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<span>5.0</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<span>4.0</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star-half-o" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<span>3.5</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<span>3.0</span>
							</a>
						</li>
						<li>
							<a href="#">
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star" aria-hidden="true"></i>
								<i class="fa fa-star-half-o" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<i class="fa fa-star-o" aria-hidden="true"></i>
								<span>2.5</span>
							</a>
						</li>
					</ul>
				</div>
				<!-- //reviews -->
				<!-- cuisine -->
				<%--<div class="left-side">
					<h3 class="agileits-sear-head">Cuisine</h3>
					<ul>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">South American</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">French</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Greek</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Chinese</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Japanese</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Italian</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Mexican</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Thai</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span">Indian</span>
						</li>
						<li>
							<input type="checkbox" class="checked">
							<span class="span"> Spanish </span>
						</li>
					</ul>
				</div>--%>
				<!-- //cuisine -->
				<!-- deals -->
				<div class="deal-leftmk left-side" id="specialGoods">
					<h3 class="agileits-sear-head">Special Deals</h3>

				</div>
				<!-- //deals -->
			</div>
			<!-- //product left -->
			<!-- product right -->
			<div class="agileinfo-ads-display col-md-9 w3l-rightpro">
				<div class="wrapper">
					<!-- first section -->

					<div class="product-sec1" >
							<c:forEach items="${freshGoods}" var="goods">

						<div class="col-xs-4 product-men" id="bianJu">
							<div class="men-pro-item simpleCart_shelfItem" id="bianKuang">
								<div class="men-thumb-item">

									<img src="img/${imgs.get(goods.fdid)}.jpg" alt="" class="goodsImg">

									<div class="men-cart-pro">
										<div class="inner-men-cart-pro">
											<a href="getGoodDetailsByFdid?fdid=${goods.fdid}" class="link-product-add-cart">Quick View</a>
										</div>
									</div>
									<span class="product-new-top">New</span>
								</div>
								<div class="item-info-product ">
									<h4>
										<a href="getGoodDetailsByFdid?fdid=${goods.fdid}" class="goodsHref">${goods.goodName}</a>
									</h4>
									<div class="info-product-price">
										<span class="item_price">${goods.price*goods.discount/100}</span>
										<del>$${goods.price}</del>
									</div>
									<div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
										<form action="#" method="post">
											<fieldset>
												<input type="hidden" name="cmd" value="_cart" />
												<input type="hidden" name="add" value="1" />
												<input type="hidden" name="business" value=" " />
												<input type="hidden" name="item_name" value="Zeeba Basmati Rice - 5 KG" />
												<input type="hidden" name="amount" value="950.00" />
												<input type="hidden" name="discount_amount" value="1.00" />
												<input type="hidden" name="currency_code" value="USD" />
												<input type="hidden" name="return" value=" " />
												<input type="hidden" name="cancel_return" value=" " />
												<input type="submit" name="submit" value="加入购物车" class="button" />
											</fieldset>
										</form>
									</div>

								</div>
							</div>
						</div>

								<% i=i+1;%>
							</c:forEach>
                        <div class="clearfix"></div>

					</div>
					<!-- //first section -->


				</div>
			</div>
			<!-- //product right -->
		</div>
	</div>
	<!-- //top products -->
	<!-- special offers -->
	<div class="featured-section" id="projects">
		<div class="container">
			<!-- tittle heading -->
			<h3 class="tittle-w3l">Special Offers
				<span class="heading-style">
					<i></i>
					<i></i>
					<i></i>
				</span>
			</h3>
			<!-- //tittle heading -->
			<div class="content-bottom-in">
				<ul id="flexiselDemo1" class="specialOffers">
					<%--<li>
						<div class="w3l-specilamk">
							<div class="speioffer-agile">
								<a href="single2.jsp">
									<img src="images/s9.jpg" alt="">
								</a>
							</div>
							<div class="product-name-w3l">
								<h4>
									<a href="single2.jsp">Lakme Eyeconic Kajal, 0.35 g</a>
								</h4>
								<div class="w3l-pricehkj">
									<h6>$153.00</h6>
									<p>Save $40.00</p>
								</div>
								<div class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out">
									<form action="#" method="post">
										<fieldset>
											<input type="hidden" name="cmd" value="_cart" />
											<input type="hidden" name="add" value="1" />
											<input type="hidden" name="business" value=" " />
											<input type="hidden" name="item_name" value="Lakme Eyeconic Kajal, 0.35 g" />
											<input type="hidden" name="amount" value="153.00" />
											<input type="hidden" name="discount_amount" value="1.00" />
											<input type="hidden" name="currency_code" value="USD" />
											<input type="hidden" name="return" value=" " />
											<input type="hidden" name="cancel_return" value=" " />
											<input type="submit" name="submit" value="Add to cart" class="button" />
										</fieldset>
									</form>
								</div>
							</div>
						</div>
					</li>--%>
				</ul>
			</div>
		</div>
	</div>
	<!-- //special offers -->
	<!-- newsletter -->
	<div class="footer-top">
		<div class="container-fluid">
			<div class="col-xs-8 agile-leftmk">
				<h2>Get your Groceries delivered from local stores</h2>
				<p>Free Delivery on your first order!</p>
				<form action="#" method="post">
					<input type="email" placeholder="E-mail" name="email" required="">
					<input type="submit" value="Subscribe">
				</form>
				<div class="newsform-w3l">
					<span class="fa fa-envelope-o" aria-hidden="true"></span>
				</div>
			</div>
			<div class="col-xs-4 w3l-rightmk">
				<img src="images/tab3.png" alt=" ">
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //newsletter -->
	<!-- footer -->
	<footer>
		<div class="container">
			<!-- footer first section -->
			<p class="footer-main">
				<span>"Grocery Shoppy"</span> Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur
				magni dolores eos qui ratione voluptatem sequi nesciunt.Sed ut perspiciatis unde omnis iste natus error sit voluptatem
				accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto
				beatae vitae dicta sunt explicabo.</p>
			<!-- //footer first section -->
			<!-- footer second section -->
			<div class="w3l-grids-footer">
				<div class="col-xs-4 offer-footer">
					<div class="col-xs-4 icon-fot">
						<span class="fa fa-map-marker" aria-hidden="true"></span>
					</div>
					<div class="col-xs-8 text-form-footer">
						<h3>Track Your Order</h3>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-xs-4 offer-footer">
					<div class="col-xs-4 icon-fot">
						<span class="fa fa-refresh" aria-hidden="true"></span>
					</div>
					<div class="col-xs-8 text-form-footer">
						<h3>Free & Easy Returns</h3>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="col-xs-4 offer-footer">
					<div class="col-xs-4 icon-fot">
						<span class="fa fa-times" aria-hidden="true"></span>
					</div>
					<div class="col-xs-8 text-form-footer">
						<h3>Online cancellation </h3>
					</div>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
			<!-- //footer second section -->
			<!-- footer third section -->
			<div class="footer-info w3-agileits-info">
				<!-- footer categories -->
				<div class="col-sm-5 address-right">
					<div class="col-xs-6 footer-grids">
						<h3>Categories</h3>
						<ul>
							<li>
								<a href="product.jsp">Grocery</a>
							</li>
							<li>
								<a href="product.jsp">Fruits</a>
							</li>
							<li>
								<a href="product.jsp">Soft Drinks</a>
							</li>
							<li>
								<a href="product2.jsp">Dishwashers</a>
							</li>
							<li>
								<a href="product.jsp">Biscuits & Cookies</a>
							</li>
							<li>
								<a href="product2.jsp">Baby Diapers</a>
							</li>
						</ul>
					</div>
					<div class="col-xs-6 footer-grids agile-secomk">
						<ul>
							<li>
								<a href="product.jsp">Snacks & Beverages</a>
							</li>
							<li>
								<a href="product.jsp">Bread & Bakery</a>
							</li>
							<li>
								<a href="product.jsp">Sweets</a>
							</li>
							<li>
								<a href="product.jsp">Chocolates & Biscuits</a>
							</li>
							<li>
								<a href="product2.jsp">Personal Care</a>
							</li>
							<li>
								<a href="product.jsp">Dried Fruits & Nuts</a>
							</li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
				<!-- //footer categories -->
				<!-- quick links -->
				<div class="col-sm-5 address-right">
					<div class="col-xs-6 footer-grids">
						<h3>Quick Links</h3>
						<ul>
							<li>
								<a href="about.jsp">About Us</a>
							</li>
							<li>
								<a href="contact.jsp">Contact Us</a>
							</li>
							<li>
								<a href="help.jsp">Help</a>
							</li>
							<li>
								<a href="faqs.jsp">Faqs</a>
							</li>
							<li>
								<a href="terms.jsp">Terms of use</a>
							</li>
							<li>
								<a href="privacy.jsp">Privacy Policy</a>
							</li>
						</ul>
					</div>
					<div class="col-xs-6 footer-grids">
						<h3>Get in Touch</h3>
						<ul>
							<li>
								<i class="fa fa-map-marker"></i> 123 Sebastian, USA.</li>
							<li>
								<i class="fa fa-mobile"></i> 333 222 3333 </li>
							<li>
								<i class="fa fa-phone"></i> +222 11 4444 </li>
							<li>
								<i class="fa fa-envelope-o"></i>
								<a href="mailto:example@mail.com"> mail@example.com</a>
							</li>
						</ul>
					</div>
				</div>
				<!-- //quick links -->
				<!-- social icons -->
				<div class="col-sm-2 footer-grids  w3l-socialmk">
					<h3>Follow Us on</h3>
					<div class="social">
						<ul>
							<li>
								<a class="icon fb" href="#">
									<i class="fa fa-facebook"></i>
								</a>
							</li>
							<li>
								<a class="icon tw" href="#">
									<i class="fa fa-twitter"></i>
								</a>
							</li>
							<li>
								<a class="icon gp" href="#">
									<i class="fa fa-google-plus"></i>
								</a>
							</li>
						</ul>
					</div>
					<div class="agileits_app-devices">
						<h5>Download the App</h5>
						<a href="#">
							<img src="images/1.png" alt="">
						</a>
						<a href="#">
							<img src="images/2.png" alt="">
						</a>
						<div class="clearfix"> </div>
					</div>
				</div>
				<!-- //social icons -->
				<div class="clearfix"></div>
			</div>
			<!-- //footer third section -->
			<!-- footer fourth section (text) -->
			<div class="agile-sometext">
				<div class="sub-some">
					<h5>Online Grocery Shopping</h5>
					<p>Order online. All your favourite products from the low price online supermarket for grocery home delivery in Delhi,
						Gurgaon, Bengaluru, Mumbai and other cities in India. Lowest prices guaranteed on Patanjali, Aashirvaad, Pampers, Maggi,
						Saffola, Huggies, Fortune, Nestle, Amul, MamyPoko Pants, Surf Excel, Ariel, Vim, Haldiram's and others.</p>
				</div>
				<div class="sub-some">
					<h5>Shop online with the best deals & offers</h5>
					<p>Now Get Upto 40% Off On Everyday Essential Products Shown On The Offer Page. The range includes Grocery, Personal Care,
						Baby Care, Pet Supplies, Healthcare and Other Daily Need Products. Discount May Vary From Product To Product.</p>
				</div>
				<!-- brands -->
				<div class="sub-some">
					<h5>Popular Brands</h5>
					<ul>
						<li>
							<a href="product.jsp">Aashirvaad</a>
						</li>
						<li>
							<a href="product.jsp">Amul</a>
						</li>
						<li>
							<a href="product.jsp">Bingo</a>
						</li>
						<li>
							<a href="product.jsp">Boost</a>
						</li>
						<li>
							<a href="product.jsp">Durex</a>
						</li>
						<li>
							<a href="product.jsp"> Maggi</a>
						</li>
						<li>
							<a href="product.jsp">Glucon-D</a>
						</li>
						<li>
							<a href="product.jsp">Horlicks</a>
						</li>
						<li>
							<a href="product2.jsp">Head & Shoulders</a>
						</li>
						<li>
							<a href="product2.jsp">Dove</a>
						</li>
						<li>
							<a href="product2.jsp">Dettol</a>
						</li>
						<li>
							<a href="product2.jsp">Dabur</a>
						</li>
						<li>
							<a href="product2.jsp">Colgate</a>
						</li>
						<li>
							<a href="product.jsp">Coca-Cola</a>
						</li>
						<li>
							<a href="product2.jsp">Closeup</a>
						</li>
						<li>
							<a href="product2.jsp"> Cinthol</a>
						</li>
						<li>
							<a href="product.jsp">Cadbury</a>
						</li>
						<li>
							<a href="product.jsp">Bru</a>
						</li>
						<li>
							<a href="product.jsp">Bournvita</a>
						</li>
						<li>
							<a href="product.jsp">Tang</a>
						</li>
						<li>
							<a href="product.jsp">Pears</a>
						</li>
						<li>
							<a href="product.jsp">Oreo</a>
						</li>
						<li>
							<a href="product.jsp"> Taj Mahal</a>
						</li>
						<li>
							<a href="product.jsp">Sprite</a>
						</li>
						<li>
							<a href="product.jsp">Thums Up</a>
						</li>
						<li>
							<a href="product2.jsp">Fair & Lovely</a>
						</li>
						<li>
							<a href="product2.jsp">Lakme</a>
						</li>
						<li>
							<a href="product.jsp">Tata</a>
						</li>
						<li>
							<a href="product2.jsp">Sunfeast</a>
						</li>
						<li>
							<a href="product2.jsp">Sunsilk</a>
						</li>
						<li>
							<a href="product.jsp">Patanjali</a>
						</li>
						<li>
							<a href="product.jsp">MTR</a>
						</li>
						<li>
							<a href="product.jsp">Kissan</a>
						</li>
						<li>
							<a href="product2.jsp"> Lipton</a>
						</li>
					</ul>
				</div>
				<!-- //brands -->
				<!-- payment -->
				<div class="sub-some child-momu">
					<h5>Payment Method</h5>
					<ul>
						<li>
							<img src="images/pay2.png" alt="">
						</li>
						<li>
							<img src="images/pay5.png" alt="">
						</li>
						<li>
							<img src="images/pay1.png" alt="">
						</li>
						<li>
							<img src="images/pay4.png" alt="">
						</li>
						<li>
							<img src="images/pay6.png" alt="">
						</li>
						<li>
							<img src="images/pay3.png" alt="">
						</li>
						<li>
							<img src="images/pay7.png" alt="">
						</li>
						<li>
							<img src="images/pay8.png" alt="">
						</li>
						<li>
							<img src="images/pay9.png" alt="">
						</li>
					</ul>
				</div>
				<!-- //payment -->
			</div>
			<!-- //footer fourth section (text) -->
		</div>
	</footer>
	<!-- //footer -->
	<!-- copyright -->
	<div class="copy-right">
		<div class="container">
			<p>Copyright &copy; 2018.Company name All rights reserved.More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a></p>
		</div>
	</div>
	<!-- //copyright -->

	<!-- js-files -->
	<!-- jquery -->
	<script src="js/jquery-2.1.4.min.js"></script>
	<!-- //jquery -->
	<script>
		$(function () {
			function goodType() {
				$.get("/getGoodTypes",function (data) {
					var option = "<option value=''>所有种类</option>";
					for (var key in data){
						option += "<option value='"+data[key].gtid+"'>"+data[key].gtname+"</option>";
					}
					$(".goodTypes").append($(option));
				});
			}
			//初始化种类下拉框
			goodType();
			//获取被选中的种类
			$(".goodTypes").on("change",function () {
				var gtid=$(this).find(":selected").val();
				location.href="getFreshGoods?gtid="+gtid;
			});
			//获取所有的特价商品
			$.get("/getSpecialGood",function (data) {
				var h3 =$('<h3 class="agileits-sear-head">特价促销</h3>');

				$("#specialGoods").append(h3);

				for(var key in data){
					var divParent = $("<div class='special-sec1'></div>");
					var divChild1 = $("<div class='col-xs-4 img-deals'></div>");
					var divChild2 = $("<div class='col-xs-8 img-deal1'></div>");
					var divChild3 = $("<div class='clearfix'></div>");
					var imgs = data[key].img.split("-");
					var img = $("<img src='img/"+imgs[0]+".jpg' style='width: 70px;height: 70px' />");
					var name = $("<h3>"+data[key].goodName+"</h3>");
					var a = $("<a href='getGoodDetailsByFdid2?fdid="+data[key].fdid+"'>$"+data[key].price*data[key].discount/100+"</a>");
					divChild1.append(img);
					divChild2.append(name);
					divChild2.append(a);
					divParent.append(divChild1);
					divParent.append(divChild2);
					divParent.append(divChild3);
					$("#specialGoods").append(divParent);
				}
			});
			//获取所有的特别优惠
			$.get("/getDiscountGoods",function (data) {
				for (var key in data) {
					var li=$("<li></li>");
					var divParent = $("<div class='w3l-specilamk'></div>");
					var divChild1 = $("<div class='speioffer-agile'><div>");
					var divChild2 =$("<div class='product-name-w3l'><div>");
					//第一个子div
					var imgs = data[key].img.split("-");
					var img =
							$("<a href='getGoodDetailsByFdid2?fdid="+data[key].fdid+"'><img src='img/"+imgs[0]+".jpg' style='width: 150px;height: 150px; ' /></a>");
					divChild1.append(img);

					//第二个子div
					var h4 = $("<h4><a href='getGoodDetailsByFdid2?fdid="+data[key].fdid+"'>"+data[key].goodName+"</a></h4>");
					divChild2.append(h4);
					var divGrandson1 =$("<div class='w3l-pricehkj'></div>");
					//divGrandson1中的标签
					var h6 = $("<h6>$"+data[key].price*data[key].discount/100+"</h6>");

					var save =$('<p>原价$'+data[key].price+'</p>');
					divGrandson1.append(h6);
					divGrandson1.append(save);
					var divGrandson2 = $("<div class='snipcart-details top_brand_home_details item_add single-item hvr-outline-out'></div>");
					//divGrandson2中的标签
					var form =$("<form action='#' method='post'></form>");
					var fieldset=$("<fieldset></fieldset>");

					var input1 =$('<input type="hidden" name="cmd" value="_cart" />');
					var input2 =$('<input type="hidden" name="add" value="1" />');
					var input3 =$('<input type="hidden" name="business" value=" " />');
					var input4 =$('<input type="hidden" name="item_name" value="'+data[key].goodName+'" />');
					var input5 =$('<input type="hidden" name="amount" value="'+data[key].price+'" />');
					var input6 =$('<input type="hidden" name="currency_code" value="USD" />');
					var input7 =$('<input type="hidden" name="return" value=" " />');
					var input8 =$('<input type="hidden" name="cancel_return" value=" " />');
					var input9 =$('<input type="submit" name="submit" value="加入购物车" class="button" />');

					fieldset.append(input1);
					fieldset.append(input2);
					fieldset.append(input3);
					fieldset.append(input4);
					fieldset.append(input5);
					fieldset.append(input6);
					fieldset.append(input7);
					fieldset.append(input8);
					fieldset.append(input9);

					form.append(fieldset);
					divGrandson2.append(form);

					divParent.append(divChild1);
					divChild2.append(divGrandson1);
					divChild2.append(divGrandson2);
					divParent.append(divChild2);
					li.append(divParent);
					$(".specialOffers").append(li);
				}
				lunxun();
			});



		});
	</script>
	<!-- popup modal (for signin & signup)-->
	<script src="js/jquery.magnific-popup.js"></script>
	<script>
		$(document).ready(function () {
			$('.popup-with-zoom-anim').magnificPopup({
				type: 'inline',
				fixedContentPos: false,
				fixedBgPos: true,
				overflowY: 'auto',
				closeBtnInside: true,
				preloader: false,
				midClick: true,
				removalDelay: 300,
				mainClass: 'my-mfp-zoom-in'
			});

		});
	</script>
	<!-- Large modal -->
	<!-- <script>
		$('#').modal('show');
	</script> -->
	<!-- //popup modal (for signin & signup)-->

	<!-- cart-js -->
	<script src="js/minicart.js"></script>
	<script>
		paypalm.minicartk.render(); //use only unique class names other than paypal1.minicart1.Also Replace same class name in css and minicart.min.js

		paypalm.minicartk.cart.on('checkout', function (evt) {
			var items = this.items(),
				len = items.length,
				total = 0,
				i;

			// Count the number of each item in the cart
			for (i = 0; i < len; i++) {
				total += items[i].get('quantity');
			}

			if (total < 3) {
				alert('The minimum order quantity is 3. Please add more to your shopping cart before checking out');
				evt.preventDefault();
			}
		});
	</script>
	<!-- //cart-js -->

	<!-- price range (top products) -->
	<script src="js/jquery-ui.js"></script>
	<script>
		//<![CDATA[ 
		$(window).load(function () {
			$("#slider-range").slider({
				range: true,
				min: 0,
				max: 9000,
				values: [50, 6000],
				slide: function (event, ui) {
					$("#amount").val("$" + ui.values[0] + " - $" + ui.values[1]);
				}
			});
			$("#amount").val("$" + $("#slider-range").slider("values", 0) + " - $" + $("#slider-range").slider("values", 1));

		}); //]]>
	</script>
	<!-- //price range (top products) -->

	<!-- flexisel (for special offers) -->
	<script src="js/jquery.flexisel.js"></script>
	<script>
		function lunxun() {
			$("#flexiselDemo1").flexisel({
				visibleItems: 3,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: {
					portrait: {
						changePoint: 480,
						visibleItems: 1
					},
					landscape: {
						changePoint: 640,
						visibleItems: 2
					},
					tablet: {
						changePoint: 768,
						visibleItems: 2
					}
				}
			});
		}
	</script>
	<script>
		$(window).load(function () {
			/*$("#flexiselDemo1").flexisel({
				visibleItems: 3,
				animationSpeed: 1000,
				autoPlay: true,
				autoPlaySpeed: 3000,
				pauseOnHover: true,
				enableResponsiveBreakpoints: true,
				responsiveBreakpoints: {
					portrait: {
						changePoint: 480,
						visibleItems: 1
					},
					landscape: {
						changePoint: 640,
						visibleItems: 2
					},
					tablet: {
						changePoint: 768,
						visibleItems: 2
					}
				}
			});
*/
		});
	</script>
	<!-- //flexisel (for special offers) -->

	<!-- password-script -->
	<script>
		window.onload = function () {
			document.getElementById("password1").onchange = validatePassword;
			document.getElementById("password2").onchange = validatePassword;
		}

		function validatePassword() {
			var pass2 = document.getElementById("password2").value;
			var pass1 = document.getElementById("password1").value;
			if (pass1 != pass2)
				document.getElementById("password2").setCustomValidity("Passwords Don't Match");
			else
				document.getElementById("password2").setCustomValidity('');
			//empty string means no validation error
		}
	</script>
	<!-- //password-script -->

	<!-- smoothscroll -->
	<script src="js/SmoothScroll.min.js"></script>
	<!-- //smoothscroll -->

	<!-- start-smooth-scrolling -->
	<script src="js/move-top.js"></script>
	<script src="js/easing.js"></script>
	<script>
		jQuery(document).ready(function ($) {
			$(".scroll").click(function (event) {
				event.preventDefault();

				$('html,body').animate({
					scrollTop: $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- //end-smooth-scrolling -->

	<!-- smooth-scrolling-of-move-up -->
	<script>
		$(document).ready(function () {
			/*
			var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
			};
			*/
			$().UItoTop({
				easingType: 'easeOutQuart'
			});

		});
	</script>
	<!-- //smooth-scrolling-of-move-up -->

	<!-- for bootstrap working -->
	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- //js-files -->

</body>

</html>