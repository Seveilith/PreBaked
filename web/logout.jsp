<!-- Terminate the session and redirect the user to the startpage-->
<%
    System.out.println("Terminating session for user: " + request.getSession().getAttribute("Username"));
    session.invalidate();
    response.sendRedirect("index.jsp");
%>
