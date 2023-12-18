<%-- 
    Document   : webinar
    Created on : Jun 7, 2023, 9:11:21 PM
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
        <title>Webinar</title>
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
            <label for="tab-nav-1">Academic Skills</label>
            <input type="radio" name="tabs" id="tab-nav-2">
            <label for="tab-nav-2">Research and Innovation</label>
            <input type="radio" name="tabs" id="tab-nav-3">
            <label for="tab-nav-3">Career Development and Job Research</label>
            <div class="tabs">
                <div>
                    <h2>Academic Skills</h2>
                    <img src="skill.jpg" width="500">
                    <p>Oceanography and environmental science are both interdisciplinary fields that require a wide range 
                        of academic skills. Some of the most important skills for these fields include:<br><br>
                    <ul>
                        <li>Critical thinking: The ability to analyze information and form your own conclusions.</li>
                        <li>Problem solving: The ability to identify and solve problems.</li>
                        <li>Communication: The ability to express your ideas clearly and effectively, both in writing and in speech.</li>
                        <li>Research: The ability to find and evaluate information.</li>
                        <li>Quantitative skills: The ability to understand and use mathematical and statistical concepts.</li>
                        <li>Computer skills: The ability to use computers to collect, analyze, and present data.</li>
                        <li>Fieldwork skills: The ability to collect data in the field, such as by conducting experiments, 
                            taking measurements, and observing organisms.</li>
                        <li>Teamwork skills: The ability to work effectively with others, both in the field and in the laboratory.</li>
                    </ul>
                    </p>
                </div>
                <div>
                    <h2>Research and Innovation</h2>
                    <img src="webinar.jpg" width="500">
                    <p>
                        Ocean acidification: Ocean acidification is a major threat to marine life, as it makes it difficult for 
                        organisms to build shells and skeletons. Researchers are working to understand the effects of ocean 
                        acidification, and to develop ways to mitigate its impact.<br><br>
                        Marine pollution: Marine pollution is a major problem, as it can harm marine life and contaminate seafood. 
                        Researchers are working to develop new methods to clean up marine pollution, and to prevent it from 
                        happening in the first place.<br><br>
                        Marine biodiversity: The ocean is home to a vast diversity of life, much of which is still unknown. 
                        Researchers are working to catalog and understand marine biodiversity, and to identify species that are 
                        at risk of extinction.<br><br>
                    </p>
                </div>
                <div>
                    <h2>Career Development and Job Research</h2>
                    <img src="workshop.jpg" width="500">
                    <p>Get a good education: A bachelor's degree in oceanography or environmental science is the minimum requirement 
                        for most entry-level jobs in this field. However, many employers prefer to hire candidates with a master's degree or Ph.D.<br><br>
                        Get experience: Gaining experience in oceanography or environmental science is essential for landing a good job in this field. 
                        You can get experience through internships, volunteer work, or by working in a related field, such as marine biology or chemistry.<br><br>
                        Network: Networking with other oceanographers and environmental scientists is a great way to learn about job opportunities and to 
                        get your foot in the door. Attend conferences, workshops, and other events related to your field.<br><br></p>
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
