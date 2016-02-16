package chapter3

// Declaration of array
// the "[" is replaced with "("
// for loop has different syntax
object ArrayDemo {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(263); 

  //the below line can also be written
  // as follows: val cars:Array[String] = new Array[String](3)
  val cars = new Array[String](3);System.out.println("""cars  : Array[String] = """ + $show(cars ));$skip(21); ;
  cars(0) = "Honda";$skip(22); ;
  cars(1) = "Toyota";$skip(19); ;
  cars(2) = "BMW";$skip(23); ;
	println(cars.length);$skip(52); ;
  for(i <- 0 to cars.length-1){
 		println(cars(i))}
  }
}
