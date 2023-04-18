import java.util.Scanner;

public class task1 {
	public static void main(String[] args) {
		String userInput = null;                   //Переменная для проверки в цикле на прерывание
		float temp = 0;                            //Переменная для блока try-catch
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите вещественное число:");
		for (; ; ) {
			userInput = scanner.next();
			try {
				temp = Float.parseFloat(userInput); //Проверка на корректность способом преобразования в тип float
				System.out.println(temp);
				break;                              //Выход из цикла если все хорошо
			} catch (NumberFormatException e) {     /*Используем исключение "Неверное преобразование символьной
												    строки в числовой формат" */
				System.out.println("Внимание!!! Введите корректное значение, последнее введенное значение было:");
			}
		} scanner.close();
	}
}