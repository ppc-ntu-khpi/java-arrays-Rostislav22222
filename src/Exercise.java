public class Exercise {

    // Метод для розрахунку кількості відпрацьованих годин
    public static void calculate() {
        // Оголошуємо змінні для зберігання кількості виключених номерів
        int excludedNumbers = 0;

        // Проходимо по всіх номерах від 1 до 100000
        for (int i = 1; i <= 100000; i++) {
            // Перетворюємо номер на рядок для перевірки на наявність числа 4 або 13
            String numberAsString = Integer.toString(i);
            // Якщо номер містить число 4 або 13, то він виключається
            if (numberAsString.contains("4") || numberAsString.contains("13")) {
                excludedNumbers++;
            }
        }

        // Виводимо результат
        System.out.println("Загальна кількість виключених номерів: " + excludedNumbers);
    }
}
