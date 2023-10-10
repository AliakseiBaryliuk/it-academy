# it-academy

```
sysdm.cpl
```


[Program](./ПрограммыкурсовJava.pdf)

[History](history.md)

[JVM Specification](https://docs.oracle.com/javase/specs/jvms/se7/html/)

[Presentation](class_one.pptx)


[Bytecode](bytecode_explanation.md)

[Java anatomy](java_anatomy.png)

In Java, the Metaspace (also known as the Metaspace PermGen in earlier versions of Java) is a memory space 
responsible for storing metadata about classes and classloaders. Here are some of the key elements located in the Metaspace:

1) Class Metadata: Metaspace stores metadata about classes loaded by the JVM, including information about the class structure, 
   methods, fields, and annotations. This metadata is necessary for the JVM to manage classloading, inheritance, and method invocation.

2) Classloader Metadata: Metaspace also stores information about classloaders. Each classloader has its own space in 
   Metaspace to store data related to the classes it has loaded.

3) Method Data: Information about methods, such as method bytecode and method signatures, is stored in Metaspace. 
   This allows the JVM to execute methods and perform runtime optimizations.

4) Constant Pool: The constant pool, which contains symbolic references used by the class, is also part of Metaspace. 
   The constant pool includes string literals, numeric literals, and references to methods and fields.

5) Annotations: Metadata related to annotations on classes and their elements is stored in Metaspace. This information 
   is used for runtime reflection and annotation processing.

6) nterned Strings: As mentioned earlier, interned strings (strings created using String.intern()) are stored in the 
   Metaspace's string pool. These strings are unique, and duplicate instances are eliminated, helping to conserve memory.

### Useful links

[JVM](https://www.youtube.com/watch?v=QHKJ9VJHIuY&list=PLmGousISGqx-nXYtNlBM4OptHdCoISEv_&index=11&t=6315s)

[MD](https://gist.github.com/Jekins/2bf2d0638163f1294637)

