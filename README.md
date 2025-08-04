
# 📟 Java Console Calculator

A simple Java-based console calculator that supports basic arithmetic operations and allows chaining operations using the previous result.

---

## ✅ Features

- Supports `+`, `-`, `*`, `/` operations
- Allows reuse of previous result (e.g., `*2` after `5+3` gives `16`)
- Handles invalid inputs gracefully
- Prevents division by zero with a user-friendly error message

---

## 🛠️ Technologies Used

- Java (JDK 8+)
- Scanner for user input
- Simple static parser for expression evaluation

---

## 📁 Project Structure

```
.
├── Main.java         # Main class with input loop
├── Helper.java       # Expression evaluator
└── README.md         # Project documentation
```

> Note: In the actual code provided, both classes (`Main` and `Helper`) are in the same `.java` file.

---

## 🚀 How to Run

1. Make sure Java is installed on your system.
2. Save the code in a file named `Main.java`.
3. Compile the program:

```bash
javac Main.java
```

4. Run the program:

```bash
java Main
```

---

## 💡 Sample Usage

```text
Enter expression (or 'q' to exit): 5+3
Result: 8.0

Enter expression (or 'q' to exit): *2
Result: 16.0

Enter expression (or 'q' to exit): -4
Result: 12.0

Enter expression (or 'q' to exit): 5/0
Error: Division by zero is undefined.

Enter expression (or 'q' to exit): q
You have exited the calculator.
Bye.
```

---

## ⚠️ Limitations

- Only supports expressions with **two operands** (e.g., `4+5`, not `4+5*2`)
- No support for parentheses or full infix expressions
- Input like `5+` will throw an error

---

## 📌 Future Improvements

- Full expression parsing with operator precedence
- GUI using JavaFX or Swing
- Memory/history functions
- Support for negative numbers and decimal inputs

---

## 👨‍💻 Author

**SUKUMAR K**  
Project developed as part of a learning module on Java and console-based applications.
