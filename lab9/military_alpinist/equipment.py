
"""
Модуль містить базовий клас Equipment, який описує спорядження альпініста.
"""

class Equipment:
    """
    Базовий клас для опису спорядження альпініста.
    """

    def __init__(self, owner_name: str, total_weight: int, number_of_items: int):
        """
    
        """
        self.owner_name = owner_name
        self.total_weight = total_weight
        self.number_of_items = number_of_items

    def show_all_attributes(self):
        """
        Виводить усю інформацію про спорядження.
        """
        print(f"=== Інформація про альпініста {self.owner_name} ===")
        print(f"Загальна вага спорядження: {self.total_weight} кг")
        print(f"Кількість предметів: {self.number_of_items}")

    def calculate_average_weight(self):
        """
        Обчислює середню вагу одного предмета спорядження.
        :return: середня вага предмета
        """
        if self.number_of_items == 0:
            return 0
        return self.total_weight / self.number_of_items
