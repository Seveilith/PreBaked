<header class="site-header" id="masthead">
    <nav class="navbar fixed-top navbar-toggleable-md navbar-light bg-faded">
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
                data-target="#navbarExample" aria-controls="navbarExample" aria-expanded="false"
                aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
        <div class="container">
            <a class="navbar-brand" href="" rel="index"><img class="loga"
                                                             src="files/img/logo.png"
                                                             alt="Loga"></a>
            <div class="collapse navbar-collapse" id="navbarExample">
                <ul class="navbar-nav ml-auto" id="nav-primary">
                    <li class="nav-item">
                        <a class="nav-link" href="/product" title="Produkter">Produkter</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="basket.jsp" title="Varukorg">Varukorg</a>
                    </li>

                    <!-- Logga ut/in ska visas beroende på om man är inloggad eller inte -->
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