<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<html>
	<button><spring:message code="label.enterpriseAdd"/></button>
	<body>
		<table>
			<tr>
				<th><spring:message code="label.enterpriseCode"/></th>
				<th><spring:message code="label.formOfIncorporationShort"/></th>
				<th><spring:message code="label.enterpriseName"/></th>
			</tr>
			<c:forEach var="enterprise" items="${enterprises}">
				<tr>
					<td>${enterprise.code}</td>
					<td>${enterprise.formOfIncorporation.shortName}</td>
					<td>${enterprise.name}</td>
				</tr>
			</c:forEach>
		</table>
	</body>
</html>
