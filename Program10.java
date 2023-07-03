//WAP that creates three threads which print no.s from 1 to 5, 6 to 10 and 11 to 15 respectively .Set the name & priority of the threads. 




package com.mycompany.program10; 
class MyThread01 extends Thread { 
int n, m; 
MyThread01(int n, int m) { 
this.n = n; 
this.m = m; 
} 
public void run() { 
for (int i = n; i <= m; i++) { 
System.out.println(i); 
} 
} 
} 
public class Program10 { 
public static void main(String[] args) { 
MyThread01 a = new MyThread01(1, 5); 
MyThread01 b = new MyThread01(6, 10); 
MyThread01 c = new MyThread01(11, 15); 
a.setName("Thread01"); 
b.setName("Thread02"); 
c.setName("Thread03"); 
a.setPriority(Thread.MAX_PRIORITY); 
b.setPriority(Thread.NORM_PRIORITY); 
c.setPriority(Thread.MIN_PRIORITY); 
c.start(); 
a.start(); 
b.start(); 
} 
} 
