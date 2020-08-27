function person(name, age, place){
    this.name=name
    this.age=age
    this.place=place
    this.display=function(){
        console.log("name: "+this.name+ " age: "+this.age)
    }

}
var aju = new person("ajmal",23,'kollam')
var umar = new person("umar mukthar" ,23,'kollam')
aju.display()
umar.display()