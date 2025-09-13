# Linked List

## Definition
A **linked list** is a linear data structure where elements (called **nodes**) are connected using **pointers/references**.  
Each node stores:
- The **data** (value of the element)
- A **pointer** (reference) to the next node (and sometimes the previous one)

Unlike arrays, linked lists don’t require contiguous memory.

---

## Common Terms
- **Node**: A single element containing data and a reference (pointer) to another node.
- **Head**: The first node in the list.
- **Tail**: The last node in the list (its `next` pointer is `null`).
- **Pointer / Reference**: The link that connects one node to another.
- **Singly Linked List**: Each node points only to the next node.
- **Doubly Linked List**: Each node points to both the next and previous node.
- **Circular Linked List**: The tail points back to the head, forming a loop.
- **Traversal**: Visiting each node in the list, usually starting from the head.


## Advantages of Linked Lists
- **Efficient insertions/removals**:
    - `O(1)` if you already have a reference to the node.
    - `O(n)` if you need to search from the head.
    - Better than arrays, which need `O(n)` for arbitrary position insertions/removals.
- **Flexible size**:
    - No need for resizing like dynamic arrays.
    - Avoids costly reallocation when the structure grows.

## Disadvantages of Linked Lists
- **No random access**:
    - Accessing the *k*-th element requires `O(n)` traversal.
    - Arrays provide `O(1)` indexing.
- **Memory overhead**:
    - Each node needs extra storage for pointers.
    - Especially costly when storing small data (e.g., booleans, characters).

## Interview Relevance
- In most algorithm problems, the choice of data structure is fixed by the input.
- Still, knowing trade-offs is useful for trivia and discussions.

## Big O Operations (Linked List)

| Operation                        | Big(O Time) |
|----------------------------------|-------------|
| Access i-th element              | **O(n)**    |
| Insert at head                   | **O(1)**    |
| Remove at head                   | **O(1)**    |
| Insert at tail (with tail ref)   | **O(1)**    |
| Insert at tail (no tail ref)     | **O(n)**    |
| Remove at tail (singly list)     | **O(n)**    |
| Remove at tail (doubly list)     | **O(1)**    |
| Insert at arbitrary position     | **O(n)** → **O(1)** if node reference is known |
| Remove at arbitrary position     | **O(n)** → **O(1)** if node reference is known |
| Search for value                 | **O(n)**    |
| Traversal (visit all elements)   | **O(n)**    |
