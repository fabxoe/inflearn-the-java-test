package me.fabxoe.inflearnthejavatest;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.function.Supplier;

import static javax.swing.DropMode.ON;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기 fast")
    @Tag("fast")
    void create_new_study() {
        Study actual = new Study(100);
        assertThat(actual.getLimit()).isGreaterThan(0);
    }

    @Test
    @DisplayName("스터디 만들기 slow")
    @Tag("slow")
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