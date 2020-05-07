#include <stdio.h>
#include <stdlib.h>
#include <limits.h>
#include "Ex1.h"

//-fsanitize=leak
void leak(){
    void *p = malloc(8);
    p=0;//The memory is leaked here

}

//-fsanitize=signed-integer-overflow 
void IntegerOverflow(){
    int32_t x = (1U << 31) - 1;
    x += 1; // Error: the add result can't fit in x   
}

//-fsanitize=shift
void InvalidShift(){
    int32_t x = (1U << 31) - 1;
    x <<= 2; // Error: the shift result can't fit in x
}

//-fsanitize=bounds
void OutOfBounds(){
    int array[5];
    for (int i = 0; i <= 5; ++i) {
        array[i] += 1; // Error: out-of-bounds access on the last iteration
    }
}



int main(){
    leak();//Calling a function that will cause Memory leak
    IntegerOverflow();//Calling a function that will cause IntegerOverFlow
    InvalidShift();//Calling a function that will cause InvalidShift
    OutOfBounds();////Calling a function that will cause OutOfBounds
    return 0;
}
