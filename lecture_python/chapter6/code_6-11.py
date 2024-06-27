class Diva:
    # 클래스 변수
    version = "v3"

    def __init__(self, name = "Diva"):
        # 인스턴스 변수
        self.name = name
    
    def song(self, title = "song"):
        print(self.name + " sing the " + title)

    def medley(self):
        self.song()
        self.song("second song")
        self.song("third song")

class Miku(Diva):
    def __init__(self, module = "class uniform"):
        self.module = module
        # 슈퍼 클래스를 초기화하지 않으면
        # 슈퍼 클래스에서 초기화 & 할당되는 name 변수를 사용할 수 없습니다.
        super().__init__("miku")

    def dance(self):
        print("Dancing")

hatsune_miku = Miku()
print(hatsune_miku.module)
print(hatsune_miku.version)
print(hatsune_miku.name)
hatsune_miku.dance()
hatsune_miku.song("Hello worker")
