# Project:      Final Program (nameFinal.py)
# Name:         name
# Date:         03/25/14
# Description:  This program will look through the master list(lstMaster)
#               for each "entry" (a person's name and 3 numbers).
#               You will add up all the numbers for each person and
#               send that total to a function that will return the square
#               root of that total.
#               You will then display the person's
#               name and the square root.
#
#               Example: Tim is associated with 20, 6 and 83. Adding up
#               the 20, 6 and 83 gives us 109 and the square root is
#               10.44030650891055.
#               The print out should be
#               "Tim's square root is 10.44030650891055"
#
#               You need to use a loop to add up the numbers. You should
#               end up having somewhere between 10-20 more lines of code,no need for more.

# Import math library
from math import *

# Square Root Function

def sqroot(x):
    y = x**0.5
    return y

# Main code
def main():

    # Create all 4 lists
    lstPerson = ["Tim","Bob","Jon","Alf","Bea","Bear","Rabbit"]
    lstFirstNum = [20,42,46,17,10,32,39]
    lstSecondNum = [6,7,99,72,52,5,50]
    lstThirdNum = [83,82,80,80,79,78,76]

    # Append the 4 lists to the Master List 
    lstMaster = []
    lstMaster.append(lstPerson)
    lstMaster.append(lstFirstNum)
    lstMaster.append(lstSecondNum)
    lstMaster.append(lstThirdNum)

    #go through every row in list    
    for j in range(7):
        #initialize number every time
        num = 0
        #go through every row in list
        for i in range(3):
            #add numbers in range
            num += lstMaster[i+1][j]
        #print(num)
        #calculate square root using function
        fltsqrt = sqroot(num)
        #print output
        #print the name
        print(format(lstMaster[0][j]), end= "")
        #print so space between name and comment is taken out
        print("'s square root is: ", fltsqrt)
        
   # print(num)
        

    
main()

# The final print out in the Shell should look like this:
# >>>
# Tim's square root is 10.44030650891055
# Bob's square root is 11.445523142259598
# Jon's square root is 15.0
# Alf's square root is 13.0
# Bea's square root is 11.874342087037917
# Bear's square root is 10.723805294763608
# Rabbit's square root is 12.84523257866513
# >>> 
