package com.clouddroid.usagesafe.data.model

import io.realm.RealmObject
import io.realm.annotations.Index
import io.realm.annotations.PrimaryKey

open class LogEvent : RealmObject() {

    @PrimaryKey
    @Index
    var timestamp: Long = 0
    var packageName: String = ""
    var className: String? = ""
    var eventType = 0

    override fun toString(): String {
        return "LogEvent (timestamp=$timestamp, packageName='$packageName')"
    }
}