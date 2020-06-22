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
        int expectedUsersQty = 5;
        int expectedPostsQty = 0;
        int expectedCommentsQty = 15;
        double expectedAvgPostsCountPerUser = 0;
        double expectedAvgCommentsCountPerUser = 3;
        double expectedAvgCommentsCountPerPost = 0;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // postsQty = 1000
    public void testCalculateAdvStatisticsCase2() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(1500);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 5;
        int expectedPostsQty = 1000;
        int expectedCommentsQty = 1500;
        double expectedAvgPostsCountPerUser = 200;
        double expectedAvgCommentsCountPerUser = 300;
        double expectedAvgCommentsCountPerPost = 1.5;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // commentsQty = 0
    public void testCalculateAdvStatisticsCase3() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 5;
        int expectedPostsQty = 1000;
        int expectedCommentsQty = 0;
        double expectedAvgPostsCountPerUser = 200;
        double expectedAvgCommentsCountPerUser = 0;
        double expectedAvgCommentsCountPerPost = 0;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // commentsQty < postsQty
    public void testCalculateAdvStatisticsCase4() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 5;
        int expectedPostsQty = 1000;
        int expectedCommentsQty = 50;
        double expectedAvgPostsCountPerUser = 200;
        double expectedAvgCommentsCountPerUser = 10;
        double expectedAvgCommentsCountPerPost = 0.5;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // commentsQty > postsQty
    public void testCalculateAdvStatisticsCase5() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        usersNames.add("user1");
        usersNames.add("user2");
        usersNames.add("user3");
        usersNames.add("user4");
        usersNames.add("user5");

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(500);
        when(statisticsMock.postsCount()).thenReturn(100);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 5;
        int expectedPostsQty = 100;
        int expectedCommentsQty = 500;
        double expectedAvgPostsCountPerUser = 20;
        double expectedAvgCommentsCountPerUser = 100;
        double expectedAvgCommentsCountPerPost = 5;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // usersQty = 0
    public void testCalculateAdvStatisticsCase6() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 0;
        int expectedPostsQty = 1000;
        int expectedCommentsQty = 50;
        double expectedAvgPostsCountPerUser = 0;
        double expectedAvgCommentsCountPerUser = 0;
        double expectedAvgCommentsCountPerPost = 0.05;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }

    @Test // usersQty = 100
    public void testCalculateAdvStatisticsCase7() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            usersNames.add("user");
        }

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();
        int expectedUsersQty = 100;
        int expectedPostsQty = 1000;
        int expectedCommentsQty = 50;
        double expectedAvgPostsCountPerUser = 10;
        double expectedAvgCommentsCountPerUser = 0.5;
        double expectedAvgCommentsCountPerPost = 0.05;

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(expectedUsersQty, forumstatistics.getUsersQty());
        Assert.assertEquals(expectedPostsQty, forumstatistics.getPostsQty());
        Assert.assertEquals(expectedCommentsQty, forumstatistics.getCommentsQty());
        Assert.assertEquals(expectedAvgPostsCountPerUser, forumstatistics.getAvgPostsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerUser, forumstatistics.getAvgCommentsCountPerUser(), 0.1);
        Assert.assertEquals(expectedAvgCommentsCountPerPost, forumstatistics.getAvgCommentsCountPerPost(), 0.1);
    }
}


