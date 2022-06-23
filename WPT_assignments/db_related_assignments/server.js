let express = require('express');
let app = express();
app.use(express.static('q4q5'));

let mysql = require('mysql2');
const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '$1d@root',
    database: 'practice',
    port:3306
});

// For Q4
app.get('/fetchareaname', (req, resp) => {

	let pincode = req.query.pincode;
	let output = {status : false, areaname : ""};

	connection.query(
		'select areaname from area where pincode = ?',
		[pincode],
		(err, res) => {
			if (err) {
				console.log(err);
			} else {
				if (res.length > 0) {
					output.status = true;
					output.areaname = res[0].areaname;
					console.log(res);
				} else {
					console.log(res);
				}
			}
			resp.send(output);
		}
	);
});

// For Q5
app.get('/fetchaccbalance', (req, resp) => {

	let accno = req.query.accno;
	let output = {status : false, accbal : 0};

	connection.query(
		'select accbal from account where accno = ?',
		[accno],
		(err, res) => {
			if (err) {
				console.log(err);
			} else {
				if (res.length > 0) {
					output.status = true;
					output.accbal= res[0].accbal;
					console.log(res);
				} else {
					console.log(res);
				}
			}
			resp.send(output);
		}
	);
});

app.listen('800', () => {console.log("Server running on port 800 . . .")});