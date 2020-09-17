
<#include "principal.ftl">
<#macro page_body>
    <br>
    <div class="container">
        <div class="jumbotron">
            <h1 class="display-4">Listado de Estudiantes</h1>
            <br>

            <a href="/api/crear" class="btn btn-primary">Nuevo Estudiante</a>
            <br>
            <table class="table table-striped">
                <br>
                <thead>
                <tr>
                    <th scope="col" style="width:25%">Matricula</th>
                    <th scope="col" style="width:25%">Nombre</th>
                    <th scope="col" style="width:25%">Apellido</th>
                    <th scope="col" style="width:25%">Telefono</th>
                    <th scope="col" style="width:25%">Acciones</th>
                </tr>
                </thead>
                <tbody>
                <#if estudiantes??>
                    <#list estudiantes as est>
                        <tr>
                            <td>${est.matricula}</td>
                            <td>${est.nombre}</td>
                            <td>${est.apellido}</td>
                            <td>${est.telefono}</td>
                            <td>
                                <a class="btn btn-secondary btn-sm" href="/api/editar?matricula=${est.matricula}">Editar</a>
                                <a class="btn btn-danger btn-sm" href="/api/eliminar?matricula=${est.matricula}">Eliminar</a>
                            </td>
                        </tr>
                    </#list>
                </#if>
                </tbody>
            </table>
        </div>
    </div>
</#macro>
<@display_page/>

