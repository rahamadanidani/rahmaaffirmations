package id.rahma.affirmations
//perintah dibawah ini merupakan perintah yang berfungsi untuk memanggil atau menghubungkan dengan
// perintah-perintah didalam file yang lainnya.
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import id.rahma.affirmations.adapter.ItemAdapter
import id.rahma.affirmations.data.Datasource


class MainActivity : AppCompatActivity() {

    //Pada perintah metode onCreate() menunjukkan penyiapan dasar untuk aktivitas,dimana
    //file tata letak XML ditentukan dengan mengirimkan ID resource file
    // R.layout.main_activity ke setContentView().
    // method ini menerima parameter savedInstanceState, yang merupakan objek Bundle yang
    // berisi status aktivitas yang sebelumnya disimpan.
    override fun onCreate(savedInstanceState: Bundle?) {
        //perintah berikut berfungsi untuk memanggil kelas super onCreate
        // untuk menyelesaikan pembuatan aktivitas seperti hierarki tampilan
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // perintah berikut digunakan untuk inisialisasi data.
        val myDataset =Datasource().loadAffirmations()

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        // Perintah ini berfungsi sebagai pengaturan untuk meningkatkan kinerja atau kreativitas
        //kita jika kita tahu itu berubah namun tidak mengubah ukuran tata letak RecyclerView pada
        //tampilannya.
        recyclerView.setHasFixedSize(true)
    }
}

