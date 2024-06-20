d1 = {
    True:"Yes! This is True!!!",
    False:"Nope",
    39:"Miku",
    39.39:"Hatsune",
    "Diva":"Song Hana",
}

# True and False
print(d1[True])
print(d1[False])
print(d1[1 > 0])
print(d1[-1 > 0])

# numbers
miku = 39
print(d1[39])
print(d1[39.39])
print(d1[miku])

# String
print(d1["Diva"])
