# 단어 1개, 숫자 1개를 전달받아서 단어의 길이와 숫자를 곱해서 반환합니다.
def count_length(word : str, num : int) -> int:
    return len(word) * num

print(count_length("miku", 39))
