const employee={
    name:"Ahmet",
    getName:function(){
       return this.name; 
    }
} 
console.log(employee.name);
console.log(employee.getName());

const emp1=Object.create(employee,{name:{value:"Mehmet"}});
console.log(emp1.name);


const emp2=Object.create(employee);
console.log(emp2.name);

