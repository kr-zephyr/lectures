def func(number):
    def func_in_func(number):
        print(number)

    print("In func")
    func_in_func(number + 1)

func(1)
