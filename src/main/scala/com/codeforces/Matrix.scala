import scala.collection.mutable.HashMap

object Matrix extends App {
	val a = readInt
	val s = readLine.map(_.toInt - 0x30).toArray
	val n = s.size
	val sum = new Array[Int](n + 1)

	for(i <- 1 to n) sum(i) = sum(i-1) + s(i-1)
	
	val cnt = new Array[Long](n * 10)
	for(i <- 0 to n; j <- i+1 to n) {
		val x = sum(j) - sum(i)
		cnt(x) = cnt(x) + 1
	}

	if (a == 0) {
		val ret = cnt(0) * n * (n + 1) - cnt(0) * cnt(0)
		println(ret)
		exit(0)
	}

	val mapAll = HashMap[Int, Long]()
	for(i <- 1 until cnt.size if cnt(i) != 0) mapAll.put(i, cnt(i))

	def mapFunc(kv: (Int, Long)): Long = {
		val key = kv._1
		if (a % key == 0 && mapAll.contains(a/key)) 
			kv._2 * mapAll(a/key)
		else 0
	}
	
	println(mapAll.map(mapFunc).toList.foldLeft(0.toLong)((x:Long, y:Long) => x + y))
}
