<%@page import="java.util.ArrayList"%>
<%@page import="dao.EventoDAO"%>
<%@page import="entidade.Evento"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastros</title>
        
        <link rel="stylesheet" href="css/estilos.css">
    <body>
        <div class="telaEventos">
            <form action="paginaPrincipal.jsp" method="post" class="form-home">
                <input type="submit" name="voltarHome" value="Home" class="btn-home">
            </form>
            <h1>LISTA DE EVENTOS</h3>

                <%
                    ArrayList<Evento> eventos = new EventoDAO().consultarTodos();
                %>

                <table class="table">
                    <th>Código</th>
                    <th>Nome</th>
                    <th>Categoria</th>
                    <th>Data</th>
                    <th>Valor</th>
                    <th>Observações</th>
                    <th>Editar</th>
                    <th>Excluir</th>
                        <%
                            for (int i=0; i < eventos.size(); i++) {
                        %>
                    <tr>
                        <td><%= eventos.get(i).getId_evento() %></td>
                        <td><%= eventos.get(i).getNome_evento() %></td>
                        <td><%= eventos.get(i).getCategoria_id()%></td>
                        <td><%= eventos.get(i).getData_evento()%></td>
                        <td><%= eventos.get(i).getValor_custo_evento()%></td>
                        <td><%= eventos.get(i).getObservacoes()%></td>
                        <td> <a href="acaoServ?a=editarEvento&id=<%= eventos.get(i).getId_evento()%>" class="btn-editar">Editar</a></td>
                        <td> <a href="acaoServ?a=excluirEvento&id=<%= eventos.get(i).getId_evento()%>" class="btn-excluir">Excluir</a></td>
                        <td></td>
                    </tr>
                    <%
                        }
                    %>
        </div>
    </body>
</html>
