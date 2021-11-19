import static org.junit.jupiter.api.Assertions.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserValidater {

	@Test
	public void givenFirstName() {
		UserValidater validater = new UserValidater();
		boolean result = validater.validateFirstName("Nikitha");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenEmailAddress() {
		UserValidater validater = new UserValidater();
		boolean result = validater.validateEmail("nikithachimmula@gmail.com");
		Assert.assertEquals(true, result);
	}

	@Test
	public void givenLastName() {
		UserValidater userValidator = new UserValidater();
		boolean result = userValidator.validateLastName("Chimmula");
		Assert.assertFalse(result);
	}

}
