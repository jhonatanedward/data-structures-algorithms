# Array Basics

## Definition
An **array** is a linear data structure that stores elements in **contiguous memory locations**.  
Each element can be directly accessed using an **index**, making lookup very efficient.

---

## Common Terms
- **Element**: A single item stored in the array.
- **Index**: The position of an element in the array (usually zero-based).
- **Length / Size**: The number of elements in the array.
- **Static Array**: Fixed size; cannot grow or shrink once created.
- **Dynamic Array**: Resizable; automatically expands when capacity is exceeded (e.g., Java `ArrayList`, Python `list`).
- **Contiguous Memory**: All elements are stored next to each other in memory, enabling fast indexing.
- **Random Access**: Ability to directly access any element in `O(1)` time using its index.
- **Resizing**: Process of allocating a larger array and copying elements when capacity is exceeded (costly operation).

--

## Big O Operations

| Operation                 | Big(O Time) |
|---------------------------|-------------|
| Read / Write i-th element | **(1)**     |
| Insert / Remove End       | **O(1)**    |
| Insert middle             | **O(n)**    |
|Remove middle              | **O(n)**    |


