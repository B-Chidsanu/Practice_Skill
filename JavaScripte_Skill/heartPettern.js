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

function Heart_Pettern2(input2, str = "") {
  for (let i = input2 / 2; i < input2; i += 2) {
    for (let j = 1; j < input2 - i; j += 2) {
      str += " ";
    }
    for (let j = 1; j < i + 1; j++) {
      str += "*";
    }
    for (let j = 1; j < input2 - i + 1; j++) {
      str += " ";
    }
    for (let j = 1; j < i + 1; j++) {
      str += "*";
    }
    str += "\n";
  }

  for (let i = input2; i > 0; i--) {
    for (let j = 0; j < input2 - i; j++) {
      str += " ";
    }
    for (let j = 1; j < i * 2; j++) {
      str += "*";
    }
    str += "\n";
  }
  const lines = str.split("\n");
  const reversedPettern = lines.reverse().join("\n");
  return reversedPettern;
}

const input1 = 6;
console.log(Heart_Pettern1(input1));

const input2 = 6;
console.log(Heart_Pettern2(input2));
