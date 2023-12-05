const express = require("express");
const app = express();
const port = 3000;
app.use(express.json());

//1
app.get("/", (req, res) => {
  res.send("Hello, Express!");
});

//2
app.get("/greet/:name", (req, res) => {
  const ch = req.params;

  res.send(`Hello, ${ch.name}!`);
});

app.post("/sum", (req, res) => {
  const request = req.body;
  const sum_1 = request.sum_1;
  const sum_2 = request.sum_2;

  res.json({ answer: sum_1 + sum_2 });
});

// app.post("/sumWithMultipleValue", (req, res) => {
//   const request = req.body;
//   const num = request.number;
//   let sum1 = 0;
//   let del1 = num[0] * 2;
//   let multiply1 = 1;
//   for (let i = 0; i <= num.length - 1; i++) {
//     sum1 += num[i];
//     del1 -= num[i];
//     multiply1 *= num[i];
//   }
//   res.json({ sum: sum1, del: del1, multiply: multiply1 });
// });

// app.post("/sumWithMultipleValue", (req, res) => {
//   const request = req.body;
//   const prod = request.product;
//   console.log(prod);
//   let totals = 0;
//   let list = [];

//   for (let i = 0; i <= prod.length - 1; i++) {
//     totals = prod[i].price * prod[i].amount;
//     list.push({ name: prod[i].name, total: totals });
//   }
//   res.json({ List: list });
// });

app.post("/sumWithMultipleValue", (req, res) => {
  const request = req.body;
  const prod = request.Result;

  let list = [];

  for (let i = 0; i <= prod.length - 1; i++) {
    const users = prod[i].user;
    let cart = [];
    for (let j = 0; j <= prod.length - 1; j++) {
      if (prod[i].user == prod[j].user) {
        cart.push(prod[j].name);
      }
    }
    if (!list.some((obj) => obj.user == users)) {
      list.push({ user: users, cart });
    }
    console.log(list);
  }

  res.json({ Result: list });
});

app.post("/MultipleValue", (req, res) => {
  const request = req.body;
  const num = request.number;
  var x = [];
  let y = 0;
  for (let i = 1; i <= num; i++) {
    y += i;
    x.push({ num: i, sum: y });
    console.log(x);
  }
  res.json({ List: x });
});

// สูครคูณ
app.post("/multiplication", (req, res) => {
  const request = req.body;
  const nums = request.number;
  var list = [];
  for (let i = 1; i <= nums; i++) {
    for (let j = 1; j <= nums; j++) {
      list.push(`${i} * ${j} = ${i * j}`);
    }
    list.push(`__________________________________________________`);
  }
  res.json(list);
});

//บวกทุกตัวยกเว้น 2 ตัวท้าย
app.post("/sumation", (req, res) => {
  const request = req.body;
  const num = request.numbers;
  var n = 0;
  for (let i = 0; i <= num.length - 3; i++) {
    n += num[i];
  }
  res.json(n);
});

app.use((req, res) => {
  res.status(404).send("404 - Not Found");
});

app.use((err, req, res, next) => {
  console.error(err.stack);
  res.status(500).send("500 - Internal Server Error");
});

app.listen(port, () => {
  console.log(`Server listening on http://localhost:${port}`);
});
