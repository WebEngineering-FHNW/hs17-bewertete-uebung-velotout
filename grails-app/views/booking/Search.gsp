<html>

<head> <!--***************************HEAD***************************nicht angezeigt*************************** -->
  <title>Web Engineering - STUDENT</title>
  <meta name="layout" content="main"  charset="UTF-8"/>

  <asset:link rel="icon" href="icone.ico"  type="image/x-ico" /><!--Icon(Reiter) -->
  <link href='https://fonts.googleapis.com/css?family=Courgette' rel='stylesheet' type='text/css'><!--Google Font)-->
</head>
<body>
<header><!--HEADER ganz oben-->
<!--  <a></a><g:link controller="rooms" action="">Rooms search page</g:link>-->
  <h1> Library-System bei die FHWN Windisch</h1>
</header>
<nav><!--NAVIGATION-->
  <a href="../"><img alt=Home class="nav" src="Images/Accueil.png"/></a>
  <a href="../books.html" > Books</a>
  <a href="../persons" > Benutzer</a>
  <a href="../cds" > CDs</a>
  <a href="../actualBooking" > Ausleih Table </a>
  <a href="../persons/create" > Sich registrieren </a>
  <a href="./create"  > Media ausleihen </a>
  <a href="/static/News.html"  > News</a>
</nav>
<section>
<div>
  Student in diese Datenbank
  <ul>
  <g:each var="person" in="${people}">
    <li>  ${person.firstName} ${person.lastName}  </li>
  </g:each>
</ul>
  .
</div>

</section>
</body>
</html>