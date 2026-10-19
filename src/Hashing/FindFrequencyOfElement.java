package Hashing;

import java.util.*;
/*
Hashing in Java

Hashing in Java is a technique used to store and retrieve data quickly by converting an object into an integer value called a hash code.

Hashing is commonly used in Java collections such as HashMap, HashSet, and Hashtable.

Let's understand it step by step with examples.
1. What is hashing?
Suppose you have 1,000 student records and want to find a particular student.
- Without hashing, you might check each record one by one.
- With hashing, Java uses a hash function to help determine where the record should be stored and searched for.

What is a hash code in Java?
Every Java object inherits the hashCode() method from the Object class unless the method is overridden.

Example:

public class Main {
    public static void main(String[] args) {
        String s = "Java";

        System.out.println(s.hashCode());
    }
}

output: 2301506


- s is a String object containing "Java".
- hashCode() calculates the hash code of that string.
- Java's String class provides its own implementation of hashCode().
Important: A hash code is not necessarily the object's memory address, and it is not guaranteed to be unique.


How does hashing work internally?
Let's understand using a simplified hash table with 10 buckets.

Suppose the hash function is:

    index = key mod 10
For the key 25:
    25 mod 10 = 5

So the key is assigned to bucket index 5.

Hash table example
0 Empty
1 Empty
2 Empty
3 Empty
4 Empty
5 Key: 25
6 Empty
7 Empty
8 Empty
9 Empty

When you search for key 25, the collection calculates the appropriate bucket index and checks the contents of that bucket rather than searching every bucket.

This is why hashing can make lookups very fast.
4. What is a collision in hashing?
A collision occurs when two different keys map to the same bucket.

For example, using our simplified hash function:
25 mod 10 = 5
35 mod 10 = 5
Both 25 and 35 map to bucket index 5.

This is called a collision.
Java's HashMap handles collisions by storing multiple entries in the same bucket. Depending on the situation, the bucket can use a linked structure or a balanced tree.
Collision example
Key: 25
Bucket 5

Key: 35
Bucket 5

Both entries share the same bucket, but Java can still distinguish their keys.

5. Relationship between hashCode() and equals()
This is one of the most important concepts in Java hashing.

Java uses two methods when working with keys in collections like HashMap:
Method	Purpose
hashCode()	Helps determine the bucket to search
equals()	Checks whether two objects are logically equal


The rules are:
1. If two objects are equal according to equals(), they must have the same hash code.
2. If two objects have the same hash code, they are not necessarily equal.
3. If two objects have different hash codes, they cannot be equal according to a correctly implemented equals() and hashCode() contract.
 */

public class FindFrequencyOfElement {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        List<Integer> arr=new ArrayList<>();

        for(int i=0;i<n;i++){
            arr.add(sc.nextInt());
        }

        Map<Integer,Integer> track=new HashMap<>();

        for(int i=0;i<n;i++){
            if(track.containsKey(arr.get(i))){
                track.put(arr.get(i),track.get(arr.get(i))+1);
            }
            else{
                track.put(arr.get(i),1);
            }
        }

        System.out.println("Enter the number N");
        int n1=sc.nextInt();

        for(int i=0;i<n1;i++){
            int a=sc.nextInt();
            System.out.println(track.containsKey(a) ? track.get(a) : 0);
        }
    }
}
