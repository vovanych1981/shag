/*class Apple{
    constructor(type, weight){
        this.type = type;
        this.weight = weight;
    }
    print(){
        console.log("Сорт: " + this.type + "Вес: "+ this.weight + "\n");
    }
}

const apple1 = new Apple("Белый налив", 100);
apple1.print();*/

/*class Wine{
    #name;
    constructor(name, color, quantity){
        this.#name = name;
        this.color = color;
        this.weight = quantity; // количество бутылок
    
    }
    print(){
        console.log("Название: " + this.#name + "Вид: " + this.color + 
        "Количество бутылок:" + this.weight +  "\n");
    }
    get name(){
        return this.#name;
    }
    set name(name){
        this.#name = name;
    }

    getColor(){
        return this.color;
    }
    setColor(color){
        this.color = color;
    }

    get quantity(){
        return this.quantity;
    }
    set quantity(quantity){
        this.quantity = quantity;
    }


}

const wine1 = new Wine("Грузинское", "красный", 20);

wine1.setColor("pink");
wine1.name = "Caberne";
wine1.print();*/

class Person{
    constructor (name, date){
        this.name = name;
        this.date = date;
    }
    print(){
        console.log("Имя: " + this.name + "Дата рождения: " + this.date + "\n");

    }

}
class Teacher extends Person{
    
}



  
  