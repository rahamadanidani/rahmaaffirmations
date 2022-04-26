package id.rahma.affirmations.adapter
// perintah dibawah ini merupakan perintah yang berfungsi untuk memanggil atau menghubungkan dengan
// perintah-perintah didalam file yang lainnya.
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import id.rahma.affirmations.R
import id.rahma.affirmations.model.Affirmation

/**
 * Adapter for the [RecyclerView] in [MainActivity]. Displays [Affirmation] data object.
 */
class ItemAdapter(
    private val context: Context,
    private val dataset: List<Affirmation>
) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    // kita akan memberikan referensi ke tampilan untuk setiap item data
    // Item data kompleks mungkin memerlukan lebih dari satu tampilan per item, dan
    // kita juga memberikan akses ke semua tampilan untuk item data dalam penampung tampilan.
    // Setiap item data hanyalah objek dari Afirmasi.
    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView = view.findViewById(R.id.item_title)
        val imageView: ImageView = view.findViewById(R.id.item_image)
    }

    /**
     * Create new views (invoked by the layout manager)
     */
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // Membuat tampilan baru dimana Layout inflanter sendiri berfungsi untuk berfungsi
        // untuk membuat tampilan baru di atas tampilan layout utama.
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item, parent, false)

        return ItemViewHolder(adapterLayout)
    }

    /**
     * Replace the contents of a view (invoked by the layout manager)
     */
    //onBindViewHolder berfungsi untuk RecyclerView memanggil metode ini untuk mengatribusikan ViewHolder
    // dengan data. Metode ini mengambil data yang sesuai dan menggunakan data tersebut
    // untuk mengisi tata letak pemegang tampilan.
    // Parameters ViewHolder yang harus diperbarui untuk mewakili
    // konten item pada posisi tertentu dalam kumpulan data.
    // Parameter Posisi(position) item dalam kumpulan data adaptor.
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)
        holder.imageView.setImageResource(item.imageResourceId)
    }

    /**
     * Return the size of your dataset (invoked by the layout manager)
     */
    // getItemCount berfungsi untuk memanggil metode ini untuk mendapatkan ukuran set data.
    override fun getItemCount() = dataset.size
}