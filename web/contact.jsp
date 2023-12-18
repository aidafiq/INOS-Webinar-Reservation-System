<%-- 
    Document   : contact
    Created on : Jun 8, 2023, 2:49:12 AM
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
        <title>Contact Us</title>
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

            section {
                padding: 60px 0;
                min-height: 100vh;
            }
            .contact-info {
                display: inline-block;
                width: 100%;
                text-align: center;
                margin-bottom: 10px;
            }
            .contact-info-icon {
                margin-bottom: 15px;
            }
            .contact-info-item {
                background: #003366;
                padding: 30px 0px;
            }
            
            .contact-info-icon i {
                font-size: 48px;
                color: #fda40b;
            }
            .contact-info-text p{margin-bottom:0px;}
            .contact-info-text h2 {
                color: #fff;
                font-size: 22px;
                text-transform: capitalize;
                font-weight: 600;
                margin-bottom: 10px;
            }
            .contact-info-text span {
                color: #999999;
                font-size: 16px;
                font-weight: 10;
                display: inline-block;
                width: 100%;
            }

            .contact-page-map {
                margin-top: 36px;
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

        <section class="contact-page-sec">
            <div class="container">
                <div class="row">
                    <div class="col-md-4">
                        <div class="contact-info">
                            <div class="contact-info-item">
                                <div class="contact-info-icon">
                                    <i class="fas fa-map-marked"></i>
                                </div>
                                <div class="contact-info-text">
                                    <h2>Address</h2>
                                    <span>Institute of Oceanography and Environment (INOS) </span> 
                                    <span>Universiti Malaysia Terengganu (UMT)</span> 
                                    <span>21030 Kuala Nerus</span>
                                    <span>Terengganu, MALAYSIA</span>
                                </div>
                            </div>            
                        </div>          
                    </div>          
                    <div class="col-md-4">
                        <div class="contact-info">
                            <div class="contact-info-item">
                                <div class="contact-info-icon">
                                    <i class="fas fa-envelope"></i>
                                </div>
                                <div class="contact-info-text">
                                    <h2>Website</h2>
                                    <span>http://www.umt.edu.my/</span> 
                                    <span>https://inos.umt.edu.my/</span>
                                </div>
                            </div>            
                        </div>                
                    </div>                
                    <div class="col-md-4">
                        <div class="contact-info">
                            <div class="contact-info-item">
                                <div class="contact-info-icon">
                                    <i class="fas fa-clock"></i>
                                </div>
                                <div class="contact-info-text">
                                    <h2>Phone</h2>
                                    <span>Tel: +609-6683195</span>
                                    <span>Fax: +609-6692166</span>
                                </div>
                            </div>            
                        </div>          
                    </div>          
                </div>
                
                    <div class="col-md-4">        
                        <div class="contact-page-map">
                            <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d3972.017502468391!2d103.08523677221375!3d5.414304166785733!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x31b7bcabeaae3b37%3A0xfdbf70b38145fcd8!2sINOS%20UMT!5e0!3m2!1sen!2smy!4v1686164181661!5m2!1sen!2smy" 
                                    width="100%" height="450" style="border:0;" allowfullscreen="" loading="lazy" referrerpolicy="no-referrer-when-downgrade" width="100%" height="450" frameborder="1" style="border:1" allowfullscreen></iframe>
                        </div>          
                    </div>        
                </div>
            </div>
        </section>
    </body>
    <footer>
        <div class="footer">
            <p>&COPY; 2023 INOS. All rights reserved.</p>
        </div>
    </footer>
</html>

