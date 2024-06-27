l = ["1", 2, "3", "4", 5]

for item in l:
    if type(item) is str:
        # item의 타입이 str일때 실행된다.
        continue

    print("number:", item)
    print("multiply by 2:", item * 2)