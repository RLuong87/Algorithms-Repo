/*
Section 1: Split
  Split takes a string value and creates an array of strings seperated by the argument given. Split is a non-destructive method. (This means it does not alter the str data where the method is called from.)
  

 Section 2: Join
  Join takes the array created by .split and brings it together. (Any sub-string created will be brought together into one string.)
*/

function splitString(value, arg) {

    let newArr = []

    let lowCase = value.toLowerCase()

    for (let i = 0; i <= lowCase.length; i++) {

        if (lowCase.slice(i, i + arg.length) == arg) {
            newArr.push(lowCase.slice(0, i))
            lowCase = lowCase.slice(i + arg.length)
            i = 0
        }
    }
    newArr.push(lowCase)

    let result = ""

    for (let i = 0; i < newArr.length; i++) {

        result += newArr[i].slice(0, 1).toUpperCase() + newArr[i].slice(1) + arg
    }
    return result
}
console.log(splitString("I'm a little tea pot", " "));
console.log(splitString("sHoRt AnD sToUt", " "))
console.log(splitString("HERE IS MY HANDLE HERE IS MY SPOUT", " "))