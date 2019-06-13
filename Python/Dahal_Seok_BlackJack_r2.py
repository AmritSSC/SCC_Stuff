# Joohwan Seok, Amrit Dahal
# Date:         07/26/2018
# Description:  This program uses "if" statements to convert
#               cards into values and add them.

#calculate the value of the card:
def CardValue(strCardValue):
    if strCardValue == "J" or strCardValue == "Q" or strCardValue == "K":
        strCardValue = "10"
    elif strCardValue == "A":
        strCardValue = "11"
    return strCardValue
   



def blackjack():

    #Enter number of cards:
    intNoOfCards = int(input("Enter the number of cards to input:"))
    intTotal = 0

    #Calculate the total value of all cards
    for i in range(intNoOfCards):                        
        #Get user input
        strCard1 = str(input("What is on your card : "))
        #Get card value
        strCard = CardValue(strCard1)
        #Add sum of cards
        intTotal += int(strCard)

##    blnAnotherCard = True
##    
####    while(blnAnotherCard == True):
####        strCard1 = str(input("What is on your card : "))
####        #Get card value
####        strCard = CardValue(strCard1)
####        #Add sum of cards
####        intTotal += int(strCard)
####
####        strWant = str(input("Do you want another card? Y/N: "))
####
####        if strWant == "N":
####            blnAnotherCard = False
####                         
    print("Your total is: ", intTotal)


blackjack()
