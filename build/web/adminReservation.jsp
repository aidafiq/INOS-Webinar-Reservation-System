<%-- 
    Document   : adminReservation
    Created on : Jun 13, 2023, 10:18:49 PM
    Author     : ASUS TUF F17
--%>

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

            .reservation-form {
                max-width: 400px;
                margin: 0 auto;
            }
            .reservation-form label {
                display: block;
                margin-bottom: 10px;
            }
            .reservation-form input[type="text"],
            .reservation-form input[type="email"] {
                width: 100%;
                padding: 5px;
                margin-bottom: 10px;
            }
            .reservation-form input[type="submit"],
            .reservation-form input[type="reset"]{
                background-color: purple;
                color: white;
                padding: 10px 20px;
                border: none;
                cursor: pointer;
            }
            .reservation-form input[type="submit"]:hover,
            .reservation-form input[type="reset"]:hover{
                background-color: maroon;
            }
            /* CSS styles for displaying the reservation list */
            .reservation-list {
                margin-top: 20px;
            }
            .reservation-list table {
                width: 100%;
                border-collapse: collapse;
            }
            .reservation-list th, .reservation-list td {
                border: 1px solid #ddd;
                padding: 8px;
                text-align: left;
            }
            .reservation-list th {
                background-color: #ff9933;
                color: whitesmoke;
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
            <label for="tab-nav-1">Make Reservation</label>
            <input type="radio" name="tabs" id="tab-nav-2">
            <label for="tab-nav-2">View Reservation</label>
            <div class="tabs">
                <div>
                    <div class="reservation-form">
                        <h2>Reserve your spot:</h2>
                        <form id="reservationForm">
                            <label for="name">Name:</label>
                            <input type="text" id="name" required>

                            <label for="email">Email:</label>
                            <input type="email" id="email" required>

                            <label for="event">Event:</label>
                            <select id="event" required>
                                <option value="workshop">Workshop</option>
                                <option value="webinar">Webinar</option>
                            </select><br><br>

                            <label for="desc">Description:</label>
                            <input type="text" id="desc" required><br>

                            <input type="submit" value="Submit">
                            <input type="reset" value="Reset">
                        </form>
                    </div>
                </div>
                <div>
                    <div class="reservation-list">
                        <h2>Current reservations:</h2>
                        <table id="reservationTable">
                            <thead>
                                <tr>
                                    <th>Name</th>
                                    <th>Email</th>
                                    <th>Event</th>
                                    <th>Description</th>
                                    <th>Status</th>
                                </tr>
                            </thead>
                            <tbody id="reservationBody"></tbody>
                        </table>
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



