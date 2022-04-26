function stringRepeat(string, number) {

    let myResult = ""

    for (let i = 0; i < number; i++) {

        myResult += string

        if (number <= 0) {
            return ""
        }
    }

    return myResult
}
console.log(stringRepeat("Yo", 5));