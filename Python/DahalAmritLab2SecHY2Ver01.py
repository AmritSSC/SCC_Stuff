# Project:      Lab 3 (DahalAmritLab3SecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         07/12/2018
# Description:  Two programs: (i)A program to calculate the cost of a coffee order,
#               and (ii) prints a table of temperature in Farenheit and Celcius.
                

import math

#Program 1: BMI Calculation
#The body mass index (BMI) is calculated as a person’s weight (in pounds) times 703,
#divided by their height (in inches) squared. A BMI in the range 19-25, inclusive, is
#considered healthy. Write a program that calculates and prints a person’s BMI as well
#as telling them whether they are above, within, or below the healthy range.

#pseudocode
    #Request weight in pounds. 
    #Request height in inches.
    #Caculate and print BMI value.
    # Depending on BMI value, return value is in, below, or above healthy range.
    

#Executable Code:

#def main()

print("Program 1:")
print("")

def mainA():

    #Request input values
    intWt = int(input("Enter your weight in pounds: "))
    intHt = int(input("Enter your height in inches: "))
    #calculate BMI to 2 decimals
    fltBMI = round(intWt *703 / intHt**2, 2)

    #print BMI
    print("Your BMI is: ", fltBMI, end = " ")

    #print whether they are in healthy range or not
    if fltBMI >= 19:
        if fltBMI <= 26:
            print("Your BMI is within healthy range.")
        else:
            print("Your BMI is above healthy range.")
    else:
        print("Your BMI is below healthy range.")
                  
    
#call function to execute    
mainA()

#Test Data:

#1.
    #Enter your weight in pounds: 180
    #Enter your height in inches: 70
    #Your BMI is:  25.82 Your BMI is within healthy range.
#2. 
    #Enter your weight in pounds: 190
    #Enter your height in inches: 70
    #Your BMI is:  27.26 Your BMI is above healthy range.
#3.
    #Enter your weight in pounds: 130
    #Enter your height in inches: 70
    #Your BMI is:  18.65 Your BMI is below healthy range

print("")
print("")
print("")
print("")



#Program 2: Congress Program

#Create the Congress Program as Python program: 
#  A) A person is eligible to be a US senator if they are at least 30 years old and have been a
#       US citizen for at least 9 years. 
#  B) To be a US representative these numbers are 25 and 7, respectively. 
#  C) They are not eligible for either if...?

#Your program will accept a person's age and years of citizenship as inputs. 
#Your outputs will be one of the following:

#    You are eligible to be a Senator or a Representative.
#    You are eligible to be a Representative.
#    You are not eligible to run for Congress.



#pseudocode
    #Request age
    #Request years as citizen.
    #If atleast 30 years old and 9 year citizen, return confirmation of eligibility to Senator or Representative.
    #If atleast 25 years old and 7 year citizen, return confirmation of eligibility to Representative.
    #If neither, return not eligible to run for Congress.


print("Program 2:")
print("")

#Executable Code:

#name the function
def mainB():

    #Request age and years as citizen
    intAge = int(input("Enter your age: "))
    intYrsasCtzn = int(input("Enter the years you have been a US Citizen: "))

    # set a flag for status:
    statusFlag = 0
    
    #see if age is acceptable to run for senate or representative.
    if intAge >= 25:
        if intYrsasCtzn >= 7:
            statusFlag = 1
        if intAge >= 30:
            if intYrsasCtzn >=9:
                statusFlag = 2

    if (intYrsasCtzn > intAge):
        print("You must be a liar.", end  = " ")
        statusFlag = 0

        
    if statusFlag == 1:
        print("You are eligible to be a Representative.")
    if statusFlag == 2:
        print("You are eligible to be a Senator or a Representative.")
    if statusFlag == 0:
        print("You are not eligible to run for Congress.")
    
mainB()

#Test Data
#1.
    #Enter your age: 29
    #Enter the years you have been a US Citizen: 6
    #You are not eligible to run for Congress.

#2.
    #Enter your age: 33
    #Enter the years you have been a US Citizen: 7
    #You are eligible to be a Representative.
#3.
    #Enter your age: 56
    #Enter the years you have been a US Citizen: 3
    #You are not eligible to run for Congress.
#4.
    #Enter your age: 23
    #Enter the years you have been a US Citizen: 24
    #You must be a liar. You are not eligible to run for Congress.

#5.
    #Enter your age: 37
    #Enter the years you have been a US Citizen: 13
    #You are eligible to be a Senator or a Representative.
