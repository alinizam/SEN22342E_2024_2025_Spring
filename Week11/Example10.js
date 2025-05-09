var a = {
    x: 10,
    calculate: function () {
      return this.x + this.y ;
    }
  };
   
  var b = {
    y: 20,
    __proto__: a
  };
   
  var c = {
    y: 30,
    __proto__: a
  };
   
  // call the inherited method
  console.log(b.calculate());  
  console.log(c.calculate());  
  