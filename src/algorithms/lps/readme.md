# Longest Prefix Suffix

Longest prefix suffix is the value of the longest prefix which is also a suffix of a string.

## prefix

Proper prefix is a substring that occurs at the beginning of a string and a proper prefix is all prefixes
that are not equal to the string itself.

ex:

String: "hello"

proper prefixes : "h", "he", "hel", "hell".

## Suffix

A suffix of a string is a substring that occurs at the end of the string and a proper suffix is 
all suffixes that are not equal to the string.

String "hello"

proper suffix : "o", "lo", "llo", "ello"


## Understanding LPS Array.

LPS is a preprocessing algorithm, that will be used by another algorithm, like KMP.
So given a pattern like "aacaaaac" LPS array size will be 8, since the pattern contains 8 caracteres. 
And that array will store at each index, the value of the Longest Prefix that is also a suffix inside that substring,
for example.

## Building the full LPS array (Abstract Walkthrough)

| Index | Substring so far  | LPS\[i] | Reason (in plain English)                                                       |
| ----- | ----------------- | ------- | ------------------------------------------------------------------------------- |
| 0     | a                 | 0       | No proper prefix and suffix.                                                    |
| 1     | a a               | 1       | The prefix `"a"` is also a suffix.                                              |
| 2     | a a b             | 0       | No prefix equals the suffix in this part.                                       |
| 3     | a a b a           | 1       | `"a"` is both prefix and suffix.                                                |
| 4     | a a b a a         | 2       | `"a a"` appears at both start and end.                                          |
| 5     | a a b a a a       | 3       | `"a a a"` is suffix and also at the start.                                      |
| 6     | a a b a a a a     | 4       | `"a a a a"` is both prefix and suffix.                                          |
| 7     | a a b a a a a b   | 3       | Now the end is `"a a b"` which is the same as the prefix starting from index 0. |
| 8     | a a b a a a a b a | 4       | \`"                                                                             |


## Algorithm

- The variable **i** Will be used to walkthrough all char at the string.
- The variable **len** will be used to compute de length of Longest Prefix which is also suffic in the current substring.

### `s[i] = s[len]` →
We can extend, we increment `len` (which is also the length), we put it in `lps[i]`, and we increment `i` to move to the next cell in the array.

---

### `s[i] ≠ s[len]` and `len > 0` →
We take `len` to the length of the LPS of the part that matched, which is the part that ends at `len - 1`.  
We can find the length of its LPS in `lps[len - 1]`, this is why we take `len` to `lps[len - 1]`.

---

### `s[i] ≠ s[len]` and `len = 0` →
We put `0` in `lps[i]` and increment `i` to move to the next cell in the array.



| a | a | b | a | a | a | a | b | a | a | b |
|---|---|---|---|---|---|---|---|---|---|---|
| 0 | 1 | 0 | 1 | 2 | 2 | 2 | 3 | 4 | 5 | 3 | 
---------------------------------------------------

🔧 Initialization:
- lps[0] = 0
- Start len = 0, and i = 1

Step-by-step table:

| i  | pattern\[i] | len | pattern\[len] | Match? | Action                                    | lps\[i] |
| -- | ----------- | --- | ------------- | ------ | ----------------------------------------- | ------- |
| 1  | a           | 0   | a             | ✅      | Match → `len = 1`, `lps[1] = 1`, move `i` | 1       |
| 2  | b           | 1   | a             | ❌      | Fallback `len = lps[0] = 0`               |         |
|    | b           | 0   | a             | ❌      | Set `lps[2] = 0`, move `i`                | 0       |
| 3  | a           | 0   | a             | ✅      | `len = 1`, `lps[3] = 1`                   | 1       |
| 4  | a           | 1   | a             | ✅      | `len = 2`, `lps[4] = 2`                   | 2       |
| 5  | a           | 2   | b             | ❌      | Fallback → `len = lps[1] = 1`             |         |
|    | a           | 1   | a             | ✅      | `len = 2`, `lps[5] = 2`                   | 2       |
| 6  | a           | 2   | b             | ❌      | Fallback → `len = lps[1] = 1`             |         |
|    | a           | 1   | a             | ✅      | `len = 2`, `lps[6] = 2`                   | 2       |
| 7  | b           | 2   | b             | ✅      | `len = 3`, `lps[7] = 3`                   | 3       |
| 8  | a           | 3   | a             | ✅      | `len = 4`, `lps[8] = 4`                   | 4       |
| 9  | a           | 4   | a             | ✅      | `len = 5`, `lps[9] = 5`                   | 5       |
| 10 | b           | 5   | a             | ❌      | Fallback → `len = lps[4] = 2`             |         |
|    | b           | 2   | b             | ✅      | `len = 3`, `lps[10] = 3`                  | 3       |


🧠 Tips to understand better:

Always compare pattern[i] with pattern[len].

On match, increase len and assign it to lps[i].

On mismatch, reduce len = lps[len - 1], and try again (without moving i).

This way we avoid repeating comparisons, making it efficient (O(n) time).
