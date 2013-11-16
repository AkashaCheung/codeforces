import java.util.Scanner
import scala.collection.mutable.HashSet

object GoodNumber extends App {
	val scan = new Scanner(System.in)
	val n = scan.nextInt
	val k = scan.nextInt
	
	def check(number: Int): Boolean = {
		var set = HashSet[Int]()
		var x = number
		do{
			if(x % 10 <= k) set = set + (x % 10)
			x = x / 10
		} while(x != 0)
		
		set == (0 to k).toSet
	}

	val ans = {
		for(i <- 0 until n) yield scan.nextInt
	}.toArray.filter(check).size

	println(ans)
}
