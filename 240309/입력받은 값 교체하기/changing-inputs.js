const fs = require("fs");
let a = fs.readFileSync(0).toString().split(" ");
a[0]=Number(a[0]);
a[1]=Number(a[1]);
[a[0],a[1]]=[a[1],a[0]];

console.log(a[0],a[1]);