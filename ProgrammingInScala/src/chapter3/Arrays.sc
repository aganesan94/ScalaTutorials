package chapter3

// Declaration of array
// the "[" is replaced with "("
// for loop has different syntax
object ArrayDemo {

  //the below line can also be written
  // as follows: val cars:Array[String] = new Array[String](3)
  // when an object is defined as val, it cannot be reassigned but the
  // reference it points to can be changed.
  val cars = new Array[String](3);                //> cars  : Array[String] = Array(null, null, null)
  cars(0) = "Honda";
  cars(1) = "Toyota";
  cars(2) = "BMW";
	println(cars.length);                     //> 3
  for(i <- 0 to cars.length-1){
 		println(cars(i))                  //> Honda
                                                  //| Toyota
                                                  //| BMW
  }
}