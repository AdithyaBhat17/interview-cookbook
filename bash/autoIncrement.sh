#Auto Increment variable in bash	


#This program increments the variable in it as soon as the program is executed.

n=1;#the variable that I want to be incremented
next_n=$[$n+1]
sudo sed -i "/#the variable that I want to be incremented$/s/=.*#/=$next_n;#/" ${0}
echo $n 
