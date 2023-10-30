package kk.example.myfirstkmmapp

import dev.icerock.moko.resources.StringResource

expect class Strings {
    fun get(id:StringResource, argue:List<Any>):String
}