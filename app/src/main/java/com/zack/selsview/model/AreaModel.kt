package com.zack.selsview.model

import com.zack.selsview.itf.ISelect

class AreaModel : ISelect {
    var areaName = ""
    var models: ArrayList<AreaModel>? = null
    override fun getName(): String {
        return areaName
    }
}