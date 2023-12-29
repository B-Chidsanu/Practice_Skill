const Heart_Pettern1 = (input1, str = "") => {
  for (let i = input1 / 2; i < input1; i += 2) {
    for (let j = 1; j < input1 - i; j += 2) {
      str += " ";
    }
    for (let j = 1; j < i + 1; j++) {
      str += "*";
    }
    for (let j = 1; j < input1 - i + 1; j++) {
      str += " ";
    }
    for (let j = 1; j < i + 1; j++) {
      str += "*";
    }
    str += "\n";
  }

  for (let i = input1; i > 0; i--) {
    for (let j = 0; j < input1 - i; j++) {
      str += " ";
    }
    for (let j = 1; j < i * 2; j++) {
      str += "*";
    }
    str += "\n";
  }
  return str;
};
const input1 = 6;
console.log(Heart_Pettern1(input1));