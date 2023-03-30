fun main(args: Array<String>) {

    val result = birthdayCakeCandles(arrayOf(3,2,1,3))
    println(result)
}


fun birthdayCakeCandles(candles: Array<Int>): Int {
    val bigNumber = candles.maxOrNull()

    var numberBig =0
    for(number in candles){
        if(bigNumber==number)
            numberBig++
    }

    return numberBig
}
