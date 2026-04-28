package org.bouncycastle.pqc.legacy.crypto.mceliece;

import org.bouncycastle.pqc.legacy.math.linearalgebra.GF2Matrix;

/* JADX INFO: loaded from: classes3.dex */
public class McEliecePublicKeyParameters extends McElieceKeyParameters {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GF2Matrix f33712g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f33713n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f33714t;

    public McEliecePublicKeyParameters(int i11, int i12, GF2Matrix gF2Matrix) {
        super(false, null);
        this.f33713n = i11;
        this.f33714t = i12;
        this.f33712g = new GF2Matrix(gF2Matrix);
    }

    public GF2Matrix getG() {
        return this.f33712g;
    }

    public int getK() {
        return this.f33712g.getNumRows();
    }

    public int getN() {
        return this.f33713n;
    }

    public int getT() {
        return this.f33714t;
    }
}
