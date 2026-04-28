package u3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f40659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f40660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f40661c;

    public j(int i11, long[] jArr, Object[] objArr) {
        this.f40659a = i11;
        this.f40660b = jArr;
        this.f40661c = objArr;
    }

    public final int a(long j9) {
        int i11 = this.f40659a - 1;
        if (i11 != -1) {
            long[] jArr = this.f40660b;
            int i12 = 0;
            if (i11 != 0) {
                while (i12 <= i11) {
                    int i13 = (i12 + i11) >>> 1;
                    long j11 = jArr[i13] - j9;
                    if (j11 < 0) {
                        i12 = i13 + 1;
                    } else {
                        if (j11 <= 0) {
                            return i13;
                        }
                        i11 = i13 - 1;
                    }
                }
                return -(i12 + 1);
            }
            long j12 = jArr[0];
            if (j12 == j9) {
                return 0;
            }
            if (j12 > j9) {
                return -2;
            }
        }
        return -1;
    }

    public final j b(long j9, Object obj) {
        long[] jArr;
        int i11;
        Object[] objArr = this.f40661c;
        int i12 = 0;
        int i13 = 0;
        for (Object obj2 : objArr) {
            if (obj2 != null) {
                i13++;
            }
        }
        int i14 = i13 + 1;
        long[] jArr2 = new long[i14];
        Object[] objArr2 = new Object[i14];
        if (i14 > 1) {
            int i15 = 0;
            while (true) {
                jArr = this.f40660b;
                i11 = this.f40659a;
                if (i12 >= i14 || i15 >= i11) {
                    break;
                }
                long j11 = jArr[i15];
                Object obj3 = objArr[i15];
                if (j11 > j9) {
                    jArr2[i12] = j9;
                    objArr2[i12] = obj;
                    i12++;
                    break;
                }
                if (obj3 != null) {
                    jArr2[i12] = j11;
                    objArr2[i12] = obj3;
                    i12++;
                }
                i15++;
            }
            if (i15 == i11) {
                jArr2[i13] = j9;
                objArr2[i13] = obj;
            } else {
                while (i12 < i14) {
                    long j12 = jArr[i15];
                    Object obj4 = objArr[i15];
                    if (obj4 != null) {
                        jArr2[i12] = j12;
                        objArr2[i12] = obj4;
                        i12++;
                    }
                    i15++;
                }
            }
        } else {
            jArr2[0] = j9;
            objArr2[0] = obj;
        }
        return new j(i14, jArr2, objArr2);
    }
}
