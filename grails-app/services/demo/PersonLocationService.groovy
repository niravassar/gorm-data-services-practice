package demo

import grails.gorm.services.Query
import grails.gorm.services.Service

@Service(Person)
abstract class PersonLocationService {
    @Query("""
    select distinct ${person}
    from ${Person person} join ${person.addresses} a
    where a.state = $state
    """)
    protected abstract List<Person> searchByState(String state)

    BigDecimal getAverageAgeOfPersonsInState(String state) {
        List<Person> persons = searchByState("TX")
        List<Integer> ages = persons.collect { it.age }
        ages.sum() / ages.size()
    }
}
