const express = require('express')
const routes = require('./routes')
const cors = require('cors');

/*
 * const corsOptions ={
 *   origin:'http://localhost:3000',
 *   credentials:true,    // access-control-allow-credentials: true
 *   optionSuccessStatus:200
 * }
*/

const app = express();
app.use(express.json());
app.use(cors()); // app.use(cors(corsOptions));
app.use(routes);

app.listen(3001);