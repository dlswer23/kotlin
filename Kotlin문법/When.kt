
fun main(args:Array<String>){

    var num:Int = 10

    when(num){
        0->println("0입니다")
        5->println("5입니다")
        10->println("10입니다")

        else -> {
            println("0,5,10에 속하지 않습니다")
            println("이렇게 중괄호 여러 라인을 쓸 수 있다")
        }
    }
}

//자바의 switch-case문과 유사하다.
