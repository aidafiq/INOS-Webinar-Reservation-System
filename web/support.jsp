<%-- 
    Document   : support
    Created on : Jun 8, 2023, 12:06:44 AM
    Author     : ASUS TUF F17
--%>
<%
if(session.getAttribute("UserName") == null){
    response.sendRedirect("login.jsp");
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Help/Support</title>
        <style>
            .navbar {
                overflow: hidden;
                background-color: lightcyan;
                font-family: Arial, Helvetica, sans-serif;
            }

            .navbar a {
                float: left;
                font-size: 16px;
                color: darkblue;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
            }

            .dropdown {
                float: left;
                overflow: hidden;
            }

            .dropdown .dropbtn {
                cursor: pointer;
                font-size: 16px;  
                border: none;
                outline: none;
                color: darkblue;
                padding: 14px 16px;
                background-color: inherit;
                font-family: inherit;
                margin: 0;
            }

            .navbar a:hover, .dropdown:hover .dropbtn, .dropbtn:focus {
                background-color: white;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 160px;
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
            }

            .dropdown-content a {
                float: none;
                color: black;
                padding: 12px 16px;
                text-decoration: none;
                display: block;
                text-align: left;
            }

            .dropdown-content a:hover {
                background-color: #ddd;
            }

            .show {
                display: block;
            }
            
            .footer {
                position: fixed;
                left: 0;
                bottom: 0;
                width: 100%;
                background-color: #ccffff;
                color: #003399;
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="navbar">
            <img src="logo.png" width="220" align="left">
            <a href="home.jsp">Home</a>
            <a href="webinar.jsp">Webinar</a>
            <a href="reservation.jsp">Reservation</a>
            <a href="account.jsp">Account</a>
            <a href="contact.jsp">Contact us</a>
            <a href="support.jsp">Help/Support</a>
            <a href="about.jsp">About us</a>
            <div class="dropdown" >
                <button class="dropbtn" onclick="myFunction()" align="right"><img src="user.png" width="15" height="15">
                    <i class="fa fa-caret-down"></i>
                </button>
                <div class="dropdown-content" id="myDropdown">
                    <a href="login.jsp">Logout</a>
                </div>
            </div> 
        </div>
        <script>
            /* When the user clicks on the button, 
             toggle between hiding and showing the dropdown content */
            function myFunction() {
                document.getElementById("myDropdown").classList.toggle("show");
            }

            // Close the dropdown if the user clicks outside of it
            window.onclick = function (e) {
                if (!e.target.matches('.dropbtn')) {
                    var myDropdown = document.getElementById("myDropdown");
                    if (myDropdown.classList.contains('show')) {
                        myDropdown.classList.remove('show');
                    }
                }
            }
        </script>

        <div class="tabbed">
            <input type="radio" name="tabs" id="tab-nav-1" checked>
            <label for="tab-nav-1">Webinar / Workshop</label>
            <input type="radio" name="tabs" id="tab-nav-2">
            <label for="tab-nav-2">Reservation</label>
            
            <div class="tabs">
                <div>
                    <h3>What is workshop purpose?</h3>
                    <p>Participants will get to learn and discuss major themes or topics 
                        during the session.</p><br>
                    <h3>Who will be the speaker?</h3>
                    <p>The speaker will be determine by the reserver.</p>
                    
                </div>
                <div>
                    <h3>How to make a reservation?</h3>
                    <p>Go to Reservation > Make Reservation, then fill in the details.</p><br>
                    <h3>How to know the status reservation?</h3>
                    <p>Go to Reservation > View Reservation, then see the status column.</p>
                </div>
                
            </div>
        </div>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/prefixfree/1.0.6/prefixfree.min.js"></script>
    </body>
    <footer>
        <div class="footer">
            <p>&COPY; 2023 INOS. All rights reserved.</p>
        </div>
    </footer>
</html>

