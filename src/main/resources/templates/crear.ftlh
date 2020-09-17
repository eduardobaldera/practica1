<#include "principal.ftl">
<!DOCTYPE html>
<head>
    <title>Creando</title>
</head>

<#macro page_body>
        <div class="container">
            <div class="jumbotron">
                <h1 class="display-4">Creacion de Estudiante</h1>
            </div>
            <!-- El endpoint que estará procesando el formulario será enviado por el controlador      -->
            <form enctype="application/x-www-form-urlencoded" method="post" action="/api/crear" modelAttribute="estudiante" >
                <div class="form-group">
                    <label for="matriculaForm">Matricula</label>
                    <!-- La variable visualizar aplica el formulario readonly.                -->
                    <input  type="number" name="matricula" class="form-control" id="matricula" aria-describedby="matriculaHelp">
                    <small id="matriculaHelp" class="form-text text-muted">Indicar el ID</small>
                </div>
                <div class="form-group">
                    <label for="nombreForm">Nombre</label>
                    <input  type="text"  name="nombre" class="form-control" id="nombre">
                </div>
                <div class="form-group">
                    <label for="ApellidoForm">Apellido</label>
                    <input type="text"  name="apellido" class="form-control" id="apellido">
                </div>
                <div class="form-group">
                    <label for="ApellidoForm">Telefono</label>
                    <input type="text"  name="telefono" class="form-control" id="telefono">
                </div>
                <!-- Los botones para la creación del producto -->
                <button type="submit" class="btn btn-primary">Guardar</button>
                <a href="/api/listar" class="btn btn-primary">Cancelar</a>
            </form>
        </div>
</#macro>

<@display_page/>