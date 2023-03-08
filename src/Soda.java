public class Soda {
  //  Создайте класс Soda (для определения типа газированной воды).
  private String additive;

  //  У класса должен быть конструктор, принимающий 1 аргумент при инициализации
  //  - строку добавка (например, "малина"),
  //  отвечающий за добавку к выбираемому лимонаду.
  public Soda(String additive){
    this.additive = additive;
  }

  public Soda(){
    this.additive = "Обычная газировака";
  }

  //  В этом классе реализуйте метод public String GetMyDrinkString(),
  //  возвращающий строку Газировка и {добавка} в случае наличия добавки.
  //    Если добавки нет, нужно вернуть строку "Обычная газировка".
  public String GetMyDrinkString(){
    if(additive.contains("Обычная газировака")){
      return additive;
    }
    return String.format("Газировка и %s", additive);
  }

}





