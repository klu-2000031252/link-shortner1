<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Design by foolishdeveloper.com -->

<!DOCTYPE html>
<html lang="en">
<head>
 
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
 
  <style>
 @import url('https://fonts.googleapis.com/css?family=Josefin+Sans:300,400,700&display=swap');

*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  outline: none;
  font-family: sans-serif;
}

body{
      height: 100vh;
      background: #e1edf9;
}

.wrapper{
  max-width: 450px;
  width: 100%;
  margin: 30px auto 0;
  padding: 10px;

}

.wrapper .form_container{
  background: #fff;
  padding: 30px;
  box-shadow: 1px 1px 15px rgba(0, 0, 0, 0.15);
  border-radius: 3px;
}
.heading{
  background: #015a80;
  margin: -30px;
  text-align: center;
  color: white;
  font-size: 19px;
  margin-bottom: 35px;
  padding: 10px;
  
  
}
.wrapper .form_container .form_item{
  margin-bottom: 25px;
}

.form_wrap.fullname,
.form_wrap.select_box{
  display: flex;
}

.form_wrap.fullname .form_item,
.form_wrap.select_box .form_item{
  width: 50%;
}

.form_wrap.fullname .form_item:first-child,
.form_wrap.select_box .form_item:first-child{
  margin-right: 4%;
}

.wrapper .form_container .form_item label{
  display: block;
  margin-bottom: 5px;
}

.form_item input[type="text"],
.form_item select{
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #dadce0;
  border-radius: 3px;
}

.form_item input[type="text"]:focus{
  border-color: #6271f0;
}

.form_item input[type="password"],
.form_item select{
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #dadce0;
  border-radius: 3px;
}



.form_item input[type="password"]:focus{
  border-color: #6271f0;
}

.form_item input[type="email"]:focus{
  border-color: #6271f0;
}

.form_item input[type="email"],
.form_item select{
  width: 100%;
  padding: 10px;
  font-size: 16px;
  border: 1px solid #dadce0;
  border-radius: 3px;
}


.btn input[type="submit"]{
  background: #1598d4;
  border: 1px solid #1598d4;
  padding: 10px;
  width: 100%;
  font-size: 16px;
  letter-spacing: 1px;
  border-radius: 3px;
  cursor: pointer;
  color: #fff;
}
  </style>
</head>
<body>
 <%@include file="index.jsp" %>
	<div class="wrapper">

		
		<div class="form_container">
		  <form action="/Registration" method="post">
        <div class="heading">
        <h2>Registration Form</h2>
      </div>
			<div class="form_wrap fullname">
				<div class="form_item">
					<label>First Name</label>
					<input type="text" name="fname" required>
					<div class="error" ></div>  
				</div>
				<div class="form_item">
					<label>Last Name</label>
					<input type="text" name="lname" required>
					<div class="error" ></div>  
				</div>
			</div>
			<div class="form_wrap">
				<div class="form_item">
					<label>Email Address</label>
					<input type="email" name="email" required>
					<div class="error" ></div>  
				</div>
			</div>
			<div class="form_wrap">
				<div class="form_item">
					<label>Password</label>
					<input type="password" name="pass" required>
					<div class="error" ></div>  
				</div>
			</div>
			<div class="form_wrap">
				<div class="form_item">
					<label>Re-Password</label>
					<input type="password" name="repass" required>
					<div class="error" ></div>  
				</div>
			</div>
			

			<div class="btn">
			  <input type="submit" value="Get Started">
			</div>
			<h4>${Uack }</h4>
		  </form>
		</div>
	  </div>
  
</body>
</html>
