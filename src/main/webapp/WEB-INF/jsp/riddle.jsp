<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container">


<div>
<form:form method="post" modelAttribute="riddles">

<div class = "form-group">
<form:label path="riddleId">Question Id : </form:label>
<form:input type="text" path="riddleId" class="form-control" required="required"/>

<form:errors path="riddleId" cssClass="text-warning"/>
</div>

<div class = "form-group">
<form:label path="question">Question : </form:label>
<form:input type="text" path="question" class="form-control" required="required"/>

<form:errors path="question" cssClass="text-warning"/>
</div>


<div class = "form-group">
<form:label path="answer">Answer : </form:label>
<form:input type="text" path="answer" class="form-control" required="required"/>

<form:errors path="answer" cssClass="text-warning"/>
</div>




<div>
<button type="submit" class="btn btn-success">Add</button>
</div>

</form:form>
</div>



</div>

<%@ include file="common/footer.jspf" %>
