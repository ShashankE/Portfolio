grade_list = [100, 99, 98, 97, 96, 95, 94, 93, 92, 91, 90, 89, 88, 87, 86, 85, 84, 83, 82, 81, 80, 79, 78, 77, 76, 75, 74, 73, 72, 71, 70]
ap_gpa_correlation = [6.0, 5.9, 5.8, 5.7, 5.6, 5.5, 5.4, 5.3, 5.2, 5.1, 5.0, 4.9, 4.8, 4.7, 4.6, 4.5, 4.4, 4.3, 4.2, 4.1, 4.0, 3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0]
adv_gpa_correlation = [5.5, 5.4, 5.3, 5.2, 5.1, 5.0, 4.9, 4.8, 4.7, 4.6, 4.5, 4.4, 4.3, 4.2, 4.1, 4.0, 3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0, 2.9, 2.8, 2.7, 2.6, 2.5]
ol_gpa_correlation = [5.0, 4.9, 4.8, 4.7, 4.6, 4.5, 4.4, 4.3, 4.2, 4.1, 4.0, 3.9, 3.8, 3.7, 3.6, 3.5, 3.4, 3.3, 3.2, 3.1, 3.0, 2.9, 2.8, 2.7, 2.6, 2.5, 2.4, 2.3, 2.2, 2.1, 2.0]
grades = []
'''
grade to gpa conversion lists
--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
input to conversion 
'''
print("    Welcome to FISD'S Weighted GPA Calcultor!")
print("   -------------------------------------------")
y = 0
grade_list.reverse()
ap_gpa_correlation.reverse()
adv_gpa_correlation.reverse()
ol_gpa_correlation.reverse()
for i in range(8):
    y += 1
    class_type = input("Is this class a Ap, Advanced(Adv), or On-Level(OL) ")
    ask = int(input("What is your grade in this class? (" + str(y) + ") "))
    print("------------------------------------------------------------------------------------------------------------------------------")
    if class_type.lower() == "ap":
        conv_ask = ask - 70
        ap = ap_gpa_correlation[conv_ask]
        grades.append(ap)
    elif class_type.lower() == "adv":
        conv_ask = ask -70
        adv = adv_gpa_correlation[conv_ask]
        grades.append(adv)
    elif class_type.lower() == "ol":
        conv_ask = ask - 70
        ol = ol_gpa_correlation[conv_ask]
        grades.append(ol)

#Math Time
Sum = sum(grades)
Sum1 = Sum / 8
print("Your Weighted GPA is : " + str(Sum1) + "!")