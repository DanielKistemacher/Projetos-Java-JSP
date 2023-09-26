<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Erro no login</title>
        
        <link rel="stylesheet" href="css/estilos.css">
        
    </head>
    <body>
        <div class="erroLogin">
            <h1 class="h1Preto">Dados inválidos ou usuário não localizado.</h1>
            
            <form action="index.jsp" method="post" class="form-voltar">
                <input type="submit" name="voltarLogin" value="Login" class="btn-entrar">
            </form>
        </div>
    </body>
</html>
