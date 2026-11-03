<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>JSP Parichay | Harsh Kumar</title>
    </head>

    <body>
        <h1>Namaste Duniya from JSP Parichay</h1>

        <!--     using plain Java -->
        <h2>
            The answer is: <%= session.getAttribute("yahSessionKeAndarResultStoreKiyaGaya") %>
        </h2>


        <!--  using jstl tags -->
        <h2>The answer is: ${yahSessionKeAndarResultStoreKiyaGaya} </h2>


        <!--  using jstl tags -->
        <h2>The alien is: ${yahAlienHaiModelKeAndar} </h2>
        <h2>The normal ModelAttribute is: ${yahNormalModelAttributeKaExampleHaiBhai}</h2>
        <h2>The alien ModelAttribute is: ${yahAlienModelAttributeKaExampleHaiBhai}</h2>
    </body>

    </html>