package kk.example.myfirstkmmapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform