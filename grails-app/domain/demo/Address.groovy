package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Address {
    String streetName
    String city
    String state

    static constraints = {
        streetName nullable: true
        city nullable: true
        state nullable: true
    }
}
