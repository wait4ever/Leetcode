/*
运用你所掌握的数据结构，设计和实现一个  LRU (最近最少使用) 缓存机制。它应该支持以下操作： 获取数据 get 和 写入数据 put 。
获取数据 get(key) - 如果密钥 (key) 存在于缓存中，则获取密钥的值（总是正数），否则返回 -1。
写入数据 put(key, value) - 如果密钥不存在，则写入其数据值。当缓存容量达到上限时，它应该在写入新数据之前删除最近最少使用的数据值，从而为新的数据值留出空间。
 */
package LeetCode;

import java.util.HashMap;

class Node{
    public int key,val;
    public Node prev,next;
    public Node(int key,int val){
        this.key = key;
        this.val = val;
    }
}

class DoubleLinkedList{
    private Node head,tail;
    private int length;

    public DoubleLinkedList() {
        this.head = new Node(0,0);
        this.tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
        length = 0;
    }
    public void remove(Node node){

        node.prev.next = node.next;
        node.next.prev = node.prev;
        length--;
    }

    public void addFirst(Node node){

        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        length++;

    }

    public Node removeLast(){

        if(tail.prev == head) return null;

        Node lastNode = tail.prev;

        tail.prev = lastNode.prev;
        lastNode.prev.next = tail;
        length--;

        return lastNode;
    }

    public int size(){
        return length;
    }

}

public class N146LRUCache {

    private DoubleLinkedList doubleLinkedList;
    private HashMap<Integer,Node> map;
    private int cap;

    public N146LRUCache(int capacity) {
        this.cap = capacity;
        doubleLinkedList = new DoubleLinkedList();
        map = new HashMap<>();
    }

    public int get(int key) {
        // 判断在不在map里
        if(map.containsKey(key)){
            int val = map.get(key).val;
            put(key,val);
            return val;
        }
        return -1;

    }

    public void put(int key, int value) {
        // 判断在不在map里
        Node newNode = new Node(key,value);
        if(map.containsKey(key)){
            doubleLinkedList.remove(map.get(key));
            doubleLinkedList.addFirst(newNode);
            map.put(key,newNode);
        }else{
            if(cap==doubleLinkedList.size()){
                Node lastNode = doubleLinkedList.removeLast();
                map.remove(lastNode.key);
            }
            doubleLinkedList.addFirst(newNode);
            map.put(key,newNode);
        }

    }
}
