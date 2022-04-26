// Reversing a string using a for loop but in reverse

function reverseString(str) {
  var myStr = ""

    for (var i = str.length - 1; i >= 0; i--) {
      myStr += str[i]
  }
  return myStr;
}
console.log(reverseString("hello"));
       


// Reversing a string with a chain method

function stringReverse(str) {

  return str.split("").reverse().join("")
}

console.log(stringReverse("Good morning"))