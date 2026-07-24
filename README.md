# 🔢 Check Even or Odd using Bit Manipulation (Java)

A simple Java program to determine whether a number is **even** or **odd** using the **Bitwise AND (`&`)** operator instead of the modulus (`%`) operator. :contentReference[oaicite:0]{index=0}

---

## 📌 Concept

The least significant bit (LSB) of a binary number determines whether it is even or odd.

- **Even Number:** Last bit is `0`
- **Odd Number:** Last bit is `1`

Using a bitmask of `1`:

```java
if ((n & 1) == 0)
```

- Result is `0` → Even Number
- Result is `1` → Odd Number

---

## 🚀 Example

### Input

```java
int n = 8;
```

### Output

```
even number
```

---

## 💻 Code Features

- Uses Bit Manipulation
- Constant Time Complexity **O(1)**
- Constant Space Complexity **O(1)**
- Beginner Friendly

---

## 🧠 Time Complexity

| Operation | Complexity |
|-----------|------------|
| Even/Odd Check | **O(1)** |

---

## 📂 File Structure

```
_01_check_Even_Odd.java
```

---

## 📖 Learning Outcome

This program helps you understand:

- Bitwise AND (`&`) Operator
- Binary Representation
- Bit Manipulation Basics
- Efficient Even/Odd Checking

---

## ⭐ Example Binary

| Number | Binary | Last Bit | Result |
|--------|--------|----------|--------|
| 8 | 1000 | 0 | Even |
| 15 | 1111 | 1 | Odd |
| 24 | 11000 | 0 | Even |
| 31 | 11111 | 1 | Odd |

---

## 👨‍💻 Author

**Samarth Dhage**

If you found this repository useful, consider giving it a ⭐ on GitHub!
