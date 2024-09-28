interface Animal {
    val breed: String
    fun pet()
}
class cat(
    val name: String,
    override val breed:String
): Animal{
    override fun pet(){
        println("meow")
    }
}
class dog(
    val name:String,
    override val breed:String
):Animal{
    override fun pet(){
        println("waff")
    }
}
fun pet(animal: Animal){
    println("you petted a${animal.breed} named as")
    animal.pet()

}
fun main(){
    pet(cat("honey","munchkin"))
    pet(dog("booster","golden retriver"))
}