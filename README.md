# 🔍 Code Similarity Detector (Java)

A **Core Java project** that analyzes two source code files and calculates how similar they are.
This tool removes comments and unnecessary spaces from code and then compares the files using the **Longest Common Subsequence (LCS)** algorithm.

It is useful for detecting **code plagiarism** or measuring similarity between two programs.

---

# 📌 Features

* 📂 Read two source code files
* 🧹 Remove comments and extra spaces
* 🧠 Compare code using the **Longest Common Subsequence (LCS)** algorithm
* 📊 Calculate similarity percentage
* 💻 Simple command-line interface

---

# 🧰 Technologies Used

* **Java (Core Java)**
* **File Handling (BufferedReader, FileReader)**
* **String Processing**
* **Dynamic Programming (LCS Algorithm)**

---

# 📁 Project Structure

```
code-similarity-detector/
│
├── CodeSimilarityDetector.java
└── README.md
```

---

# ⚙️ How the Program Works

1. **Read Files**

   * The program reads two source code files using Java file handling.

2. **Clean the Code**

   * Removes:

     * Single-line comments (`//`)
     * Multi-line comments (`/* */`)
     * Extra spaces and line breaks

3. **Apply LCS Algorithm**

   * The program calculates the **Longest Common Subsequence** between the two cleaned codes.

4. **Calculate Similarity**

```
Similarity = (2 × LCS length) / (Length of File1 + Length of File2) × 100
```

5. **Display Result**

   * Prints the similarity percentage.

---

# ▶️ How to Run the Project

### 1️⃣ Clone the repository

```
git clone https://github.com/your-username/code-similarity-detector.git
```

### 2️⃣ Navigate to the project folder

```
cd code-similarity-detector
```

### 3️⃣ Compile the Java file

```
javac CodeSimilarityDetector.java
```

### 4️⃣ Run the program

```
java CodeSimilarityDetector
```

---

# 🖥️ Example Output

```
Enter first file path:
file1.java

Enter second file path:
file2.java

Code Similarity: 98.88%
```

---

# 💡 Future Improvements

* Highlight similar lines of code
* Support multiple programming languages
* Compare multiple files at once
* Build a GUI using Java Swing
* Export similarity report

---

# 🎯 Learning Outcomes

This project demonstrates:

* Object-oriented programming concepts
* File handling in Java
* String processing techniques
* Dynamic programming using LCS algorithm
* Basic software design for a real-world problem

---

# 📄 License

This project is open-source and available under the **MIT License**.

---

⭐ If you like this project, consider giving it a **star on GitHub**!
