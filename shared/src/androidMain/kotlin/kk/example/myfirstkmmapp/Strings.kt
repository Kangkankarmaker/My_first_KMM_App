package kk.example.myfirstkmmapp

import android.content.Context
import dev.icerock.moko.resources.StringResource
import dev.icerock.moko.resources.desc.Resource
import dev.icerock.moko.resources.desc.StringDesc
import dev.icerock.moko.resources.format

actual class Strings(
    private val context: Context
) {
    actual fun get(id:StringResource, argue:List<Any>):String{
        return if (argue.isEmpty()){
            StringDesc.Resource(id).toString(context = context)
        }else{
            id.format(*argue.toTypedArray()).toString(context)
        }
    }
}