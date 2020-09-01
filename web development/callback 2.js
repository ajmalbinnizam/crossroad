var hello=function(data){
    console.log("data: "+data +'team')

}
var hey=function(callback){
   callback('crossroads')
}
hey(hello)
hello(hey)