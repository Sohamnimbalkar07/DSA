# Data Structures & Algorithms

This repository contains **Java implementations** of common **Data Structures and Algorithms (DSA)** concepts.

## 📚 Topics Covered

---

### 🔢 Sorting Algorithms
- **Bubble Sort (optimized)** – Sorts an array by repeatedly swapping adjacent elements. Includes an optimized version that stops early if the array becomes sorted.
- **Insertion Sort** – Builds a sorted portion of the array by inserting elements into their correct positions.
- **Merge Sort** – A **divide-and-conquer** sorting algorithm that recursively splits the array and merges sorted halves.
- **Selection Sort** – Repeatedly selects the **minimum element** from the unsorted part and moves it to the beginning.
- **Quick Sort** – A **divide-and-conquer** algorithm that selects a **pivot**, partitions the array around it, and recursively sorts subarrays.

---

### 🔍 Search Algorithms
- **Binary Search** – Searches a **sorted array** by repeatedly dividing the search interval in half (**non-recursive implementation**).

---

### 🔗 Linked Lists
- **Singly Linked List** – Supports **insertion at head**, **insertion at tail**, **insertion at any position**, **deletion**, and **traversal**.
- **Doubly Linked List** – Allows **insertion and deletion** from both ends, **insertion at any position**, and **bidirectional traversal**.

---

### 🌳 Tree Data Structures
#### **Binary Search Tree (BST)**
- **Insertion & Deletion** of nodes while maintaining the BST property.
- **Recursive & Non-Recursive Traversals**:
  - Preorder
  - Inorder
  - Postorder
- **Search Techniques**:
  - **Binary Search**
  - **Breadth-First Search (BFS)**
  - **Depth-First Search (DFS)**
- **Height Calculation** – Computes the **maximum depth** of the tree.
- **Delete with Parent Tracking** – Useful for safer node deletion.
- **Delete All** – Recursively deletes all nodes (post-order cleanup).

---

### 🔄 Queue Data Structures
- **Linear Queue** – A simple queue using an **array** with **enqueue**, **dequeue**, and **peek** operations using **front** and **rear** pointers.
- **Circular Queue** – An **array-based circular buffer** that wraps around to use space efficiently.
- **Queue Using Two Stacks** – Implements a queue using **two stacks** to manage **enqueue** and **dequeue** operations.

---

### 🧱 Stack Data Structure
- **Stack Implementation** – A classic **LIFO (Last-In-First-Out)** structure built using **arrays**.  
  Supports:
  - `push` – Add an element to the top
  - `pop` – Remove the top element
  - `peek` – View the top element without removing it
  - `isEmpty` – Check if the stack is empty

---

### 🧮 Stacks & Expression Conversion
- **Infix → Postfix** – Converts an **infix arithmetic expression** to **postfix notation** using a stack.
- **Infix → Prefix** – Converts an infix expression to **prefix notation** using stack operations.
- **Parenthesis Balancing** – Checks if an expression has **balanced parentheses** using a stack.

---

### #️⃣ Hashing
- **Hash Table (Chaining)** – A simple hash table using an **array of linked lists** (**separate chaining**). Supports **put (insert/update)** and **get (retrieve)** operations.

---

Each concept is implemented in **Java** and demonstrates the **fundamental algorithms and operations** for that data structure or algorithm.

---

📁 Explore the code in the repository to dive deeper into each concept!
