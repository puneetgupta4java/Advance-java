<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
 <title>login form</title>    
    <link type="text/css" rel="stylesheet" href="form.css"/>
    <script>
   function validateForm() {
        var x = document.forms["myForm"]["email"].value;
        var atpos = x.indexOf("@");
        var dotpos = x.lastIndexOf(".");
        if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length) {
            alert('invalid mail');
            return false;
        }
       var y = document.forms["myForm"]["phn"].value;
       if(y.length!=10){
           alert('invalid phone no.');
           return false;
       }
    }
</script>
</head>
    <body>
        <section id="parallax">
            <div id="inner">
              <div id="first">
                  <div id="second">
                  <div  id="hello"><p>Hello everyone!!</p></div>
            <form name="myForm" onsubmit="return validateForm();" method="post" action="Communicate">
                <table>
                    <tr> <td rowspan="2"><label class="lab"> Username:</label></td>
                        <td rowspan="2"><input type="text" name="user" placeholder="enter username" class="box"/> </td></tr>
                    <tr><td><c:if test="${result.length() eq 0 }">
						<p>invalid user</p>
						</c:if></td></tr>
                    <tr> <td rowspan="2"><label class="lab"> E-mail:</label></td>
                        <td rowspan="2"> <input type="text"name="email" placeholder="enter E-mail" class="box"/></td> </tr>
                    <tr><td><p id="inemail"></p></td></tr>
                        <tr> <td rowspan="2"><label class="lab"> D.O.B:</label></td>
                            <td rowspan="2"><input type="date" name="dob" placeholder="mm/dd/yyyy" class="box"/></td> </tr>
                    <tr><td><p id="indate"></p></td></tr>
                    <tr><td rowspan="2"><label class="lab">Contact No:</label></td>
                            <td rowspan="2"><input type="text" name="phn" placeholder="enter phone number" class="box"/></td></tr>
                    <tr><td><p id="inphn"></p></td></tr>
                        <tr><td rowspan="2"><label class="lab">Password:</label></td>
                            <td rowspan="2"><input type="password" name="pwd" placeholder="enter password" class="box"/></td></tr>
                    <tr><td><p id="inpwd"></p></td></tr>
                    <tr><td><button type="submit" class="sub" value="submit">Submit</button></td></tr>
                </table>        
            </form>
                      <p class="stay">Sign in & Stay tuned for more updates!!!!!</p>
                  </div>
              </div>
            </div>
        </section>
       <div id="copy">
        <h2>&copy; copyright TeamDev 2016</h2>
        </div>    
    </body>    
</html>