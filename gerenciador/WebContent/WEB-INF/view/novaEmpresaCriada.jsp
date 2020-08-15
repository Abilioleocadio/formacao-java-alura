		<!-- Criando um for pulando de dois em dois numeros de 1 a 10 -->
<%-- <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!-- <html> -->
<!--   <body> -->
<%--      <c:forEach var="i" begin="1" end="10" step="2"> --%>
<%--        ${i} <br /> --%>
<%--      </c:forEach> --%>
<!--   </body> -->
<!-- </html> -->
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
	<body>
	
	<c:import url="logout-parcial.jsp" />
	
		<c:if test="${not empty empresa}">
			Empresa ${ empresa } cadastrada com sucesso!			
		</c:if>
		<c:if test="${empty empresa}">
			Nenhuma empresa cadastrada!			
		</c:if>
	</body>
</html>
