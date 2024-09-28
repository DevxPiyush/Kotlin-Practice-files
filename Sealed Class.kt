import java.awt.Label

sealed class Role
class ceoRole:Role()
class ManagerRole(val name: String) :Role()
class WorkerRole(val name: String) :Role()

fun constructLabel(role:Role):String{
    return when (role){
        is ceoRole -> "The Boss"
        is ManagerRole -> "Manager ${role.name}"
        is WorkerRole -> role.name
    }
}
fun main(){
    val label = constructLabel(ManagerRole("leonard"))
    println(label)
}
