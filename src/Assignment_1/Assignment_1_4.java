/**
 * 
 */
package Assignment_1;

/** Write a program in java to implement type casting between different variables.
 *  Take six variables as one of each byte, short, Int, long, float and double. Initialize only byte and short asking the value from the user.
 *  Take byte & short variables and store their sum in the integer variable and print the sum 
 *  All the comments in the program will be placed on the Right-Hand-Side.
 *  @author Sahil Khurana <sahilkhurana369@gmail.com>
 */
import java.util.*;
import java.util.InputMismatchException ;

public class Assignment_1_4 {																		// Main methods Starts.
	public static void main(String[] args) {				  										// Declaration 6 Variables
byte myByteValue;																						 							
short myShortValue;																							 
int myIntValue;																								 
long myLongValue;																							
float myfloatValue;																							
double MydoubleValue;                                                                                     
try {																									// try and catch Start as code that may throw exception 
Scanner sc1 = new Scanner(System.in);                                                                  // Initialize the scanner to get input from User
System.out.print("Enter the Byte number in the Range -128 to 127 : ");                                 // This will print out the argument and ends the line
myByteValue = sc1.nextByte();                                                                          // Read input of a as Byte from the User
if (myByteValue > -128 || myByteValue < 127);														   // if and else loop ..to check input myByteValue range from -128 to 127.
else {System.exit(0);}																					// if not ... then System.exit(0) will terminate the JVM and so your program.

Scanner sc2 = new Scanner(System.in);                                                                  // Initialize the scanner to get input from User
System.out.print("Enter the Short number in the Range -32768 to 32767 : ");                            // This will print out the argument and ends the line
myShortValue = sc2.nextShort();                                                                        // Read input of a as Short from the User
if (myShortValue > -32768 || myShortValue < 32767);														//if and else loop ..to check input myShortValue range from -32,768 to 32,767.
else { System.exit(0);}                                                                                // if not ... then System.exit(0) will terminate the JVM and so your program.

Byte byteObj = new Byte(myByteValue);																	// Object Declaration
short myByteValueConvertToshort = byteObj.shortValue();													// Conversion of Byte to short
short addMyByteValueConvertToShortAndMyShortValue = (short) (myByteValueConvertToshort+myShortValue);	// Addition of two short values
myIntValue = addMyByteValueConvertToShortAndMyShortValue;												// After the Addition operation value stored in int myIntValue variable
System.out.println("Sum of Byte and Short Numbers :"+myIntValue);										// Print the argument at the end of the line
System.out.println("Integer Number : "+myIntValue);														// Print the argument at the end of the line

int covertMyShortValueTOInt = myShortValue;																// Conversion of short to int
int Add_covertMyShortValueTOInt_byteShortTOInt = (int) (covertMyShortValueTOInt+myIntValue);			// After the Addition operation on two integer variables
System.out.println("Sum of Short and Integer : "+Add_covertMyShortValueTOInt_byteShortTOInt);			// Print the argument at the end of the line
Integer intObj = new Integer(Add_covertMyShortValueTOInt_byteShortTOInt);								// Object Declaration
myLongValue = intObj.longValue();																		// Addition operation on two integer variables stored in myLongValue
System.out.println("Long Number : "+myLongValue);														// Print the argument at the end of the line

float ConvertmyLongValueTofloat = (float)myLongValue;
// Casting Conversion of long to float
Integer byteShortTOInt_float = new Integer(myIntValue);													// Conversion of int to float by Object Declaration
myfloatValue = byteShortTOInt_float.floatValue();														
float Add_byteShortTOInt_float = (float) (byteShortTOInt_float+ConvertmyLongValueTofloat);					// Addition operation on two float variables stored in myLongValue
System.out.println("Sum of Integer and Long : "+Add_byteShortTOInt_float);								// Print the argument at the end of the line
System.out.println("Float Number : "+Add_byteShortTOInt_float);											// Print the argument at the end of the line

// long + float –> double
MydoubleValue = (double)Add_byteShortTOInt_float;														// Casting Conversion of float to double
Float myLongValue_long = new Float(myLongValue);														// Conversion of long to float by Object Declaration
Double Con_l_To_D = new Double(myLongValue_long.toString());											
double Add_Con_l_To_D_And_MydoubleValue = (double) (Con_l_To_D+MydoubleValue);							// Addition operation on two double variables
System.out.println("Sum of Long and Float : "+Add_Con_l_To_D_And_MydoubleValue);						// Print the argument at the end of the line
System.out.println("Double Number : "+Add_Con_l_To_D_And_MydoubleValue);								// Print the argument at the end of the line
} 																											// try block closed
catch (InputMismatchException e) {                                                                          // if Input from user in byte and short then catch the Exception
System.out.println("Invalid number - Try again");														// Print the argument at the end of the line
}																											// catch block closed
}																												// Main methods closed.
}																													// //Class Assignment1_4 closed										

