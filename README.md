# 🚀 Data Structures in Java: Stack & Queue

This repository contains implementations of a **Linked List**, **Stack** and **Queue** data structures in Java, demonstrating their core functionalities and use cases.

## 📖 Overview
Data structures like are essential for efficient algorithm design. This repository provides:  
✔ **LinkedList.java** → Implements a dynamic data storage with the `insert()` operation.\
✔ **Stack.java** → Implements a LIFO stack with `push()`, `pop()`, `peek()`, and `isEmpty()` operations.  
✔ **Queue.java** → Implements a FIFO queue with `enqueue()`, `dequeue()`, `peek()`, and `isEmpty()` operations.

## ⚙️ Features
✅ Simple **array-based implementation** of Stack & Queue.\
✅ Simple **insertion and traversal** of a Singly Linked List.\
✅ Covers basic operations with **O(1) complexity** (except `dequeue()`, which is `O(n)`).  \
✅ **Well-structured Java classes** for better code reusability.\
✅ Includes **test cases in the `main` method** for easy execution.

## 📂 Folder Structure  
/JavaDataStructures\
│── src\
│ ├── com\leonardof108\datastructures\linkedlist\
│ │   ├── LinkedList.java\
│ ├── com\leonardof108\datastructures\queue\
│ │   ├── Queue.java\
│ ├── com\leonardof108\datastructures\stack\
│ │   ├── Stack.java\
│── README.md\
│── LICENSE\
│── .gitignore

## 🚀 Getting Started

### 🛠 Prerequisites
Make sure you have:
- **Java 11+** installed.
- A Java IDE (IntelliJ IDEA, Eclipse, VS Code) or a terminal with `javac`.

### ▶️ Running the Code

Clone the repository:
```sh
git clone https://github.com/leonardof108/JavaDataStructures.git
cd JavaDataStructures/src/com/leonardof108/datastructures/
```
## 📌 Usage Example

**Linked List Example**:

```sh
LinkedList list = new LinkedList();
list.insert(10);
list.insert(20);
list.insert(30);
list.printList(); # Output: 10 -> 20 -> 30 -> null
```
**Stack Example**:

```sh
Stack stack = new Stack(5);
stack.push(10);
stack.push(20);
stack.printStack();   # Output: 20 10
System.out.println(stack.pop()); # Output: 20
```
**Queue Example**:

```sh
Queue queue = new Queue(5);
queue.enqueue(10);
queue.enqueue(20);
queue.printQueue();  # Output: 10 20
System.out.println(queue.dequeue()); # Output: 10
```

## 🤝 Contributing

Want to contribute? Fork the repository, add improvements, and create a pull request!

## 📬 Contact
📧 Email: leonardof108@gmail.com\
🔗 LinkedIn: linkedin.com/in/leonardof108\
💻 GitHub: github.com/leonardof108