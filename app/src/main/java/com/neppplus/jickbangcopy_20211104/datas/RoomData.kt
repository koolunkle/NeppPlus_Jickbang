package com.neppplus.jickbangcopy_20211104.datas

import android.icu.text.NumberFormat
import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*

class RoomData(
    val price: Int,
    val address: String,
    val floor: Int,
    val description: String) {

    //    가격에 따라 다른 형태로 가공해서 가격을 알려주는 함수

    @RequiresApi(Build.VERSION_CODES.N)
    fun getFormattedPrice() : String {

        if (this.price < 10000) {

            val priceStr = NumberFormat.getNumberInstance(Locale.KOREA).format(this.price)
            return priceStr

        }
        else {

            val uk = this.price / 10000
            val rest = this.price % 10000
            val restCommaStr = NumberFormat.getNumberInstance(Locale.KOREA).format(rest)

            val priceStr = "${uk}억 ${restCommaStr}"

            return priceStr
        }

    }

}