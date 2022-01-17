class Song(val title:String, val artist: String){
    fun Play(){
        println("Playing the song $title by $artist")
    }
    fun Stop(){
        println("Stopped playing $title")
    }
}
fun main(){
    val song1 = Song("Айсберг","Алла Пугачева")
    val song2 = Song("Ромашки","Земфира")
    val song3 = Song("Black and White","Michel Jackson")
    song2.Play()
    song2.Stop()
    song3.Play()
    song1
}