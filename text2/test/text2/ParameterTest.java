package text2;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class ParameterTest {
	int expected = 0;
	int input1 = 0 ;
	int input2 = 0;
	int input3 = 0;
@Parameters
public static Collection<Object[] > t(){
	return Arrays.asList(new Object[][]{
		{0,3,1,2},
		{0,4,2,2},
		{2,2,2,1},
		{3,1,1,1},
		{4,3,4,5},
		{1,6,8,7}
	});
}


public ParameterTest(int expected,int input1,int input2,int input3){
	this.expected = expected;
	this.input1 = input1;
	this.input2 = input2;
	this.input3 = input3;
}
@Test
public void test1(){
	assertEquals(expected, triangle.text1(input1,input2,input3));
}
}
