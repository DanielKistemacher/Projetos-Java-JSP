<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Currículo Web</title>
        
        <link href="./css/estilos.css" rel="stylesheet">
    </head>
    <body>
        <div class="paginaLogin">
            <h1>Bem vindo</h1>

            <form action="/loginServ" method="post" class="form-signin">
                <label for="userLogin"></label> <br>
                <input type="text" id="userLogin" name="user" class="inputsLogin" placeholder="Usuário" ><br><br>

                <label for="senhaUsuario"></label> <br>
                <input type="password" id="senhaUsuario" name="senha" class="inputsLogin" placeholder="Senha" ><br><br>
                
                <div class="acaoEntrar">
                    <input type="submit" name="entrar" value="Entrar" class="btn-entrar" onclick=camposPreenchidos()>
                </div>
            </form>
        </div>
        
        <div class="autor">
            <label>Criado por: Daniel Kistemacher da Silva</label>
        </div>
        
        <script language="javascript">
            function camposPreenchidos() {
                if (document.getElementById('userLogin').value == "" ||
                        document.getElementById('senhaUsuario').value == ""){
                            alert ("Preencha todos os campos!");
                        }
            }
        </script>>
    </body>
</html>