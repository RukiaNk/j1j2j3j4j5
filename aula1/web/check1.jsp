
<%-- 
    Document   : teste
    Created on : 10/08/2018, 19:20:11
    Author     : Ana, Marcos, Michelly
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style>table {
border: solid black 1px;
}

h1 {
font-family: Verdana, Geneva, Tahoma, sans-serif;
color: blue
}

tr {
border: solid black 1px;
}

td {
border: solid black 1px;
}

body{
background-color: lightblue;</style>
    </head>
    <body>
        <h1>SEPT</h1>
        <table>
            <tr>
                <td>
                    Nome   
                </td>
                <td>
                    Rede Social
                </td>
            </tr>
            <tr>
                <td>
                    Ana Nicole Massaneiro
                </td>
                <td>
                    <a href="https://www.instagram/AnaNicole/">Instagram</a>
                </td>
            </tr>
            <tr>
                <td>
                    Marcos Henrique Bastos
                </td>
                <td>
                    <a href="https://www.facebook.com/MarcosBastos/">Facebook</a>
                </td>
            </tr>
            <tr>
                <td>
                    Michelly Narita Kuriyama
                </td>
                <td>
                    <a href="https://www.twitter.com/MichelyNK">Twitter</a>
                </td>
            </tr>
        </table>
        <input id="botao" onclick="location.href = 'primServlet'" name="voltar" type="submit" value="Voltar">
    </body>