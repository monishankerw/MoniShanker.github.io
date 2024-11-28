1. Is finally block always get executed in Java?
Yes, the finally block is always get executed unless there is an abnormal program 
termination either resulting from a jvm crash or from a call to system.exit(). 
A finally block is always get executed whether exception has occurred or not.
2. Is there a case where finally with not execute?
yes, some case finally block not execute
a. In try and catch block used system.exist() method finally block not execute.
b. Jvm crash, out of memory.
c. forced fully killed java program.
d. deadlock condition not used finally.
e. shutdown system due to power failure.
3. Difference between final,finally, finalize.
finally
1. If you make variable final once initialize then after can not be changed.
2. If you make method final overriding not possible.
3. If you make class final inheritance not possible.
4. If you make static and non static final if not initialized automatically not give default value.

final:
1. It is the extension of try and catch block.
2. When exception happen or not finally block continuous executed.

finalize():
1. Finalize is method.
2. finalize is used to clean activity.
3. when object created they are not in use then jvm will automatically call garbage collector to clean up the un used object.
4. But when garbage collector will be called is quite difficult to predict.
