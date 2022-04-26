var myArr = [9, 5, 7, 13, 19, 23, 4, 12, 15]


function myFactor() {
 for (var i = 0; i < myArr.length; i++) {
   var factor = 1
   for (var j = 1; j <= myArr[i]; j++) {
     factor *= j
   }
   console.log(`The factorial of ${myArr[i]} is ${factor}`)
 }
}
myFactor()