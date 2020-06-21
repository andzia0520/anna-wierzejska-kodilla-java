package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ForumStatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.");
    }

    @AfterClass
    public static void afterAllTests() {
        System.out.println("All tests are finished.");
    }

    @Before
    public void beforeEveryTest() {
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Test // postsQty = 0
    public void testCalculateAdvStatisticsCase1() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(15);
        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStatistics forumstatistics = new ForumStatistics();

        //When
        int expectedUsersQty = 5;
        int expectedPostsQty = 0;
        int expectedCommentsQty = 15;
        double expectedAvgPostsCountPerUser = 0;
        double expectedAvgCommentsCountPerUser = 3;
        double expectedAvgCommentsCountPerPost = 0;

        //Then
        Assert.assertEquals(expectedUsersQty, usersNames.size());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty,forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.calculateAdvStatistics());
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.calculateAdvStatistics());
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.calculateAdvStatistics());

    }

}
