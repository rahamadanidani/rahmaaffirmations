package id.rahma.affirmations.model
// pada perintah import berikut digunakan sebagai referensi android ke berbagai resource yaitu
// drawlabes dan string yang kemudian akan di dilanjutkan dengan integer
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

// menambahkan kata kunci sebelum class affirmation, agar tidak terjadi error maka harus disertai
// dengan propertinya.
// Resource string untuk ditampilkan sebagai afirmasi dalam aplikasi
// Resource image berfungsi untuk menampilkan gambar pada aplikasi.
data class Affirmation(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int)

