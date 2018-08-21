# Python3 program for array implementation of queue

# Class Queue to represent a queue
class Queue:

    # __init__ function
    def __init__(self, capacity):
        self.front = self.size = 0
        self.rear = capacity -1
        self.Q = [None]*capacity
        self.capacity = capacity
    
    # Queue is full when size becomes
    # equal to the capacity 
    def isFull(self):
        return self.size == self.capacity
    
    # Queue is empty when size is 0
    def isEmpty(self):
        return self.size == 0

    # Function to add an item to the queue. 
    # It changes rear and size
    def EnQueue(self, item):
        if self.isFull():
            #print("Full")
            return
        self.rear = (self.rear + 1) % (self.capacity)
        self.Q[self.rear] = item
        self.size = self.size + 1
        #print("%s enqueued to queue"  %str(item))

    # Function to remove an item from queue. 
    # It changes front and size
    def DeQueue(self):
        if self.isEmpty():
            #print("Empty")
            print("-1",end=" ")
            return
        
        print(str(self.Q[self.front]),end=" ")
        self.front = (self.front + 1) % (self.capacity)
        self.size = self.size -1
        
    # Function to get front of queue
    def que_front(self):
        if self.isEmpty():
            print("Queue is empty")

        print("Front item is", self.Q[self.front])
        
    # Function to get rear of queue
    def que_rear(self):
        if self.isEmpty():
            print("Queue is empty")
        print("Rear item is",  self.Q[self.rear])
        
q = Queue(100)
t = int(input())
for t in range(0,t):
    n = int(input())
    inp = input()
    arr=inp.split()
    i=0
    while n>0:
        if arr[i]=='1':
            i=i+1
            q.EnQueue(arr[i])
            i=i+1
        elif arr[i]=='2':
            q.DeQueue()
            i=i+1
        n-=1