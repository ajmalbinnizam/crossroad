function person(name, age, place){
    this.name= name
    this.age = age
    this.place = place
    this.display=function(){
        console.log("name "+this.name+" age" +this.age)
    }
}
var aju = new person("ajmal", 20,"kollam")
aju.display()