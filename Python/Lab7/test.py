def main():


    #Open file and read contents
    inFile = open("dogs.txt", 'r')

    print(inFile)

    #initialize required storage variables.
    strDigit = [] #store the rank of each dog from the list
    strLoc = [] #store each dog and associated rank
    strRanked = [] #store dog and rank from best to last.

    #find the number associated with each dog
    for strLine in inFile:
        #if line has been separated by "Enter button, ignore the Enter key"
        if (strLine[-1]) == '\n' :
            #process only the rank
            strDigit.append(strLine[-2])
            #store the rank and dog type
            strLoc.append(strLine[:-1])
        #if "Enter" key is not present
        else :
            strDigit.append(strLine[-1])
            strLoc.append(strLine)
    #close file as data required has been retrieved        
    inFile.close()

    #find the length of the list created to be used in sorting the dog ranks
    strLength = len(strDigit)
    
    #go through the list, finding and removing the best ranked every time
    for i in range(strLength) :
        #find the list index for the best ranked dog
        intBestRanked = strDigit.index(min(strDigit))
        #append the best ranked dog in the list into a new list while sorting
        strRanked.append(strLoc[intBestRanked])
        #The first iteration will present the best ranked dog
        if i == 0:
            print(" The best ranked dog is:", strLoc[intBestRanked])     
        #delete the best ranked dog to find the next best ranked dog
        del strLoc[intBestRanked]
        del strDigit[intBestRanked]

    print("")
    print("The list of dogs by order of rank is:", strRanked)
    
main()
