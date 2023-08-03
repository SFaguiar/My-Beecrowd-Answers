var input = require("fs").readFileSync("./dev/stdin", "utf-8");
var lines = input.split("\n");

const PI = 3.14159;

let R = lines[0];
let area = PI * R ** 2;
area = area.toFixed(4);

console.log(`X=${area}`);