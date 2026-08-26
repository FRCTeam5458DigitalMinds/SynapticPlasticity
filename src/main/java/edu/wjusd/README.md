## Java Lessons

The lessons are designed to be worked on with a mentor present to answer questions and give hints. 

- [Lesson 1 - Syntax and Strings](./Lesson01.java)
- [Lesson 2 - Ints](./Lesson02.java)
- [Lesson 3 - Doubles](./Lesson03.java)
- [Lesson 4 - Booleans](./Lesson04.java)
- [Lesson 5 - Conditional Statements](./Lesson05.java)

## Java Resources

### Arithmetic Operators:

| Operator | Function |
|:--------|:-----------|
| `+` | Addition  |
| `-`   | Subtraction |
| `*` | Multiplication |
| `/` | Division |
| `%` | Modulus  |
| `++` | Increment |
| `--` | Decrement |

### Comparison Operators:

| Operator | Task |
|:--------|:-----------|
| `==` | Equal to  |
| `!=`   | Not equal |
| `>` | Greater than |
| `<` | Less than |
| `>=` | Greater than or equal to  |
| `<=` | Less than or equal to |

### Logical Operators:

| Operator | Task |
|:--------|:-----------|
| `&&` | Logical and  |
| `\|\|`   | Logical or |
| `!` | Logical not |

### Order of Operations:

- `()` - Parentheses
- `*`, `/`, `%` - Multiplication, Division, Modulus
- `+`, `-` - Addition, Subtraction
- `>`, `<`, `>=`, `<=` - Comparison
- `==`, `!=` - Equality
- `&&` - Logical 
- `||` - Logical OR
- `=` - Assignment

### Standard Data Types:

| Data Type | Description |
|:--------|:-----------|
| `int` | Whole numbers from -2,147,483,648 to 2,147,483,647 |
| `long`| Whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 | 
| `float` | Fractional numbers. Sufficient for storing 6 to 7 decimal digits |
| `double` | Fractional numbers. Sufficient for storing 15 to 16 decimal digits | 
| `boolean` | True or False values |
| `String` | Collection of characters | 

### Conditional Statements Examples
```java
//If Statement
if(conditionIsTrue)
{
    System.out.println("It was true");
}
else if(thisConditionWasTrue)
{
    System.out.println("So, this was true");
}
else
{
    System.out.println("Neither above was true, so we are doing this");
}

//Switch Statement Check
//Mixing Cases Just for Demo. In real code keep them same data type
switch(conditionToCheck)
{
    case 1:
        System.out.println("It was 1");
        break;

    case 2:
        System.out.println("It was 2");
        break;

    case "Tuesday":
        System.out.println("Tuesday it is");
        break;

    case "Friday":
        System.out.println("You wish it was Friday");
        break;

    default:
        System.out.println("What we do if case not found");
}
```