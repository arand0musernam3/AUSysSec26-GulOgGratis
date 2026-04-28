package org.bouncycastle.pqc.crypto.bike;

import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes3.dex */
public class BIKEParameters implements KEMParameters {
    public static final BIKEParameters bike128 = new BIKEParameters("bike128", 12323, 142, 134, 256, 5, 3, 128);
    public static final BIKEParameters bike192 = new BIKEParameters("bike192", 24659, 206, 199, 256, 5, 3, BERTags.PRIVATE);
    public static final BIKEParameters bike256 = new BIKEParameters("bike256", 40973, 274, 264, 256, 5, 3, 256);
    private BIKEEngine bikeEngine;
    private final int defaultKeySize;
    private int l;
    private String name;
    private int nbIter;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f33465r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33466t;
    private int tau;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f33467w;

    private BIKEParameters(String str, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        this.name = str;
        this.f33465r = i11;
        this.f33467w = i12;
        this.f33466t = i13;
        this.l = i14;
        this.nbIter = i15;
        this.tau = i16;
        this.defaultKeySize = i17;
        this.bikeEngine = new BIKEEngine(i11, i12, i13, i14, i15, i16);
    }

    public BIKEEngine getEngine() {
        return this.bikeEngine;
    }

    public int getL() {
        return this.l;
    }

    public int getLByte() {
        return this.l / 8;
    }

    public String getName() {
        return this.name;
    }

    public int getNbIter() {
        return this.nbIter;
    }

    public int getR() {
        return this.f33465r;
    }

    public int getRByte() {
        return (this.f33465r + 7) / 8;
    }

    public int getSessionKeySize() {
        return this.defaultKeySize;
    }

    public int getT() {
        return this.f33466t;
    }

    public int getTau() {
        return this.tau;
    }

    public int getW() {
        return this.f33467w;
    }
}
