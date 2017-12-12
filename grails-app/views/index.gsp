<!doctype html>
<html>

<head> <!--***************************HEAD***************************nicht angezeigt*************************** -->
    <title>Web Engineering - bewertete Uebung.</title>
    <meta name="layout" content="main"/>
    <meta charset="UTF-8">
    <asset:link rel="icon" href="icone.ico"  type="image/x-ico" /><!--Icon(Reiter) -->
    <link href='https://fonts.googleapis.com/css?family=Courgette' rel='stylesheet' type='text/css'><!--Google Font)-->
</head>
<body>
<header><!--HEADER ganz oben-->
<!--  <a></a><g:link controller="rooms" action="">Rooms search page</g:link>-->
    <h1> Library-System bei die FHWN Windisch</h1>
</header>
<nav><!--NAVIGATION-->
    <a href=""><img class="nav" src="Images/Accueil.png"/></a>
    <a href="books.html" > Books</a>
    <a href="persons" > Benutzer</a>
    <a href="cds" > CDs</a>
    <a href="booking" > Ausleih Table </a>
    <a href="persons/create" > Sich registrieren </a>
    <a href="booking/create"  > Media ausleihen </a>
    <a href="/static/Home.html"  > Home</a>
</nav>

<!--awfull  green backgroun
    <div class="svg" role="presentation">
        <div class="grails-logo-container">
            <asset:image src="grails-cupsonly-logo-white.svg" class="grails-logo"/>
        </div>
    </div>-->

    <div id="content" role="main">
        <section class="row colset-2-its">
            <h2>Wilkommen ! LIBRARY SYSTEM</h2>
            <h3>Die aktuelle Zeit:

                <script src="http://code.jquery.com/jquery-latest.js">
                </script>
                <script src="js/jquery.carouFredSel.js">
                </script>
                <script>
                    $(document).ready(domReady);
                    function domReady() {
                        $("#carousel").carouFredSel({items : 4});
                    }
                </script>

            <script>
                var uhrzeit = new Date();
                document.write(uhrzeit.getHours());
                document.write(":");
                document.write(uhrzeit.getMinutes());
            </script></h3>

            <a href="${g.resource(file:'./views/index.html')}">My Link</a>
            <ul id="carousel">
                <li> c </li>
                <li> a </li>
                <li> r </li>
                <li> o </li>
                <li> u </li>
                <li> s </li>
                <li> e </li>
                <li> l </li>
            </ul>
            <p>
                Congratulations, you have successfully started your first Grails application! At the moment
                this is the default page, feel free to modify it to either redirect to a controller or display
                whatever content you may choose. Below is a list of controllers that are currently deployed in
                this application, click on each to execute its default action:
            </p>

            <div id="controllers" role="navigation">

                <p> Localhost: ${ InetAddress.getLocalHost() }</p>
                <h2>Available Controllers:</h2>
                <ul>

                    <li class="controller">
                        <g:link controller="booking" action="">Booking search page</g:link>
                    </li>
                    <li class="controller">
                       <!-- <g:link controller="rooms" action="search">Rooms search page</g:link>-->
                    </li>


                    <g:each var="c" in="${grailsApplication.controllerClasses.sort { it.fullName } }">
                        <li class="controller">
                            <g:link controller="${c.logicalPropertyName}">${c.fullName}</g:link>
                        </li>
                    </g:each>
                </ul>
            </div>
        </section>
    </div>

    <section>
        <p class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Application Status <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Environment: ${grails.util.Environment.current.name}</a></li>
                <li><a href="#">App profile: ${grailsApplication.config.grails?.profile}</a></li>
                <li><a href="#">App version:
                    <g:meta name="info.app.version"/></a>
                </li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Grails version:
                    <g:meta name="info.app.grailsVersion"/></a>
                </li>
                <li><a href="#">Groovy version: ${GroovySystem.getVersion()}</a></li>
                <li><a href="#">JVM version: ${System.getProperty('java.version')}</a></li>
                <li role="separator" class="divider"></li>
                <li><a href="#">Reloading active: ${grails.util.Environment.reloadingAgentEnabled}</a></li>
            </ul>
        </p>
        <p class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Artefacts <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <li><a href="#">Controllers: ${grailsApplication.controllerClasses.size()}</a></li>
                <li><a href="#">Domains: ${grailsApplication.domainClasses.size()}</a></li>
                <li><a href="#">Services: ${grailsApplication.serviceClasses.size()}</a></li>
                <li><a href="#">Tag Libraries: ${grailsApplication.tagLibClasses.size()}</a></li>
            </ul>
        </p>
        <p class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">Installed Plugins <span class="caret"></span></a>
            <ul class="dropdown-menu">
                <g:each var="plugin" in="${applicationContext.getBean('pluginManager').allPlugins}">
                    <li><a href="#">${plugin.name} - ${plugin.version}</a></li>
                </g:each>
            </ul>
        </p>

    </section>

</body>
</html>