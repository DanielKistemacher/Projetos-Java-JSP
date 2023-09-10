<%-- 
    Document   : paginaPrincipal
    Created on : 6 de set. de 2023, 20:12:31
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu</title>
        
        <style>
            ul {
                list-style-type: none;
                margin: 0;
                padding: 0;
            }
            li {
                display: inline;
            }
        </style>
    </head>
    <body>
        <ul>
            <li>
                <a href="paginaPrincipal.jsp">Home</a>
            </li>
            <li>
                <a href="cadastroPessoa.jsp">Cadastro Pessoal</a>
            </li>
        </ul>
    </body>
</html>
