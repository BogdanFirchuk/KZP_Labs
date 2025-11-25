
from military_alpinist.military_equipment import MilitaryAlpinistEquipment

def main():
    firchuk = MilitaryAlpinistEquipment("Firchuk", 40, 8, 5, True, 4, 10)
    petrov = MilitaryAlpinistEquipment("Petrov", 60, 12, 7, True, 7, 15)

    firchuk.show_all_attributes()
    petrov.show_all_attributes()

    print(f"Максимальна висота підйому Petrov: {petrov.calculate_max_climb_height()} м")

    petrov.compare_rope(firchuk)

    avg = petrov.calculate_average_weight()
    print(f"Середня вага предмета спорядження Petrov: {avg:.2f} кг")

if __name__ == "__main__":
    main()
