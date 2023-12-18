<%-- 
    Document   : adminAccount
    Created on : Jun 13, 2023, 10:26:00 PM
    Author     : ASUS TUF F17
--%>

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

            body {
                font-family: Arial, sans-serif;
                margin: 0;
                padding: 0;
            }
            header {
                background-color: #333;
                color: #fff;
                padding: 20px;
                text-align: center;
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
            .container {
                max-width: 800px;
                margin: 20px auto;
                padding: 20px;
            }
            .form-group {
                margin-bottom: 20px;
            }
            .form-group label {
                display: block;
                font-weight: bold;
                margin-bottom: 5px;
            }
            .form-group input[type="text"],
            .form-group input[type="email"],
            .form-group textarea {
                width: 100%;
                padding: 5px;
                font-size: 16px;
            }
            .form-group input[type="submit"]
            .form-group input[type="reset"]{
                background-color: #4CAF50;
                color: white;
                padding: 10px 20px;
                border: none;
                cursor: pointer;
            }
            .form-group input[type="submit"]:hover {
                background-color: #45a049;
                .form-group input[type="reset"]:hover {
                    background-color: #45a049;
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
                        <a href="login.jsp">Login</a>
                        <a href="#">Logout</a>
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
                <label for="tab-nav-1">User Profile</label>
                <input type="radio" name="tabs" id="tab-nav-2">
                <label for="tab-nav-2">Speaker Profile</label>
                <input type="radio" name="tabs" id="tab-nav-3">
                <label for="tab-nav-3">View Speaker Profile</label>
                <input type="radio" name="tabs" id="tab-nav-4">
                <label for="tab-nav-4">View Speaker Profile</label>
                <div class="tabs">
                    <div>
                        <div class="container">
                            <form id="profileForm">
                                <div class="form-group">
                                    <label for="name">Name:</label>
                                    <input type="text" id="name" required>
                                </div>

                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="email" id="email" required>
                                </div>

                                <div class="form-group">
                                    <label for="matricNo">Matric No:</label>
                                    <input type="text" id="matricNo" required>
                                </div>

                                <div class="form-group">
                                    <label for="program">Program:</label>
                                    <input type="text" id="program" required>
                                </div>

                                <div class="form-group">
                                    <label for="faculty">Faculty:</label>
                                    <input type="text" id="faculty" required>
                                </div>

                                <input type="submit" value="Confirm">
                                <input type="reset" value="Reset">
                            </form>
                        </div>

                    </div>
                    <div>
                        <div class="container">
                            <form id="profileForm">
                                <div class="form-group">
                                    <label for="name">Name:</label>
                                    <input type="text" id="name" required>
                                </div>

                                <div class="form-group">
                                    <label for="email">Email:</label>
                                    <input type="email" id="email" required>
                                </div>

                                <div class="form-group">
                                    <label for="phone">Phone:</label>
                                    <input type="text" id="phone" required>
                                </div>

                                <div class="form-group">
                                    <label for="address">Address:</label>
                                    <input type="text" id="address" required>
                                </div>

                                <div class="form-group">
                                    <label for="occupation">Occupation:</label>
                                    <input type="text" id="occupation" required>
                                </div>

                                <input type="submit" value="Confirm">
                                <input type="reset" value="Reset">
                            </form>
                        </div>
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


