// var person = {name:"aju", age:25,place:"kollam"}
// person.name = "umar"
// person.age = 22

// for(x in person){
//     console.log(person[x]) 
// }

// console.log(person.name)
// console.log(person['age'])
var person = {name:"aju", age:25,place:"kollam", display:function(){
    var name = "ajmal"
    console.log(this.name)

}}
person.dob="20-2-2020"
person.displayAge=function(){
    console.log(this.age)
}
// console.log(person.displayAge())
person.displayAge()