function countOnline(usersObj) {
    let count = 0

    for (let user in usersObj) {

        if (usersObj[user].online == true) {
            count++
        }
    }
    return count
}
console.log(countOnline({ Rich: { online: true }, Alan: { online: false }, Jeff: { online: true }, Sarah: { online: false }}))