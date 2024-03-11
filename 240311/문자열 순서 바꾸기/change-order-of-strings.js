const fs = require("fs");
let arr = fs.readFileSync(0).toString().trim().split("\n");
[arr[0],arr[1]] = [arr[1],arr[0]];
console.log("%s\n%s",arr[0],arr[1]);