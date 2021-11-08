package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = spy(new Feline());
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actual = feline.eatMeat();
        List<String> expected = Arrays.asList("Животные", "Птицы", "Рыба");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void GetFamilyTest() {
        Feline feline = new Feline();
        String expectedFamily ="Кошачьи";
        String actualFamily = feline.getFamily();
        Assert.assertEquals("Семья указана не верно", expectedFamily,actualFamily);
    }
    @Test
    public void FelineGetKittens() {
        Feline feline = new Feline();
        int expectedKittens = 1;
        int actualKittens = feline.getKittens();
        Assert.assertEquals("Неверное количество", expectedKittens, actualKittens);
    }

}
