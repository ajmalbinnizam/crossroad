var read=require('readline-sync')
num1 = read.question('enter 2 number ')
num2 = read.question('')
console.log(num1,num2)
if(num1>num2){
    console.log('largeris'+ num1)

}
else if(num1==num2){
    console.log('same'+num1 + ' ' +num2)

}
else{
    console.log('larger is '+ num2)
}