const employee={
    name:"Ahmet",
    getName:function(){
       return this.name; 
    },
    getAge:function(){
        return this.age; 
     }
} 

employee.age=50;
const e1= Object.create(employee);
e1.age=40;
const e2= Object.create(employee);
e2.age=10;

console.log(employee.age);
console.log(e1.age);
console.log(e2.age);