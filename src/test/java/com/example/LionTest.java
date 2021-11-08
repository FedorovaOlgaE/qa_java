package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    Feline feline;

    @Test
    public void doesFemaleHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самка");
        boolean actual = lion.doesHaveMane();
        boolean expected = false;
        assertEquals(expected, actual);
    }
    @Test
    public void doesMaleHaveMane() throws Exception {
        Lion lion = new Lion(feline, "Самец");
        boolean actual = lion.doesHaveMane();
        boolean expected = true;
        assertEquals(expected, actual);
    }

   @Test(expected = Exception.class)
   public void doesHaveManeException() throws Exception {
       Lion lion = new Lion(feline, "Самец1");
       lion.doesHaveMane();
   }

    @Test
    public void LionGetFood() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        List<String> actualFood = lion.getFood();
        Assert.assertEquals(expectedFood, actualFood);
    }

    @Test
    public void LionGetKittens() throws Exception{
        Lion lion = new Lion(feline, "Самец");
        int expectedKittens = 0;
        int actualKittens = lion.getKittens();
        Assert.assertEquals("Неверное количество", expectedKittens, actualKittens);
    }


}


