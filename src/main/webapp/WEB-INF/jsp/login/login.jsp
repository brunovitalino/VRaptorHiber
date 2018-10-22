<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link rel="stylesheet" href="<c:url value="/css/bootstrap/bootstrap.css"/>">
	<style type="text/css">
		.jumbotron {
			width: 400px;
			text-align: center;
			margin-top: 5px;
			margin-left: auto;
			margin-right: auto;
		}
		.table {
			margin-bottom: 5px;
		}
		.form-control {
			margin-bottom: 5px;
		}
		.amarelo {
			background-color: yellow;
		}
		.negrito {
			font-weight: bold;
		}
		.vermelho {
			background-color: red;
		}
	</style>
	<title>Entrar</title>
</head>
<body>
	<c:import url="header.jsp" />
	
	
	<div class="jumbotron">
		<div class="container">
			<form>
			<fieldset>
			<legend>Acesso</legend>
				<div class="form-group">
					<div class="row">
						<div class="col-md-2">
							<label><h5>Nome</h5></label>
						</div>
						<div class="col-md-10">
						</div>
					</div>
					<input type="text" class="form-control"/>
					
					<div class="row">
						<div class="col-md-2">
							<label><h5>Senha</h5></label>
						</div>
						<div class="col-md-10">
						</div>
					</div>
					<input type="password" class="form-control"/>
				</div>
			</fieldset>
			</form>
		<button class="btn btn-block btn-primary">Entrar</button>
		</div>
	</div>
		
		<!-- 		
		<div class="form-group">
			<div class="col-lg-1"></div>
			<label for="usuario" class="control-label col-lg-1">Usuário:</label>			
			<div class="col-lg-2">
				<input type="text" id="usuario" aria-describedby="usuarioDica" placeholder="Usuário">
			</div>
			<!--  small id="usuarioDica" class="form-text text-muted">Não compartilharemos seus dados.</small >
			<div class="col-lg-8"></div>
		</div>
		
		
		
		
		<div class="form-check">
			<input type="checkbox" class="form-check-input" id="continuarLogado">
			<label class="form-check-label" for=continuarLogado>Mantêr-se logado?</label>
		</div>
		<button type="submit" class="btn btn-primary">Submit</button>
		 -->
	
	
	<c:import url="footer.jsp" />
</body>	
</html>