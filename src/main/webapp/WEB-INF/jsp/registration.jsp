<html lang="en">
<head>
    <title>Registration</title>

</head>

<body>
<h1> Registration </h1>
<form: form modelAttribute="registration1">

    <table>
        <tr>
            <td>FirstName </td>
            <td> <form:input type="text" path="FirstName"></td>

        </tr>

        <tr>
                    <td> LastName </td>
                    <td> <form:input type="text" path="LastName" /></td>

          </tr>


         <tr>
          <td colspan="3"> <input type="submit" value="Add Registeration"> </td>
         </tr>



    </table>
</form:form>


</body>
</html>