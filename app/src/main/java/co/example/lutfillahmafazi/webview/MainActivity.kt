package co.example.lutfillahmafazi.webview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import co.example.lutfillahmafazi.webview.R.id.layoutWebView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // TODO menyetting agar javaCkrip dapat berjalan
        layoutWebView.settings.javaScriptEnabled
        // TODO untuk menampilkan url websitenya
        layoutWebView.loadUrl("https://idn.sch.id/")
    }

    // TODO Menampilkan toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        // TODO mengubah layout menjadi object java
        menuInflater.inflate(R.menu.menu,menu)
        // TODO mengembalikan nilai true kalo function nya di panggil
        return true
    }

    // TODO method untuk memilih item yang sudah kita buat
    override fun onOptionsItemSelected(item: MenuItem?): Boolean = when(item?.itemId){

        R.id.webProfil -> {
            layoutWebView.loadUrl("https://idn.sch.id/profil/")
            true
        }

        R.id.webDaftar -> {
            layoutWebView.loadUrl("https://idn.sch.id/daftar/")
            true
        }

        R.id.webTarget -> {
            layoutWebView.loadUrl("https://idn.sch.id/target/")
            true
        }
        else -> {
            super.onOptionsItemSelected(item)
        }


    }
}
