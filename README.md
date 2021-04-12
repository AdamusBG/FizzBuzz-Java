# FizzBuzz Java

Fizzbuzz is a game whereby a group of people will take it in turns to say a number aloud, going up from 1.  

However, it is not as simple as just saying incrementally increasing numbers!  

The numbers are to be substituted for words following these rules:  
- If 3 is a factor of the number say "Fizz"
- If 5 is a factor of the number say "Buzz"
- If both 3 and 5 are factors of the number say "FizzBuzz"
- Only say the number if no other rules apply

The complexity can also be increased by changing the factor numbers for "Fizz" or "Buzz" or by adding in new substitutions altogether.  

This program reflects the simplest version of the rules (above), but is designed with extensibility and modifiability in mind.

## Using the program

To clone this repo to your computer, please navigate to your desired directory from a terminal window and enter: `git clone https://github.com/AdamusBG/FizzBuzz-Java.git`. Then enter `cd FizzBuzz-Java` to open it.

Now follow enter the following commands into your terminal, note you will need Maven installed.

```
$ mvn compile
$ mvn exec:java -Dexec.mainClass=Main
```

This will cause the program to run and the numbers 1 to 100 will be printed in your terminal, with the appropriate substitutions.  

### Tests

Entering `mvn test` into your terminal when inside the directory will run the 16 tests covering all four default conditions.  

### Further information

In the Fizzify class, the numbers 3 & 5 are set to be substituted by constants defined in the constructor. These can be simply swapped for other numbers to change the program 
behaviour.

If additional substitution rules are to be added (e.g. if the number is divisible by 7, substitute with "Zap"), then a new constant must be declared and initialized and the private method #setUpConversionMap must be updated.  

Note that if the factor required for substitution is lower it will appear earlier in the converted word, i.e. for an input of 15 the output is "FizzBuzz" and not "BuzzFizz", with because 3 being substituted with "Fizz" comes first.  