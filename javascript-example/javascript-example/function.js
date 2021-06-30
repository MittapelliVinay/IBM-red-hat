function _myFunction()
{
    let a=100;
    let b=200;
    return('addition of a and b is: ',(a+b));
}
 
let result=_myFunction();
console.log(result);
 
function AwesomeFunc()
{
    console.log("Hello");
    console.log("and");
    console.log("Goodbye");
}
 
function Sum(num1, num2)
{
    let result = num1 + num2;
 
    console.log(result);
}
 
function SumReturn(num1, num2)
{
    let result = num1 + num2;
 
    return result;
}
 
AwesomeFunc();
Sum(4, 7);
console.log(SumReturn(5, 9));
 
let epicVar = SumReturn(2, 100);
 
console.log(epicVar);