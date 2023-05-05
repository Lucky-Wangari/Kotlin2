fun main() {
    println(records("Lucky", 45, "New Zealand"))
    println(sentence("discombobulate"))
    println(myName("Monica"))

}
//Write a function that takes in 3 parameters, name, age, and country,
//and returns a String with this structure “Hi, my name is x, I am y years old and I am from z.”
//Where x, y, and z are the provided name, age, and country respectively. (3 points)
fun records(name: String, age: Int, country: String): String{
    return "Hi, my name is $name, I am $age years old and I am from $country"

}
//Write a function that takes in a String and returns its length (2 points)
fun sentence(word: String): Int{
    return word.length
}
//Write a function that takes in a name and prints out “That’s me!” when your name
// is passed to it, otherwise,
// it prints out “I don’t know who that is” (3 points)
fun myName(name: String){
    var names = "Lucky Wangari"
        if (name == names){
            println("That's me")
    } else{
        println("I don't know who that is")
    }
}
//Write a Kotlin function that takes in a string will
//all the vowels replaces by the character ‘*’.
//Use string interpolation to generate the output. (2 points)
fun replacing(details: String){
    var vowels = "aeiou"
    var replaced = ""
    for( x in details){
        if (x in vowels ){
            replaced += "*"
        } else{
            println(x)
        }
        println(replaced)
    }

}