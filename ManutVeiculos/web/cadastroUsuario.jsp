<%@page import="entidade.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Usuário</title>
        
        <link href="./css/estilos.css" rel="stylesheet">
        
        <script src="https://code.jquery.com/jquery-3.6.0.js"></script>
        <script src="https://code.jquery.com/ui/1.13.2/jquery-ui.js"></script>
        
        <script>
            $( function() {
                $( "#draggable" ).draggable();
            } );
        </script>
        
    </head>
    
        <%
            Usuario usuario = (Usuario) request.getAttribute("usuario");

            if (usuario == null) {
                usuario = new Usuario();
            }
        %>
        
    <body>
        <div id="draggable" class="paginaLoginECadastro">
            <h1>Novo Usuário</h1>

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
