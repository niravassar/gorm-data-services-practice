package demo

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Person {

    String name
    Integer age
    List<Address> addresses

    static hasMany = [addresses: Address]

    static constraints = {
        age nullable: true
    }
}

