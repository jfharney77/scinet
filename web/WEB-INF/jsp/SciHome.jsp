<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

 <script type="text/javascript" src='<c:url value="/scripts/jquery-1.7.2/jquery.min.js" /> '></script>
 <script type="text/javascript" src='<c:url value="/scripts/jquery-1.4.2/jquery-ui-1.8.12.custom.min.js" /> '></script>



<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>EZPub Home Page</title>
</head>
<body>

<div style="font-size:18px;font-style:bold;text-align:center;margin-bottom:20px">Scinet Home Page for ${user_id}</div>

<%-- 

<form action="/esg-webpub/service/new/${openid}" method="post" style="margin-top:30px">

<input id="publish-new-button" type="submit" value="Publish New Dataset" />

</form>
--%>      		

</body>
</html>

<script type="text/javascript">

    $(function(){
    	alert('js in sci home');
    	
    	
    	
    	
    });
    
</script>

