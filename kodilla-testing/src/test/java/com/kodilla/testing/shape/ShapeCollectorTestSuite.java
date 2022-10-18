package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import com.kodilla.testing.shape.ShapeCollector;


@DisplayName("ShapeCollector Test Suite")
public class ShapeCollectorTestSuite {

        @Test
        void testGetFigure(){
            //Given
            Shape shape = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shape);

            // When
            Shape retrievedShape = new Circle();
            retrievedShape = shapeCollector.getFigure(0);

            //Then
            Assertions.assertEquals(shape, retrievedShape);
        }

        @Test
        void testRemoveShapeNotExisting(){
            //Given
            Shape shape = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertFalse(result);
        }

        @Test
        void testRemoveShape(){
            //Given
            Shape shape = new Circle();
            ShapeCollector shapeCollector = new ShapeCollector();
            shapeCollector.addFigure(shape);

            //When
            boolean result = shapeCollector.removeFigure(shape);

            //Then
            Assertions.assertTrue(result);

        }

        @Test
        void testGetNoExistingFigure(){
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();

            //When
            Shape retrieveShape = shapeCollector.getFigure(5);
            Shape retrieveShape2 = shapeCollector.getFigure(-1);


            //Then
            Assertions.assertNull(retrieveShape);
            Assertions.assertNull(retrieveShape);

        }
}
