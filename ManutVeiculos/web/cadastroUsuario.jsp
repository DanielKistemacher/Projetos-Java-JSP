<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Usuário</title>
        
        <link href="./css/estilos.css" rel="stylesheet">
        
    </head>
    
        <%
            Usuario usuario = (Usuario) request.getAttribute("usuario");

            if (usuario == null) {
                usuario = new Usuario();
            }
        %>
        
    <body>
        <div class="paginaCadastroUsuario">
            <h1>Novo usuário</h1>

            <form action="loginServ?evento=salvarUsuario" method="post" class="form-signin">
                <label for="novoUsuario"></label> <br>
                <input type="text" id="novoUsuario" name="nomeUsuario" class="inputUsuario" placeholder="Usuário" required value="<%= usuario.getNomeUsuario() %>" ><br><br>

                <label for="senhaUsuario"></label> <br>
                <input type="password" id="senhaUsuario" name="senhaUsuario" class="inputSenha" placeholder="Senha" required value="<%= usuario.getSenhaUsuario() %>" ><br><br>

                <div>
                    <input type="submit" name="salvar" value="Salvar" class="btn-primario">
                </div>
            </form>
            
            <div class="divCadastroUser">
                <form action="/login.jsp" method="post">
                    <input type="submit" name="voltarLogin" value="Voltar" class="btn-secundario">
                </form>
            </div>
        </div>
    </body>
</html>
