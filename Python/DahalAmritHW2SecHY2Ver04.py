# Project:      Homework 2 (DahalAmritHW2SecHY2Ver03.py)
# Name:         Amrit Dahal
# Date:         07/19/2018
# Description:  Determine cost of 3 items shipped with tax.
                


#Program 1: Calculate order subtotal shipping handling costs, tax, and total


#pseudocode
    #Request input of the following for three items:
            #Description,
            #Price,
            #Quantity, and
            #Weight
    #Calculate the subtotal cost of each item
    #Calculate the shipping and handling cost of order
    #Calculate the tax on the order.
    #Output the following:
            #subtotal of each item,
            #shipping costs,
            #tax, and
            #total cost of the order.

    # Shipping is $0.25 per pound
    # Handling is $5 per order.
    # Tax rate is 9% of subtotal

#Test Date:
    # Shovel $25.00 2 each 6lbs
    # Planter $45.00 2 each 11lbs
    # Broom $12.00 1 each 4lbs
    # Subtotal is $152.00, Shipping & Handling is $14.50, Tax is $13.68 and the Total is $180.18

#Executable Code:
    
#include libraries
import math

#def main()
def mainA():
    try:
        #define value storage elements
        runningCost = 0
        runningWt = 0
        #set fixed quantity
        ShippingCost = 0.25 #dollars
        HandlingCost = 5    #dollars
        TaxRate = 0.09      #percent
        #Request, description, price, quantity, and weight of item
        for i in range(3):
             strDesc = str(input("Input item description: "))
            #only accepts positive values, if negative value entered, converts to positive
             fltCost = float(input("Input item cost: "))
             intQntty = int(input("Input quantity requested: "))           
             fltWt = float(input("Input weight of item: "))

             #round item total two two decimal places
             itemtotal = round(fltCost * intQntty, 2)
             #calculate total weight
             itemWt = fltWt * intQntty
             #show item number and subtotal
             print(i+1, end = ". ")
             print("You have purchased", intQntty, strDesc, "of total weight", itemWt, \
                   "lb and price ${0:0.2f}". format(fltCost), end =" each.")
             print("The subtotal is: ${0:0.2f}". format(itemtotal))
             print (" ")

             #sum the running cost and weight of orders thus far
             runningCost += itemtotal
             runningWt += itemWt

        #round the total weight to the next integer number:
        runningWt = math.ceil(runningWt)

        #calculate the shipping, handling, tax and total costs to 2 decimal places.
        fltShH = round(runningWt * ShippingCost  + HandlingCost, 2)
        fltTax = round(runningCost * TaxRate, 2)
        fltTotal = round(runningCost +fltShH + fltTax, 2)
        #Print the values

        print(" ")
        #print the subtotal, shipping and handling, tax, and total values
        print("The subtotal for the order is: ${0:0}". format(runningCost))
        print("The Shipping and Handling cost is: ${0:0}". format(fltShH))
        print("The Tax is: ${0:0}". format(fltTax))
        print(" ")
        print("The total is: ${0:0}". format(fltTotal))
    #if an unrecognized value is entered, return the following error message.
    except: 
        print(" ")
        print("There is an error in your input.")


mainA()

#Result for Test Data:
    # 1. You have purchased 2 Shovel of total weight 12.0 lb and price $25.00 each.The subtotal is: $50.00
    # 2. You have purchased 2 Planter of total weight 22.0 lb and price $45.00 each.The subtotal is: $90.00
    # 3. You have purchased 1 Broom of total weight 4.0 lb and price $12.00 each.The subtotal is: $12.00
     
    # The subtotal for the order is: $152.0
    # The Shipping and Handling cost is: $14.5
    # The Tax is: $13.68
    
    # The total is: $180.18

# Expected results of test data match.    
# Subtotal is $152.00, Shipping & Handling is $14.50, Tax is $13.68 and the Total is $180.18

