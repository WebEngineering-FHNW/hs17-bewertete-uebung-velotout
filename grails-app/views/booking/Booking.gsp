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
  <h2>Ausleih in diese Datenbank</h2>
  <ul>
  <g:each var="book" in="${bookings}">
    <li>  ${book.booker} hat <strong>${book.media} </strong> ausgeliehen.
    <br>den  ${book.date}
    <p id="comment">No comments</p>
      <!--VERSUCH
      <script>
        var today = new Date().clearTime();
        var returnDate = ${book.date};
           if (returnDate==today){  status="Please give the media back: returnDate"; }
            else {status="No Problem with this Booking"; }
              document.getElementById("comment").innerHTML =status;
      </script>-->

      <br><br> </li>
  </g:each>
</ul>
  .
</div>

</section>
</body>
</html>