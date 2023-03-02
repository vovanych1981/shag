class Apple{
    constructor(type, weight){
        this.type = type;
        this.weight = weight;
    }
    print(){
        console.log("Сорт: " + this.type + "Вес: "+ this.weight + "\n");
    }
}

const apple1 = new Apple("Белый налив", 100);
apple1.print();


  
  