# Multithreading

## About this Repo
* This repository is maintained by me to track and update daily learnings on multithreading concepts in Java.
* It serves as a personal knowledge base to document what I read, practice, and understand each day as part of my learning.

## 1. What is Multithreading?
Multithreading is the ability of a program to run multiple threads concurrently. Each thread is a separate path of execution, allowing the CPU to manage and run tasks more efficiently. This can improve performance by doing tasks either concurrently (switching between tasks) or in parallel (running tasks truly at the same time, if multiple cores are available).

## 2. Concurrency vs Parallelism

### Concurrency
Concurrency means executing multiple tasks by interleaving their execution on a single core. Only one task runs at a time, but the system switches between them quickly, so it appears they are running at the same time.

### Parallelism
Parallelism means executing multiple tasks at the exact same time using multiple threads on multiple cores. Each thread runs independently and truly in parallel.

## 3. Key Points in Concurrency and Parallelism

### Concurrency — "Switching between tasks"
* Can happen even with one core
* You can have many threads, but only one is executing at a time
* CPU switches between threads rapidly (context switching)
* Looks like everything is running at once, but it's not

### Parallelism — "Running tasks at the same time"
* Requires multiple cores (or multiple processors)
* Each core can run a thread truly at the same time
* So, threads are not just switching, they're really working in parallelva
## 4. Process and Threads

### Process
An instance of a program execution. When you open an app, that is called a process. It starts running and OS will assign its stack and heap area to it.

### Threads
Threads are smaller pieces of a process which execute inside the program. A single process can contain multiple threads, and each thread shares the same space, resources, and memory of the process.

## 5. Time Slicing Algorithm

Time slicing algorithm is a mechanism where it:
* Assigns time to the threads to run on CPU
* Once the allocated time is over, it will switch to another thread even if the task is not completed by the previous thread
* This makes it look like all threads are running simultaneously
* This algorithm is part of preemptive multitasking, and it's managed by the operating system scheduler, not directly by the Java program

> **Note:** Preemptive multitasking is a CPU scheduling method where the operating system has the power to interrupt (preempt) a currently running task (thread or process) and switch to another task, even if the current task hasn't finished.

## 6. Creating threads in java 

We can create thread in java in two ways one by implementing Runnable interface and other is by extending Thread class.

### Runnable Interface
   * Runnable is a functional interface in Java (i.e., it has a single abstract method: run()).
   * When we implement Runnable, we define the logic to be executed by the thread inside the run() method.

### Thread Class
   * Thread is a class in Java that implements the Runnable interface itself.
   * You can create a custom thread class by extending Thread and overriding the run() method.

   **Note:** Both types of threads are started by using start() method.You can refer code sample for using Runnable interface and Thread class in RunnableThreadExample and ExtendsThread class.

## 7. Which is best Runnable or Thread
   * In java if we can't extend more than one class.So if creating thread using Thread class restricting the extension  of other class
   * But we can implement more than one interface in java there is no restriction for that.
   * So implementing runnable interface is best practise than extending thread class
