# Write a script to Auto Increment variable in bash	


# This program increments the variable in it as soon as the program is executed.

n=3;#the variable that I want to be incremented
next_n=$(($n+1))
sudo sed -i "/#the variable that I want to be incremented$/s/=.*#/=$next_n;#/" ${0}
echo $n 


#There should be no space between the variable and the comment
#This is how bash will identify which varible to update
