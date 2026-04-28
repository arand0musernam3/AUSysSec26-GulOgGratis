package h7;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h2 {
    public static int a() {
        return 4;
    }

    public static int b() {
        return 128;
    }

    public static int c() {
        return 8;
    }

    public static int d(int i11) {
        if (i11 == 1) {
            return 0;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 4) {
            return 2;
        }
        if (i11 == 8) {
            return 3;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 32) {
            return 5;
        }
        if (i11 == 64) {
            return 6;
        }
        if (i11 == 128) {
            return 7;
        }
        if (i11 == 256) {
            return 8;
        }
        if (i11 == 512) {
            return 9;
        }
        i4.a.f(j4.s.f(i11, "type needs to be >= FIRST and <= LAST, type="));
        return 0;
    }

    public static int e() {
        return 32;
    }

    public static int f() {
        return 2;
    }

    public static int g() {
        return 1;
    }

    public static int h() {
        return 519;
    }

    public static int i() {
        return 16;
    }

    public static int j() {
        return 64;
    }
}
