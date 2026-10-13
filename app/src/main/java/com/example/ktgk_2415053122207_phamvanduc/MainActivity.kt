package com.example.ktgk_2415053122207_phamvanduc


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var edtTenKhoanChi_207: EditText
    private lateinit var edtSoTien_207: EditText
    private lateinit var edtGhiChu_207: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title =
            "Phạm Văn Đức - 2415053122207 - Quản lý chi tiêu cá nhân"

        // Anh xa cac thanh phan giao dien
        edtTenKhoanChi_207 =
            findViewById(R.id.edtTenKhoanChi_207)

        edtSoTien_207 =
            findViewById(R.id.edtSoTien_207)

        edtGhiChu_207 =
            findViewById(R.id.edtGhiChu_207)

        val btnThemKhoanChi_207 =
            findViewById<Button>(R.id.btnThemKhoanChi_207)

        val btnXemChiTiet_207 =
            findViewById<Button>(R.id.btnXemChiTiet_207)

        // Xu ly nut Them khoan chi
        btnThemKhoanChi_207.setOnClickListener {

            val tenKhoanChi_207 =
                edtTenKhoanChi_207.text.toString().trim()

            val soTien_207 =
                edtSoTien_207.text.toString().toDoubleOrNull() ?: 0.0

            if (tenKhoanChi_207.isEmpty()) {
                edtTenKhoanChi_207.error =
                    "Vui lòng nhập tên khoản chi"
            } else {
                val khoanChi_207 = KhoanChi(
                    maKhoanChi_207 = "KC20701",
                    tenKhoanChi_207 = tenKhoanChi_207,
                    soTien_207 = soTien_207,
                    ghiChu_207 = edtGhiChu_207.text.toString().trim(),
                    daThanhToan_207 = false
                )

                if (khoanChi_207.laSoTienHopLe_207()) {
                    Toast.makeText(
                        this,
                        "Đã thêm: ${khoanChi_207.tenKhoanChi_207}",
                        Toast.LENGTH_SHORT
                    ).show()
                } else {
                    edtSoTien_207.error =
                        "Số tiền phải lớn hơn 0"
                }
            }
        }

        // Xu ly nut Xem chi tiet

        btnXemChiTiet_207.setOnClickListener {

            // Lay du lieu tu giao dien
            val tenKhoanChi_207 =
                edtTenKhoanChi_207.text.toString().trim()

            val soTien_207 =
                edtSoTien_207.text.toString().toDoubleOrNull()

            val ghiChu_207 =
                edtGhiChu_207.text.toString().trim()

            // Tao Intent chuyen sang man hinh chi tiet
            val intent_207 = Intent(
                this,
                ChiTietChiTieuActivity::class.java
            )

            // Truyen du lieu
            intent_207.putExtra("tenKhoanChi_207", tenKhoanChi_207)
            intent_207.putExtra("soTien_207", soTien_207 ?: 0.0)
            intent_207.putExtra("ghiChu_207", ghiChu_207)

            // Mo man hinh chi tiet
            startActivity(intent_207)
        }
    }
}
