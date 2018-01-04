import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.Parameters;

//step 1
@RunWith(value = Parameterized.class)
public class test3 {


    // Step 2: variables to be used in test method of Step 5 
	private int firstRealPart;
	private int firstImaginPart;
    private int inputRealPart;  
    private int inputImaginPart;
    private String jurge;  
    // Step 3: parameterized constructor  
    public test3(int firstRealPart, int firstImaginPart, int inputRealPart,int inputImaginPart,String jurge) {  
        super();  
        this.firstRealPart = firstRealPart;
        this.firstImaginPart = firstImaginPart;
        this.inputRealPart = inputRealPart;  
        this.inputImaginPart = inputImaginPart; 
        this.jurge = jurge;  
    }  
   
    // Step 4: data set of variable values  
    @Parameters  
    public static Collection<Object[]> data() {  
        Object[][] data = new Object[][] {  
                {0,0,0,0,"0+0i"},
                {0,1,1,0,"1+1i"},
                {2147483647,0,1,1,"21474836478+1i"},
                {0,2147483647,1,1,"1+2147483648i"},
                {0.1,0.2,0.3,0.4,"0.4+0.6i"},
        };  
        return Arrays.asList(data);  
    }  
    @Test  
    public void test() {  
        //System.out.println("inputNumber: " + inputNumber1 + "; isEven: " + isEven);  
        Complex complextest = new Complex(firstRealPart,firstImaginPart);  
        // Step 5: use variables in test code
        Complex ab = new Complex(inputRealPart,inputImaginPart);
        String actualResult = complextest.complexAdd(ab).toStringC();  
        System.out.println(actualResult);  
        assertEquals(jurge, actualResult);  
    }  

}
