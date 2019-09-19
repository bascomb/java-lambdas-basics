# java-lambdas-basics
Demonstrate basics of Java Lambda Expressions

Create an application that demonstrates the basics of Java Lambda Expressions:
What is a Java Lambda Expression?
-The closet you get to a function in Java. It is short way of implementing an 
interface with one method and setting it to variable.

1.) Create a interface with one method that returns a String.
-PowerLevel.java
2.) Create an anonymous class that implements this interface. Execute the method.
-powerLevelAnonClassTest
3.) Create a Java Lambda expression that implements this interface. Execute the method.
-powerLevelLamdaTest
4.) Multiple parameter Interface.
--racquetLamdaTest
5.) No Parameter interface
6.) Single Parameter interface. What can you omit when defining this Lambda.
7.) Can you have interfaces with multiple methods?

mvn archetype:generate -DgroupId=com.mycompany.app -DartifactId=my-app \ 
-DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4