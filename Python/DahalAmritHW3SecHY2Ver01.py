# Project:      Homework 3 (DahalAmritHW3SecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         07/26/2018
# Description:  Determine cost of sending out coffee.
                


#Program 1: Calculate order: subtotal, shipping handling costs, tax, and total


#pseudocode
##    1.  Request input for coffee order, delivery method, city and state, and payment method.
##    2. Calculate total cost by weight for each coffee type
##    3. Calculate and print shipping, and handling and delivery method costs.
##    4. Calculate and print Tax
##    5. Calculate and print total.
    
#include libraries


def SubTotal(Brew, Jolt):
 #   print("")
    print("You have ordered", Brew, "pounds of Jonestown Brew coffee.")
    print("You have ordered", Jolt, "pounds of Plymouth Jolt coffee.")
  #  print("")
    #return sub-total    
    return round( Brew * 10.50 + Jolt * 16.95, 2 )

##############################################################################

#shipping calculation
def ShippingAndHandling(Brew, Jolt, Shipping):

    #Handling charge
    Handling = 2.50

    #calculate shipping cost per weight 
    fltWeightCost = (Brew + Jolt) * 0.93

    print("")
    print("The shipping and handling cost is: $ {0:0.2f}". format(Handling + fltWeightCost))

    #determine shipping method cost
    if  Shipping.upper() == 'N':
        print("You have chosen Overnight delivery with a charge of $20.")
        DelCost = 20.00
    elif  Shipping.upper() == 'T':
        print("You have chosen 2-day delivery with a charge of $13.")
        DelCost = 13.00
    else:
        print("You have chosen Standard delivery, with no extra charge.")
        DelCost = 0
 #   print("")

    #return shipping cost
    return round( (fltWeightCost + DelCost + Handling), 2 )

##############################################################################

#tax calculation        
def Tax( State,  SalesAmount):

    #Calculate tax dependent upon state
    if State.upper() == 'WA' or State.lower() == 'CA' or State.lower == 'TX':
        fltTax = SalesAmount * 0.09
    elif State.upper() == 'OR' or State.lower() == 'FL':
        fltTax = SalesAmount * 0.00
    else:
        fltTax = SalesAmount * 0.07

 
    #return total tax 
    return round(fltTax, 2)

##############################################################################

#payment calculation
def PaymentMethod(Method, SalesAmount):
    #Calculate fees based on payment method
 #   print("")
    if Method.upper() == 'P':
        print("Paypal has been selected to pay for the purchase.")
        fltFee = SalesAmount * 0.03
    elif Method.upper() == 'C':
        print("A check has been selected to pay for the purchase.")
        fltFee = SalesAmount * -0.02
    else:
        print("A credit card has been selected to pay for the purchase.")
        fltFee = SalesAmount * 0.05
#    print("")
    return fltFee

##############################################################################
#main function
def main():
    try:

        #request input data
        intBrew = int(input("Enter the pounds of Jonestown Brew Coffee being ordered: "))
        intJolt = int(input("Enter the pounds of Plymouth Jolt Coffee being ordered: "))
        strCity = str(input("Enter city the order is to be delivered to: "))
        strState = str(input("Enter 2 letter code for state the order is to be delivered to: "))
                      
        strShipBy = str(input("Enter the shipping method to deliver order; N for overnight, \
T for 2-Day, any other key for Standard: "))

        strPayMethod = str(input("    Note: Using Paypal has 3% fee, CreditCard has 5% fee, and \
using Check has 2% discount." + '\n'  + "Enter your method of payment; 'P' for Paypal, 'C' for check, \
or any other key for credit card: "))
        
                           
        print("")
        print("")
        #store required values
        fltSubTotal = SubTotal(intBrew, intJolt)
        fltPayFee = PaymentMethod(strPayMethod, fltSubTotal)
        fltShipping = ShippingAndHandling(intBrew, intJolt, strShipBy)
        fltTax = Tax(strState, fltSubTotal)

        print("")                
        #print the required outputs
        print("The Sub-total for the order is: ${0:0.2f}". format(fltSubTotal) )
        
        print("The order is being shipped to:", strCity.capitalize(), ",", strState.upper())
        print("Tax for the order in the state of", strState, "is: ${0:0.2f}". format(fltTax) )        
        print("Payment fee/discount on the order is: ${0:0.2f}". format(fltPayFee) )

        fltTotalCost= fltSubTotal + fltShipping + fltTax + fltPayFee

        print("")
        print("The total cost is: ${0:0.2f}". format(fltTotalCost) )

    # execute if a wrong input is entered.   
    except:
        print("" + '\n' + "")
        print("Your entry was not recognized.")

main()

