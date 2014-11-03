<%@ include file="/WEB-INF/header.jspf" %>
<form method="post" action="<c:url value="/login"/>" class="form-horizontal" >
<fieldset>

<!-- Form Name -->
<legend>Login</legend>

<!-- Text input-->
<div class="control-group">
  <label class="control-label" for="mailLogin">E-mail adress</label>
  <div class="controls">
    <input id="mailLogin" name="mailLogin" type="text" placeholder="Enter your e-mail" class="input-xlarge" required="">
    
  </div>
</div>

<!-- Password input-->
<div class="control-group">
  <label class="control-label" for="passwordRegister">Password </label>
  <div class="controls">
    <input id="passwordRegister" name="passwordRegister" type="password" placeholder="Enter your password" class="input-xlarge" required="">
    
  </div>
</div>

<!-- Button -->
<div class="control-group">
  <label class="control-label" for="validRegister"></label>
  <div class="controls">
    <button id="validRegister" name="validRegister" class="btn btn-primary">Valid</button>
  </div>
</div>

</fieldset>
</form>

<%@ include file="/WEB-INF/footer.jspf" %>