
```markdown
# Java Interview Notes

---

## 1. Java Basics

### Q. What is Java?
Java is a simple, object-oriented, platform-independent language designed to be easy to write, debug, and run on any device with a JVM.

### Q. Features of Java
1. **Platform Independent**: "Write Once, Run Anywhere."
2. **Object-Oriented**: Uses classes and objects.
3. **Simple and Secure**: Clean syntax and a secure runtime environment.
4. **Robust**: Strong memory management and garbage collection.
5. **Multithreaded**: Supports concurrent programming.
6. **Portable**: Runs on any platform with a JVM.
7. **High Performance**: JIT compiler improves runtime speed.

---

## 2. History of Java
- **1991**: Created by Sun Microsystems, originally named "Oak."
- **1995**: Java 1.0 released.
- **2004**: Java 5 introduced features like generics.
- **2010**: Oracle acquired Sun Microsystems.
- **2021**: Java SE 17 with long-term support.

---

## 3. Difference Between C++ and Java

| Feature                  | C++                         | Java                          |
|--------------------------|-----------------------------|-------------------------------|
| **Platform Dependency**  | Platform-dependent         | Platform-independent          |
| **Memory Management**    | Manual (pointers)          | Automatic (garbage collection)|
| **Multiple Inheritance** | Supports                    | Supports via interfaces only  |
| **Syntax**               | Complex (pointers, etc.)   | Simplified                    |
| **Performance**          | Faster                      | Slower, improved with JIT     |
| **Compilation**          | Compiled to machine code   | Compiled to bytecode (JVM)    |
| **Use Cases**            | System-level programming   | Web, mobile, enterprise apps  |

---

## 4. Java Keywords and Syntax

### Q. Explain `public static void main(String[] args) {}`

- **public**: JVM can call it from outside packages.
- **static**: No object needed to call the main method.
- **void**: No return type.
- **String[] args**: Command-line arguments.

---

## 5. System.out.println("Hello");
- **System**: Class in `java.lang` package.
- **out**: Static final PrintStream object in `System`.
- **println()**: Method to print text to the console.

---

## 6. Setting Java Path

### Windows:
1. Find the JDK `bin` path.
2. Go to **Control Panel > System > Advanced system settings > Environment Variables**.
3. Add `C:\Program Files\Java\jdk\bin` to the **Path** variable.
4. Verify by running `java -version` in Command Prompt.

### Mac/Linux:
1. Open `.bashrc`, `.bash_profile`, or `.zshrc`.
2. Add: `export PATH=$PATH:/path/to/jdk/bin`.
3. Apply changes with `source ~/.bashrc`.
4. Verify with `java -version`.

---

## 7. Why Java is Not Purely Object-Oriented
Java is not 100% object-oriented due to its use of primitive data types (like `int`, `double`).

---

## 8. Why Java Doesn’t Use Pointers
Java handles memory management internally to prevent accidental memory manipulation and improve security. It uses references instead of explicit pointers.

---

## 9. Out of Memory Error
Occurs when JVM cannot allocate space for an object due to insufficient heap memory, resulting in a runtime error.
```

