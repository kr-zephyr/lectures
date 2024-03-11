package com.sz21c.lecture.java.steam;

import com.sz21c.lecture.java.steam.model.Score;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Stream {

    @Test
    public void streamFilter() {
        List<Score> scoreList = new ArrayList<>();
        scoreList.add(new Score("A", 100));
        scoreList.add(new Score("B", 90));
        scoreList.add(new Score("C", 80));
        scoreList.add(new Score("D", 70));

        List<Score> over80List = scoreList.stream()
                .filter(score -> score.getPoint() > 80)
                .toList();
        Assert.assertEquals(2, over80List.size());

        List<Score> listValueAAndB = scoreList.stream()
                .filter(score -> score.getName().equals("A"))
                .toList();
        Assert.assertEquals(1, listValueAAndB.size());
    }
}
