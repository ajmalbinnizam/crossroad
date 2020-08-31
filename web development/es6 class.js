class class1{
    constructor(num1, num2){
        this.num1=num1
        this.num2=num2
    }
 /*method*/   classfunction(){
        console.log("number "+(this.num1+this.num2))
    }
}
//object
let claz=new class1(10,20)

claz.classfunction()

