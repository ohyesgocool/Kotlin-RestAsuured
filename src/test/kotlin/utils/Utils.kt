package utils

import java.io.FileInputStream
import java.util.*

class Utils {
    companion object {

        fun getGlobalValue(key: String): String {
            var prop = Properties()
            var fileInputStream = FileInputStream(System.getProperty("user.dir") + "/global.properties")
            prop.load(fileInputStream)
            return prop.getProperty(key)
        }
    }
}