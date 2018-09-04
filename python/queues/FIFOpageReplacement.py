'''
In operating systems that use paging for memory management, page replacement algorithm are needed to 
decide which page needed to be replaced when new page comes in. Whenever a new page is referred and not 
present in memory, page fault occurs and Operating System replaces one of the existing pages with newly 
needed page. Different page replacement algorithms suggest different ways to decide which page to replace. 
The target for all algorithms is to reduce number of page faults.

First In First Out (FIFO) page replacement algorithm 
This is the simplest page replacement algorithm. In this algorithm, operating system keeps track of all 
pages in the memory in a queue, oldest page is in the front of the queue. When a page needs to be replaced 
page in the front of the queue is selected for removal.

Example -1. Consider page reference string 1, 3, 0, 3, 5, 6 and 3 page slots.

Initially all slots are empty, so when 1, 3, 0 came they are allocated to the empty slots —> 3 Page Faults.
when 3 comes, it is already in memory so —> 0 Page Faults.
Then 5 comes, it is not available in memory so it replaces the oldest page slot i.e 1. —>1 Page Fault.
Finally 6 comes, it is also not available in memory so it replaces the oldest page slot i.e 3 —>1 Page Fault.

So total page faults = 6.
'''
#using inbuilt modules for queue
from collections import deque

queue = deque([])

#input number of page slots

cap = int(input())

#input number of pages

n=int(input())

fault=0

for i in range(0,n):
    k=int(input())
    if k not in queue:
        if len(queue) < cap:
            queue.append(k)
            fault+=1
        else:
            queue.popleft()
            queue.append(k)
            fault+=1
    print(queue)
    
print(fault)
