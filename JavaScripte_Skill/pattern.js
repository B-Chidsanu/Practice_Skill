//--------------------สี่เหลี่ยมเว้นกลาง--------------------//
// const input = 5;

// let y = "";

// for (let i = 0; i < input; i++) {
//     for (let j = 0; j < input; j++) {
//         if (i == 0 || i == input - 1) {
//             y += "*";
//         } else if (j == 0 || j == input - 1) {
//             y += "*";
//         }
//         else {
//             y += " ";
//         }
//     }
//     y += ("\n");
// }
// console.log(y);

//--------------------สามเหลี่ยมเต็ม--------------------//

// let input = 10;

// let str = "";

// for (let i = 1; i <= input; i++) {
//     for (let j = 1; j <= input - i; j++) {
//         str += " ";
//     }
//     for (let l = 0; l < 2 * i - 1; l++) {
//         str += "*";
//     }
//     str += ("\n");
// }
// console.log(str);

//--------------------สามเหลี่ยมเว้นกลาง--------------------//

// let input = 5;

// let str = "";

// for (let i = 1; i <= input; i++) {
//     for (let j = 1; j <= input - i; j++) {
//         str += " ";
//     }
//     for (let l = 0; l < 2 * i - 1; l++) {
//         if (i == 1 || i == input) {
//             str += "*";
//         } else if (l == 0 || l == 2 * i - 2) {
//             str += "*";

//         } else {
//             str += " ";
//         }
//     }
//     str += ("\n");
// }
// console.log(str);

//--------------------ข้าวหลามตัด--------------------//

// let input = 5;

// let str = "";

// for (let i = 1; i <= input; i++) {
//   for (let j = input; j > i; j--) {
//     str += " ";
//   }
//   for (let l = 0; l < 2 * i - 1; l++) {
//     str += "*";
//   }
//   str += "\n";
// }
// for (let i = 1; i <= input - 1; i++) {
//   for (let j = 0; j < i; j++) {
//     str += " ";
//   }
//   for (let l = (input - i) * 2 - 1; l > 0; l--) {
//     str += "*";
//   }
//   str += "\n";
// }

// console.log(str);
