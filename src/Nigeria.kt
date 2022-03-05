
class Nigeria( var state: Int, val population: Int, val allocation: Int): Country{

    override fun numberOfState(test: Int?) {
        if (test == null) {
            println("Nigeria has no state")
        }else {
            println("Nigeria has $test state")
        }
    }

    override fun populationOfCountry() {
        println("Nigeria has  population of $population people")
    }

    override fun allocationOfState() {
        println("Nigeria has $allocation per capital")
    }
}

