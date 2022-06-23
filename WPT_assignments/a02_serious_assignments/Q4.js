let express = require('express');
let app = express();

//Tell express that folder cp is a static folder
app.use(express.static('cp'));

//URIs
app.get('/addItem', (req, res) => {
	res.send('Add item needs to be done');
});

app.get('/updateItem', (req, res) => {
	res.send('Update item needs to be done');
});

// Hosting localhost server
app.listen(800, () => {
	console.log('Server running at port 800');
})