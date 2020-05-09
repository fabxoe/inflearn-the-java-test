package me.fabxoe.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {
        String test_env = System.getenv("TEST_ENV");
        System.out.println(test_env);

//        assumeTrue("LOCAL".equalsIgnoreCase(test_env));

        assumingThat("LOCAL".equalsIgnoreCase(test_env), () -> {
            System.out.println("local");
            Study actual = new Study(100);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });

        assumingThat("sungmin".equalsIgnoreCase(test_env), () -> {
            System.out.println("sungmin");
            Study actual = new Study(10);
            assertThat(actual.getLimit()).isGreaterThan(0);
        });


    }

    @Test
    @DisplayName("스터디 만들기2")
    void create_new_study_again() {
        System.out.println("create1");
    }

    @BeforeAll
    static void beforeAll() {
        System.out.println("before all");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("after all");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("before each");
    }

    @AfterEach
    void afterEach() {
        System.out.println("after each");
    }
}