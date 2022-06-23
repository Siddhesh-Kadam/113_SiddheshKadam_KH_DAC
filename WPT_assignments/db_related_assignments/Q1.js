let mysql = require('mysql2');

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '$1d@root',
    database: 'practice',
    port:3306
});

//Proving db works
connection.query('select 5', (error, result) => {

	if (error) {
		console.log(error);
	} else {
		console.log("Database connection successful!");
	}
});