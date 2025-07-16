# Big O Notation (Quick Reference)

**Big O notation** is a mathematical way to describe the performance or complexity of an algorithm. It expresses how the runtime or space requirements grow relative to the input size `n`, especially as `n` becomes large.

## Why use Big O?

- To understand **how scalable** an algorithm is.
- To compare algorithms independently of machine or language.
- To focus on the most significant factors affecting performance.

# Big O Basic Concepts

## O(1): Constant Time
- Doesn't depend on the size of the data set.
- **Example:** Accessing an array element by its index.

## O(log n): Logarithmic Time
- Splits the data in each step (divide and conquer).
- **Example:** Binary search.

## O(n): Linear Time
- Directly proportional to the data set size.
- **Example:** Looping through an array.

## O(n log n): Linearithmic Time
- Splits and sorts or searches data.
- **Example:** Merge sort, quick sort.

## O(n²): Polynomial Time
- Nested loops for each power of n.
- **Example:** Bubble sort (O(n²)).

---

## Omega (Ω) — Best Case
- **What it means:** Omega (Ω) describes the best-case scenario for an algorithm.
- **In simple terms:** It tells you the fastest an algorithm can run in the best circumstances.

## Theta (Θ) — Average Case
- **In simple terms:** It tells you what to generally expect in terms of time complexity.

## Big O (O) — Worst Case
- **What it means:** Big O (O) describes the worst-case scenario for an algorithm.
- **In simple terms:** It tells you the slowest an algorithm can run in the worst circumstances.

---

## Useful Tips
- **Drop Non-Dominant Terms:**  
  In O(n² + n), focus on O(n²) as it will dominate for large n.
- **Drop Constants:**  
  O(2n) simplifies to O(n).



## Common Big O complexities

- **O(1)** — Constant time (e.g., accessing an array element).
- **O(log n)** — Logarithmic time (e.g., binary search).
- **O(n)** — Linear time (e.g., simple loops through an array).
- **O(n log n)** — Linearithmic time (e.g., efficient sorting algorithms like merge sort).
- **O(n²)** — Quadratic time (e.g., nested loops).
- **O(2ⁿ)** — Exponential time (e.g., solving some recursive problems naively).
- **O(n!)** — Factorial time (e.g., generating all permutations).

## Key points to remember

✅ Focuses on **growth rate**, not exact speed.  
✅ Describes **worst-case** most commonly (but can also describe best or average case).  
✅ Helps design and choose more efficient algorithms.

---

> "Big O doesn't care about small constants or exact execution time — it cares about how things grow as your input gets huge!"
