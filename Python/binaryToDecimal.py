binary_input = input("Enter Binary: ")
binary_list = list(binary_input)
decimal = 0
binary_list.reverse()
for counter in range(len(binary_list)):
    if binary_list[counter] == "0":
        pass
    elif binary_list[counter] == "1":
        decimal = decimal + 2 ** counter
    else:
        print("invalid binary")
        quit()
print(decimal)