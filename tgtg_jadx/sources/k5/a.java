package k5;

import u70.b0;
import u70.c0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f25955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f25956b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f25957c;

    static {
        b0 b0Var = c0.f40833b;
        f25955a = (((long) 1023) << 50) ^ (-1);
        f25956b = (-1) ^ (((long) 33554431) << 25);
        long j9 = 33554431;
        f25957c = j9 | (((long) Math.min(0, 1023)) << 50) | (j9 << 25);
    }
}
