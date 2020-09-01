/*var dt = new Date()
for(i=0;i<=1000;i++){
    console.log('loop')
}
console.log('end')
var diff= new Date()-dt
console.log(diff)
*/
function longTask(time){
    dt= new Date()
    while((new Date-dt) <=time){

    }
}
// console.log("started")
// longTask(4000)
// console.log('end')
//asynchronous
function showEnd()
{
console.log('end')

}
console.log('started')
setTimeout(showEnd,2000)
console.log('started')
setTimeout(showEnd,2000)
console.log('started')
setTimeout(showEnd,2000)