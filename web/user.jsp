<%-- 
    Document   : user
    Created on : Oct 12, 2021, 10:44:38 AM
    Author     : ferna
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <%@include file="header.jsp" %>
        <title>Usuarios</title>
    </head>
    <body>
        <div class="container">
            <div class="row text-center">
                <h1>CRUD para Usuarios</h1>
                <p>
                    <a href="<%=request.getContextPath()%>/agregar" class="btn btn-danger">Agregar nuevo usuario</a>
                </p>
            </div>
        </div>
        
        <table class="table table-bordered">
            <thead>
            <th>ID</th>
            <th>Nombre</th>
            <th>Apellido</th>
            <th>Correo</th>
            <th>Cargo</th>
            <th>Telefono</th>
            <th>Direccion</th>
            <th>Acciones</th>
            </thead>
            <tbody>
                <c:forEach items="${datos}" var="dato">
                    <tr>
                        <td><c:out value="${dato.getId()}"/></td>
                        <td><c:out value="${dato.getNombre()}"/></td>
                        <td><c:out value="${dato.getApellido()}"/></td>
                        <td><c:out value="${dato.getCorreo()}"/></td>
                        <td><c:out value="${dato.getCargo()}"/></td>
                        <td><c:out value="${dato.getTelefono()}"/></td>
                        <td><c:out value="${dato.getDireccion()}"/></td>
                        <td>
                            <a href="<%=request.getContextPath()%>/editar?id=<c:out value="${dato.getId()}"/>"><span class="glyphicon glyphicon-pencil" aria-hidden="true"></span></a>
                            <a href="<%=request.getContextPath()%>/eliminar?id=<c:out value="${dato.getId()}"/>"><span class="glyphicon glyphicon-trash" aria-hidden="true"></span></a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
