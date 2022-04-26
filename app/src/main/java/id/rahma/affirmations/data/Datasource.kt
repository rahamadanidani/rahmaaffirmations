package id.rahma.affirmations.data
// Perintah berikut berfungsi untuk menghubungkan dengan file yang lainnya.
import id.rahma.affirmations.R
import id.rahma.affirmations.model.Affirmation

class Datasource {

    // Perintah berikut berfungsi untuk menampilkan daftar Affirmations,dan
    // untuk melakukannya, kita membuat daftar dan mengisinya dengan instance Affirmation untuk setiap
    // string resource.
    //Dimana disertai dengan adanya jenis list,sehingga pada tampilan aplikasi nanti semua gambar
    // yang sudah diinputkan ditampilkan berurutan dan tidak berdenpetan.
    //Dengan menambahkan afirmasi objek kedaftar semua afirmasi yang hanya dipisahkan dengan koma
    // dan untuk menginputan nama gambarnya juga harus disesuaikan dengan nama gambar yang ada pada
    //drawlable yang mana kita sudah menginputkan nama sebelumnya.
    fun loadAffirmations(): List<Affirmation> {
        return listOf<Affirmation>(
            Affirmation(R.string.affirmation1, R.drawable.image1),
            Affirmation(R.string.affirmation2, R.drawable.image2),
            Affirmation(R.string.affirmation3, R.drawable.image3),
            Affirmation(R.string.affirmation4, R.drawable.image4),
            Affirmation(R.string.affirmation5, R.drawable.image5),
            Affirmation(R.string.affirmation6, R.drawable.image6),
            Affirmation(R.string.affirmation7, R.drawable.image7),
            Affirmation(R.string.affirmation8, R.drawable.image8),
            Affirmation(R.string.affirmation9, R.drawable.image9),
            Affirmation(R.string.affirmation10, R.drawable.image10)
        )
    }
}
