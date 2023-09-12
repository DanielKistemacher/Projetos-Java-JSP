<%-- 
    Document   : sucesso
    Created on : 9 de set. de 2023, 12:54:46
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sucesso</title>
        
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    <body>
        <div>
            <h1>Operação realizada com sucesso!</h1>
            
            <div class="menusVoltar">
                <form action="erro.jsp" method="post" class="form-home">
                    <input type="submit" name="voltarHome" value="Home" class="btn-voltarHome">
                </form>
                <form action="cadastroPessoa.jsp" method="post" class="form-voltarCadastro">
                    <input type="submit" name="voltarCadastro" value="Cadastro Pessoal" class="voltarCadastro">
                </form>
            </div>
        </div>
    </body>
</html>
