function bouncer(arr) {
    let truthy = []

    for (let i = 0; i < arr.length; i++) {

        if (typeof arr[i] != "boolean" && arr[i]) {
            truthy.push(arr[i])
        }
    }
    return truthy
}
console.log(bouncer([7, "ate", "", false, 9]))
console.log(bouncer([false, null, 0, NaN, undefined, ""]))
console.log(bouncer([null, NaN, 1, 2, undefined]))