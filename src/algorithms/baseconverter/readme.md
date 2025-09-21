# How Computers Understand Numbers

## Binary System: The Language of Computers

Computers use the **binary system** to represent and process data. Unlike humans who usually work with **decimal (base 10)** numbers (digits 0–9), computers only understand **two states**:
- **0** (off)
- **1** (on)

These two states can represent any data: numbers, letters, images, or sounds. Each digit in a binary number is called a **bit** (short for binary digit).

## What is a Byte?

A **byte** is a group of **8 bits**. This grouping helps organize data and gives us enough combinations to represent meaningful content.

For example:
1 Byte = 8 bits = 2⁸ = 256 possible values (from 0 to 255)


A single byte can represent:
- A small integer (0–255)
- A character in ASCII encoding (like 'A', 'B', etc.)
- Part of a pixel color value, and so on.

## Arranging Bytes for Meaningful Content

When we use bytes to create meaningful content for users (such as text), each byte is interpreted according to a **coding standard** or **format**, for example:
- **ASCII**: One byte per character (for basic English letters and symbols)
- **UTF-8**: One or more bytes per character (to represent characters from many languages)
- **Images**: Bytes arranged in patterns to define colors, shapes, and transparency

Thus, the interpretation of a byte depends on the **context and encoding scheme**.

## Translating Binary to Decimal

Humans read numbers in **decimal**, but computers store them in binary. To convert a binary number to decimal, each bit contributes a value based on its position (powers of 2).

### Formula

Given a binary number with bits: `bₙ bₙ₋₁ ... b₁ b₀`

The decimal value `D` is:

**D = bₙ × 2ⁿ + bₙ₋₁ × 2ⁿ⁻¹ + ... + b₁ × 2¹ + b₀ × 2⁰**


### Example

Convert binary `1101` to decimal:

**1 × 2³ + 1 × 2² + 0 × 2¹ + 1 × 2⁰ = 8 + 4 + 0 + 1 = 13**


## Translating Decimal to Binary

To convert a decimal number to binary, we repeatedly divide the number by 2 and record the remainders.

### Steps

1. Divide the number by 2.
2. Write down the remainder (it will be 0 or 1).
3. Update the number to be the result of the integer division by 2.
4. Repeat until the number is 0.
5. The binary result is the sequence of remainders **read from bottom to top**.

### Example

Convert decimal `13` to binary:

13 ÷ 2 = 6, remainder = 1

6 ÷ 2 = 3, remainder = 0

3 ÷ 2 = 1, remainder = 1

1 ÷ 2 = 0, remainder = 1



## Summary

- Computers work with binary (0 and 1).
- A byte is 8 bits, allowing 256 combinations.
- Bytes are arranged and interpreted using standards to create human-meaningful content.
- Conversion from binary to decimal uses powers of 2.

---

**Tip:** You can always verify your binary-to-decimal conversions using this formula to understand how computers "see" numbers internally.
