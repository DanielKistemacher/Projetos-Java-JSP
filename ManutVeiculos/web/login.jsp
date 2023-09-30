<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        
        <link href="./css/estilos.css" rel="stylesheet">
        
    </head>
    <body>
        
        
        <div class="paginaLogin">
            <h1>Login</h1>

            <form action="loginServ?evento=fazerLogin" method="post" class="form-signin">
                <label for="userLogin"></label> <br>
                <input type="text" id="userLogin" name="user" class="inputUsuario" placeholder="Usuário" required ><br><br>

                <label for="senhaUsuario"></label> <br>
                <input type="password" id="senhaUsuario" name="senha" class="inputSenha" placeholder="Senha" required ><br><br>

                <div>
                    <input type="submit" name="entrar" value="Entrar" class="btn-login">
                </div>
            </form>
            
            <div class="divCadastroUser">
                <form action="/cadastroUsuario.jsp" method="post">
                    <input type="submit" name="cadastrar" value="Cadastrar" class="btn-secundario">
                </form>
            </div>
        </div>
         
    </body>
</html>
