package k30;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f25870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f25872c;

    public a(int i11) {
        ex.i.m(i11, "initialCapacity");
        this.f25870a = new Object[i11];
        this.f25871b = 0;
    }

    public static int d(int i11, int i12) {
        if (i12 < 0) {
            i4.a.f("cannot store more than Integer.MAX_VALUE elements");
            return 0;
        }
        if (i12 <= i11) {
            return i11;
        }
        int iHighestOneBit = i11 + (i11 >> 1) + 1;
        if (iHighestOneBit < i12) {
            iHighestOneBit = Integer.highestOneBit(i12 - 1) << 1;
        }
        if (iHighestOneBit < 0) {
            return Integer.MAX_VALUE;
        }
        return iHighestOneBit;
    }

    public final void a(Object obj) {
        obj.getClass();
        c(1);
        Object[] objArr = this.f25870a;
        int i11 = this.f25871b;
        this.f25871b = i11 + 1;
        objArr[i11] = obj;
    }

    public final void b(Object... objArr) {
        int length = objArr.length;
        m0.c.T(length, objArr);
        c(length);
        System.arraycopy(objArr, 0, this.f25870a, this.f25871b, length);
        this.f25871b += length;
    }

    public final void c(int i11) {
        Object[] objArr = this.f25870a;
        int iD = d(objArr.length, this.f25871b + i11);
        if (iD > objArr.length || this.f25872c) {
            this.f25870a = Arrays.copyOf(this.f25870a, iD);
            this.f25872c = false;
        }
    }
}
