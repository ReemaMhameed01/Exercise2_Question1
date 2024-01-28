package Exe2_Ques1.Exe2_Ques1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	/**
	 * Rigorous Test :-)
	 */
	@Test
	public void exe_2_Partition_A_min() {

		String result = App.NumberToChar(90);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
	@Test
	public void exe_2_Partition_A_min_plus1() {

		String result = App.NumberToChar(91);
		String expected_result="C";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
	@Test
	public void exe_2_Partition_A_max() {

		String result = App.NumberToChar(100);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}

	@Test
	public void exe_2_Partition_A_max_minus_1() {

		String result = App.NumberToChar(99);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
	@Test
	public void exe_2_Partition_A_Nom() {

		String result = App.NumberToChar(50);
		String expected_result="A";
		org.junit.Assert.assertEquals(expected_result,result,0.00001);
	}
}
