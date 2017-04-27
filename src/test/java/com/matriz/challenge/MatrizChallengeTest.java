package com.matriz.challenge;

import java.io.File;
import java.io.FileReader;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MatrizChallengeTest {

	protected FileReader inputs;
	protected MatrizChallenge challenge;

	private GivenSteps given;
	private WhenSteps when;
	private ThenSteps then;

	@Before
	public void init() {
		this.given = new GivenSteps();
		this.when = new WhenSteps();
		this.then = new ThenSteps();
	}
	
	@Test
	public void test() throws Exception {
		given.iHaveTheInputs();
		String[][] matriz = when.iExecuteChallenge();
		then.theResultShouldBe(matriz, "Azul");
	}

	class GivenSteps {
		void iHaveTheInputs() throws Exception {
			inputs = new FileReader(new File("src/main/resources/inputs"));
			challenge = MatrizChallenge.challenge(inputs);
		}
	}

	class WhenSteps {
		String[][] iExecuteChallenge() throws Exception {
			return challenge.execute();
		}
	}

	class ThenSteps {
		public void theResultShouldBe(String[][] matriz, String color) throws Exception {
			Assert.assertEquals(matriz[1][1], color);
		}
	}

}
