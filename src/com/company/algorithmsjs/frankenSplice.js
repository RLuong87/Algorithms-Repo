function frankenSplice(arr1, arr2, n) {
    let sliced = []

    sliced.push(...arr2.slice(0, n))
    sliced.push(...arr1)
    sliced.push(...arr2.slice(n, 4))

    return sliced
}
console.log(frankenSplice([1, 2, 3], [4, 5, 6], 1))
console.log(frankenSplice(["claw", "tentacle"], ["head", "shoulders", "knees", "toes"], 2));