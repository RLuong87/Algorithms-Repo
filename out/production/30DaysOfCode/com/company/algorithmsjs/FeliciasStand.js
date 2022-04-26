// Felicia’s Fruit Stand 2.0


var fruitType = [
    ["Apples"],
    ["Oranges"],
    ["Grapes"]
  ]
  
  
  var fruits = [
    [" Wealthy", " Granny Smith", " Gala"],
    [" Blood", " Navel", " Mandarin"],
    [" Red Globe", " Concord", " Merlot"]
  ]
  
  
  var prices = [
    [3, 2, 3],
    [2, 3, 4],
    [3, 2, 2]
  ]
  
  
  var salesQuantity = [
    [40, 70, 30],
    [25, 35, 60],
    [25, 20, 50]
  ]
  
  
  var fruitStock = [
    [100, 200, 250],
    [250, 300, 350],
    [150, 230, 240]
  ]
  
  
  function myFruits() {

    for (let i = 0; i < fruits.length; i++) {

      console.log(`${fruitType[i]}:${fruits[i]}\n`)
    }
  }
  
  function data() {
    for (let i = 0; i < fruits.length; i++) {

      for (let j = 0; j < fruits.length; j++) {

        let profit = [prices[i][j] * salesQuantity[i][j]]
        let stock = [fruitStock[i][j] - salesQuantity[i][j]]
        let missedProfit = [prices[i][j] * stock]
        
        console.log(`Total Sales: ${salesQuantity[i][j]}${fruits[i][j]} ${fruitType[i]}\nTotal Profit: $${profit}\n${stock}${fruits[i][j]} ${fruitType[i]} left in stock\nTotal Missed Profit: $${missedProfit}\n`)
      }
    }
  }
  myFruits()
  data()