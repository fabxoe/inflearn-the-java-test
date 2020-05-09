package me.fabxoe.inflearnthejavatest;

import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;
import java.time.Duration;
import java.util.function.Supplier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class StudyTest {

    @Test
    @DisplayName("스터디 만들기")
    void create_new_study() {
        Study actual = new Study(10);
        assertThat(actual.getLimit()).isGreaterThan(0);

        IllegalArgumentException illegalArgumentException = assertThrows(IllegalArgumentException.class, () -> new Study(-10));
        assertEquals("limit은 0보다 커야 한다.", illegalArgumentException.getMessage());
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
                new Study(10);
                Thread.sleep(300);
                // TODO Preemptively는 ThreadLocal에서 사용시 문제가 생길 수 있다. 스프링 트랜잭션 다른 스레드와 공유가 안되는데. 테스트에서 예상치 못한 문제가 발생할 수 있다.
        });
//        Study study = new Study(-10);
//        assertAll(
//                () -> assertNotNull(study),
//                () -> assertEquals(StudyStatus.DRAFT, study.getStatus(),
//                        () -> "스터디를 처음 만들면 상태값이 " + StudyStatus.DRAFT + "상태다."),
//                () -> assertTrue(study.getLimit() > 0, ()->"스터디 최대 참석가능 인원은 0보다 커야 한다.")
//        );
//        assertNotNull(study);
//        System.out.println("create");

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