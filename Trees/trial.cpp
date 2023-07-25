#include <iostream>
#include<chrono>
#include<math.h>

int main() {
    long long factor1 = 999999929;//987654319;//10000000019;//11111111; //2164383069; // extra prime factor to test
    long long factor2 = 999999937;//987654323;//10000000057;//11111117;//2164383087;  // extra prime factor to test
    auto startTime = std::chrono::high_resolution_clock::now();
    long long target = factor1*factor2;
    long long approxFactor = sqrt(target);
    std::cout<<"Approx Factor = "<<approxFactor<<"\n";
    std::cout<<"Factor 1 = "<<factor1<<"\n";
    std::cout<<(approxFactor<factor1)<<"\n";
    
    for(long long i=approxFactor;i>=approxFactor/2;i--){
        if(target%i==0){
            std::cout<<"The factors of "<<target<<" are "<<i<<" and "<<target/i<<".\n";
            break;
        }else{
            std::cout<<i<<"\n";
        }
    }

    for(long long i=approxFactor;i<=approxFactor*10;i++){
        if(target%i==0){
            std::cout<<"The factors of "<<target<<" are "<<i<<" and "<<target/i<<".\n";
            break;
        }else{
            std::cout<<i<<"\n";
        }
    }


    auto endtTime = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::minutes>(endtTime-startTime).count();
    std::cout<<"Ran for "<<duration<<" minutes\n";
    return 0;
}
