<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>


<div class="container">

<table class = "table  table-hover">
<caption>All Riddles and Answers.... </caption>
<thead class="thead-dark">
<tr>
<th>Id</th>
<th>Riddle</th>
<th>Answer</th>
<th></th>
<th></th>
</tr>
</thead>

<tbody>
<c:forEach items = "${qna }" var = "qna">
<tr>
<td>${qna.riddleId }</td>
<td>${qna.question }</td>
<td>${qna.answer }</td>
<td><a type="button" class="btn btn-warning" href = "/delete-todo?id=${qna.riddleId}">Delete</a></td>
<td><a type="button" class="btn btn-success" href="/update-todo?id=${qna.riddleId}">Update</a></td>
</tr>
</c:forEach>

</tbody>
</table>



</div>


<%@ include file="common/footer.jspf" %>