# Project:      Lab7 (DahalAmritLab7SecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         08/09/2018
# Description:  Import data and search master list.

##VB Auto sells its own brand of spark plugs. To cross-reference
##to major brands, it keeps a table of equivalent part numbers
##(see image below). VB Auto wants to computerize the process of
##looking up part numbers in order to improve its customer service.
##
##The user should be able to enter the part number and brand and
##look up the corresponding VB Auto part number.
##
##Your program will automatically import all 4 txt files
##(BrandA.txtPreview the document, BrandC.txtPreview the document, BrandX.txt
##Preview the document and BrandVB.txtPreview the document) and place into
##Lists. Put those lists into a Master List. Search the Master List with
##the part number and brand to identify the VB Auto part number. Display the
##VB Auto part number. All in the python shell, you can try it in a graphics
##interface if you'd like. The below image gives you the matrix.
##



print("Program  1:")
print("")

      
#pseudocode:
    # 1. Import data and add to master list
    # 2. Request Brand and partnumber
    # 3. Return and print VBAuto part number
    
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
