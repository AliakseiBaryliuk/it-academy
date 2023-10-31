[Presentation](presentation.pptx)


In Java, exceptions are divided into two main categories: checked exceptions and unchecked exceptions 
(also known as runtime exceptions). Checked exceptions are exceptions that must be explicitly handled in your code, either by using a try-catch block or by declaring them in the method signature using the throws keyword. Here are 15 common checked exceptions in Java:

1) IOException: Thrown when an I/O operation fails, such as reading from or writing to files.
2) FileNotFoundException: Thrown when an attempt to open a file for reading or writing fails because 
   the file does not exist.
3) ParseException: Thrown when there is an error in parsing a string or text, typically used in date and time parsing.
4) SQLException: Thrown when a database-related operation encounters an error.
5) ClassNotFoundException: Thrown when a class is not found by the classloader while using reflection.
6) NoSuchMethodException: Thrown when a requested method does not exist in a class.
7) IllegalAccessException: Thrown when you try to access a field or method in a class,
   but you don't have the necessary permissions.
8) InstantiationException: Thrown when you try to create an instance of an abstract class or an interface using new.
9) NoSuchFieldException: Thrown when you try to access a field that does not exist in a class.
10) CloneNotSupportedException: Thrown when an object cannot be cloned because it does not implement the Cloneable interface.
11) InterruptedException: Thrown when a thread is interrupted using the interrupt() method.
12) InvocationTargetException: Thrown when a method invoked using reflection throws an exception.
13) NoSuchElementException: Thrown by various collection classes (e.g., Iterator) when there are no more elements to retrieve.
14) InvalidClassException: Thrown when trying to deserialize an object and the class of the object has changed incompatibly.
15) EOFException: Thrown when the end of a file is reached unexpectedly while reading data.


These are some examples of checked exceptions in Java. When you encounter these exceptions, 
you are required to handle them by either wrapping the code that might throw the exception 
in a try-catch block or declaring them in the method signature using the throws keyword. 
Failure to do so will result in a compilation error.