<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core_1_1" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<link rel="stylesheet"
	href="https://storage.googleapis.com/code.getmdl.io/1.0.0/material.indigo-orange.min.css" />
<script
	src="https://storage.googleapis.com/code.getmdl.io/1.0.0/material.min.js"></script>
<link rel="stylesheet"
	href="https://fonts.googleapis.com/icon?family=Material+Icons">
<title>Liste des contacts</title>
</head>
<body>
	<div id="page">
		<div id="divTable">
			<table id="resultTable"
				class="mdl-data-table mdl-js-data-table mdl-data-table--selectable mdl-shadow--2dp">
				<thead>
					<tr>
						<th class="mdl-data-table__cell--non-numeric">Civilit�</th>
						<th class="mdl-data-table__cell--non-numeric">Nom</th>
						<th class="mdl-data-table__cell--non-numeric">Prenom</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${contacts }" var="c">
					<tr>
						<td class="mdl-data-table__cell--non-numeric">${c.civilite }</td>
						<td class="mdl-data-table__cell--non-numeric">${c.nom }</td>
						<td class="mdl-data-table__cell--non-numeric">${c.prenom }</td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>