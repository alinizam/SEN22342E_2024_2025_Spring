const employee={
    name:"Ahmet",
    getName:function(){
       return this.name; 
    },
    getAge:function(){
        return this.age; 
    }
} 

const emp=Object.create(employee);
emp.__proto__.hireDate=2000;


const emp1=Object.create(emp);
console.log(emp1.hireDate);
emp1.__proto__.getWorkingYear=function(){
    console.log(2025-this.hireDate);   
}

emp1.getWorkingYear();
emp.getWorkingYear();
