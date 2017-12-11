package mvc

class UrlMappings {

    static mappings = {
         "/rooms"(resources: "room")
        "/persons"(resources: "person")
        "/books"(resources: "book")
        "/cds"(resources:"cd")
        "/booking"(resources:"booking")

                "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
