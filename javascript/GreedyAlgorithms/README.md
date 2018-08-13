# Greedy Algorithms  

A greedy algorithm is an algorithmic paradigm that follows the problem solving heuristic of making the locally optimal choice at each stage with the intent of finding a [global optimum](https://en.wikipedia.org/wiki/Maxima_and_minima). In many problems, a greedy strategy does not usually produce an optimal solution, but nonetheless a greedy heuristic may yield locally optimal solutions that approximate a globally optimal solution in a reasonable amount of time.  

### Greedy Knapsack Problem  

Given weights and values of *n* items, we need to put these items in a knapsack of capacity W to get the maximum total value in the knapsack.  
```
Input :
  Items as (value, weight) pairs
  array[] = [{60, 10}, {100, 20}, {120, 30}]
  Knapsack Capacity, W = 50;
Output :
  Maximum possible value = 220
  by taking items of weight 20 and 30 kg 
```

![Greedyknapsack](https://image.slidesharecdn.com/knapsackproblem-achchuthan-140506120412-phpapp02/95/greedy-knapsack-problem-by-y-achchuthan-5-638.jpg?cb=1399378079)  






