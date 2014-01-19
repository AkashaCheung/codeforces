
object FixingTypos extends App {
	val s = readLine
	
	def fix(str: String): String = {
		var ss: StringBuffer = new StringBuffer("")
		var now = 2
		for(i <- 0 until str.size if i==0 || str(i) != str(i-1)) {
			if(now == 2) ss.append(str(i))
			ss.append(str(i))
			now = 3 - now
		}
		ss.toString
	}

	var ret: StringBuffer = new StringBuffer("")
	var begin = 0
	for(i <- 0 until s.size) {
		var bb = false
		var ee = false
		if(i==0 || s(i) != s(i-1)) bb = true
		if(i== s.size - 1 || s(i) != s(i + 1)) ee = true
		if(ee && bb) {
			ret.append(fix(s.substring(begin, i)))
			ret.append(s(i))
			begin = i + 1
		} else if(i == s.size - 1) ret.append(fix(s.substring(begin, s.size)))
	}
	println(ret)
}
