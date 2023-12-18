<%-- 
    Document   : home
    Created on : Jun 7, 2023, 8:11:18 PM
    Author     : ASUS TUF F17
--%>
<%
if(session.getAttribute("UserName") == null){
    response.sendRedirect("login.jsp");
}
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<link rel="stylesheet" href="style.css">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
<!DOCTYPE html>
<html>
    <head>
        <title>Homepage</title>
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

            * {
                box-sizing: border-box;
            }

            .row {
                display: flex;
            }

            /* Create three equal columns that sits next to each other */
            .column {
                flex: 33.33%;
                padding: 5px;
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

        <div class="container">  
            <div id="myCarousel" class="carousel slide" data-ride="carousel">
                <!-- Indicators -->
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                    <li data-target="#myCarousel" data-slide-to="3"></li>
                </ol>

                <!-- Wrapper for slides -->
                <div class="carousel-inner">
                    <div class="item active">
                        <img src="underwater.jpg" style="width:100%; height: 500px;">
                    </div>

                    <div class="item">
                        <img src="ikan.jpg" style="width:100%; height: 500px;">
                    </div>

                    <div class="item">
                        <img src="seminar.jpg" style="width:100%; height: 500px;">
                    </div>

                    <div class="item">
                        <img src="seminar2.jpg" style="width:100%; height: 500px;">
                    </div>
                </div>

                <!-- Left and right controls -->
                <a class="left carousel-control" href="#myCarousel" data-slide="prev">
                    <span class="glyphicon glyphicon-chevron-left"></span>
                    <span class="sr-only">Previous</span>
                </a>
                <a class="right carousel-control" href="#myCarousel" data-slide="next">
                    <span class="glyphicon glyphicon-chevron-right"></span>
                    <span class="sr-only">Next</span>
                </a>
            </div>
            <div class="row">
                <div class="column">
                    <a href="webinar.jsp"><img src="h1.jpg" alt="Snow" style="width:100%"></a>
                </div>
                <div class="column">
                    <a href="reservation.jsp"><img src="h2.jpg" alt="Forest" style="width:100%"></a>
                </div>
            </div>
        </div>
    </body>
    <footer>
        <div class="footer">
            <p>&COPY; 2023 INOS. All rights reserved.</p>
        </div>
    </footer>
</html>

