
def mainA():

    intWt = int(input("Enter weight in pounds: "))
    intHeight = int(input("Enter height in inches: "))

    fltBMI = round(intWt * 703 /  intHeight**2, 2)

    print("Your BMI is: ", fltBMI)

    if fltBMI >= 19:
        if flt <= 26:
            print("Your BMI value is within healthy range.")
        else:
            print("Your BMI value is above healthy range.")
    else:
            print("Your BMI value is below healthy range.")
                    
                    
                       
