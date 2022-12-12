import java.util.Scanner;

class ArrayX
{
    public int Arr[];
    public int iSize;

    public ArrayX(int No)
    {
        iSize=No;
        Arr=new int[iSize];
    }

    public void Accept()
    {
        Scanner sobj = new Scanner(System.in);
        System .out.println("Enter the elements:");
        int iCnt=0;
        for(iCnt=0; iCnt<iSize; iCnt++)
        {
            Arr [iCnt]= sobj.nextInt();
        }
    }

    public void Display()
    {
        System.out.println("Elements of Array are:");
        int iCnt=0;
        for(iCnt=0; iCnt<iSize;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

    }

    public int Addition()
    {
        int iCnt=0;
        int iSum=0;
        for (iCnt=0; iCnt<iSize; iCnt++)
        {
            iSum=iSum+Arr[iCnt];
        }
        return iSum;

    }
}

class ArrayOOP
{
    public static void main(String Arg[])
    {
        int iRet=0;
        int iSize=4;
        ArrayX obj1=new ArrayX(iSize);
        obj1.Accept();
        obj1.Display();

        iRet=obj1.Addition();
        System.out.println("Addition is :"+iRet);
    }
}