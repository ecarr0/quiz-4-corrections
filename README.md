# quiz-4-corrections

## Question 4:
When writing a method, you must always include a(n) [access modifier] , a(n)  [return type] , and the method name (in that order). Together, this is known as the method's [Select].

Answer:
The last [Select] should be a method signature. My previous answer of method identifier was incorrect as a method identifier is simply the name used to call a method. For instance, if you created a method called findAverage() with the parameters of int a and int b, the identifier would be "findAverage". Similarly, method name is a colloquial term used to refer to the name used to call a method. On the other hand, method signatures consist of the method declaration where one identifies a method identifier, an access modifier, a return type, and parameters if needed. For instance, a method signature would look like the following:

public int findAverage(int a, int b){
    //code
 }
 
## Question 5:
Consider the following method definition.

  public int add(int x, int y) {
    return x + y;
  }
  
Assuming I've created an object of the class in which this method is defined called test, how can I use this method to compute and store the sum of two integers?

Answer:
The answer to this question should be the following option:
  int sum = test.add(123, 456);
This is because when calling a method from another class, you must call the name of the class and then the method name with the specified parameters. Since we can assume that add() is not a method within the class that we are trying to store the sum of two integers in, we must call the add() method from another class, and thus, call it using the "prefix" of the class name, test. 
My previous answer was incorrect because I neglected the fact that the add() method was being called from another class and simply set sum equal to add(123, 456), which would result in errors.
