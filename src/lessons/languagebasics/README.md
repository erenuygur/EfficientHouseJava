# What is Java?

Java is well-known as a programming language for Internet applications.

In 1991, James Gosling led a team at Sun Microsystems that developed the first version of Java ( It was Oak )

Java is an object-oriented programming (OOP) language.

Java is called high-level language The language that the computer can directly understand is called machine language  ,

Machine language or any language similar to machine language is called a low-level language.

Must be translated into a program in machine language before the program can be run. The program that does the translating is called a compiler, and the translation process is called compiling.

<aside>
💡 Compiler

A compiler is a program that translates a high-level-language program, such as a Java
program, into an equivalent low-level-language program

</aside>

One disadvantage of most programming languages is that the compiler translates the high-level-language program directly into the machine language for your computer.
Since different computers have different machine languages, this means you need a different compiler for each type of computer.

Java, however, uses a slightly different and much more versatile approach to compiling.

The Java compiler translates your Java program into a language called  byte-code.
Byte-code is not the machine language for any particular computer; it is the  machine language for a fictitious computer called the Java Virtual Machine (JVM).
The Java Virtual Machine is very similar to all typical computers. Thus, it is easy to  translate a program written in byte-code into a program in the machine language  for any particular computer.
There are two ways the JVM can do this  translation: through an interpreter and through a Just-In-Time (JIT) compiler

An interpreter combines the translation of the byte-code and the execution of the  corresponding machine language instructions.
The interpreter works by translating an  instruction of byte-code into instructions expressed in your computer’s machine language  and then executing those instructions on your computer.
It does this one byte-code  instruction at a time. Thus, an interpreter translates and executes the instructions in the  byte-code one after the other, rather than translating the entire byte-code program at once.

Modern implementations of the JVM use a JIT compiler, which uses a combination  of interpretation and compilation.
The JIT compiler reads the byte-code in chunks  and compiles entire chunks to native machine language instructions as needed.
The  compiled machine language instructions are remembered—that is, cached—for future  use, so the chunk needs to be compiled only once.
This model generally runs programs  faster than the interpreted model, which always has to translate the next byte-code  instruction to machine code instructions

.  To run a Java program, first use the compiler to translate the Java program into  byte-code.,
Then, use the JVM for your computer to translate byte-code instructions to  machine language and to run the machine language instructions. (It sounds as though Java byte-code just adds an extra step in the process.)

### Why not write  compilers that translate directly from Java to the machine language for your particular  computer?

This is what is done for most other programming languages.

However, Java  byte-code makes your Java program very portable.
After you compile your Java program  into byte-code, you can use that byte-code on any computer. When you run your program  on another type of computer, you do not need to recompile it.
This means that you can  send your byte-code over the Internet to another computer and have it easily run on that  computer. This is one of the reasons Java is good for Internet applications.
This model is  also more secure. If a Java program behaves badly, it only does so within the context of the  JVM instead of behaving badly directly on your native machine.
Of course, every kind of  computer must have its own program to implement the Java Virtual Machine.

<aside>
💡 Byte Code
The Java compiler translates your Java program into a language called byte-code, which is the machine language for a fictitious computer. It is easy to translate this byte-code into the machine language of any particular computer. Each type of computer will have its own software to implement the Java Virtual Machine that translates and executes byte-code instructions.

</aside>

# Primitive Types

- byte = 1bit : 8 byte  ; The `byte`data type is an 8-bit signed two's complement integer (-128 , 127) The `byte` data type can be useful for where the memory savings actually matters.

- short = 2bit : 16byte ; The `short`data type is a 16-bit signed two's complement integer.

(-2^15 , 2^15 -1)

- int = 4bit : 32byte ; the `int`data type is a 32-bit signed two's complement integer (-2^32 , 2^31-1)

<aside>
💡 Java SE 8 and later, you can use the `int` data type to represent an unsigned 32-bit integer (0 , 2^32 -1)

</aside>

> Use the Integer class to use `int`data type as an unsigned integer
>

<aside>
💡 **int is the default type of java.**

</aside>

- long = 8bit : 64byte ; The `long`data type is a 64-bit signed two's complement integer (2^63 , 2^63-1)

<aside>
💡 . In Java SE 8 and later, you can use the `long` data type to represent an unsigned 64-bit long, (0,2^64-1)

</aside>

Use this data type when you need a range of values wider than those provided by `int`.

Floating Point Numbers

- float = 4byte :32bit ;The `float`data type is a single-precision 32-bit IEEE 754 floating point.

This is signed. ( -2^31 , 2^31 -1)

- double = 8byte : 64bit ; The `double`data type is a double-precision 64-bit IEEE 754 floating point (-2^63 , 2^63 -1)

> **For decimal values, this data type is generally the default choice. Cause** , Double is more precise than float and can store 64 bits, double of the number of bits float can store. Double is more precise and for storing large numbers, we prefer double over float.
>

• **boolean**: The `boolean` data type 1bit and has only two possible values: `true` and `false`. Use this data type for simple flags that track true/false conditions. This data type represents one bit of information, but its "size" isn't something that's precisely defined.

<aside>
💡 The type boolean has the two values true and false.                                                         (Unlike some other programming languages, the Java values true and false are not integers and will not be automatically converted to integers.) so true its not 1 and false its not 0 at Java be careful.

</aside>

> • Why is a boolean 1 byte and not 1 bit of size?
>

( because we said before boolean can be true(1bit) or false(1bit) but boolean 8-bit Because the CPU can't address anything smaller than a byte.

- char : The `char`data type is a single 16-bit Unicode character. This is unsigned. This Type has 2^16 values.

<aside>
💡 String primitive type değildir user defined type’tır.

</aside>

### Type Casting

A type cast takes a value of one type and produces a value of another type that is Java’s best guess of an equivalent value.

![Untitled](Primitive%20Types%208567912cbe204feea68d12a49a5a1eb8/Untitled.png)

```
byte b = 4;

short c = b; 

int a = c;

They can easily be converted to each other because int includes short and short' byte.

Ancak
int c = 100000;
byte b = (byte)c;

When converting from int to byte we should use casting operator, forcing.
```

