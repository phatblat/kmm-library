package at.phatbl.kmmlib

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}