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


def MasterList():
    #open, save list, then close file
    fileVB = open("BrandVB.txt", 'r')
    lstVB = []
    for line in fileVB:
        lstVB.append(line.rstrip('\n'))
    fileVB.close()

    #open, save list, then close file
    fileA = open("BrandA.txt", 'r')
    lstA = []
    for line in fileA:
        lstA.append(line.rstrip('\n'))
    fileA.close()

    #open, save list, then close file
    fileC = open("BrandC.txt", 'r')
    lstC = []
    for line in fileC:
        lstC.append(line.rstrip('\n'))
    fileC.close()

    #open, save list, then close file
    fileX = open("BrandX.txt", 'r')
    lstX = []
    for line in fileX:
        lstX.append(line.rstrip('\n'))
    fileX.close()

    #append all lists to a master list, in order:
    mlstParts = []
    mlstParts.append(lstVB)
    mlstParts.append(lstA)
    mlstParts.append(lstC)
    mlstParts.append(lstX)

    #return created master list
    return mlstParts

 
def main():

    #create master list
    mlstParts = MasterList()
    #print(mlstParts)


    #request Brand and Part Number inputs:
    strBrand = str(input("Enter the Brand; A, C or X : ")).upper()
    strBrandNo = str(input("Enter the Brand Part Number: ")).upper()

    #flag to check whether brand and part number enter exist and match
    index = False 

    #confirm if brand AND part number exist:
    if strBrand == 'A' and strBrandNo in mlstParts[1]:
            indexNo = mlstParts[1].index(strBrandNo)
            index = True
    elif strBrand == 'C' and strBrandNo in mlstParts[2]:
            indexNo = mlstParts[2].index(strBrandNo)
            index = True
    elif strBrand == 'X' and strBrandNo in mlstParts[3]:
            indexNo = mlstParts[3].index(strBrandNo)
            index = True

    # if brand and part number recognized, return VB Auto's equivalent part number
    # otherwise return error
    if index == True: 
        print("The VB Auto equivalent part number for Brand", strBrand +"'s part number", \
              strBrandNo, "is: ", mlstParts[0][indexNo])
    else:
        print(" The Brand or Part Number is not recognized.")
    

main()
