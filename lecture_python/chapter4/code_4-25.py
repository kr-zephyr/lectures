numbers = [9, 1, 2, 7, 0, 4, 10, 2, 39, 10, 33, 36, 38]

for number in numbers:
    if number == 39:
        print("I found it! 39!!")
        break
    else:
        print("I found", number, "but this is not I want")
else:
    print("Not found 39...")