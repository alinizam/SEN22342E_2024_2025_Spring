const animal={
    type:"Animal",
    speak: function(){
        console.log(this.type);
    }
}



const dog=Object.create(animal);
dog.type="Dog";
dog.__proto__.bark=()=>console.log("How");

dog.bark();
dog.speak();

animal.sleep=function(){
    console.log("I am sleeping");
}

animal.sleep();
dog.sleep();