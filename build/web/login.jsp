<%-- 
    Document   : login
    Created on : Jun 8, 2023, 4:01:17 AM
    Author     : ASUS TUF F17
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="style.css">
        <title>Login</title>
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
        </style>
    </head>
    <body>

        <div>
            <div class="container">
                <h2>Login</h2>
                <div id="login-form">
                    <form id="login" class="form-group" method="GET" action="UserAuth">
                        <label for="login-username">Username</label>
                        <input type="text" id="login-username" name="UserName" placeholder="Enter your username" required><br><br>
                        <label for="login-password">Password</label>
                        <input type="password" id="login-password" name="password" placeholder="Enter your password" required><br><br>
                        <input type="hidden" name="action" value="login"/>
                        <button type="submit">Login</button><br>
                        <a href="register.jsp">Don't have an account? Register Here</a>
                    </form>
                </div>

            </div>
        </div>

    </body>
</html>
