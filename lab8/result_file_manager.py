
import struct

class ResultFileManager:
    def write_text(self, file_name: str, x: float, y: float):

        with open(file_name, 'w', encoding='utf-8') as f:
            f.write(f"x = {x}\n")
            f.write(f"y = {y}\n")

    def read_text(self, file_name: str):
        print("Змiст текстового файлу:")
        with open(file_name, 'r', encoding='utf-8') as f:
            for line in f:
                print(line.strip())

    def write_binary(self, file_name: str, x: float, y: float):
        with open(file_name, 'wb') as f:
            f.write(struct.pack('dd', x, y))

    def read_binary(self, file_name: str):
        print("Зчитано з двiйкового файлу:")
        with open(file_name, 'rb') as f:
            data = f.read(struct.calcsize('dd'))
            x, y = struct.unpack('dd', data)
            print(f"x = {x}")
            print(f"y = {y}")
