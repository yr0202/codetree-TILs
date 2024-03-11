const fs = require("fs");
//let a = fs.readFileSync(0).toString().split(" ");
let b = fs.readFileSync(0).toString().split(/[\n ]/);
console.log(Number(b[0]),Number(b[1]),Number(b[2]));