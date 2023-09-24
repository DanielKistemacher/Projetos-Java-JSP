<%-- 
    Document   : cadastroPessoa
    Created on : 9 de set. de 2023, 09:58:55
    Author     : Daniel
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="dao.PessoaDAO"%>
<%@page import="dao.PessoaDAO"%>
<%@page import="entidade.Pessoa"%>
<%@page import="entidade.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Cadastro</title>
        
        <link rel="stylesheet" href="css/estilos.css">
        
    </head>
    
    <%
        Pessoa pessoa = (Pessoa) request.getAttribute("pessoa");
        
        if (pessoa == null) {
            pessoa = new Pessoa();
        }
    %>
    
    <body>
        <div class="telaCadastro">
            <form action="paginaPrincipal.jsp" method="post" class="form-home">
                <input type="submit" name="voltarHome" value="Home" class="btn-home">
            </form>
                
            <h1>Cadastro Pessoal</h1>

            <form action="acaoServ?a=salvarPessoa" method="post" class="form-cadastro">
                <label for="codigo" class="labelCadastro">Código: </label> <br>
                <input type="text" id="codigo" name="codigo" readonly="" value="<%= pessoa.getIdPessoa() %>" class="inputsCadastro"> <br><br>

                <label for="nome" class="labelCadastro">Nome: </label> <br>
                <input type="text" id="nome" name="nome" value="<%= pessoa.getNomePessoa() %>" class="inputsCadastro"> <br><br>

                <label for="email" class="labelCadastro">Email: </label> <br>
                <input type="text" id="email" name="email" value="<%= pessoa.getEmailPessoa() %>" class="inputsCadastro"> <br><br>

                <label for="telefone" class="labelCadastro">Telefone: </label> <br>
                <input type="text" id="telefone" name="telefone" value="<%= pessoa.getTelefonePessoa() %>" class="inputsCadastro"> <br><br>

                <label for="dataNascimento" class="labelCadastro">Data de nascimento (dd/mm/aaaa): </label> <br>
                <input type="text" id="dataNascimento" name="dataNascimento" value="<%= pessoa.getDataNascimento() %>" class="inputsCadastro"> <br><br>

                <input type="submit" name="salvar" value="Salvar" class="btn-cadastrar" onclick="camposPreenchidos()">
            </form>
        </div>
        
        <script language="javascript">
            function camposPreenchidos() {
                if (document.getElementById('nome').value == "" ||
                        document.getElementById('email').value == "" ||
                        document.getElementById('telefone').value == "" ||
                        document.getElementById('dataNascimento').value == ""){
                            alert ("Preencha todos os campos!");
                        }
            }
        </script>>
    </body>
</html>
