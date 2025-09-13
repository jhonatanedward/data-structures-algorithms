# Queue Basics

## Definition
A **queue** is a linear data structure that follows the **FIFO (First In, First Out)** principle:
- The first element inserted is the first one to be removed.
- Works like a real-life line (first come, first served).

---

## Common Terms
- **Enqueue**: Insert an element at the end of the queue.
- **Dequeue**: Remove the element from the front of the queue.
- **Front (Head)**: The first element in the queue (next to be removed).
- **Rear (Tail)**: The last element in the queue (most recently added).
- **Empty Queue**: A queue with no elements.
- **Overflow**: Trying to add to a full queue (for fixed-size implementations).
- **Underflow**: Trying to remove from an empty queue.

---

## Operations
- **Enqueue(x)** → adds `x` to the end.
- **Dequeue()** → removes and returns the front element.
- **Peek/Front()** → returns the front element without removing it.
- **isEmpty()** → checks if the queue is empty.
- **isFull()** → checks if the queue is full (for fixed-size arrays).

---

## Big O Operations (Queue)

| Operation    | Array Implementation | Linked List Implementation |
|--------------|----------------------|-----------------------------|
| Enqueue      | **O(1)** (amortized for dynamic array, O(n) worst if resize) | **O(1)** |
| Dequeue      | **O(n)** (requires shifting elements) | **O(1)** |
| Peek / Front | **O(1)** | **O(1)** |
| isEmpty      | **O(1)** | **O(1)** |
| isFull       | **O(1)** (only for fixed-size array) | N/A |

---

## Variants
- **Circular Queue**: Uses a circular buffer (array) to reuse memory efficiently.
- **Deque (Double-Ended Queue)**: Allows insertions and removals at both ends.
- **Priority Queue**: Elements are removed based on priority rather than order of arrival.  