package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    @Mock
    Feline feline;

    @Test
    public void catGetFoodTest() throws Exception{
        Cat cat = new Cat(this.feline);
        List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        List<String> actualFood = cat.getFood();
        Assert.assertEquals("Не правильный список еды", expectedFood, actualFood);

    }

    @Test
    public void catGetSoundTest(){
        Cat cat = new Cat(this.feline);
        String expectedSound = "Мяу";
        String actualSound = cat.getSound();
        Assert.assertEquals("Не правильный звук", expectedSound, actualSound);
    }
}
