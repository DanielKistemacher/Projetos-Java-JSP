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
    </head>
    <body>
        <h1>Bem Vindo!</h1>
        
        <p>Faça seu login preenchendo seus dados nos campos abaixo.</p>
        
        <form action="/loginServ" method="post">
            <label for="userLogin" >Usuário: </label> <br>
            <input type="text" id="userLogin" name="user"><br><br>
            
            <label for="senhaUsuario">Senha: </label> <br>
            <input type="text" id="senhaUsuario" name="senha"><br><br>
            
            <input type="submit" name="entrar" value="Entrar">
        </form>
    </body>
</html>
