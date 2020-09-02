var bb = ['aju', 'jech','umar', 'ajas']

console.log(bb)

var http = require('http')

// http.createServer(server).listen(7000)

// function server(req, res){

//     res.write('crossroads')
//     res.end()

// }
http.createServer(function(req,res){
    
    res.write('ajmalbinnziam')
    res.end()

}).listen(5000)


