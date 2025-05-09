const employee = { name: "Ahmet", age: 30 };
const emp1 = Object.create(employee);
console.log(emp1)

const f = function() {
  this.name = "Mehmet";
  this.age = 40;
};

//const emp2 = Object.create(f);
const emp2 = new f();
console.log(emp2)
