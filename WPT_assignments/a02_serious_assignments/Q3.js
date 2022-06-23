//Using express framework 
let exp = require('express');

//This line creates an Express application by calling the top-level express() function.
// Our app variable (express application) has methods for handling requests and configuring 
// how the application behaves. We can create multiple apps this way,
// each with their own requests and responses.
let app = exp();

//URI
app.get('/', (req, res) => {
	let radius = req.query.radius;
	let diameter = radius * 2;
	res.send("Diameter : " + diameter);
});

//Hosting localhost server
app.listen(800, () => {
	console.log("Server running at port 800");
});


// Using http module
// let http = require("http");
// let url = require("url");
// http.createServer((reqs,resp)=>{
//     let rs =url.parse(reqs.url,true).query;
//     let di = rs.radius*2;
//     resp.write("di="+di);
//     resp.end();
// }).listen(800);