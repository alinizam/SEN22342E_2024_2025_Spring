function add(a, b){
    return a+b;
}

function extract(a, b){
    return a-b;
}

function multiply(a, b){
    return a*b;
}
 

function callOperation(operations,a,b){
    return operations(a,b)
}

const result=callOperation(multiply,1,2)

console.log(result);
