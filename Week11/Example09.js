(function f(){
    x=5; 
    console.log(this.x);
})();

(function f(){
    console.log(x);
})();

const obj={
    f:function(){
        this.x;
        console.log(this.x);
    }
}
obj.f();
