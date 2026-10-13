package com.example.ktgk_2415053122207_phamvanduc
import android.app.Activity
import android.content.Intent
import android.widget.Toast
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

        val btnLuu_207 =
            findViewById<Button>(R.id.btnLuu_207)

        btnLuu_207.setOnClickListener {
            val tenMoi_207 =
                edtSuaTen_207.text.toString().trim()

            val tienMoi_207 =
                edtSuaTien_207.text.toString().toDoubleOrNull()

            val ghiChuMoi_207 =
                edtSuaGhiChu_207.text.toString()

            if (tenMoi_207.isBlank()) {
                edtSuaTen_207.error = "Tên không được để trống"
                return@setOnClickListener
            }

            if (tienMoi_207 == null ||
                !tienMoi_207.isFinite() || tienMoi_207 <= 0) {
                edtSuaTien_207.error = "Số tiền không hợp lệ"
                return@setOnClickListener
            }

            val ketQua_207 = Intent().apply {
                putExtra("tenKhoanChi_207", tenMoi_207)
                putExtra("soTien_207", tienMoi_207)
                putExtra("ghiChu_207", ghiChuMoi_207)
            }

            setResult(Activity.RESULT_OK, ketQua_207)
            finish()
        }

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
