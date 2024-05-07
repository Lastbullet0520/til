// for를 이용한 1부터 100까지의 합
var result = 0
for( i in 1..100) {
    result += i
}

println(result)


//for를 이용한 1부터 100까지 짝수의 합
result = 0

for (i in 1..100) {
    if (i % 2 == 0) {
        result +=i
    }
}
print(result)

//when을 이용한 1부터 100까지 짝수의 합
result = 0

for (i in 1..100) {
    when {
        i % 2 == 0 -> result +=i
    }
}
print(result)

// for를 이용한 FizzBuzz
for (i in 1..100) {
    if (i % 3 == 0 && i % 5 == 0) {
        println("FizzBuzz")
    } else if (i % 3 == 0) {
        println("Fizz")
    } else if (i % 5 == 0) {
        println("Buzz")
    } else {
        println(i)
    }
}
// when을 이용한 FizzBuzz
for (i in 1..100) {
    when {
        i % 3 == 0 && i % 5 ==0 -> println("FizzBuzz")
        i % 3 == 0 -> println("Fizz")
        i % 5 == 0 -> println("Buzz")
        else -> println(i)
    }
}
// 이중 for를 이용한 * 출력
for (i in 1..15) {
    if (i % 2 != 0) {
        for (n in 1..i) {
            print("*")
        }
        println(" ")
    }
}
// repeat을 이용한 * 출력
for (i in 1..15) {
    if (i % 2 != 0) {
        println("*".repeat(i))
    }
}