function arryss() {
    let arr=[1,2,3,0,4,5];
console.log(arr[0]);

for (let i = 1; i <= arr.length; i++) {
 console.log(arr[i]);                       // 1  0
 i+=i++;
    
}
}

console.log(arryss());
