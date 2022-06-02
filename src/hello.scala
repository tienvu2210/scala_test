object hello {
    abstract class Foo[A] (name: String, val run: A => List[A], val run_implicit: A => Int => List[A]) {
        def doSomething(item: A): List[A] = {
            run_implicit(item)(5)
        }
    }

    val add = (x: Int, y: Int) => {
      x + y
    }

    class TienObject extends Foo[Int]("mr brown", item => {
        List[Int]()
    }, item => implicit some_implicit_number => {
        var new_elements: List[Int] = List[Int]()

        for (n <- 1 to some_implicit_number) {
            new_elements = item :: new_elements
        }

        println("one plus two is", add(1, 2))

        new_elements
    })

    def main(args: Array[String]) = {
        var thing = new TienObject()
        thing.doSomething(10)
        println("Hello, world")
    }
}
