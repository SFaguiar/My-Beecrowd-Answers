var input = require("fs").readFileSync("./dev/stdin","utf-8");
var lines = input.split("\n");

A = lines[0];
B = lines[1];

A = Number(A);
B = Number(B);

console.log(`X = ${A + B}`)