package Day4Java.DefaultMethod;

interface DefaultInterfae {
    default int multiply(int num1,int num2)
    {
        return num1*num2;
    }
}
