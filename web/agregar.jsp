<%-- 
    Document   : agregar
    Created on : Oct 12, 2021, 11:39:02 AM
    Author     : ferna
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset=UTF-8">
        <%@include file="header.jsp" %>
        <title>Usuarios</title>
    </head>
    <body>
        <ol class="breadcrumb">
            <li><a href="<%=request.getContextPath()%>/user">Listado de Usuarios</a></li>
            <li class="active">Agregar usuario</li>
        </ol>
            <div class="container">
                <div class="row">
                    <h1>Agregar usuarios</h1>
                        <form name="form" action="<%=request.getContextPath()%>/agregar_post" method="post">
                        <div class="form-group">
                           <label for="nombre">Nombre</label>
                           <input type="text" class="form-control" id="n1" placeholder="Ingresa tu nombre" name="nom" autocomplete="off" required>
                         </div> 
                       <div class="form-group">
                           <label for="apellido">Apellido</label>
                           <input type="text" class="form-control" id="a1" placeholder="Ingresa tu apellido" name="ap" autocomplete="off" required>
                         </div>  
                       <div class="form-group">
                           <label for="correo">Email address</label>
                           <input type="email" class="form-control" id="exampleInputEmail1" placeholder="Ingresa tu correo" name="corr" autocomplete="off" required>
                         </div>
                       <div class="form-group">
                           <label for="cargo">Cargo</label>
                           <input type="text" class="form-control" id="c1" placeholder="Ingresa tu cargo" name="car" autocomplete="off" required>
                         </div> 
                       <div class="form-group">
                           <label for="telefono">Telefono</label>
                           <input type="number" class="form-control" id="t1" placeholder="Ingresa tu telefono" name="tel" autocomplete="off" required>
                         </div> 
                       <div class="form-group">
                           <label for="direccion">Direccion</label>
                           <input type="text" class="form-control" id="d1"  placeholder="Ingresa tu direccion" name="direc" autocomplete="off" required>
                         </div>   
                         <button type="submit" class="btn btn-success btn-lg btn-block">Guardar registro</button>
                       </form>
                </div>
            </div>
        
    </body>
</html>
