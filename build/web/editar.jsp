<%-- 
    Document   : editar
    Created on : Oct 12, 2021, 1:19:41 PM
    Author     : ferna
--%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta harset=UTF-8">
        <%@include file="header.jsp" %>
        <title>Editar Usuario</title>
    </head>
    <body>
        <ol class="breadcrumb">
            <li><a href="<%=request.getContextPath()%>/user">Listado de Usuarios</a></li>
            <li class="active">Editar usuario</li>
        </ol>
            <div class="container">
                <div class="row">
                    <h1>Editar Usuario</h1>
                     <form action="<%=request.getContextPath()%>/Update" method="post">
                            <input type="hidden" value="<c:out value="${id}"/>" name="id">
                            <div class="form-group">
                                <label for="nombre">Nombre</label>
                                <input type="text" name="nombre" value="<c:out value="${nombre}" />" id="nombre" class="form-control" placeholder="Por favor digite sus nombres" required>
                            </div>
                            <div class="form-group">
                                <label for="apellido">Apellido</label>
                                <input type="text" name="apellido" value="<c:out value="${apellido}" />" id="apellido" class="form-control" placeholder="Por favor digite sus nombres" required>
                            </div>
                            <div class="form-group">
                                <label for="correo">Correo Electronico</label>
                                <input type="email" name="correo" value="<c:out value="${correo}" />" id="correo" class="form-control" placeholder="Por favor digite su correo electronico" required>
                            </div>
                            <div class="form-group">
                                <label for="cargo">Cargo</label>
                                <input type="text" name="cargo" value="<c:out value="${cargo}" />" id="cargo" class="form-control" placeholder="Por favor digite sus nombres" required>
                            </div>
                            <div class="form-group">
                                <label for="telefono">Telefono</label>
                                <input type="text" name="telefono" value="<c:out value="${telefono}" />" id="telefono" class="form-control" placeholder="Por favor digite sus nombres" required>
                            </div>
                            <div class="form-group">
                                <label for="direccion">Direccion</label>
                                <input type="text" name="direccion" value="<c:out value="${direccion}" />" id="direccion" class="form-control" placeholder="Por favor digite sus nombres" required>
                            </div>
                            <p>
                                <input type="submit" class="btn btn-primary btn-lg btn-block" value="Editar Usuario">
                            </p>
                       </form>
                </div>
            </div>
    </body>
</html>
