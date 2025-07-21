// function createCounter(n) {
//     return function() {
//         return n++;
//     };
// }

// // Example usage:
// const counter = createCounter(10);
// console.log(counter()); // Output: 10
// console.log(counter()); // Output: 11
// console.log(counter()); // Output: 12


// var createCounter = function(init){
//     let current =  init;

//     return {
//         increament : () => ++current,
//         reset : () => (current = init),
//         decreament : () => --current

//     }
// }

// var counter = createCounter(5);
// console.log(counter.increament());
// console.log(counter.reset());
// console.log(counter.decreament());



var once=(fn)=>{

   return function (...args) {
    return fn(...args);
   } 

}
const add =(a,b)=>a+b;

const onceFn=once(add);

console.log(onceFn(2,3,6));
console.log(onceFn(3,3,6));
console.log(onceFn(5,3,6));