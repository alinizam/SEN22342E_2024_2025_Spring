function add(a, b){
    return a+b;
}

function extract(a, b){
    return a-b;
}

function multiply(a, b){
    return a*b;
}

const operationList=[add, extract, multiply];


function callOperation(operations,i){
    return operations[i]
}

const operation=callOperation(operationList,2)

console.log(operation(5,2));
