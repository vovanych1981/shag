/*Зациклить вывод дней недели таким образом: «День недели.
Хотите увидеть следующий день?» и так до тех пор, пока
пользователь нажимает OK.*/

/*while(true) {
    var day1 = ( alert("Понедельник. Хотите увидеть следующий день?"));
    var day2 = ( alert("Вторник. Хотите увидеть следующий день?"));
    var day3 = ( alert("Среда. Хотите увидеть следующий день?"));
    var day4 = ( alert("Четверг. Хотите увидеть следующий день?"));
    var day5 = ( alert("Пятница. Хотите увидеть следующий день?"));
    var day6 = (alert("Суббота. Хотите увидеть следующий день?"));
    var day7 = (alert("Воскресенье. Хотите увидеть следующий день?"));
}*/

/* Вывести таблицу умножения для всех чисел от 2 до 9.
   Каждое число необходимо умножить на числа от 1 до 10.*/
alert( "Таблица умножения: ")
var number = '';

for (var i = 1; i < 10; i++){
    for (var j = 1; j < 11; j++){
        let multiplication = i * j;
        if(multiplication <10){
            multiplication = "  " + multiplication;
        }
        number += multiplication + "  ";
    }
    number += "\n"
}
alert(number);

/*Игра «Угадай число». Предложить пользователю загадать
число от 0 до 100 и отгадать его следующим способом:
каждую итерацию цикла делите диапазон чисел пополам,
записываете результат в N и спрашиваете у пользователя
«Ваше число > N, < N или == N?». В зависимости от того
что указал пользователь, уменьшаете диапазон. Начальный
диапазон от 0 до 100, поделили пополам и получили 50.
Если пользователь указал, что его число > 50, то изменили
диапазон на от 51 до 100. И так до тех пор, пока пользователь не выберет == N*/
    /*alert('Игра "Угадай число" ');
    let number = alert('Загадайте число от 0 до 100');
    let min = 0;
    let max = 100;
    let mid = Math.floor((min + max)/2);
    while(true){
    let ask = prompt(`Вы загадали число больше ${mid}, меньше ${mid}, или равно ${mid} ?`);
    if(!ask) break;
    if(ask == '='){
        alert(`Ваше число - ${Math.floor((min + max)/2)}`)
        break;
    }
        if(ask == '+'){
            min = mid;
            mid = Math.floor((min + max)/2);
        }
        if(ask == '-') {
            max = mid;
            mid = Math.floor((min + max)/2);
        }
    }*/

