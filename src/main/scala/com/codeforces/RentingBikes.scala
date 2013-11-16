import scala.math._
import java.util.Scanner

object RentingBikes extends App {
	val scan = new Scanner(System.in)
	val n = scan.nextInt
	val m = scan.nextInt
	val a = scan.nextInt
	
	val b = {
		for(i <- 0 until n) yield scan.nextInt
	}.toArray.sortWith((x, y) => x < y)

	val p = {
		for(i <- 0 until m) yield scan.nextInt
	}.toArray.sortWith((x, y) => x < y)

	def calc(x: Int): Long = {
		var sum: Long = 0
		for(i <- 0 until x if p(i) > b(i + b.size - x)) {
			sum = sum - b(i + b.size - x) + p(i)
		}
		sum
	}

	var high = min(n, m) + 1
	var low = 1
	while (high > low) {
		val mid = (high + low) / 2
		calc(mid) <= a match {
			case true => low = mid + 1
			case false => high = mid
		}
	}
	
	val ret = low - 1
	var sum = -a
	for(i <- 0 until ret) sum = sum + p(i)
	sum = max(sum, 0)
	println("%d %d".format(ret, sum))

}
