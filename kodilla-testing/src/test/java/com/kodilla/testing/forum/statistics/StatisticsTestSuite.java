package com.kodilla.testing.forum.statistics;
import org.junit.*;
import java.util.ArrayList;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    private static int testCounter = 0;

    @BeforeClass
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests.\n");
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
    //postsNumber = 0
    public void testCaseCalculateAdvStatistics1(){
        System.out.println("Assumption: Number of posts = 0.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 23; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //postsNumber = 1000
    public void testCaseCalculateAdvStatistics2(){
        System.out.println("Assumption: Number of posts = 1000.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 37; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.commentsCount()).thenReturn(2753);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(27.02, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(74.40, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(2.75, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //commentsNumber = 0
    public void testCaseCalculateAdvStatistics3(){
        System.out.println("Assumption: Number of comments = 0.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 63; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(342);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(5.42, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //commentsNumber < postsNumber
    public void testCaseCalculateAdvStatistics4(){
        System.out.println("Assumption: Number of comments < number of posts.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 28; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(248);
        when(statisticsMock.commentsCount()).thenReturn(117);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(8.86, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(4.18, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(0.47, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //commentsNumber > postsNumber
    public void testCaseCalculateAdvStatistics5(){
        System.out.println("Assumption: Number of comments > number of posts.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 17; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(212);
        when(statisticsMock.commentsCount()).thenReturn(287);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(12.47, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(16.88, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(1.35, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //usersNumber = 0
    public void testCaseCalculateAdvStatistics6(){
        System.out.println("Assumption: Number of users = 0.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();

        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(0);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(0, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(0, forumStatistics.avgCommentsPerPost, 1);
    }
    @Test
    //usersNumber = 100
    public void testCaseCalculateAdvStatistics7(){
        System.out.println("Assumption: Number of users = 100.\n");
        //Given
        Statistics statisticsMock = mock(Statistics.class);

        ArrayList<String> usersList = new ArrayList<>();
        String user = "User no. ";
        for(int i = 1; i <= 100; i++) {
            user = user + i;
            usersList.add(user);
        }
        when(statisticsMock.usersNames()).thenReturn(usersList);
        when(statisticsMock.postsCount()).thenReturn(1346);
        when(statisticsMock.commentsCount()).thenReturn(2334);
        //When
        ForumStatistics forumStatistics = new ForumStatistics();
        forumStatistics.calculateAdvStatistics(statisticsMock);
        forumStatistics.showStatistics();
        //Then
        Assert.assertEquals(13.46, forumStatistics.avgPostsPerUser, 1);
        Assert.assertEquals(23.34, forumStatistics.avgCommentsPerUser, 1);
        Assert.assertEquals(1.73, forumStatistics.avgCommentsPerPost, 1);
    }
}