# Project:      Lab5 (DahalAmritLab5SecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         07/26/2018
# Description:  Determine cost per square inch of pizza using functions.

"""
Write a program that calculates the cost per square inch of a circular pizza,
given its diameter and price. The formula for area is
A\:=\:\pi r^2 A = π r 2 A = π r 2 A=πr2

Create two functions(besides the main function)—one to compute the area
of the pizza, and one to compute cost per square inch. The main function
calls the Area function, that function calls the Cost per Square Inch function,
a value is returned to the Area function and that value is returned to the main
function for printing (see below Pizza Flow diagram).

    Make sure you follow our Homework/Lab Style Guide
    Turn in the py file.

Develop Test Data! What is the diameter of your pizza? What is the cost? With the
diameter what is the area? With both area and cost what is the price per square inch? 
"""



print("Program  1:")
print("")

      
#pseudocode:
    # 1. Request pizza size and cost.
    # 2. Call function to calculate total area of pizza
    # 3. Call function to calculate cost per square inch of pizza
    # 4. Return value of cost per square inch of pizza
    
#import required libraries    
import math

#Calculate the cost per square inch
def CostPerInch(Area, Cost):
    #calculate the cost per square inch of pizza
    fltCostPerSqIn = Cost / Area
    #return the value of cost per square inch of pizza
    return fltCostPerSqIn
    
#find the area of the pizza to calculate cost per square inch    
def PizzaArea(Size, Cost):

    #The Area of pizza is π*r^2 = π*d^2/4
    fltArea = math.pi * Size**2 /4

    #return the cost per square inch of pizza 
    return CostPerInch(fltArea, Cost)
    

def mainA():

    #Request Pizza size and cost
    intSize = int(input("Enter the size of pizza in inches: "))                  
    fltCost = float(input("Enter the cost of the pizza: $"))
    
    print("")
    #round the cost per square inch to 5 decimal places when printing for better accuracy.
    print("The cost of pizza per square inch is: ${0:0.5f}". format(PizzaArea(intSize, fltCost)))

    
mainA()

## Test Data:
##
## Size of Pizza = 10 inches
## Cost of Pizza = $10
## Area = pi * 10^2 /4 = 78.53981633974483
## Cost Per Square inch = $0.12732
##
##
## Result:
##
##    Program  1:
##
##    Enter the size of pizza in inches: 10
##    Enter the cost of the pizza: $10
##
##    The cost of pizza per square inch is: $0.12732
