# Python3 program for array implementation of queue

# Class Queue to represent a queue
class Queue:
    # __init__ function
    def __init__(self, capacity):
        self.front = self.size = 0
        self.rear = capacity - 1
        self.Q = [None]*capacity # empty Queue
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
            return
        self.rear = (self.rear + 1) % (self.capacity)
        self.Q[self.rear] = item
        self.size = self.size + 1

    # Function to remove an item from queue. 
    # It changes front and size
    def DeQueue(self):
        if self.isEmpty():
            print("-1",end=" ")
            return
        
        #print(str(self.Q[self.front]),end=" ")
        self.front = (self.front + 1) % (self.capacity)
        self.size = self.size -1
        
    # Function to get front of queue
    def que_front(self):
        if self.isEmpty():
            print("Queue is empty")
        #print("Front item is", self.Q[self.front])
        return self.Q[self.front]
       
    # Function to get rear of queue
    def que_rear(self):
        if self.isEmpty():
            print("Queue is empty")
        #print("Rear item is",  self.Q[self.rear])
        return self.Q[self.rear]


    
#enter no. of elements
n=int(input())

q=Queue(n)
q1=Queue(n)
q2=Queue(n)
    
#enter elements
for i in range(0,n):
    q.EnQueue(input())
    
#insert first half in q1
for j in range(0,int(n/2)):
    q1.EnQueue(q.que_front())
    q.DeQueue()
    
#insert second half in q2
for k in range(0,int(n/2)):
    q2.EnQueue(q.que_front())
    q.DeQueue()
        
        
#insert back into q alternatively
for i in range(0,int(n/2)):
    q.EnQueue(q1.que_front())
    print(q1.que_front(),end="\t")
    q1.DeQueue()
    q.EnQueue(q2.que_front())
    print(q2.que_front(),end="\t")
    q2.DeQueue()
    