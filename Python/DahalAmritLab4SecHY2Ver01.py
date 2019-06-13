# Project:      Lab4 (DahalAmritLab4SecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         07/19/2018
# Description:  Determine cost of 3 items shipped with tax.

#Create these two programs

#Lab 4A program:
#Write a program that prints the numeric value of a single name (first or last)
#entered by the user.You can assume there will be NO PUNCTUATION in the entered name.

#Numerologists claim to be able to determine a person's character traits based
#on the "numeric value" of a name.  The value of a name is determined by summing
#up the values of the letters of the name where 'a' is 1, 'b' = 2, …,'z' = 26.
#Upper- and lower-case letters are treated as equal.  For example, "Tindell" would
#have value 20+9+14+4+5+12+12 = 76. 

#Hint: you can use ord() to help with the number. See page 132 of the textbook
#(or this pdf     ).


#Program 1: Turn a string into a numerical value.

print("Program  1:")
print("")

      
#pseudocode:
    # 1. Request name.
    # 2. Turn name into lowercase, and remove all spacings if present.
    # 3. Convert letters to numerics.
    # 4. add all numeric equivalent of letters present.
    # 5. Print the total sum as numeric value of name.

def mainA():

    #Request Name 
    strName = str(input("Enter your first OR last Name only: "))

    #Convert all letters to lowercase- no distinction of value between upper case letters and lower case letters.
    strname = strName.lower()
    print(strname)
    #if name includes a space, hyphen or apostrophe, ignore them. 
    strname = strname.replace(" ", "")
    strname = strname.replace("-", "")
    strname = strname.replace("'", "")
    
    print(strname)
    #initial storage variables
    inty = 0 #sum of string numerical values
    intz = 0 #placemarker for character in string

    for i in strname:
        #use the ordinal (ord) function to convert character into integer
        #since lower case letters a-z are from 97 to 122, subtract 96 so a = 1.. z = 26
        intx = ord(strname[intz]) - 96
        #add numeric value of each letter
        inty += intx
        #increase the character count
        intz += 1

    #print the numeric value of entered name
    print("The numerical value of you name is: ", inty)

        
mainA()
        
#Lab 4B program:
#Word count. A common utility on Unix/Linux systems is a small program called
#“wc”. This program counts the number of lines, words (strings of characters
#separated by blanks or new lines), and characters in a file (not including
#blank spaces between words). Write your own version of this program. The
#program should accept a file name from the user and then print three numbers
#showing the count of lines, words, and characters(do not count blank spaces)
#in the file. You can use the quotes.txtPreview the document file as your test
#file.
    
