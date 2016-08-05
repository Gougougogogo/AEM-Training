<%@include file="/libs/foundation/global.jsp"%>
<%@taglib prefix="cq" uri="http://www.day.com/taglibs/cq/1.0" %>
<%@ page session="false" import="com.thoughtworks.www.samples.services.SimpleService" %>

<h1>Kun Xi Template Page</h1>
<footer>
    <%
        //create a instance
        SimpleService timeService = sling.getService(SimpleService.class);
    %>
</footer>
