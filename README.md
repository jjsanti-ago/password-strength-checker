# Password Strength Checker 🔐

A simple Java-based password strength checker that evaluates a password using five basic security criteria and assigns a strength level based on the total score.

## 📌 Overview

This project was created as a beginner cybersecurity and Java programming project to practice:

* Java programming fundamentals
* Conditional statements
* String handling
* Regular expressions
* User input using `Scanner`
* Basic password security concepts

## ⚙️ How It Works

The program evaluates the password based on five criteria:

| Criteria          | Description                                      |
| ----------------- | ------------------------------------------------ |
| Length            | At least 8 characters                            |
| Uppercase         | Contains at least one uppercase letter (`A-Z`)   |
| Lowercase         | Contains at least one lowercase letter (`a-z`)   |
| Number            | Contains at least one number (`0-9`)             |
| Special Character | Contains at least one non-alphanumeric character |

Each satisfied criterion adds **1 point** to the password score.

### Strength Classification

| Score | Strength |
| ----: | -------- |
|   0–2 | WEAK     |
|   3–4 | MODERATE |
|     5 | STRONG   |

## 🛠️ Technologies Used

* Java
* NetBeans IDE
* Java `Scanner`
* Regular Expressions

## ▶️ Example

```text
=================================
     PASSWORD STRENGTH CHECKER
=================================
Enter password: Password123!

Strength: STRONG
Score: 5/5
```

## 🧪 Testing

The program was tested using different password inputs to verify the strength classification.

Example test cases:

| Test Input     | Expected Result |
| -------------- | --------------- |
| `abc`          | WEAK            |
| `password`     | WEAK            |
| `Password123`  | MODERATE        |
| `Password123!` | STRONG          |

Testing was performed locally using **NetBeans IDE**.

## 🎯 Learning Objectives

Through this project, I practiced applying basic programming concepts to a cybersecurity-related problem.

The project demonstrates how password characteristics can be evaluated programmatically using simple rules and scoring logic.

## ⚠️ Disclaimer

This project is for **educational purposes only**.

It is a basic password-strength demonstration and should not be considered a complete password security solution. Real-world password security should use established security practices, secure password storage, and appropriate authentication mechanisms.

## 👩‍💻 Author

**jjsanti-ago**

GitHub: [jjsanti-ago](https://github.com/jjsanti-ago)
