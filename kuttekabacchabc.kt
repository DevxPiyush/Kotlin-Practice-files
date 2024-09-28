open class Doge( open val name:String)
class labrador( name: String):Doge(name)
fun main(){
    val lab = labrador("kadu")
    println(lab.name)
}
