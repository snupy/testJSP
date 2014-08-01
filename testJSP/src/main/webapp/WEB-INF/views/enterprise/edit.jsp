<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<body>
	<form:form method="POST" modelAttribute="enterprise">
		<fieldset>
			<table>
				<tr>
					<th><spring:message code="label.enterpriseCode" /></th>
					<td><form:input path="code" /></td>
				</tr>
				<tr>
					<th><spring:message code="label.formOfIncorporationShort" /></th>
					<th><form:select path="formOfIncorporation">
							<form:option value="NONE" label="--- Select ---" />
							
						</form:select></th>

				</tr>
				<tr>
					<th><spring:message code="label.enterpriseName" /></th>
					<td><form:input path="name" /></td>
				</tr>
				<tr>
					<spring:message code="label.save" var="labelSave"></spring:message>
					<td colspan="2"><input type="submit" value="${labelSave}" /></td>
				</tr>
			</table>

		</fieldset>
	</form:form>
</body>
</html>