package kr.devdogs.kotlinbook.chapter2
//package 키워드로 패키지를 선언한다

import java.util.Random as R
//코틀린은 기존 자바의 모든 라이브러리들을 사용할 수 있다. 기본 자바 API는 물론 스프링등의 프레임워크까지 사용이 가능하다.
//import로 타 패키지의 클래스를 가져올 때의 문법도 자바와 동일하다.
//하지만 코틀린에서는 파이썬 등의 언어처럼 "as" 키워드를 통해 import 한 클래스에 별명을 붙이는 것도 가능하다.


fun main(args : Array<String>){

    val random = R()
    val randomNumber = random.nextInt()

    println("랜덤하게 뽑은 숫자는 ${randomNumber} 입니다")
}

//이 코드는 자바의 API 랜덤 클래스를 가져와 R이라는 별명을 붙여주었다.
// 이 별명은 클래스를 생성하거나 사용할 때에 바로 사용할 수 있다. 메인 메소드의 R()은 Random의 객체를 생성하므로 Random()과 같은 의미이다.