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
        <title>Cadastros</title>
        
        <link rel="stylesheet" href="css/estilos.css">
    </head>
    
    <%
        Pessoa pessoa = (Pessoa) request.getAttribute("pessoa");
        
        if (pessoa == null) {
            pessoa = new Pessoa();
        }
    %>
    
    <body>
        <div>
            <form action="paginaPrincipal.jsp" method="post" class="form-home">
                <input type="submit" name="voltarHome" value="Home" class="btn-home">
            </form>
                
            <h1>Cadastro Pessoal</h1>

            <form action="acaoServ?a=salvarPessoa" method="post">
                <label for="codigo" >Código: </label> <br>
                <input type="text" id="codigo" name="codigo" readonly="" value="<%= pessoa.getIdPessoa() %>"> <br><br>

                <label for="nome" >Nome: </label> <br>
                <input type="text" id="nome" name="nome" value="<%= pessoa.getNomePessoa() %>"> <br><br>

                <label for="email" >Email: </label> <br>
                <input type="text" id="email" name="email" value="<%= pessoa.getEmailPessoa() %>"> <br><br>

                <label for="telefone">Telefone: </label> <br>
                <input type="text" id="telefone" name="telefone" value="<%= pessoa.getTelefonePessoa() %>"> <br><br>

                <label for="dataNascimento">Data de nascimento (dd/mm/aaaa): </label> <br>
                <input type="text" id="dataNascimento" name="dataNascimento" value="<%= pessoa.getDataNascimento() %>"> <br><br>

                <input type="submit" name="salvar" value="Salvar" class="btn-cadastrar">
            </form>

            <br><br>
                
            <h3>LISTA DE CADASTROS:</h3>

            <%
                ArrayList<Pessoa> pessoas = new PessoaDAO().consultarTodos();
            %>

            <table class="table">
                <th>Código</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Telefone</th>
                <th>Data de Nascimento</th>
                <th>Editar</th>
                <th>Excluir</th>
                    <%
                        for (int i=0; i < pessoas.size(); i++) {
                    %>
                <tr>
                    <td><%= pessoas.get(i).getIdPessoa() %></td>
                    <td><%= pessoas.get(i).getNomePessoa() %></td>
                    <td><%= pessoas.get(i).getEmailPessoa() %></td>
                    <td><%= pessoas.get(i).getTelefonePessoa() %></td>
                    <td><%= pessoas.get(i).getDataNascimento() %></td>
                    <td> <a href="acaoServ?a=editarPessoa&id=<%= pessoas.get(i).getIdPessoa()%>" class="btn-editar">Editar</a></td>
                    <td> <a href="acaoServ?a=excluirPessoa&id=<%= pessoas.get(i).getIdPessoa()%>" class="btn-excluir">Excluir</a></td>
                    <td></td>
                </tr>
                <%
                    }
                %>
        </div>
    </body>
</html>
