package com.sippitechnologies.ktsforandroid

import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.assertEquals


/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class ExampleUnitTest {

//Before All is used like static class in Java or object class in Kotlin
    //Applicable in Global scope and used for common tasks on all test available

    @BeforeAll
    fun beforeAll()
    {

    }


    /* AfterAll is opposite to BeforeAll is used to release all resources define in Before all like data
    base connections etc
    * */
    @AfterAll
    fun afterAll()
    {

    }

    /* BeforeEach is Run before every test and use for configuration before and after test
    * */
    @BeforeEach
    fun beoreEach()
    {

    }

    /*AfterEach is run after every test to release resources consumed by test
    * */
    @AfterEach
    fun aferEach()
    {

    }

    /* TestInfo is object of JUNIT5 which contains special information regarding speciefic  test

    * */
    @BeforeEach
    fun beoreEach1(testInfo:TestInfo)
    {
            testInfo.displayName
            testInfo.tags
    }
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun isValidStringLength()
    {
        val resultLength = "ABCD".length
        val expected=4
        assertEquals(expected,resultLength)
    }

}
