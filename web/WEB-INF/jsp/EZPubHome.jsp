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

<div style="font-size:18px;font-style:bold;text-align:center;margin-bottom:20px">EZPub Home Page for ${openid}</div>


<form action="/esg-webpub/service/new/${openid}" method="post" style="margin-top:30px">
<!--  
<input type="hidden" name="dataset_id" value="' + id + '">/employee/{id}
-->

<input id="publish-new-button" type="submit" value="Publish New Dataset" />

</form>
      		

</body>
</html>

<script type="text/javascript">

    $(function(){
    	
    	$('#publish-new-button1').click(function() {

    		alert('publish new dataset...navigate to the publication form');
    		
    		var queryString = '/esg-webpub/service/new/ddd';
    		
    		alert('posting to ' + queryString);
    		
    		var form = '<form action="'+ 'queryString.jsp' +'" method="post" >';
            
    	    form += '</form>';
    		
    	    //send request using a dynamically generated form with the query string as the action
    	    //the method should be post because the query string may be long
    	    //jQuery('<form action="'+ queryString +'" method="post" >'+ '' +'</form>')
    	    jQuery(form).appendTo('body').submit();
    	    
    	    
    	});
    	
    	
    	
    	
    	
    });
    
</script>

