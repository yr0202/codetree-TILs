const fs = require("fs");
let a = fs.readFileSync(0).toString().split("\n");

console.log(Number(a[0]),Number(a[1]))