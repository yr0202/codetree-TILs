const fs = require("fs");

let a = Number(fs.readFileSync(0).toString());

a = a*2+3;
console.log(a);