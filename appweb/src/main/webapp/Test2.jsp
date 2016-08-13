<%@ page import="java.util.Date" %>
<%@ page import="org.test_jee5.ejb1.IEjb1" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="org.test_jee5.ejb2.IEjb2" %>
<%@ page import="javax.ejb.EJB" %><%--
  Created by IntelliJ IDEA.
  User: Alain
  Date: 10/07/2016
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test 2</title>
</head>

<%!
    //@EJB
    //private IEjb2 ejb2;

%>

<%
    IEjb1 ejb1;
    IEjb2 ejb2;
    Properties jndiProperties=new Properties();
    jndiProperties.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
    Context context=new InitialContext(jndiProperties);
    String url;
    //url="ejb:/ear1//ejb1 !org.test_jee5.ejb1.IEjb1";
    //url="java:module/Ejb1!org.test_jee5.ejb1.IEjb1";
    //url="java:module/Ejb1";
    url="java:app/org.test_jee5.ejb1-1.0-SNAPSHOT/Ejb1";
    ejb1= (IEjb1) context.lookup(url);

    url="java:app/org.test_jee5.ejb2-1.0-SNAPSHOT/Ejb2";
    ejb2= (IEjb2) context.lookup(url);
%>

<body>
Test 1 : <%= new Date() %><br/>
Test 2 : <%= ejb1.getValeurTest() %><br/>
Test 3.1 : <%= ejb2.getAndIncrement() %><br/>
Test 3.2 : <%= ejb2.getIntRandom() %><br/>
Test 3.3 : <%= ejb2.getValue() %><br/>
</body>
</html>
