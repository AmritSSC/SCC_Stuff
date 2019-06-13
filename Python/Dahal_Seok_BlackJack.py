# Joohwan Seok, Amrit Dahal
# Date:         07/26/2018
# Description:  This program uses "if" statements to convert
#               cards into values and add them.

#calculate the value of the card:
def CardValue(fltCardValue):
    if fltCardValue == "J" or fltCardValue == "Q" or fltCardValue == "K":
        fltCardValue = "10"
    elif fltCardValue == "A":
        fltCardValue = "11"
    return fltCardValue
   



def blackjack():

    #Get user input
    strCard1 = str(input("What is your first card: "))
    strCard2 = str(input("What is your second card: "))

    #Value of first Card
    strCard1 = CardValue(strCard1)
 

    #Value of second Card
    strCard2 = CardValue(strCard2)
    
   
    #Add together and display
    intTotal = int(strCard1) + int(strCard2)
    print("Your total is: ", intTotal)


blackjack()
