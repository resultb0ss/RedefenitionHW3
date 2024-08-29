fun main() {
    var strOne = "ПриВет, кАк деЛа"
    var count = 0
    for (i in strOne){
        if (i.isUpperCase()){
            println(i)
            count+=1
        }

    }
    println("Больших символов $count")
}