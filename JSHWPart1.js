console.log(fibi(3));
console.log(sort([2,4,5,1,3,1]));
console.log(facti(3));
console.log(rotateLeft([1,2,3,4,5],3));

/*
 1. Return the nth Fibonacci number
`x`
 f(0) = 0
 f(1) = 1
 f(10) = 55 
*/
function fibi(q){
        if(q<=0){
            return 0;
        }else if(q==1){
            return 1;
         }else if(q==2){
             return 1;
        }
        else{
            return (fibi(q-1) + fibi(q-2));
        }
     
     };

/*
2. Sort array of integers

f([2,4,5,1,3,1]) = [1,1,2,3,4,5]

Don't use the Array sort() method... that would be lame.
*/
function sort(array) {
    for(a=0;a<array.length;a++){
        for(b=0; b<array.length - a; b++){

            if(array[b-1] > array[b]){
              drift = array[b-1];
              array[b-1] = array[b];
              array[b] = drift;
            }
        }
     
    }
    return array;
};


/*
 3. Return the factorial of n

 f(0) = 1
 f(1) = 1
 f(3) = 6
*/


function facti(q){
    if(q<=0){
        return 1;
    }
    return q* facti(q-1);
};

 /*
 4. Rotate left

 Given array, rotate left n times and return array

 f([1,2,3,4,5], 1) = [2,3,4,5,1]
 f([1,2,3,4,5], 6) = [2,3,4,5,1]
 f([1,2,3,4,5], 3) = [4,5,1,2,3]

*/
function rotateLeft(array, n) {
    for(a=0; a<n; a++){
        drift = array[0];
        for(b = 0; b<array.length -1; b++){
            array[b]= array[b + 1];
        }
        b[array.length-1] = drift;
    }
    return array;
};


