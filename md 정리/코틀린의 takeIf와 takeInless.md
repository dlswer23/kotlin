

## 코틀린의 takeIf 와 takeUnless



takeIf 함수와 takeUnless는 kotlin 확장함수 입니다.



takeIf 함수를 보자면 

```kotlin
public inline fun <T> T.takeIf(predicate: (T) -> Boolean): T? 
    = if (predicate(this)) this else null
```

takeIf에 조건함수 predicate는 파라미터로 T 객체를 전달 받습니다.

predicate의 결과에 따라 T 객체인 자기 자신이나 null을 반환 합니다.





takeUnless 함수를 살펴보자면 

```kotlin
public inline fun <T> T.takeUnless(predicate: (T) -> Boolean): T? 
    = if (!predicate(this)) this else null
```

takeIf 함수와는 역으로 동작합니다. 

takeUnless는 조건이 true일 때 -> null

​						조건이 false일 때 -> this 를 반환합니다.





```ko
//기존 코드 
if(status) { doThis() }

//수정된 코드 
takeIf { status }?.apply { doThis() }
```