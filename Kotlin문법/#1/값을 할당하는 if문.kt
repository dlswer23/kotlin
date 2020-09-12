//If문으로 값 할당하기

//else 문에 println을 한 후에 값을 할당한다. 심지어 다른 동작을 진행하면서도 값을 할당 할 수 있다.

fun main(args:Array<String>){
    var a = 10
    var b = 20

    var c = if(a==b) {
        println("if문의 코드 블럭 실행")
        "a와 b는 같은 값 입니다" //C의 값이 할당된다.

    } else {
        println("else문의 코드블럭 실행")
            "a와 b는 다른 값 입니다" //C의 값이 할당된다.

    }
    println(c)
}