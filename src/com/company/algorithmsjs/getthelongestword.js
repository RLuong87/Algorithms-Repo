function findLongestWordLength(str) {
  
  let array = str.split(" ")
    let emptyStr = ""

      for (let i = 0; i < array.length; i++) {

        let words = array[i]

          if (words.length > emptyStr.length) {
            emptyStr = words
        }
    }
  return emptyStr.length;
}
console.log(findLongestWordLength("The quick brown fox jumped over the lazy dog"));