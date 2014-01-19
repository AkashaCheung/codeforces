import java.util.Scanner
import scala.collection.mutable.HashMap

object DimaAndSalad extends App {
	val scan = new Scanner(System.in)
	val n = scan.nextInt
	val k = scan.nextInt

	val ARRAY_SIZE = 110000
	val START_INDEX = 10000
	
	val a = {
		for(i <- 0 until n) yield scan.nextInt
		}.toArray
	val b = {
		for(i <- 0 until n) yield scan.nextInt
		}.toArray
	val c = {
		for(i <- 0 until n) yield a(i) - k * b(i)
		}.toArray
	
	val arr = Array.fill[Int](ARRAY_SIZE)(-1)
	
	arr(START_INDEX) = 0
	
	for(i <- 0 until n; j <- (0 until ARRAY_SIZE -1).reverse if arr(j) != -1) {
		val newKey = j + c(i)
		val newValue = arr(j) + a(i)
		if(arr(newKey) < newValue)
			arr(newKey) = newValue
	}

	
	if(arr(START_INDEX) == -1) println("-1")
	else println(arr(0))
}
