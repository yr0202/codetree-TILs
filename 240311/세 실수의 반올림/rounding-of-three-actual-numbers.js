const fs = require("fs");
let arr = fs.readFileSync(0).toString().split("\n");
console.log(`${Number(arr[0]).toFixed(3)}\n${Number(arr[1]).toFixed(3)}\n${Number(arr[2]).toFixed(3)}`);