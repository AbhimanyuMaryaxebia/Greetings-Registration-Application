<!DOCTYPE html>
       <html lang="en">
       <head>
           <meta charset="UTF-8">
           <title>Greeting</title>
       </head>
       <style>
       table {
         border-radius: 50px;
         background-color: #f2f2f2;
         padding: 40px;
         width: 100%
       }

       input[type=text], select {
         width: 100%;
         padding: 12px 20px;
         margin: 8px 0;
         display: inline-block;
         border: 1px solid #ccc;
         border-radius: 4px;
         box-sizing: border-box;
       }

       input[type=submit] {
         width: 100%;
         background-color: #4CAF50;
         color: white;
         padding: 14px 20px;
         margin: 8px 0;
         border: none;
         border-radius: 4px;
         cursor: pointer;
       }

       input[type=submit]:hover {
         background-color: #45a049;
       }

       </style>
       <body>
       <h1> ${message}</h1>
       </body>
       </html>