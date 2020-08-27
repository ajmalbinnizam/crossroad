
var readline = require('readline');

var read = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});



// function hello(){
//     console.log("hello")
//     return  10
// }
// val = hello()
// console.log(val)
// console.log(hello())

//1function without return and without argument

// function sum(){
//    var a = 10
//    var b =20
//     var sum=a+b
//     console.log( sum)
// }
// sum()
//--------------------------------------

// 2function with return and without argument

// function sum(){
//     var a = 10
//     var b = 20
//     return a+b
// }
// var num=sum()
// console.log(num)
//-----------------------------------

//3function without return and with argument

// function sum(num1,num2){
//     var total = num1 + num2
//     console.log(total)

// }
// sum(10,20)
//------------------------------------

// 4function with return and with argument

// function sum(num1, num2){
// return num1+num2
// }

// var total = sum(10,20)
// console.log(total)

// function processSum(number) {
//     // Insert code to do whatever with sum here.
//     console.log('The sum is', number);
// }

// read.question('Enter a number: ', function (x) {
//     read.question('Enter another number: ', function (y) {
//         var sum = parseFloat(x) + parseFloat(y);

//         processSum(sum)

//         read.close();
//     });
// })
