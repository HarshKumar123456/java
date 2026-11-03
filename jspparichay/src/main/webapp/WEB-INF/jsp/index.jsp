<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>JSP Parichay | Harsh Kumar</title>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        #jodne-wala-form {
            margin: auto;
            display: flex;
            flex-direction: column;
            width: 80vw;
            height: min-content;
            border: 2px solid rgb(185, 139, 229);
            border-radius: 4px;
        }

        #jodne-wala-form > input {
            margin: 8px;
            padding: 8px 16px;
            border: 2px solid rgb(147, 241, 186);
            border-radius: 4px;
        }

        #jodne-wala-form > button {
            margin: 16px;
            padding: 16px 32px;
            border: 2px solid rgb(81, 156, 214);
            border-radius: 9999px;
        }







        #multiply-wala-form {
            margin: auto;
            display: flex;
            flex-direction: column;
            width: 80vw;
            height: min-content;
            border: 2px solid rgb(49, 225, 231);
            border-radius: 4px;
        }

        #multiply-wala-form > input {
            margin: 8px;
            padding: 8px 16px;
            border: 2px solid rgb(147, 241, 186);
            border-radius: 4px;
        }

        #multiply-wala-form > button {
            margin: 16px;
            padding: 16px 32px;
            border: 2px solid rgb(81, 156, 214);
            border-radius: 9999px;
        }






        #divide-wala-form {
            margin: auto;
            display: flex;
            flex-direction: column;
            width: 80vw;
            height: min-content;
            border: 2px solid rgb(171, 68, 235);
            border-radius: 4px;
        }

        #divide-wala-form > input {
            margin: 8px;
            padding: 8px 16px;
            border: 2px solid rgb(147, 241, 186);
            border-radius: 4px;
        }

        #divide-wala-form > button {
            margin: 16px;
            padding: 16px 32px;
            border: 2px solid rgb(81, 156, 214);
            border-radius: 9999px;
        }







        #subtract-wala-form {
            margin: auto;
            display: flex;
            flex-direction: column;
            width: 80vw;
            height: min-content;
            border: 2px solid rgb(227, 77, 54);
            border-radius: 4px;
        }

        #subtract-wala-form > input {
            margin: 8px;
            padding: 8px 16px;
            border: 2px solid rgb(147, 241, 186);
            border-radius: 4px;
        }

        #subtract-wala-form > button {
            margin: 16px;
            padding: 16px 32px;
            border: 2px solid rgb(81, 156, 214);
            border-radius: 9999px;
        }
    </style>

</head>
<body>
    <h1>Namaste Duniya from JSP Parichay</h1>
    <form action="print-alien" id="alien-wala-form">
        <h2>Alien Wala Form</h2>
        <input type="text" name="name" id="name" placeholder="Kripya Alien ka Naam enter kijiye....">
        <input type="number" name="id" id="id" placeholder="Kripya Alien ki id enter kijiye....">
        <button type="submit">
            Print karke Dekhte hain
        </button>
        
    </form>

    <br>
    <br>
    <br>
    <br>

    <form action="print-alien-part-2" id="alien-wala-form">
        <h2>Alien Wala Form Part 2</h2>
        <input type="text" name="name" id="name" placeholder="Kripya Alien ka Naam enter kijiye....">
        <input type="number" name="id" id="id" placeholder="Kripya Alien ki id enter kijiye....">
        <button type="submit">
            Print karke Dekhte hain
        </button>
        
    </form>

    <br>
    <br>
    <br>
    <br>





    <form action="jodiye" id="jodne-wala-form">
        <h2>Jodne Wala Form</h2>
        <input type="number" name="pahla" id="pahla" placeholder="Kripya Pahla no. enter kijiye....">
        <input type="number" name="doosra" id="doosra" placeholder="Kripya Doosra no. enter kijiye....">
        <button type="submit">
            Jodkar Dekhte hain
        </button>
        
    </form>

    <br>
    <br>
    <br>
    <br>

    <form action="multiply-kijiye" id="multiply-wala-form">
        <h2>Multiply Wala Form</h2>
        <input type="number" name="pahla" id="pahla" placeholder="Kripya Pahla no. enter kijiye....">
        <input type="number" name="doosra" id="doosra" placeholder="Kripya Doosra no. enter kijiye....">
        <button type="submit">
            Multiply karke Dekhte hain
        </button>
        
    </form>


    <br>
    <br>
    <br>
    <br>

    <form action="divide-kijiye" id="divide-wala-form">
        <h2>Divide Wala Form</h2>
        <input type="number" name="pahla" id="pahla" placeholder="Kripya Pahla no. enter kijiye....">
        <input type="number" name="doosra" id="doosra" placeholder="Kripya Doosra no. enter kijiye....">
        <button type="submit">
            Divide karke Dekhte hain
        </button>
        
    </form>




    <br>
    <br>
    <br>
    <br>

    <form action="subtract-kijiye" id="subtract-wala-form">
        <h2>Subtract Wala Form</h2>
        <input type="number" name="pahla" id="pahla" placeholder="Kripya Pahla no. enter kijiye....">
        <input type="number" name="doosra" id="doosra" placeholder="Kripya Doosra no. enter kijiye....">
        <button type="submit">
            Subtract karke Dekhte hain
        </button>
        
    </form>
</body>
</html>