const fs = require("fs");
let a = fs.readFileSync(0).toString().split("\n");
Number(a[0])
console.log(Number(a[0]),Number(a[1]))