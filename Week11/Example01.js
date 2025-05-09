function f1(){
    console.log("Hello");
}

f1();

const fReference=function(){
    console.log("Hello REference"); 
}

fReference();

(function(){
    console.log("Hello Self"); 
})();

fRef2 = ()=>console.log("Hello lambda");
fRef2();

