<%-- 
    Document   : paginaErroLogin
    Created on : 9 de set. de 2023, 09:48:20
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro no login</title>
        
        <link rel="stylesheet" href="css/estilos.css">
        
    </head>
    <body>
        <div>
            <h1>Dados inválidos ou usuário não localizado.</h1>
            
            <form action="index.jsp" method="post" class="form-voltar">
                <input type="submit" name="voltarLogin" value="Login" class="btn-entrar">
            </form>
        </div>
    </body>
</html>
