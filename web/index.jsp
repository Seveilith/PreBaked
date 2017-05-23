<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>PreBaked</title>
    <link rel='stylesheet' type='text/css' href='./files/css/style.css'>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- Bootstrap core CSS -->
    <link href="./files/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="./files/css/landing-page.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link href="./files/vendor/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,300italic,400italic,700italic" rel="stylesheet"
          type="text/css">

    <!-- Temporary navbar container fix -->
    <style>
        .navbar-toggler {
            z-index: 1;
        }

        @media (max-width: 576px) {
            nav > .container {
                width: 100%;
            }
        }
    </style>
</head>
<body>


<!--HEADER-->
<header class="site-header" id="masthead">
    <nav class="navbar fixed-top navbar-toggleable-md navbar-light bg-faded">
        <div class="container">
            <a class="navbar-brand" href="./" rel="index"><img class="loga"
                                                               src="files/img/logo.png"
                                                               alt="Loga"></a>
            <div class="collapse navbar-collapse" id="navbarExample">
                <ul class="navbar-nav ml-auto" id="nav-primary">
                    <li class="nav-item">
                        <a class="nav-link" href="productPage.jsp" title="Produkter">Produkter</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="basket.jsp" title="Varukorg">Varukorg</a>
                    </li>

                    <%
                        String username = (String) request.getSession().getAttribute("Username");
                        if (username == null) { %>
                    <li class="nav-item">
                        <a class="nav-link" href="login.jsp" title="Logga in">Logga in</a>
                    </li>
                    <% } else { %>
                    <li class="nav-item">
                        <a class="nav-link" href="logout.jsp" title="Logga in">Logga ut</a>
                    </li>
                    <% } %>
                </ul>
            </div>
        </div>
    </nav>
</header>

<!-- Header -->
<header class="intro-header">
    <div class="container">
        <div class="intro-message">
            <h1>PreBaked</h1>
            <h3>Your Home For Custom Made RaspBerry Pi's</h3>
            <hr class="intro-divider">
            <ul class="list-inline intro-social-buttons">
                <li class="list-inline-item">
                    <a href="https://github.com/Seveilith/PreBaked" class="btn btn-secondary btn-lg"><i
                            class="fa fa-github fa-fw"></i> <span class="network-name">Github</span></a>
                </li>
            </ul>
        </div>
    </div>
</header>

<!-- Page Content -->
<section class="content-section-a">
    <div class="container">
        <div class="row">
            <div class="col-lg-5">
                <hr class="section-heading-spacer">
                <div class="clearfix"></div>
                <h2 class="section-heading">Death to self programming.</h2>
                <p class="lead">Thanks to PreBaked you no longer have to program your raspberry pi.</p>
                <p style="font-weight: 400; font-size:20px;">No More Coding
                <p>
                <p class="lead">Just tell us what you want you want, and we will deliver!</p>
            </div>
            <div class="col-lg-5 offset-lg-2">
                <img class="img-fluid" src="./files/img/ipad.png" alt="missing img">
            </div>
        </div>
    </div><!-- /.container -->
</section>

<section class="content-section-b">
    <div class="container">
        <div class="row">
            <div class="col-lg-5 push-lg-7">
                <hr class="section-heading-spacer">
                <div class="clearfix"></div>
                <h2 class="section-heading">3D Device Mockups<br>by PSDCovers</h2>
                <p class="lead">Turn your 2D designs into high quality, 3D product shots in seconds using free Photoshop
                    actions by <a target="_blank" href="http://www.psdcovers.com/">PSDCovers</a>! Visit their website to
                    download some of their awesome, free photoshop actions!</p>
            </div>
            <div class="col-lg-5 pull-lg-5">
                <img class="img-fluid" src="./files/img/dog.png" alt="">
            </div>
        </div>
    </div><!-- /.container -->
</section><!-- /.content-section-b -->

<section class="content-section-a">
    <div class="container">
        <div class="row">
            <div class="col-lg-5">
                <hr class="section-heading-spacer">
                <div class="clearfix"></div>
                <h2 class="section-heading">Google Web Fonts and<br>Font Awesome Icons</h2>
                <p class="lead">This template features the 'Lato' font, part of the <a target="_blank"
                                                                                       href="http://www.google.com/fonts">Google
                    Web Font library</a>, as well as <a target="_blank" href="http://fontawesome.io">icons from Font
                    Awesome</a>.</p>
            </div>
            <div class="col-lg-5 offset-lg-2">
                <img class="img-fluid" src="./files/img/phones.png" alt="">
            </div>
        </div>
    </div><!-- /.container -->
</section><!-- /.content-section-a -->

<aside class="banner">
    <div class="container">
        <div class="row">
            <div class="col-lg-6">
                <h2>Connect to Start Bootstrap:</h2>
            </div>
            <div class="col-lg-6">
                <ul class="list-inline banner-social-buttons">
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-secondary btn-lg"><i class="fa fa-twitter fa-fw"></i> <span
                                class="network-name">Twitter</span></a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-secondary btn-lg"><i class="fa fa-github fa-fw"></i> <span
                                class="network-name">Github</span></a>
                    </li>
                    <li class="list-inline-item">
                        <a href="#" class="btn btn-secondary btn-lg"><i class="fa fa-linkedin fa-fw"></i> <span
                                class="network-name">Linkedin</span></a>
                    </li>
                </ul>
            </div>
        </div>
    </div><!-- /.container -->
</aside><!-- /.banner -->

<!-- Footer -->
<footer>
    <div class="container">
        <ul class="list-inline">
            <li class="list-inline-item">
                <a href="#">Home</a>
            </li>
            <li class="footer-menu-divider list-inline-item">&sdot;</li>
            <li class="list-inline-item">
                <a href="#about">About</a>
            </li>
            <li class="footer-menu-divider list-inline-item">&sdot;</li>
            <li class="list-inline-item">
                <a href="#services">Services</a>
            </li>
            <li class="footer-menu-divider list-inline-item">&sdot;</li>
            <li class="list-inline-item">
                <a href="#contact">Contact</a>
            </li>
        </ul>
        <p class="copyright text-muted small">Copyright &copy; Your Company 2017. All Rights Reserved</p>
    </div>
</footer>

<!-- Bootstrap core JavaScript -->
<script src="./files/vendor/jquery/jquery.min.js"></script>
<script src="./files/vendor/tether/tether.min.js"></script>
<script src="./files/vendor/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>