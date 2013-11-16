import java.util.Scanner

object Fence {
	def main(args: Array[String]): Unit = {
		val scan: Scanner = new Scanner(System.in)
		val n = scan.nextInt
		val k = scan.nextInt
		
		val h: Array[Int] = new Array[Int](n)
		for(i <- 0 until n) {
			h(i) = scan.nextInt
		}
		
		var ans = 0
		var now = 0
		var best = 0x3fffffff
		for((x,i) <- h.view.zipWithIndex) {
			if (i < k) now += x
			else {
				now += x
				now -= h(i - k)
			}
			if (i >= k - 1 && best > now) {
				ans = i
				best = now
			}
		}
		println(ans - k + 2)
	}
}
