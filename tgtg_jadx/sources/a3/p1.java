package a3;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z4.z f511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i0 f513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d2 f514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1.i0 f515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ArrayList f516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f519k;

    public p1(long j9, long j11, z4.z zVar, boolean z11, i0 i0Var, d2 d2Var) {
        this.f509a = j9;
        this.f510b = j11;
        this.f511c = zVar;
        this.f512d = z11;
        this.f513e = i0Var;
        this.f514f = d2Var;
        int i11 = q1.t.f35829a;
        this.f515g = new q1.i0(6);
        this.f516h = new ArrayList();
        this.f517i = -1;
        this.f518j = -1;
        this.f519k = -1;
    }

    public final int a(int i11, l lVar, l lVar2) {
        if (i11 == -1) {
            int i12 = o1.$EnumSwitchMapping$0[s1.b(lVar, lVar2).ordinal()];
            if (i12 == 1) {
                return this.f519k - 1;
            }
            if (i12 == 2) {
                return this.f519k;
            }
            if (i12 != 3) {
                e40.a.f();
                return 0;
            }
        }
        return i11;
    }
}
