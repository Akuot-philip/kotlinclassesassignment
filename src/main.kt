fun main(){

 var food= Human("Queenter",21,80.0F)
    food.eat(2)
    println(food.weight)

    food.speak("My name is Queenter and i love kotlin")
    food.birthday()
    var x=user("Akuot","Queenter","ahffghilipp@gmail.com",792345087,"Dinskey")
    (println(x.firstName))
    (println(x.lastName))
    (println(x.email))
    (println(x.password))





}
class Human(var name:String,var age:Int,var weight:Float){

    fun eat(foodWeight: Int){
        println("i am eating $foodWeight kg of food")
        weight+=foodWeight


    }

    fun speak(speech: String){
        println(speech)

    }
    fun birthday():Int{
       println(age+1)
        return age

    }

}
data class user(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String)

