import java.util.Scanner

object DimaAndTodolist extends App {
	val scan = new Scanner(System.in)
	val n = scan.nextInt
	val k = scan.nextInt

	val s = {
		for(i <- 0 until n) yield (i % k, scan.nextInt)
		}.toArray.groupBy(_._1)

	val ans = s.map(kv =>
		(kv._1, kv._2.map(_._2).reduce(_ + _))).minBy(x => (x._2, x._1))._1 + 1
	

	println(ans)
}
