package mvc

class UrlMappings {

    static mappings = {
         "/rooms"(resources: "room")
        "/persons"(resources: "person")
        "/books"(resources: "book")
        "/cds"(resources:"cd")
        "/actualBooking"(resources:"booking")

        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        //"/"(redirect: "/static/index.html")
        "/"(view:"/index")
        "/index"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
