<%-- 
    Document   : erro
    Created on : 9 de set. de 2023, 12:56:01
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro</title>
        
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div>
            <h1>Ação não realizada, por favor tente novamente.</h1>
            
            <div class="menusVoltar">
                <form action="paginaPrincipal.jsp" method="post" class="form-home">
                    <input type="submit" name="voltarHome" value="Home" class="btn-voltarHome">
                </form>
                <form action="cadastroPessoa.jsp" method="post" class="form-voltarCadastro">
                    <input type="submit" name="voltarCadastro" value="Cadastro Pessoal" class="voltarCadastro">
                </form>
            </div>
        </div>
    </body>
</html>
