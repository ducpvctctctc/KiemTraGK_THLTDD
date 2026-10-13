package com.example.ktgk_2415053122207_phamvanduc

data class KhoanChi(
    var maKhoanChi_207: String,
    var tenKhoanChi_207: String,
    var soTien_207: Double,
    var ghiChu_207: String,
    var daThanhToan_207: Boolean
) {

    // Kiem tra so tien hop le
    fun laSoTienHopLe_207(): Boolean {
        return soTien_207.isFinite() && soTien_207 > 0
    }

    // Lay thong tin khoan chi
    fun layThongTin_207(): String {
        val trangThai_207 =
            if (daThanhToan_207) "Đã thanh toán"
            else "Chưa thanh toán"

        return """
            Mã khoản chi: $maKhoanChi_207
            Tên khoản chi: $tenKhoanChi_207
            Số tiền: $soTien_207 VNĐ
            Ghi chú: $ghiChu_207
            Trạng thái: $trangThai_207
        """.trimIndent()
    }
}
