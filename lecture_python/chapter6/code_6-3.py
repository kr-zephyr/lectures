class Diva:
    # 클래스 변수
    version = "v3"

    def __init__(self, name = "Diva"):
        # 인스턴스 변수
        self.name = name
        
diva1 = Diva()
diva2 = Diva("Miku")
diva3 = Diva("Hana")

def print_diva_info(diva):
    print("====")
    print("Name: ", diva.name)
    print("Version: ", diva.version)

print_diva_info(diva1)
print_diva_info(diva2)
print_diva_info(diva3)
