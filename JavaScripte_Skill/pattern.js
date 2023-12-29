//--------------------สี่เหลี่ยมเว้นกลาง--------------------//
function centeredSquare(input1) {
  let str = "";
  for (let i = 0; i < input1; i++) {
    for (let j = 0; j < input1; j++) {
      if (i == 0 || i == input1 - 1 || j == 0 || j == input1 - 1) {
        str += "*";
      } else {
        str += " ";
      }
    }
    str += "\n";
  }
  return str;
}
const input1 = 5;
console.log(centeredSquare(input1));

//--------------------สามเหลี่ยมเต็ม--------------------//
function fullTriangle(input2) {
  let str = "";
  for (let i = 1; i <= input2; i++) {
    for (let j = 1; j <= input2 - i; j++) {
      str += " ";
    }
    for (let l = 0; l < 2 * i - 1; l++) {
      str += "*";
    }
    str += "\n";
  }
  return str;
}
const input2 = 5;
console.log(fullTriangle(input2));

//--------------------สามเหลี่ยมเว้นกลาง--------------------//
function centeredTriangle(input3) {
  let str = "";
  for (let i = 1; i <= input3; i++) {
    for (let j = 1; j <= input3 - i; j++) {
      str += " ";
    }
    for (let l = 0; l < 2 * i - 1; l++) {
      if (i == 1 || i == input3) {
        str += "*";
      } else if (l == 0 || l == 2 * i - 2) {
        str += "*";
      } else {
        str += " ";
      }
    }
    str += "\n";
  }
  return str;
}
const input3 = 5;
console.log(centeredTriangle(input3));

//--------------------ข้าวหลามตัด--------------------//
function diamond(input4) {
  let str = "";
  for (let i = 1; i <= input4; i++) {
    for (let j = input4; j > i; j--) {
      str += " ";
    }
    for (let l = 0; l < 2 * i - 1; l++) {
      str += "*";
    }
    str += "\n";
  }
  for (let i = 1; i <= input4 - 1; i++) {
    for (let j = 0; j < i; j++) {
      str += " ";
    }
    for (let l = (input4 - i) * 2 - 1; l > 0; l--) {
      str += "*";
    }
    str += "\n";
  }
  return str;
}
const input4 = 5;
console.log(diamond(input4));
