import java.util.Scanner

object Soroban extends App {
	val scan = new Scanner(System.in)
	var n = scan.nextInt
	
	do {
		val k = n % 10
		println(output(k))
		n = n / 10
	} while (n != 0)
	
	def output(number: Int): String = {
		number match {
			case 0 => "O-|-OOOO"
			case 1 => "O-|O-OOO"
			case 2 => "O-|OO-OO"
			case 3 => "O-|OOO-O"
			case 4 => "O-|OOOO-"
			case 5 => "-O|-OOOO"
			case 6 => "-O|O-OOO"
			case 7 => "-O|OO-OO"
			case 8 => "-O|OOO-O"
			case 9 => "-O|OOOO-"
		}
	}
}
