// Upvotes vs Downvotes

function getVoteCount(votes) {
    let voteCount = []

    for (let prop in votes) {
        voteCount.push(votes[prop])
    }
    return voteCount[0] - voteCount[1]
}
console.log(getVoteCount({ upvotes: 2, downvotes: 33 }))
console.log(getVoteCount({ upvotes: 13, downvotes: 0 }))
console.log(getVoteCount({ upvotes: 132, downvotes: 132 }))



function getVoteCount2(votes) {

    return votes.upvotes - votes.downvotes
}
console.log(getVoteCount({ upvotes: 2, downvotes: 33 }))
console.log(getVoteCount({ upvotes: 13, downvotes: 0 }))
console.log(getVoteCount({ upvotes: 132, downvotes: 132 }))
console.log(getVoteCount({ downvotes: 4, upvotes: 1 }))





// 50-30-20 Strategy

function budgetPlan(Needs, Wants, Savings) {
    let obj = {
        Needs: Needs,
        Wants: Wants,
        Savings: Savings
    };
    return obj;
}
let myBudget = budgetPlan(50 / 100 * 50000, 30 / 100 * 50000, 20 / 100 * 50000);

console.log(myBudget)


//_________________________________________________________________________________________//

function fiftyThirtyTwenty(ati) {
    let budget = {
        Needs: 50 / 100 * ati,
        Wants: 30 / 100 * ati,
        Savings: 20 / 100 * ati
    }
    return budget
}
console.log(fiftyThirtyTwenty(10000))








// Profile Lookup

var contacts = [
    {
        "firstName": "Akira",
        "lastName": "Laine",
        "number": "0543236543",
        "likes": ["Pizza", "Coding", "Brownie Points"]
    },
    {
        "firstName": "Harry",
        "lastName": "Potter",
        "number": "0994372684",
        "likes": ["Hogwarts", "Magic", "Hagrid"]
    },
    {
        "firstName": "Sherlock",
        "lastName": "Holmes",
        "number": "0487345643",
        "likes": ["Intriguing Cases", "Violin"]
    },
    {
        "firstName": "Kristian",
        "lastName": "Vos",
        "number": "unknown",
        "likes": ["JavaScript", "Gaming", "Foxes"]
    }
];

function lookUpProfile(name, prop) {

    for (let i = 0; i < contacts.length; i++) {
        //   console.log(contacts[i].firstName)
        //   console.log(contacts[i][prop])
        if (contacts[i].firstName == name) {
            return contacts[i][prop] || 'No such property'
        }
    }
    return 'No such contact'
}
let info = lookUpProfile("Harry", "likes")

console.log(info)






// Sum of people's budgets

function getBudgets(arr) {
    let total = 0

    for (let i = 0; i < arr.length; i++) {
        total += arr[i].budget
    }
    return total
}
console.log(getBudgets([
    { name: "John", age: 21, budget: 23000 },
    { name: "Steve", age: 32, budget: 40000 },
    { name: "Martin", age: 16, budget: 2700 }
]))
console.log(getBudgets([
    { name: "John", age: 21, budget: 29000 },
    { name: "Steve", age: 32, budget: 32000 },
    { name: "Martin", age: 16, budget: 1600 }
]))






// Objects into Arrays

function toArray(obj) {
    let keys = []

    for (let prop in obj) {
        keys.push([prop, obj[prop]])
    }
    return keys
}
console.log(toArray({ a: 1, b: 2 }))
console.log(toArray({ shrimp: 15, tots: 12 }))
console.log(toArray({}))






// Make a circle with OOP

class Circle {
    constructor(radius) {
        this.radius = radius
    }
    getArea() { return Math.PI * this.radius * this.radius }
    getPerimeter() { return Math.PI * this.radius * 2 }
}

let q = new Circle(11);
console.log(q.getArea());
console.log(q.getPerimeter());






// Wherefore art thou?

function whatIsInAName(collection, source) {
    var matchPair = [];

    collection.forEach(object => {
        let pair = 0

        for (let key in source) {

            if (object[key] == source[key]) {
                pair++
            }
            if (pair == Object.keys(source).length) {
                matchPair.push(object)
            }
        }
    })
    return matchPair
}
console.log(whatIsInAName([{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], { last: "Capulet" }))
console.log(whatIsInAName([{ "apple": 1 }, { "apple": 1 }, { "apple": 1, "bat": 2 }], { "apple": 1 }))
console.log(whatIsInAName([{ "apple": 1, "bat": 2 }, { "bat": 2 }, { "apple": 1, "bat": 2, "cookie": 2 }], { "apple": 1, "bat": 2 }))
console.log(whatIsInAName([{ "apple": 1, "bat": 2 }, { "apple": 1 }, { "apple": 1, "bat": 2, "cookie": 2 }], { "apple": 1, "cookie": 2 }))
console.log(whatIsInAName([{ "apple": 1, "bat": 2 }, { "apple": 1 }, { "apple": 1, "bat": 2, "cookie": 2 }, { "bat": 2 }], { "apple": 1, "bat": 2 }))
console.log(whatIsInAName([{ "a": 1, "b": 2, "c": 3 }], { "a": 1, "b": 9999, "c": 3 }))