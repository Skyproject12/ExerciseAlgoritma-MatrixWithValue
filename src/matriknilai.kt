import java.util.*

fun main (args : Array<String>){
    var a=100
    var b=100
        hitungBaris(a,b)
}
fun hitungBaris (a : Int , b : Int ) {
    var scan = Scanner(System.`in`)
    println("masukkan baris")
    var baris = scan.nextInt()
    println("masukkan kolom")
    var kolom = scan.nextInt()
    var perulanganBaris = Array(a) {
        IntArray(b)
    }
    for(b in 1..baris){
        for(t in 1..kolom){
            var h=0
            h=h+t
            println("matriks[$b , $t] = "+h)
        }
    }
}