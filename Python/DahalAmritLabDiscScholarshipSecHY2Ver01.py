# Project:      Lab5 (DahalAmritDiscScholarshipSecHY2Ver01.py)
# Name:         Amrit Dahal
# Date:         07/26/2018
# Description:  Determine cost per square inch of pizza using functions.

"""
Create a program that takes a student's grades and credits from up to 5
classes (as letter grades, A, B, C etc). It also collects the number of
recommendation letters from the user. The program determines if the student
is eligible for a scholarship.

A = 4.0
B = 3.5
C = 3.0
D = 2.5
F = 0.0

To be eligible for the scholarship they have to have more than 20 credits,
a GPA of 3.7 or above and 2 or more letters.
"""



print("Program  1:")
print("")

      
#pseudocode:
    # 1. Request GPA, and convert them to numeric values.
    # 2. Request number of letter of recommendations obtained
    # 3. Print scholarship eligibility.
    

#calculate the total GPA
def GPA(Grades):
    #there should be five grades entered.
    return sum(Grades) / 5
 
#Determine whether the student is eligible or not
def Eligible(TotalGPA, Credits, Letters):

    
    #See if requirements are fulfilled   
    if TotalGPA >=3.7 and Credits > 20 and Letters >= 2:
        return True
    else:
        return False
    

def PrintScholarship ():
    

    #Enter the grades earned for each class:
    fltGrades = []  
    for i in range(5):
        strGrade = str(input("Enter the grade; Grades must be A,B,C,D, or F: "))

        if strGrade == 'A':
            fltGrade = 4.0
        elif strGrade == 'B':
            fltGrade = 3.5
        elif strGrade == 'C':
            fltGrade = 3.0
        elif strGrade == 'D':
            fltGrade = 2.5
        elif strGrade == 'F':
            fltGrade = 0.0
        #append grade to the list of GPA
        fltGrades.append(fltGrade)


    #Enter the number of Recommendation Letters and total credits earned:
    intCredits = int(input("Enter the number of Credits you have obtained: "))
    intLetters = int(input("Enter the number of Letter of Recommendation you have obtained: "))
    print("")    
    
    #Return whether student is eligible for scholarship or not 
    return Eligible(GPA(fltGrades), intCredits, intLetters)
                     

def mainA():
    
    if PrintScholarship():
        print("Congratulations! You are eligible for a scholarship!")
    else:
        print("Regretfully, you are not eligible for a scholarship.")                     
        

mainA()

