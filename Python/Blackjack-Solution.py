# Joohwan Seok, Amrit Dahal
# Date:         07/26/2018
# Description:  This program uses "if" statements to convert
#               cards into values and add them.


def CardValue(fltCardValue):
    if fltCardValue == "J" or fltCardValue == "Q" or fltCardValue == "K":
        strCard1 = "10"
    elif strCard1 == "A":
        strCard1 = "11"




def blackjack():

    #Get user input
    strCard1 = str(input("What is your first card: "))
    strCard2 = str(input("What is your second card: "))

    #Associate the number with J,Q,K or A cards
    strCard1 == CardValue(strCard1)
    #if strCard1 == "J" or strCard1 == "Q" or strCard1 == "K":
     #   strCard1 = "10"
    #elif strCard1 == "A":
      #  strCard1 = "11"

    #Associate the number with J,Q,K or A cards
    strCard2 == CardValue(strCard2)
    
    #if strCard2 == "J" or strCard2 == "Q" or strCard2 == "K":
     #   strCard2 = "10"
    #elif strCard2 == "A":
     #   strCard2 = "11"

    #Add together and display
    intTotal = int(strCard1) + int(strCard2)
    print("Your total is: ", intTotal)

blackjack()
