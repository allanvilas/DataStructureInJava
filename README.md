# Java Data Structures

![Java](https://img.shields.io/badge/Java-8%2B-blue)
![License](https://img.shields.io/badge/license-MIT-green)

This repository contains Java implementations of basic data structures, including LinkedList, Stack, Queue, and Tree. The implementations are intended for educational purposes and can be used as a reference for studying and practicing data structures in Java.

## Prerequisites

To compile and run the code in this repository, you need to have:

- Java Development Kit (JDK) version 8 or higher
- Java IDE such as Eclipse, IntelliJ IDEA, or any IDE of your choice

## How to Run

1. Clone this repository:
   - :link: git clone https://github.com/allanvilas/DataStructureInJava.git
2. Open the project in your Java IDE.

3. Run the unit tests to ensure that the data structure implementations are functioning correctly.

## Contributions

Contributions are welcome! If you find any issues or wish to add new features, feel free to open an issue or submit a pull request.

## Implemented Data Structures

Here are the data structures implemented in this project:

### LinkedList

- **Features**: :white_check_mark:
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

- **Future Implementations**:
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

## Future Data Structures

Here are some additional data structures that would be interesting to implement in this project:

### HashMap

- **Features**:
- **put(K key, V value)**: Associates the specified value with the specified key.
- **get(K key)**: Returns the value to which the specified key is mapped.
- **remove(K key)**: Removes the mapping for the specified key.
- **containsKey(K key)**: Checks if the map contains a mapping for the specified key.
- **size()**: Returns the number of key-value mappings in the map.

### Graph

- **Features**:
- **addVertex(T value)**: Adds a vertex to the graph.
- **addEdge(T vertex1, T vertex2)**: Adds an edge between two vertices.
- **removeVertex(T value)**: Removes a vertex from the graph.
- **removeEdge(T vertex1, T vertex2)**: Removes the edge between two vertices.
- **DFS(T start)**: Performs a Depth-First Search starting from a given vertex.
- **BFS(T start)**: Performs a Breadth-First Search starting from a given vertex.

### Priority Queue

- **Features**:
- **insert(T value)**: Inserts a value into the priority queue.
- **peek()**: Returns the highest priority element without removing it.
- **poll()**: Removes and returns the highest priority element.
- **isEmpty()**: Checks if the priority queue is empty.
- **size()**: Returns the number of elements in the priority queue.


## License

This project is licensed under the [MIT License](https://opensource.org/licenses/MIT).
