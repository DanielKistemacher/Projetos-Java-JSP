<%-- 
    Document   : index
    Created on : 6 de set. de 2023, 19:49:49
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Currículo Web</title>
        
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div>
            <h1>Faça seu login</h1>

            <form action="/loginServ" method="post" class="form-signin">
                <label for="userLogin" >Usuário: </label> <br>
                <input type="text" id="userLogin" name="user"><br><br>

                <label for="senhaUsuario">Senha: </label> <br>
                <input type="password" id="senhaUsuario" name="senha"><br><br>

                <input type="submit" name="entrar" value="Entrar" class="btn-entrar">
            </form>
        </div>
    </body>
</html>
