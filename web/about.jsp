<%-- 
    Document   : about
    Created on : Jun 8, 2023, 12:58:14 AM
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
        <title>Account</title>
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
            team-members{
                color: #99ffff;
                align-content: center;
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
            <label for="tab-nav-1">Our Company</label>
            <input type="radio" name="tabs" id="tab-nav-2">
            <label for="tab-nav-2">Our Team</label>
            <input type="radio" name="tabs" id="tab-nav-3">
            <label for="tab-nav-3">Mission and Vision</label>

            <div class="tabs">
                <div>
                    <p>The Institute of Oceanography (INOS) is a premier center of excellence 
                        in Malaysia that focuses its activities on oceanic and marine related 
                        research and post-graduate training.INOS has a long and strong tradition 
                        in marine science and oceanographic research via the grouping at INOS of 
                        highly trained scientists from the former Faculty of Fisheries and Marine 
                        Science, UPM.Recommended by the Intergovernmental Oceanographic Commission 
                        of UNESCO, the institute is accorded official status as a center of 
                        excellence by the Malaysian Government in April 2001.INOS aims to be a 
                        leading regional center of research, post-graduate studies as well as 
                        the reference center for marine and its related environment with special 
                        emphasis on the South China Sea and its related ecosystems.</p>
                    <h2>Our Service</h2>
                    <p>The system built in middle of 2023 which the idea was triggered
                        by a group of students in University of Malaysia Terengganu. The team 
                        members are majoring in Degree of Computer Science(Mobile Computing)
                        with Hons.The system provides the customers to reserve the webinar or 
                        workshop. It can make the transaction easier to process.</p>

                </div>

                <div>
                    <h1>Team Members</h1>

                    <img src="3.jpg" alt="3" style="width:150px;" />
                    <h3>Izazi - Head of Team</h3>

                    <img src="2.jpg" alt="2" style="width:150px;"/>
                    <h3>Afiq - Developer</h3>

                    <img src="1.jpg" alt="1" style="width:150px;"/>
                    <h3>Adib - Designer</h3>

                </div>

                <div>
                    <h2>Vision</h2>
                    <p>An institute to bring the human-touch back into nature.</p>
                    <h2>Mission</h2>
                    <p>To provide experience and knowledge about ocean and environment.</p>
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
