import java.util.Scanner
import scala.math.max

object TheFibonacciSegment extends App {
	val scan = new Scanner(System.in)
	val n = scan.nextInt
	val a = new Array[Int](n)
	
	var ans = 2
	var nowx: Int = _
	var nowy: Int = _
	var nowl = 2
	for(i <- 0 until n) {
		val z = scan.nextInt
		if(i >= 2) {
			if(nowx + nowy == z) {
				ans = max(ans, nowl + 1)
				nowl = nowl + 1
			} else nowl = 2
		}
		nowx = nowy
		nowy = z
	}

	if(n == 1) ans = 1
	println(ans)
}
