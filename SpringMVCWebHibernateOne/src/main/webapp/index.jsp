<!DOCTYPE html>
<html lang="en">

<head>
    <title>LoginPage</title>

    <style>
        .block {
            width: 300px;
            height: 120px;
            background-color: blue;
        }
    </style>
    <script type="text/javascript">
        function reset() {
            document.getElementById("loginform").reset();
        }
    </script>

</head>




<body>
    <form id="loginform" action="login">
            <div class="block">
                <table>
                    <tr>
                        <td>
                            <p><b>USER ID:</b></p>
                        </td>
                        <td><input type="text" name="username"> </td>
                    </tr>
                    <tr>
                        <td>
                            <p><b>PASSWORD</b></p>
                        </td>
                        <td><input type="password" name="password">
                        </td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Submit"></td>
                        <td><input type="button" value="Clear" onclick="reset()"></td>
                    </tr>
                </table>
            </div>
    </form>
</body>

</html>