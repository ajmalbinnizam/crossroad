// for(i=2;i<=100;i=i+2){
//     console.log(i)
// }
// for(var i=1;i<=5;i++){
//     console.log("*".repeat(i))
// }

for (let i = 1; i <= 5; i++) {
    for (let j = 1; j <= i; j++) {
        document.write('*');
    }
    document.write('</br >');
}


var x,y,chr;
for(x=1; x <=6; x++)
{
   for (y=1; y < x; y++)
     {
    chr=chr+("*");        
      }
 console.log(chr);
 chr='';    
}