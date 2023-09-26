<%@page import="java.util.ArrayList"%>
<%@page import="dao.EventoDAO"%>
<%@page import="dao.CategoriaDAO"%>
<%@page import="entidade.Evento"%>
<%@page import="entidade.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Novo Evento</title>
        
        <link rel="stylesheet" href="css/estilos.css">
        
    </head>
    
    <%
        Evento evento = (Evento) request.getAttribute("evento");
        
        if (evento == null) {
            evento = new Evento();
        }
    %>
    
    <body>
        <div class="mae">
            <div class="telaCadastro">
                <form action="paginaPrincipal.jsp" method="post" class="form-home">
                    <input type="submit" name="voltarHome" value="Home" class="btn-home">
                </form>

                <h1>Cadastro de Evento</h1>

                <form action="acaoServ?a=salvarEvento" method="post" class="form-cadastro">
                    <label for="codigo" class="labelCadastro">Código: </label> <br>
                    <input type="text" id="codigo" name="codigo" readonly="" value="<%= evento.getId_evento() %>" class="inputsCadastro"> <br><br>

                    <label for="nome" class="labelCadastro">Nome do Evento: </label> <br>
                    <input type="text" id="nome" name="nome" value="<%= evento.getNome_evento()%>" class="inputsCadastro"> <br><br>

                    <label for="categoriaId" class="labelCadastro">Categoria: </label> <br>
                    <input type="text" id="categoriaId" name="categoriaId" value="<%= evento.getCategoria_id()%>" class="inputsCadastro"> <br><br>

                    <label for="dataEvento" class="labelCadastro">Data do Evento: </label> <br>
                    <input type="text" id="dataEvento" name="dataEvento" value="<%= evento.getData_evento() %>" class="inputsCadastro"> <br><br>

                    <label for="valorCusto" class="labelCadastro">Custo (xxx.xx): </label> <br>
                    <input type="text" id="valorCusto" name="valorCusto" value="<%= evento.getValor_custo_evento() %>" class="inputsCadastro"> <br><br>

                    <label for="observacoes" class="labelCadastro">Observações: </label> <br>
                    <input type="text" id="observacoes" name="observacoes" value="<%= evento.getObservacoes() %>" class="inputsCadastro"> <br><br>

                    <input type="submit" name="salvar" value="Salvar" class="btn-cadastrar" onclick="camposPreenchidos()">
                </form>
            </div>
            
            <div class="telaCadastroTable">
                <h2>Categorias</h2>
                <%
                    ArrayList<Categoria> categorias = new CategoriaDAO().consultarTodos();
                %>

                <table class="tableCategorias">
                    <th>Código</th>
                    <th>Descrição</th>
                        <%
                            for (int i=0; i < categorias.size(); i++) {
                        %>
                    <tr>
                        <td><%= categorias.get(i).getId()%> </td>
                        <td><%= categorias.get(i).getDescricao()%> </td>
                    </tr>
                    <%
                        }
                    %>
            </div>
        </div>
        
        
        <script language="javascript">
            function camposPreenchidos() {
                if (document.getElementById('nome').value == "" ||
                        document.getElementById('categoria_Id').value == "" ||
                        document.getElementById('dataEvento').value == "" ||
                        document.getElementById('valorCusto').value == "" ||
                        document.getElementById('observacoes').value == ""){
                            alert ("Preencha todos os campos!");
                        }
            }
        </script>
    </body>
</html>
