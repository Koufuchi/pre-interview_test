
const userIds = ["U01", "U02", "U03"];
const orderIds = ["T01", "T02", "T03", "T04"];
const userOrders = [			
    { userId: "U01", orderIds: ["T01", "T02"] },
    { userId: "U02", orderIds: [] },
    { userId: "U03", orderIds: ["T03"] },
];
const userData = { 
    "U01": "Tom", 
    "U02": "Sam", 
    "U03": "John" 
}; 
const orderData = {						
    "T01": { name: "A", price: 499 }, 
    "T02": { name: "B", price: 599 },
    "T03": { name: "C", price: 699 }, 
    "T04": { name: "D", price: 799 }
};

// userOrders 的 userId 對應 userData
// userOrders 的 orderIds 對應 orderData

let result = [];
let temp;
for(let i=0; i<userOrders.length; i++){
    let userId = userOrders[i]['userId']; 
    // 先處理 user
    temp = {
        user: { 
            id: userId,
            name: userData[userId]
        }, 
        orders: []
    }

    // 再處理 user 的訂單
    let userOrderIds = userOrders[i]['orderIds']; 
    for(let j=0; j<userOrderIds.length; j++){
        temp.orders.push({   
            id : userOrderIds[j],
            name : orderData[userOrderIds[j]]['name'],
            price : orderData[userOrderIds[j]]['price']
        });
    }
    // 都處理完之後放進 result
    result.push(temp);
}









