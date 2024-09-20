<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Basic Form</title>

    <!-- Internal CSS -->
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 20px;
        }

        .form-container {
            max-width: 400px;
            margin: auto;
            background: #fff;
            padding: 20px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2 {
            text-align: center;
            color: #333;
        }

        .form-group {
            margin-bottom: 15px;
        }

        .form-group label {
            display: block;
            margin-bottom: 5px;
            color: #555;
        }

        .form-group input {
            width: 100%;
            padding: 8px;
            box-sizing: border-box;
            border: 1px solid #ccc;
            border-radius: 4px;
        }

        .form-group input:focus {
            border-color: #0066cc;
        }

        .submit-btn {
            width: 100%;
            padding: 10px;
            background-color: #0066cc;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        .submit-btn:hover {
            background-color: #005bb5;
        }

        .error {
            color: red;
            font-size: 0.9em;
        }
    </style>
</head>
<body>

    <div class="form-container">
        <h2>User Information Form</h2>

        <!-- Form -->
        <form id="userForm" action="addForm">
            <div class="form-group">
                <label for="id">ID</label>
                <input type="text" id="id" name="id">
                <span class="error" id="idError"></span>
            </div>

            <div class="form-group">
                <label for="firstname">First Name</label>
                <input type="text" id="firstname" name="firstname">
                <span class="error" id="firstnameError"></span>
            </div>

            <div class="form-group">
                <label for="lastname">Last Name</label>
                <input type="text" id="lastname" name="lastname">
                <span class="error" id="lastnameError"></span>
            </div>

            <div class="form-group">
                <label for="address">Address</label>
                <input type="text" id="address" name="address">
                <span class="error" id="addressError"></span>
            </div>

            <div class="form-group">
                <label for="email">Email</label>
                <input type="email" id="email" name="email">
                <span class="error" id="emailError"></span>
            </div>

            <button type="submit" class="submit-btn">Submit</button>
        </form>
    </div>
	

   
</body>
</html>
