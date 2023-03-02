/*class List{
    constructor(values){
        this.values = values;
    }
    
    /*get values(){
        return this.values;
    }
    set values(values){
         this.values = values;
    }*/
    /*print(){
        this.values.sort();
        document.write('<p><ol>');
        for (const elem of this.values) {
            document.write('<li>' + elem + '</li>')

        }
        document.write('</ol></p>');
    }
    add(elem){
        this.values.push(elem);
    }
    clear(){
        this.values.length = 0;
    }

}
sp1 = ['banana', 'apple', 'kiwi', 'onion', 'peach'];
sp2 = ['java', 'JS', 'Python', 'C#'];
l1 = new List(sp1);
l1.print();
l1.add('punpkin');
l1.print();
l1.clear;
for(elem of sp2) l1.add(elem);
l1.print();*/
class Button{
    constructor(text){
        this.text = text;
    
    }
    show(){
        document.write('<div id=btn1 style='+
         '"width: 150;'+
          'padding: 10px;'+
          'height: 50px;'+
          'margin: 10px 20px;'+
          'background: #fa8072;'+
          'vertical-align: middle;'+
          'display: table-cell;">'+
          '<a href = "#btn3">' + this.text + '</a></div>'
        );

    }
}

class ColorButton{
    constructor(text, color){
       super(text);
        this.color = color;
}
show(){
    document.write(
    '<div id=btn1 style='+
         '"width: 150;'+
          'padding: 10px;'+
          'height: 50px;'+
          'margin: 10px 20px;'+
          'background: #fa8072;'+ this.color + '+' + 
          'vertical-align: middle;'+
          'display: table-cell;">'+
          '<a href = "#btn3">' + this.text + '</a></div>');
}
}
btn1 = new Button("Press me!");
btn1.show();
btn2 = new ColorButton("Press me!", "red");
btn2.show();
