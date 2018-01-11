package com.kodilla.testing.shape;
import org.junit.*;

public class ShapeCollectorTestSuite {
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
    public void testCaseAddFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(5);
        //When
        collector.addFigure(circle);
        //Then
        Assert.assertEquals(circle, collector.getFigure(0));
    }
    @Test
    public void testCaseRemoveFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Square square = new Square(5);
        collector.addFigure(square);
        //When
        boolean result = collector.removeFigure(square);
        collector.removeFigure(square);
        //Then
        Assert.assertTrue(result);
        Assert.assertEquals(false, collector.removeFigure(square));
    }
    @Test
    public void testCaseGetFigure() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Triangle triangle = new Triangle(5,7);
        collector.addFigure(triangle);
        //When
        Shape tempShape = collector.getFigure(0);
        //Then
        Assert.assertEquals(triangle, tempShape);
    }
    @Test
    public void testCaseShowFigures() {
        //Given
        ShapeCollector collector = new ShapeCollector();
        Circle circle = new Circle(6);
        collector.addFigure(circle);
        //When
        collector.showFigures();
        //Then
        Assert.assertEquals(circle, collector.getFigure(0));
    }
}