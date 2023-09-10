<%-- 
    Document   : cadastroPessoa
    Created on : 9 de set. de 2023, 09:58:55
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo</title>
    </head>
    <body>
        <h1>Cadastro Pessoa</h1>
        
        <form action="acaoServ?a=salvarPessoa" method="post">
            
            <label for="nome" >Nome: </label> <br>
            <input type="text" id="nome" name="nome"><br><br>
            
            <label for="email" >Email: </label> <br>
            <input type="text" id="email" name="email"><br><br>

            <label for="telefone">Telefone: </label> <br>
            <input type="text" id="telefone" name="telefone"><br><br>
            
            <label for="dataNascimento">Data de nascimento: </label> <br>
            <input type="text" id="dataNascimento" name="dataNascimento"><br><br>

            <input type="submit" name="salvar" value="Cadastrar">
        </form>
    </body>
</html>
