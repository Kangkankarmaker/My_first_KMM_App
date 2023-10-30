package kk.example.myfirstkmmapp


import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.format

actual class Strings{
    actual fun get(id:StringResource, argue:List<Any>):String{
        return if (argue.isEmpty()){
            StringDesc.Resource(id).localized()
        }else{
            id.format(*argue.toTypedArray()).localized()
        }
    }
}