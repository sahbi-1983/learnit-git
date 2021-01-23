package fr.adneom.testutils;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fr.adneom.utils.PartitionUtil;
              
public class PartitionTest {
	List<Integer> inputList = null;
	List<Integer> emptytList = null;
	List<List<Integer>> listeAttendue = null;
	PartitionUtil l = null;
	@Before
	public void setUp() throws Exception {
		inputList = new ArrayList<>();
		for (int i = 1; i < 6; i++) {
			inputList.add(i);
		}
		emptytList = new ArrayList<> ();
		listeAttendue = new ArrayList<List<Integer>> ();
		l = new PartitionUtil();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testListeCaseNegativeSizePartition() {
		listeAttendue.add(inputList);
		assertEquals(listeAttendue, l.partition(inputList, -2));
	}
	@Test
	public void testListeCaseEmpty() {
		assertEquals(listeAttendue, l.partition(emptytList, 2));
	}
	@Test
	public void testListeWithRightSizePartition() {
		listeAttendue.add((Arrays.asList(1,2)));
	    listeAttendue.add(Arrays.asList(3,4));
	    listeAttendue.add(Arrays.asList(5));
	    assertNotNull(l.partition(inputList, 2));
		assertEquals(listeAttendue, l.partition(inputList, 2));
	}
	

}
