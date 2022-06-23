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
    'insert into item values (?, ?, ?, ?)', 
    [4, "Mop", 450, "House Supplies"], 
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
    'update item set price = ?, category = ? where itemno = ?', 
    [200, "House Supplies", 1], 
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
    'select * from item where category = ?', 
    ["House Supplies"], 
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
    'select * from item where itemno = ?', 
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

