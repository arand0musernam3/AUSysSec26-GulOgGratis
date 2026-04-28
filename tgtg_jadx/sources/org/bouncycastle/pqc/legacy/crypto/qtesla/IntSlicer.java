package org.bouncycastle.pqc.legacy.crypto.qtesla;

/* JADX INFO: loaded from: classes3.dex */
final class IntSlicer {
    private int base;
    private final int[] values;

    public IntSlicer(int[] iArr, int i11) {
        this.values = iArr;
        this.base = i11;
    }

    public final int at(int i11, long j9) {
        int[] iArr = this.values;
        int i12 = this.base + i11;
        int i13 = (int) j9;
        iArr[i12] = i13;
        return i13;
    }

    public final IntSlicer copy() {
        return new IntSlicer(this.values, this.base);
    }

    public final IntSlicer from(int i11) {
        return new IntSlicer(this.values, this.base + i11);
    }

    public final void incBase(int i11) {
        this.base += i11;
    }

    public final int at(int i11, int i12) {
        this.values[this.base + i11] = i12;
        return i12;
    }

    public final int at(int i11) {
        return this.values[this.base + i11];
    }
}
