function findLongestWordLength(str, n) {
    let strSplit = []

    for (let i = 0; i < str.length; i++) {

        if (str.slice(i, i + n.length) == n) {
            strSplit.push(str.slice(0, i))
            str = str.slice(i + n.length)
            i = 0
        }
    }
    strSplit.push(str)

    let biggest = ""

    for (let i = 0; i < strSplit.length; i++) {

        if (strSplit[i].length > biggest.length) {
            biggest = strSplit[i]
        }
    }
    return biggest.length
}
console.log(findLongestWordLength("The quick brown fox jumped over the lazy dog", " "));