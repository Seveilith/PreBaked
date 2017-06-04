<!-- MODAL Login Form Visar sig när man klickar på logga in -->
<div id="id01" class="modal">
    <form class="modal-content animate" action="login">
        <div class="imgcontainer">
            <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
            <img src="files/img/logo.png" alt="Avatar" class="avatar">
        </div>

        <div class="modal-container">
            <label><b>Username</b></label>
            <input type="text" placeholder="Enter Username" name="username" required>

            <label><b>Password</b></label>
            <input type="password" placeholder="Enter Password" name="password" required>

            <button type="submit" value="Logga In">Logga In</button>
        </div>

        <div class="modal-container" style="background-color:#f1f1f1">
            <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">
                Cancel
            </button>
            <span class="psw">Forgot <a href="#">password?</a></span>
        </div>
    </form>
</div>

<!-- NavBar Visas i toppen på alla sidor -->
<nav class="navbar fixed-top navbar-toggleable-md navbar-light bg-faded">
    <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse"
            data-target="#navbarExample" aria-controls="navbarExample" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="container">
        <a class="navbar-brand" href="index.jsp" rel="index"><img class="loga"
                                                                  src="files/img/logo.png"
                                                                  alt="Loga"></a>
        <div class="collapse navbar-collapse" id="navbarExample">
            <ul class="navbar-nav ml-auto" id="nav-primary">
                <% if (request.getSession().getAttribute("Username") != null && request.getSession().getAttribute("Username").equals("Admin01")) { %>
                <li class="nav-item" id="paddinglight">
                    <a class="nav-link" href="/admin" title="Admin">Admin</a>
                </li>
                <%}%>
                <li class="nav-item" id="paddinglight">
                    <a class="nav-link" href="/product" title="Produkter">Products</a>
                </li>
                <%
                    String username = (String) request.getSession().getAttribute("Username");
                    if (username == null) { %>
                <li class="nav-item" id="paddinglight">
                    <a class="nav-link " onclick="document.getElementById('id01').style.display='block'"
                       style="cursor: pointer" title="Logga in">Logga in</a>
                </li>
                <% } else { %>
                <li class="nav-item" id="paddinglight">
                    <a class="nav-link" href="/logout" title="Logga in">Logga ut</a>
                </li>
                <% } %>
            </ul>
        </div>
    </div>
</nav>