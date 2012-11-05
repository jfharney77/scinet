<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

 <script type="text/javascript" src='<c:url value="/scripts/jquery-1.7.2/jquery.min.js" /> '></script>
 <script type="text/javascript" src='<c:url value="/scripts/jquery-1.4.2/jquery-ui-1.8.12.custom.min.js" /> '></script>

 
 
<html>
<head>
<title>ESGF Metadata Editor</title>
<!--Styles-->
<link type="text/css" rel="stylesheet" media="all" href='<c:url value="/styles/css/main.css" /> ' />
<link type="text/css" rel="stylesheet" media="all"
	href='<c:url value="/styles/css/autocomplete.css" /> ' />
<link rel="stylesheet" type="text/css"
	href='<c:url value="/styles/css/mfbase/ext/resources/css/ext-all.css" /> ' ></link>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/styles/css/mfbase/ext/resources/css/xtheme-gray.css" /> ' ></link>
<link rel="stylesheet" type="text/css"
	href='<c:url value="/styles/mfbase/openlayers/theme/default/style.css" /> ' ></link>
<link rel="stylesheet" type="text/css" href='<c:url value="/styles/css/spatialsearch.css" /> ' ></link>
<link rel="stylesheet" type="text/css" href='<c:url value="/styles/css/jquery-ui.css" /> ' ></link>
<link rel="stylesheet" type="text/css" href='<c:url value="/styles/css/common.css" /> ' ></link>

	
<!--Scripts-->

<script type="text/javascript" src='<c:url value="/scripts/js/toggleMenu.js" /> ' ></script>
<script type='text/javascript'
	src='<c:url value="/scripts/OME/dwr/interface/AutoCompleteService.js" /> ' ></script>
<script type='text/javascript' src='<c:url value="/scripts/OME/dwr/engine.js" /> ' ></script>
<script type='text/javascript' src='<c:url value="/scripts/OME/dwr/util.js" /> ' ></script>
<script type='text/javascript' src='<c:url value="/scripts/js/dwrspring.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/prototype/prototype.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/script.aculo.us/effects.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/script.aculo.us/controls.js" /> ' ></script>
<script type='text/javascript' src='<c:url value="/scripts/js/autocomplete.js" /> ' ></script>
 
<script type="text/javascript" src='<c:url value="/scripts/js/jquery.min.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/jquery-ui.min.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/jquery.validate.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/collapsible.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/mfbase/openlayers/OpenLayers.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/mfbase/openlayers/Geocoder.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/mfbase/ext/adapter/ext/ext-base.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/mfbase/ext/ext-all-debug.js" /> ' ></script>

<script type="text/javascript" src='<c:url value="/scripts/js/mfbase/GeoExtSingle/script/GeoExt.js" /> ' ></script>

	
<script type="text/javascript" src='<c:url value="/scripts/js/spatialsearch.js" /> ' ></script>
<script type="text/javascript" src='<c:url value="/scripts/js/main.js" /> ' ></script>

</head>

<body>
	
	
<%-- 
<%@ include file="/WEB-INF/jsp/metadata/header1.jsp" %>
--%>	

<%@ include file="/WEB-INF/jsp/metadata/header2.jsp" %>
<%@ include file="/WEB-INF/jsp/metadata/main.jsp" %>

<%-- 
<%@ include file="/WEB-INF/jsp/metadata/main.jsp" %>
--%>

<%-- 
<%@ include file="/WEB-INF/jsp/metadata/footer1.jsp" %>
--%>
</body>
