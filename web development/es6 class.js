class sample{
    sampleHello(){
        console.log('this is a sample class')
    }
}

class class1 extends sample{
    constructor(num1, num2){
        super()
        this.num1=num1
        this.num2=num2
    }
 /*method*/   classfunction(){
        console.log("number "+(this.num1+this.num2))
    }
}
//object
let obj=new class1(10,20)

obj.classfunction()

obj.sampleHello()