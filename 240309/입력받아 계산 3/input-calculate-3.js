const fs = require("fs");
let a = fs.readFileSync(0).toString().split("\n");
A=Number(a[0]);
b=Number(a[1]);
console.log(A*b);