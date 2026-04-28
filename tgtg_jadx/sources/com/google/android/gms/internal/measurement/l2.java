package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f11584a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11585b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f11586c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11587d;

    public l2(n0 n0Var, String str, Object[] objArr) {
        this.f11584a = n0Var;
        this.f11585b = str;
        this.f11586c = objArr;
        char cCharAt = str.charAt(0);
        if (cCharAt < 55296) {
            this.f11587d = cCharAt;
            return;
        }
        int i11 = cCharAt & 8191;
        int i12 = 1;
        int i13 = 13;
        while (true) {
            int i14 = i12 + 1;
            char cCharAt2 = str.charAt(i12);
            if (cCharAt2 < 55296) {
                this.f11587d = i11 | (cCharAt2 << i13);
                return;
            } else {
                i11 |= (cCharAt2 & 8191) << i13;
                i13 += 13;
                i12 = i14;
            }
        }
    }

    public final int a() {
        int i11 = this.f11587d;
        if ((i11 & 1) != 0) {
            return 1;
        }
        return (i11 & 4) == 4 ? 3 : 2;
    }
}
