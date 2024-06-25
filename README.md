# Data Structures With Java
   
<p align="center">
   
   <img src="https://img.shields.io/badge/Java-8%2B-blue" alt="Java Version"/>
   <img src="https://img.shields.io/badge/license-MIT-green" alt="Project License"/>
   <a href="https://github.com/allanvilas/DataStructureInJava/actions" target="_blank"><img src="https://github.com/allanvilas/DataStructureInJava/workflows/Java%20CI%20with%20Maven/badge.svg" alt="Build Status"></a>
   <img src="https://img.shields.io/badge/Coverage-83.33%25-green" alt="Project License"/>
</p>


This repository contains Java implementations of basic data structures, including LinkedList, Stack, Queue, and Tree. The implementations are intended for educational purposes and can be used as a reference for studying and practicing data structures in Java.

## Prerequisites

To compile and run the code in this repository, you need to have:

- Java Development Kit (JDK) version 8 or higher
- Java IDE such as Eclipse, IntelliJ IDEA, or any IDE of your choice

## How to Run

1. Clone this repository:
   1. git clone https://github.com/allanvilas/DataStructureInJava.git
2. Open the project in your Java IDE.

3. Run the unit tests to ensure that the data structure implementations are functioning correctly.

Here are the data structures implemented in this project:

### LinkedList

- **Features**:
- **get(int index)**: Returns the element at the specified index.
- **makeEmpty()**: Removes all elements from the list.
- **append(T data)**: Adds an element to the end of the list.
- **removeFirst()**: Removes the first element from the list.
- **remove(int index)**: Removes the element at the specified index.
- **insert(int index, T data)**: Inserts an element at the specified index.
- **set(int index, T data)**: Updates the element at the specified index.
- **prepend(T data)**: Adds an element to the beginning of the list.
- **removeLast()**: Removes the last element from the list.

- **Future Implementations**:
- **contains(T data)**: Checks if an element exists in the list.
- **reverse()**: Reverses the order of elements in the list.
- **indexOf(T data)**: Returns the index of the specified element.
- **size()**: Returns the number of elements in the list.

### Stack

- **Features**:
- **push(T value)**: Adds an element to the top of the stack.
- **pop()**: Removes and returns the element from the top of the stack.
- **makeEmpty()**: Removes all elements from the stack.

- **Future Implementations**:
- **peek()**: Returns the element at the top of the stack without removing it.
- **isEmpty()**: Checks if the stack is empty.
- **size()**: Returns the number of elements in the stack.
- **contains(T value)**: Checks if an element exists in the stack.

### Queue

- **Features**:
- **enqueue(T value)**: Adds an element to the end of the queue.
- **dequeue()**: Removes and returns the element from the front of the queue.
- **makeEmpty()**: Removes all elements from the queue.
- **peek()**: Returns the element at the front of the queue without removing it.
- **isEmpty()**: Checks if the queue is empty.
- **size()**: Returns the number of elements in the queue.
- **contains(T value)**: Checks if an element exists in the queue.  

### Tree

- **Features**:
- **insert(T value)**: Inserts a new element into the tree.
- **preOrder()**: Returns a list of elements in pre-order.
- **inOrder()**: Returns a list of elements in in-order.
- **posOrder()**: Returns a list of elements in post-order.
- **BFS(T value)**: Performs a Breadth-First Search (BFS) on the tree.

- **Future Implementations**:
- **DFS(T value)**: Performs a Depth-First Search (DFS) on the tree.
- **height()**: Returns the height of the tree.
- **isBalanced()**: Checks if the tree is balanced.
- **remove(T value)**: Removes a specific element from the tree.
- 
## Contributions

Contributions are welcome! If you find any issues or wish to add new features, feel free to open an issue or submit a pull request.

## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
