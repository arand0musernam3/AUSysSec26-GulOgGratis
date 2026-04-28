package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class eh {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f11394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final eh f11395e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11398c;

    static {
        long jCharAt = 0;
        for (int i11 = 0; i11 < 7; i11++) {
            jCharAt |= (((long) i11) + 1) << ((int) (((long) (" #(+,-0".charAt(i11) - ' ')) * 3));
        }
        f11394d = jCharAt;
        f11395e = new eh(0, -1, -1);
    }

    public eh(int i11, int i12, int i13) {
        this.f11396a = i11;
        this.f11397b = i12;
        this.f11398c = i13;
    }

    public static int e(int i11, int i12, String str) {
        if (i11 == i12) {
            throw zzabo.b(i11 - 1, "missing precision", str);
        }
        int i13 = 0;
        for (int i14 = i11; i14 < i12; i14++) {
            char cCharAt = (char) (str.charAt(i14) - '0');
            if (cCharAt >= '\n') {
                throw zzabo.b(i14, "invalid precision character", str);
            }
            i13 = (i13 * 10) + cCharAt;
            if (i13 > 999999) {
                throw zzabo.a("precision too large", i11, i12, str);
            }
        }
        if (i13 != 0) {
            return i13;
        }
        if (i12 == i11 + 1) {
            return 0;
        }
        throw zzabo.a("invalid precision", i11, i12, str);
    }

    public final boolean a() {
        return this == f11395e;
    }

    public final boolean b(int i11, boolean z11) {
        int i12;
        if (a()) {
            return true;
        }
        int i13 = ~i11;
        int i14 = this.f11396a;
        if ((i13 & i14) != 0) {
            return false;
        }
        if ((!z11 && this.f11398c != -1) || (i14 & 9) == 9 || (i12 = i14 & 96) == 96) {
            return false;
        }
        return i12 == 0 || this.f11397b != -1;
    }

    public final boolean c() {
        return (this.f11396a & 128) != 0;
    }

    public final void d(StringBuilder sb2) {
        if (a()) {
            return;
        }
        int i11 = 0;
        while (true) {
            int i12 = this.f11396a & (-129);
            int i13 = 1 << i11;
            if (i13 > i12) {
                break;
            }
            if ((i12 & i13) != 0) {
                sb2.append(" #(+,-0".charAt(i11));
            }
            i11++;
        }
        int i14 = this.f11397b;
        if (i14 != -1) {
            sb2.append(i14);
        }
        int i15 = this.f11398c;
        if (i15 != -1) {
            sb2.append('.');
            sb2.append(i15);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eh) {
            eh ehVar = (eh) obj;
            if (ehVar.f11396a == this.f11396a && ehVar.f11397b == this.f11397b && ehVar.f11398c == this.f11398c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f11396a * 31) + this.f11397b) * 31) + this.f11398c;
    }
}
