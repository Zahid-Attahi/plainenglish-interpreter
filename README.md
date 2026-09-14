# PlainEnglish Interpreter

A tree-walking interpreter for a custom English-like programming language, built in Java.

PlainEnglish is a small interpreted programming language designed to make programming syntax more readable while still supporting core programming concepts such as variables, expressions, conditionals, loops, methods, objects, and recursion.

## How It Works

The interpreter follows a traditional language-processing pipeline:

```text
PlainEnglish Source Code
          │
          ▼
        Lexer
          │
          ▼
        Tokens
          │
          ▼
        Parser
          │
          ▼
         AST
          │
          ▼
     Interpreter
          │
          ▼
        Output
```

### Main Components

* **Lexer** — Converts PlainEnglish source code into tokens while tracking indentation, lines, and positions.
* **Parser** — Uses recursive-descent parsing to convert tokens into an Abstract Syntax Tree (AST).
* **AST** — Represents the structure of the PlainEnglish program.
* **Interpreter** — Walks the AST and executes the program at runtime.

## Features

PlainEnglish supports:

* Variables
* Numbers, strings, characters, and booleans
* Arithmetic operations

  * Addition
  * Subtraction
  * Multiplication
  * Division
  * Modulo
  * Exponentiation
* Boolean operations

  * `and`
  * `or`
  * `not`
* Comparison operations

  * `==`
  * `!=`
  * `<`
  * `>`
  * `<=`
  * `>=`
* Conditional statements

  * `if`
  * `else`
* Loops
* Methods with parameters
* Function calls
* Variable references
* Custom types and objects
* Object fields
* Built-in `Print`
* Recursion
* Runtime error handling

## Example

A simple PlainEnglish program:

```text
Make number as 10

If number is greater than 5:
    Print "Number is greater than 5"
```

The interpreter reads the source code, tokenizes it, parses it into an AST, and then executes the resulting tree.

## Project Structure

```text
plainEnglish 2/
│
├── AST/
│   ├── AST node classes
│   └── expression/operator classes
│
├── Lexer.java
├── PlainEnglishParser.java
├── Interpreter.java
│
├── ProgramNode.java
├── StatementNode.java
├── ExpressionNode.java
├── IfNode.java
├── LoopNode.java
├── MethodNode.java
├── FunctionCallNode.java
├── MakeNode.java
├── SetNode.java
├── VariableReferenceNode.java
├── TypeDefNode.java
├── FieldNode.java
└── other supporting classes
│
├── Lexer2Tests.java
├── Parser1Tests.java
├── Parser2Tests.java
├── Parser3Tests.java
├── Parser4Tests.java
│
├── InterpreterTest_If.eng
├── InterpreterTest_Loop.eng
├── InterpreterTest_Recursion.eng
│
├── ExpectedInterpreterOutputs/
└── README.md
```

## Running the Interpreter

### Requirements

* Java
* JUnit Platform Console Standalone 1.8.2 for the included test suites

The project expects the JUnit JAR to be located one directory above the project folder.

For example:

```text
ICSI 311/
├── junit-platform-console-standalone-1.8.2.jar
└── plainEnglish 2/
```

### Compile

From the project directory:

```bash
javac -cp ../junit-platform-console-standalone-1.8.2.jar -d . *.java AST/*.java
```

### Run a PlainEnglish Program

After compiling:

```bash
java PlainEnglish.Interpreter InterpreterTest_If.eng
```

Other included programs:

```bash
java PlainEnglish.Interpreter InterpreterTest_Loop.eng
```

```bash
java PlainEnglish.Interpreter InterpreterTest_Recursion.eng
```

## Testing

The project includes JUnit tests covering lexer and parser functionality.

### Parser 1

```bash
java -jar ../junit-platform-console-standalone-1.8.2.jar -cp . --select-class PlainEnglish.Parser1Tests
```

**Result:** 4/4 tests passing.

### Parser 2

```bash
java -jar ../junit-platform-console-standalone-1.8.2.jar -cp . --select-class PlainEnglish.Parser2Tests
```

**Result:** 4/4 tests passing.

### Lexer 2

```bash
java -jar ../junit-platform-console-standalone-1.8.2.jar -cp . --select-class PlainEnglish.Lexer2Tests
```

**Result:** 4/4 tests passing.

### Parser 3

```bash
java -jar ../junit-platform-console-standalone-1.8.2.jar -cp . --select-class PlainEnglish.Parser3Tests
```

**Result:** 3/3 tests passing.

### Parser 4

```bash
java -jar ../junit-platform-console-standalone-1.8.2.jar -cp . --select-class PlainEnglish.Parser4Tests
```

**Result:** 4/4 tests passing.

### Test Summary

```text
Parser1Tests   4/4
Parser2Tests   4/4
Lexer2Tests    4/4
Parser3Tests   3/3
Parser4Tests   4/4
--------------------
Total         19/19
```

## Interpreter Examples

The repository includes example PlainEnglish programs demonstrating interpreter execution.

### Conditional and Runtime Errors

`InterpreterTest_If.eng` demonstrates arithmetic evaluation and runtime error handling.

Example output includes:

```text
9 * 3:

27.0

----------

21 - 5:

16.0

----------

12 / 0

Cannot do division by 0
```

The interpreter also reports invalid operations such as unsupported exponent operations in that test program.

### Loops and Expressions

`InterpreterTest_Loop.eng` demonstrates expression evaluation including exponentiation.

Example results include:

```text
2 ^ 10:
1024.0

125 ^ 1:
125.0

987 ^ 0:
1.0
```

### Recursion

`InterpreterTest_Recursion.eng` demonstrates recursive execution.

Example output:

```text
Looking for 10 between 0-25

Number of recursive calls:

19.0
```

## Error Handling

The interpreter includes runtime error handling for invalid operations.

For example, attempting to divide by zero produces:

```text
Cannot do division by 0
```

rather than allowing the operation to execute normally.

## Technologies

* **Java**
* **JUnit 5**
* Custom lexer
* Recursive-descent parser
* Abstract Syntax Tree (AST)
* Tree-walking interpreter

## Key Concepts Demonstrated

This project demonstrates practical experience with:

* Lexical analysis
* Tokenization
* Recursive-descent parsing
* Abstract Syntax Trees
* Tree-walking interpretation
* Expression evaluation
* Runtime execution
* Variable scoping
* Methods and function calls
* Recursion
* Object/type representation
* Runtime error handling
* Automated testing

## Author

**Zahidullah Attahi**

Computer Science student at the University at Albany.
