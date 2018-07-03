import org.junit.Assert;
import org.junit.Test;

public class TestPangram {
	Pangrams pangram = new Pangrams();

	@Test
	public void testValidCase() {
		String panRef = "The quick brown fox jumps over the lazy dog";
		Assert.assertTrue(pangram.isPanagram(panRef));
	}

	@Test
	public void testFalseCase() {
		String panRef = "Shikha Shree";
		Assert.assertFalse(pangram.isPanagram(panRef));
	}

	@Test
	public void testEmptyString() {
		String panRef = "";
		Assert.assertFalse(pangram.isPanagram(panRef));
	}

	@Test
	public void testNull() {
		String panRef = null;
		Assert.assertFalse(pangram.isPanagram(panRef));
	}
	
	@Test
	public void testAllNull() {
		Assert.assertFalse(pangram.isPanagram(null));
	}

	@Test
	public void testSpecialCharacters() {
		String panRef = "The quick ;p'[],./;;'';brown fox jumps over the lazy dog";
		Assert.assertTrue(pangram.isPanagram(panRef));
	}

}
