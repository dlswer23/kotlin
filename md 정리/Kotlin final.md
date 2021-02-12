# Kotlin final



+ 함수 정의

  + fun 키워드로 정의한다.
  + 함수 몸체가 식인 경우 return 생략가능 하다.
  + 리턴 할 값이 없는 경우 Unit으로 return 생략 가능, return type이 추론된다.
  + unit은 생략 가능하다

+ 패키지 정의

  ```
  package my.demo
      
    import java.util.*
  ```

+ 변수 정의 

  + val  : 읽기 전용 번수

  + 값의 할당이 1회만 가능하다. final 과 유사하다.

    

  #### 여기서 final이란

  final (Java) 정의와 예제는 다음과 같습니다.

  > the final keyword is used in several contexts to define an entity that can only be assigned once.

  final 키워드는 엔티티를 한 번만 할당합니다. 즉, 두 번 이상 할당하려 할 때 컴파일 오류가 발생하여 확인이 가능합니다.

  **클래스, 함수, 변수가 변하지 못하도록 의도하고 싶다면 final로 선언하는 것 입니다.**

  final에는 여러가지가 있다. 클래스, 메소드,그리고 variales 등이 있다. 