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