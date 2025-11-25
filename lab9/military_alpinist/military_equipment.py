
"""
Модуль містить похідний клас MilitaryAlpinistEquipment,
який розширює Equipment та описує спорядження військового альпініста.
"""

from .equipment import Equipment

class MilitaryAlpinistEquipment(Equipment):
    """
    Похідний клас для опису спорядження військового альпініста.
    цей клас успадковує всі поля і методи базового класу Equipment,
    але також додає власні
    """

    def __init__(self, owner_name: str, total_weight: int, number_of_items: int, rope_length: int, has_helmet: bool, experience_years: int, weapon_weight: int):
        """
        конструктор (викликається через super() з похідного класу)

        """
        super().__init__(owner_name, total_weight, number_of_items)
        self.rope_length = rope_length
        self.has_helmet = has_helmet
        self.experience_years = experience_years
        self.weapon_weight = weapon_weight

    def show_all_attributes(self):
        """
        Метод виведення базової інформації (запускається через super() у перевизначеному методі похідного класу)
        Виводить усю інформацію про військового альпініста.
        """
        super().show_all_attributes()
        print(f"Довжина мотузки: {self.rope_length} м")
        print(f"Наявність шолома: {'так' if self.has_helmet else 'ні'}")
        print(f"Досвід сходжень: {self.experience_years} років")
        print(f"Вага зброї: {self.weapon_weight} кг")
        print("------------------------------------------")

    def calculate_max_climb_height(self):
        """
        Обчислює максимальну висоту підйому (умовна формула).
        """
        return (self.rope_length * 10) + (self.experience_years * 50)

    def compare_rope(self, other):
        """
        Порівнює довжину мотузки з іншим альпіністом.
        """
        if self.rope_length > other.rope_length:
            print(f"{self.owner_name} має довшу мотузку, ніж {other.owner_name}.")
        elif self.rope_length < other.rope_length:
            print(f"{self.owner_name} має коротшу мотузку, ніж {other.owner_name}.")
        else:
            print(f"{self.owner_name} і {other.owner_name} мають однакову довжину мотузки.")
