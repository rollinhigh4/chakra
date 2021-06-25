<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container">

<div>
<form:form method="post" modelAttribute="userInfo">

<div class = "form-group">
<form:label path="email">Email : </form:label>
<form:input type="text" path="email" class="form-control" required="required"/>
<form:errors path="email" cssClass="text-warning"/>
</div>

<div class = "form-group">
<form:label path="password">password : </form:label>
<form:input type="password" path="password" class="form-control" required="required"/>
<form:errors path="password" cssClass="text-warning"/>
</div>

<div class = "form-group">
<form:label path="name">Name : </form:label>
<form:input type="text" path="name" class="form-control" required="required"/>
<form:errors path="name" cssClass="text-warning"/>
</div>

<div class = "form-group">
<form:label path="mobileNo">Mobile Number : </form:label>
<form:input type="text" path="mobileNo" class="form-control" required="required"/>
<form:errors path="mobileNo" cssClass="text-warning"/>
</div>

<div class = "form-group">
<form:label path="college">College : </form:label>
<form:input type="text" path="college" class="form-control" required="required"/>
<form:errors path="college" cssClass="text-warning"/>
</div>


<div>
<button type="submit" class="btn btn-success">Add</button>
</div>

</form:form>
</div>

</div>

<%@ include file="common/footer.jspf" %>