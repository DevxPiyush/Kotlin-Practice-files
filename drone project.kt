open class drone{
    open val look = "Black and white"
open fun setoff(){
move(0.0,10.0,0.0)
}
open fun move(front:Double,up:Double,rotate:Double){
    println("moving $front $up $rotate")
}
}
class SuperheroDrone():drone(){
    override val look: String = "Superhero look"
    override fun setoff() {
        move(9.0,8.0,9.9)
    }

    override fun move(front: Double, up: Double, rotate: Double) {
        println("superhero is moving by $front front $up up and rotating by $rotate")
    super.move(front, up, rotate)
    }
}
fun main(){
    val drone=SuperheroDrone()
    println(drone.look)
    drone.setoff()
    drone.move(10.0,0.0,9.0)
}