package com;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class GameServiceTest {
	private GameService gs;
	@BeforeEach
	public void initialize() {
		gs = new GameService();
	}
	
	@AfterEach
	public void destroy() {
		gs = null;
	}
	@Test
	void testGameService() {
		assertNotNull(gs.viewAll());
	}

	@Test
	void checkIfEmpty() {
		assertFalse(gs.viewAll().isEmpty());
	}
	@Test
	void checkIfSize() {
		assertEquals(5, gs.viewAll().size());
	}

	@ParameterizedTest
	@MethodSource("data")
	void testAuthorSearch(String result, String author) {
		assertEquals(result, gs.authorSearch(author));
	}
	public static Collection data() {
		return Arrays.asList(new Object[][] {{"FreshFood", "Ram"}, {"SnowBird", "Danny"}, {"Batsman", "Kate"}, {"Pokiman", "Steeve"}, {"NOT FOUND", null}});
	}
}
