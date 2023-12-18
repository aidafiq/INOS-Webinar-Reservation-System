<%-- 
    Document   : register
    Created on : Jun 11, 2023, 11:23:35 PM
    Author     : ASUS TUF F17
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Register</title>
        <style>
            body {
                font-family: Arial, sans-serif;
                background-color: #f2f2f2;
            }

            .container {
                color: #3399ff;
                max-width: 400px;
                margin: 0 auto;
                padding: 20px;
                background-color: #ccccff;
                border-radius: 5px;
                box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            }

            h2 {
                text-align: center;
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
            .form-group input[type="password"] {
                width: 100%;
                padding: 10px;
                border: 1px solid #ccc;
                border-radius: 3px;
            }

            .form-group button {
                display: block;
                width: 100%;
                padding: 10px;
                border: none;
                background-color: #3399ff;
                color: #fff;
                cursor: pointer;
                border-radius: 3px;
            }

            .form-group button:hover {
                background-color: #6666ff;
            }

            .form-toggle {
                text-align: center;
                margin-top: 20px;
            }

            .form-toggle a {
                text-decoration: none;
                color: #4CAF50;
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
        <div>
            <div class="container">
                <h2>Signup</h2>
                <div id="signup-form" >
                    <form id="signup" class="form-group" method="POST" action="UserAuth">
                        <label for="signup-username">Username</label>
                        <input type="text" id="signup-username" name="UserName" placeholder="Enter a username" required><br><br>
                        <label for="signup-password">Password</label>
                        <input type="password" id="signup-password" name="password" placeholder="Enter a password" required><br><br>
                        <input type="hidden" name="action" value="insert">
                        <button type="submit">Sign up</button><br>
                        <a href="login.jsp">Already have an account? Login</a>
                    </form>
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
