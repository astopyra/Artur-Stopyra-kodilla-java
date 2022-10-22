package com.kodilla.testing.forum.statistics;

import com.kodilla.testing.weather.stub.Temperatures;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticTestSuite {

    @Mock
    private Statistics statisticsMock;
    List<String> names = new ArrayList<>();

    @BeforeEach
    void before(){
        names.add("adam");
        names.add("julia");

        when(statisticsMock.usersNames()).thenReturn(names);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(20);
    }

    @Test
    void testCalculateAdvStatisticsFor0Posts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserPosts = calculateStatistics.averageUserPosts;
        double averPostComments = calculateStatistics.averagePostComments;

        //Then
        assertEquals(0, averUserPosts);
        assertEquals(0, averPostComments);
    }

    @Test
    void testCalculateAdvStatisticsFor1000Posts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserPosts = calculateStatistics.averageUserPosts;
        double averPostComments = calculateStatistics.averagePostComments;

        //Then
        assertEquals(500, averUserPosts);
        assertEquals(0.02, averPostComments);
    }

    @Test
    void testCalculateAdvStatisticsFor0Comments(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserComments = calculateStatistics.averageUserComments;
        double averPostComments = calculateStatistics.averagePostComments;

        //Then
        assertEquals(0, averUserComments);
        assertEquals(0, averPostComments);
    }

    @Test
    void testCalculateAdvStatisticsForMoreCommentsThanPosts(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserComments = calculateStatistics.averageUserComments;
        double averUserPosts = calculateStatistics.averageUserPosts;
        double averPostComments = calculateStatistics.averagePostComments;

        //Then
        assertEquals(10, averUserComments);
        assertEquals(5, averUserPosts);
        assertEquals(2,averPostComments);
    }

    @Test
    void testCalculateAdvStatisticsForMorePostsThanComments(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        when(statisticsMock.postsCount()).thenReturn(40);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserComments = calculateStatistics.averageUserComments;
        double averUserPosts = calculateStatistics.averageUserPosts;
        double averPostComments = calculateStatistics.averagePostComments;

        //Then
        assertEquals(10, averUserComments);
        assertEquals(20, averUserPosts);
        assertEquals(0.5,averPostComments);
    }

    @Test
    void testCalculateAdvStatisticsFor0Users(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> noNames = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(noNames);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserComments = calculateStatistics.averageUserComments;
        double averUserPosts = calculateStatistics.averageUserPosts;

        //Then
        assertEquals(0, averUserComments);
        assertEquals(0, averUserPosts);
    }

    @Test
    void testCalculateAdvStatisticsFor100Users(){
        //Given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        List<String> hundredNames = new ArrayList<>();
        for(int i=1; i<=100; i++){
            hundredNames.add("name " + i);
        }
        when(statisticsMock.usersNames()).thenReturn(hundredNames);

        //When
        calculateStatistics.calculateAdvStatistics(statisticsMock);
        double averUserComments = calculateStatistics.averageUserComments;
        double averUserPosts = calculateStatistics.averageUserPosts;

        //Then
        assertEquals(0.2, averUserComments);
        assertEquals(0.1, averUserPosts);
    }
}
