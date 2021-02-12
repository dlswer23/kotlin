package chap02.section1

import java.awt.Stroke

import com.example.edu.Person as User

fun main(){
    val user1 = Person("Kildong",30)
    val user2 =Person("A123","Kildong")


    println(user1.name)

    println(user2.id)
    println(user2.name)

}
class Person(val id:String, val name:String)