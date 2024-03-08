const fs = require("fs");
let s = fs.readFileSync(0).toString().split("\n");
a[0]=Number(a[0]);
a[1]=Number(a[1]);
console.log(a[0]*a[1]);