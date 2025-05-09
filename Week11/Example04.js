function employee(name,age){
    this.name=name;
    this.age=age; 
    
}
const emp=new employee("Ahmet",30);

console.log(emp.name);
