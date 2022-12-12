
class GenericMethod
{
    public static <T> void Display(T Arr[])
    {
        for( int i=0; i<Arr.length; i++)
        {
            System.out.println(Arr[i]);
        }
    }
    public static void main(String arg[])
    {
        Integer iArr[] = {10,20,30,40};
        Display(iArr);

        Character cArr[] = {'a','b','c','d'};
        Display(cArr);

        Float fArr[] = {10.2f,20.4f,30.0f,40.5f};
        Display(fArr);
    }
}