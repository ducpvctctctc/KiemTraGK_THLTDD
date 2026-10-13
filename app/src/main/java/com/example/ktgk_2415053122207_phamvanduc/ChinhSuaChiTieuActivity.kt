package com.example.ktgk_2415053122207_phamvanduc


import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ChinhSuaChiTieuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chinh_sua_chi_tieu)

        supportActionBar?.title =
            "Phạm Văn Đức - 2415053122207 - Quản lý chi tiêu cá nhân"

        val edtSuaTen_207 =
            findViewById<EditText>(R.id.edtSuaTen_207)

        val edtSuaTien_207 =
            findViewById<EditText>(R.id.edtSuaTien_207)

        val edtSuaGhiChu_207 =
            findViewById<EditText>(R.id.edtSuaGhiChu_207)

        val btnHuy_207 =
            findViewById<Button>(R.id.btnHuy_207)

        val tenKhoanChi_207 =
            intent.getStringExtra("tenKhoanChi_207") ?: ""

        val soTien_207 =
            intent.getDoubleExtra("soTien_207", 0.0)

        val ghiChu_207 =
            intent.getStringExtra("ghiChu_207") ?: ""

        edtSuaTen_207.setText(tenKhoanChi_207)
        edtSuaTien_207.setText(soTien_207.toString())
        edtSuaGhiChu_207.setText(ghiChu_207)

        btnHuy_207.setOnClickListener {
            finish()
        }
    }
}
