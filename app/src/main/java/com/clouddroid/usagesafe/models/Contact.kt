package com.clouddroid.usagesafe.models

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey

open class Contact : RealmObject() {

    @PrimaryKey
    var email: String = ""
    var name: String = ""
    var emailsSent: Int = 0

}