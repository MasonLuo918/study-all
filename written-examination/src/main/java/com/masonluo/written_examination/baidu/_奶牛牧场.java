package com.masonluo.written_examination.baidu;

import java.util.List;

/**
 * @author Masonluo
 * @date 2020-09-03 21:41
 */
public class _奶牛牧场 {

    public static class Region {
        int start;

        int end;

        public Region(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean intersect(Region other) {
            return end >= other.start && start <= other.end;
        }
    }

    public static void solution(int cowNum, int n, List<Region[]> regions) {

    }
}
