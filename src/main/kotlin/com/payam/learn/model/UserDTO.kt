package com.payam.learn.model

import com.payam.learn.entity.Address
import com.payam.learn.enum.AddressType

class UserDTO() {
    var totalCount: Int? = 0
    var currentPage: Int? = 0
    var pageSize: Int? = 0
    var pageItems: List<Detail>? = null
    class Detail {
        var name: String? = null
        var family: String? = null
        var addresses: Set<Address>? = null
    }

}