def add_with_transform(left, right, transform_func):
    tmp_val = transform_func(left) + transform_func(right)
    return transform_func(tmp_val)

def add_plus_1(number):
    return number + 1

# (2+1) + (3+1) + 1 = 8
ret_val = add_with_transform(2, 3, add_plus_1)

print(ret_val)
