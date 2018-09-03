import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sandeep.day7.MagicDate;

class MagicDateTest {

	@Test
	void testCheckMagic() {
		assertEquals(true, MagicDate.checkMagic(24,4,96));
	}

}
