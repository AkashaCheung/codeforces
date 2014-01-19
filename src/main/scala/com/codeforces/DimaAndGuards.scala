import java.util.Scanner
import scala.util.control.Breaks._

object DimaAndGuards extends App {
	val scan = new Scanner(System.in)
	
	val n = scan.nextInt
	
	def ok(a: Int, b: Int, c: Int, d: Int): Int = {
		if (a + c <= n) a
		else if(b + c <= n) b
		else if(a + d <= n) a
		else if(b + d <= n) b
		else -1
	}

	var find = false
	for(i <- 1 to 4) {
		val ret = ok(scan.nextInt, scan.nextInt, scan.nextInt, scan.nextInt)
		if (!find && ret != -1) {
			println("%d %d %d".format(i, ret, n - ret))
			find = true
		}
	}
	if (!find) println("-1")
}
