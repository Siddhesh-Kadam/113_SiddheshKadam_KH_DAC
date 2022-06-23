let mysql = require('mysql2');

const connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '$1d@root',
    database: 'practice',
    port:3306
});

// Insertion
connection.query(
    'insert into resource values (?, ?, ?), (?, ?, ?), (?, ?, ?)', 
    [1, "abcd", true, 2, "xyz", false, 3, "pqr", true,], 
    (error, result) => {
        if (error) {
            console.log(error);
        } else {
            if (result.affectedRows > 0) {
                console.log(result.affectedRows + " rows inserted!");
            }        
        }
    }
);

// Update
connection.query(
    'update resource set resourcename = ?, status = ? where resourceid = ?', 
    ["donkey", false, 1], 
    (error, result) => {
        if (error) {
            console.log(error);
        } else {
            if (result.affectedRows > 0) {
                console.log(result.affectedRows + " rows updated!");
            }        
        }
    }
);

// Multi select
connection.query(
    'select * from resource where status = ?', 
    [false], 
    (error, result) => {
        if (error) {
            console.log(error);
        } else {
            if (result.length > 0) {
                console.log(result);
            }        
        }
    }
);

//Single select
connection.query(
    'select * from resource where resourceid = ?', 
    [2], 
    (error, result) => {
        if (error) {
            console.log(error);
        } else {
            if (result.length > 0) {
                console.log(result);
            }        
        }
    }
);
