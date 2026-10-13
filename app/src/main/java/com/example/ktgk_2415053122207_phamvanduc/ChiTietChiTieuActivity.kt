package com.example.ktgk_2415053122207_phamvanduc


import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ChiTietChiTieuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_chi_tiet_chi_tieu)

        supportActionBar?.title =
            "Phạm Văn Đức - 2415053122207 - Quản lý chi tiêu cá nhân"

        // Anh xa TextView
        val tvTenKhoanChi_207 =
            findViewById<TextView>(R.id.tvTenKhoanChi_207)

        val tvSoTien_207 =
            findViewById<TextView>(R.id.tvSoTien_207)

        val tvGhiChu_207 =
            findViewById<TextView>(R.id.tvGhiChu_207)

        val btnQuayLai_207 =
            findViewById<Button>(R.id.btnQuayLai_207)

        // Nhan du lieu tu Intent
        val tenKhoanChi_207 =
            intent.getStringExtra("tenKhoanChi_207") ?: ""

        val soTien_207 =
            intent.getDoubleExtra("soTien_207", 0.0)

        val ghiChu_207 =
            intent.getStringExtra("ghiChu_207") ?: ""

        // Hien thi du lieu
        tvTenKhoanChi_207.text =
            "Tên khoản chi: $tenKhoanChi_207"

        tvSoTien_207.text =
            "Số tiền: $soTien_207 VNĐ"

        tvGhiChu_207.text =
            "Ghi chú: $ghiChu_207"

        // Quay lai MainActivity
        btnQuayLai_207.setOnClickListener {
            finish()
        }
    }
}
