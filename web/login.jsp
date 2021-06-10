<%--
    @program: web-ssh
    @description
    @author: LIANG
    @create: 2021-06-09 17:47
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
    <head>
        <title>登陆</title>
    </head>
    <body>
        <s:form  action="login" namespace="/user" >
            <s:textfield name="username" label="用户名" requiredLabel="true"></s:textfield><br>
            <s:password name="password" label="密码" requiredLabel="true" showPassword="true"></s:password><br>
            <s:submit value="登陆" ></s:submit>
        </s:form>
    </body>
</html>
