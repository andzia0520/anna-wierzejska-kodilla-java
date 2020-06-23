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

    @Test
    public void testCalculateAdvStatisticsFor0Posts() {
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
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumstatistics.getUsersQty());
        Assert.assertEquals(0, forumstatistics.getPostsQty());
        Assert.assertEquals(15, forumstatistics.getCommentsQty());
        Assert.assertEquals(0, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(3, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(0, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor1000posts() {
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

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumstatistics.getUsersQty());
        Assert.assertEquals(1000, forumstatistics.getPostsQty());
        Assert.assertEquals(1500, forumstatistics.getCommentsQty());
        Assert.assertEquals(200, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(300, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(1.5, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor0Comments() {
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

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumstatistics.getUsersQty());
        Assert.assertEquals(1000, forumstatistics.getPostsQty());
        Assert.assertEquals(0, forumstatistics.getCommentsQty());
        Assert.assertEquals(200, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(0, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(0, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsLessThanPosts() {
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

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumstatistics.getUsersQty());
        Assert.assertEquals(1000, forumstatistics.getPostsQty());
        Assert.assertEquals(50, forumstatistics.getCommentsQty());
        Assert.assertEquals(200, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(10, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(0.05, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsForCommentsMoreThanPosts() {
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

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(5, forumstatistics.getUsersQty());
        Assert.assertEquals(100, forumstatistics.getPostsQty());
        Assert.assertEquals(500, forumstatistics.getCommentsQty());
        Assert.assertEquals(20, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(100, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(5, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor0Users() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersNames = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersNames);
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumstatistics = new ForumStatistics();

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(0, forumstatistics.getUsersQty());
        Assert.assertEquals(1000, forumstatistics.getPostsQty());
        Assert.assertEquals(50, forumstatistics.getCommentsQty());
        Assert.assertEquals(0, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(0, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(0.05, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }

    @Test
    public void testCalculateAdvStatisticsFor100Users() {
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

        //When
        forumstatistics.calculateAdvStatistics(statisticsMock);

        //Then
        Assert.assertEquals(100, forumstatistics.getUsersQty());
        Assert.assertEquals(1000, forumstatistics.getPostsQty());
        Assert.assertEquals(50, forumstatistics.getCommentsQty());
        Assert.assertEquals(10, forumstatistics.getAvgPostsCountPerUser(), 0.01);
        Assert.assertEquals(0.5, forumstatistics.getAvgCommentsCountPerUser(), 0.01);
        Assert.assertEquals(0.05, forumstatistics.getAvgCommentsCountPerPost(), 0.01);
    }
}


