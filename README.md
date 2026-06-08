# Codveda_BST
Binary Search Tree (BST) Implementation is a Java project that demonstrates tree data structures and algorithms. It supports insertion, deletion, searching, and traversal operations including in-order, pre-order, and post-order traversals. The project helps in understanding efficient data storage, retrieval, and recursive programming concepts.

# Binary Search Tree (BST) Implementation

## Description

Binary Search Tree (BST) Implementation is a Java-based project that demonstrates tree data structures and algorithms. The application supports insertion, deletion, searching, and traversal operations including in-order, pre-order, and post-order traversals. It provides a practical understanding of hierarchical data storage and efficient searching techniques.

## Features

* Insert nodes into the BST
* Delete nodes from the BST
* Search for a specific value
* In-order traversal
* Pre-order traversal
* Post-order traversal
* Recursive tree operations
* Console-based interaction
* Object-Oriented Programming implementation

## Technologies Used

* Java
* Object-Oriented Programming (OOP)
* Data Structures and Algorithms

## Objectives

* Understand Binary Search Tree concepts.
* Implement insertion, deletion, and search operations.
* Perform tree traversals.
* Learn recursive programming techniques.
* Analyze efficient data storage and retrieval methods.

## Project Structure

```text
BSTProject/
│
├── TreeNode.java
├── BinarySearchTree.java
└── Main.java
```

### TreeNode.java

Represents a node in the Binary Search Tree.

Fields:

* data
* left
* right

### BinarySearchTree.java

Contains methods for:

* Insert
* Delete
* Search
* In-order Traversal
* Pre-order Traversal
* Post-order Traversal

### Main.java

Provides a menu-driven interface for user interaction.

## How to Run

### Compile

```bash
javac BSTImplementation.java
```

### Run

```bash
java BSTImplementation
```

## Sample Input and Output

### Insert Nodes

Input:

```text
Insert: 50
Insert: 30
Insert: 70
Insert: 20
Insert: 40
Insert: 60
Insert: 80
```

Output:

```text
Nodes inserted successfully.
```

### Search Node

Input:

```text
Search: 40
```

Output:

```text
Node Found.
```

Input:

```text
Search: 90
```

Output:

```text
Node Not Found.
```

### In-Order Traversal

Output:

```text
20 30 40 50 60 70 80
```

### Pre-Order Traversal

Output:

```text
50 30 20 40 70 60 80
```

### Post-Order Traversal

Output:

```text
20 40 30 60 80 70 50
```

### Delete Node

Input:

```text
Delete: 30
```

Output:

```text
Node deleted successfully.
```

Updated In-Order Traversal:

```text
20 40 50 60 70 80
```

## Time Complexity

| Operation | Average Case | Worst Case |
| --------- | ------------ | ---------- |
| Insert    | O(log n)     | O(n)       |
| Search    | O(log n)     | O(n)       |
| Delete    | O(log n)     | O(n)       |
| Traversal | O(n)         | O(n)       |

## Learning Outcomes

* Binary Search Tree Structure
* Recursive Algorithms
* Tree Traversal Techniques
* Data Organization and Searching
* Time Complexity Analysis
* Object-Oriented Programming Concepts

## Future Enhancements

* Self-Balancing BST (AVL Tree)
* Red-Black Tree Implementation
* Graphical Tree Visualization
* Level Order Traversal
* Tree Height Calculation
* Find Minimum and Maximum Values
* Convert BST to Balanced BST

## Author

Naveen Kumar
