<%@ page import="java.util.Date" %>
<%@ page import="org.test_jee5.ejb1.IEjb1" %>
<%@ page import="java.util.Properties" %>
<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="org.test_jee5.ejb2.IEjb2" %>
<%@ page import="javax.ejb.EJB" %>
<%@ page import="org.test_jee5.ejb3.IEjb3" %><%--
  Created by IntelliJ IDEA.
  User: Alain
  Date: 10/07/2016
  Time: 09:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Test 3</title>
</head>

<%!
    //@EJB
    //private IEjb2 ejb2;

%>

<%
    //IEjb1 ejb1;
    //IEjb2 ejb2;
    IEjb3 ejb3;
    Properties jndiProperties=new Properties();
    jndiProperties.put(Context.URL_PKG_PREFIXES,"org.jboss.ejb.client.naming");
    Context context=new InitialContext(jndiProperties);
    String url;
    //url="ejb:/ear1//ejb1 !org.test_jee5.ejb1.IEjb1";
    //url="java:module/Ejb1!org.test_jee5.ejb1.IEjb1";
    //url="java:module/Ejb1";
    /*url="java:app/org.test_jee5.ejb1-1.0-SNAPSHOT/Ejb1";
    ejb1= (IEjb1) context.lookup(url);

    url="java:app/org.test_jee5.ejb2-1.0-SNAPSHOT/Ejb2";
    ejb2= (IEjb2) context.lookup(url);*/
    url="java:app/org.test_jee5.ejb3jpa-1.0-SNAPSHOT/Ejb3";
    ejb3= (IEjb3) context.lookup(url);
    ejb3.ajoute("AAAA","BBBBB");
%>

<body>
Test 1 : <%= new Date() %><br/>
Test 2 : <%= ejb3.getNb() %><br/>

</body>
</html>
