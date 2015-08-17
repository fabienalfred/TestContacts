<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<title>Accueil</title>
</head>
<body>
	<div id="page">
		<div id="divFormSearch">
			<form action="FrontControllerServlet?cde=searchName" method="post">
				<div
					class="mdl-textfield mdl-js-textfield mdl-textfield--expandable textfield-demo">
					<label class="mdl-button mdl-js-button mdl-button--icon"
						for="inputName"> <i class="material-icons">search</i>
					</label>
					<div class="mdl-textfield__expandable-holder">
						<input class="mdl-textfield__input" type="text" id="inputName"
							name="nameContact" /> <label class="mdl-textfield__label"
							for="sample-expandable">Nom du contact</label>
					</div>
				</div>
			</form>
		</div>

		<div id="formAll">
			<form action="FrontControllerServlet?cde=getAll" method="post">
				<button id="buttonAll"
					class="mdl-button mdl-js-button mdl-js-ripple-effect mdl-button--colored">Get
					all</button>
			</form>
		</div>

		<div id="divFormContact">
			<form id="formContact" action="FrontControllerServlet?cde=add" method="post">
				<fieldset>
					<legend>Nouveau contact</legend>
					<div class="mdl-textfield mdl-js-textfield">
						<label for="contactCiv" class="mdl-textfield__label">Civilité...</label>
						<input id="contactCiv" name="contactCiv" class="mdl-textfield__input" type="text" />
					</div>
					<div class="mdl-textfield mdl-js-textfield">
						<label for="contactName" class="mdl-textfield__label">Nom...</label>
						<input id="contactName" name="contactName" class="mdl-textfield__input" type="text" />
					</div>
					<div class="mdl-textfield mdl-js-textfield">
						<label for="contactPrenom" class="mdl-textfield__label">Prenom...</label>
						<input id="contactPrenom" name="contactPrenom" class="mdl-textfield__input" type="text" />
					</div>
					<br /><br />
					<div id="divButtons">
						<button id="createContact" type="submit"
							class="mdl-button mdl-js-button mdl-button--icon mdl-js-ripple-effect mdl-button--colored">
							<i class="material-icons">add</i>
						</button>
					</div>
				</fieldset>
			</form>
			<br />
		</div>
	</div>
</body>
</html>