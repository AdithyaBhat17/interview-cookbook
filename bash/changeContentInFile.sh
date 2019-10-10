# Edit a line with specific pattern in shell script.

sed -i '/pattern/c\ new_line' filename    

#Suppose you need to change a field like Auth to NO in file example.txt, you can use this

sed -i 'Auth/c\ Auth=NO' example.txt




