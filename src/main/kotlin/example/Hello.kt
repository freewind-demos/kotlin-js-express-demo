package example

external fun require(module: String): dynamic

val express = require("express")
val app = express()

fun main(args: Array<String>) {
    
    app.get("/", { req, res ->
        res.type("text/plain")
        res.send("Hello!")
    })

    app.listen(3000, {
        println("Listen on 3000")
    })

}

