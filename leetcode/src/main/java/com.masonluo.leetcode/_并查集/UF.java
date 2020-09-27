package com.masonluo.leetcode._并查集;

/**
 * @author Masonluo
 * @date 2020-09-27 10:00
 */
public class UF {

    private int count;

    private int[] parent;

    private int[] size;

    public UF(int n) {
        this.count = n;
        parent = new int[n];
        size = new int[n];
        for (int i = 0; i < n; i++) {
            parent[i] = i;
            size[i] = 1;
        }
    }

    public void union(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        if (rootP == rootQ) {
            return;
        }
        if (size[p] > size[q]) {
            parent[rootQ] = p;
            size[rootP] += size[rootQ];
        } else {
            parent[rootP] = rootQ;
            size[rootQ] += size[rootP];
        }
        count--;
    }

    public boolean connected(int p, int q) {
        int rootP = find(p);
        int rootQ = find(q);
        return rootP == rootQ;
    }

    public int count() {
        return 0;
    }

    private int find(int x) {
        while (parent[x] != x) {
            x = parent[parent[x]];
        }
        return x;
    }
}
