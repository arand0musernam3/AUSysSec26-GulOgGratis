package f2;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import z1.h2;
import z4.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f17182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f17184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f17185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f17186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f17187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v80.b0 f17189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z5.c f17190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f17191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f17192k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f17193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f17194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f17195o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h2 f17196p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f17197q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f17198r;

    public s(t tVar, int i11, boolean z11, float f11, v0 v0Var, float f12, boolean z12, v80.b0 b0Var, z5.c cVar, long j9, List list, int i12, int i13, int i14, boolean z13, h2 h2Var, int i15, int i16) {
        this.f17182a = tVar;
        this.f17183b = i11;
        this.f17184c = z11;
        this.f17185d = f11;
        this.f17186e = v0Var;
        this.f17187f = f12;
        this.f17188g = z12;
        this.f17189h = b0Var;
        this.f17190i = cVar;
        this.f17191j = j9;
        this.f17192k = list;
        this.l = i12;
        this.f17193m = i13;
        this.f17194n = i14;
        this.f17195o = z13;
        this.f17196p = h2Var;
        this.f17197q = i15;
        this.f17198r = i16;
    }

    @Override // z4.v0
    public final void a() {
        this.f17186e.a();
    }

    @Override // z4.v0
    public final int b() {
        return this.f17186e.b();
    }

    @Override // z4.v0
    public final Map c() {
        return this.f17186e.c();
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f17186e.d();
    }

    public final s e(int i11, boolean z11) {
        t tVar;
        int i12;
        int i13;
        int i14;
        if (this.f17188g) {
            return null;
        }
        List list = this.f17192k;
        if (list.isEmpty() || (tVar = this.f17182a) == null) {
            return null;
        }
        int i15 = tVar.f17215r;
        int i16 = this.f17183b - i11;
        if (i16 < 0 || i16 >= i15) {
            return null;
        }
        t tVar2 = (t) CollectionsKt.O(list);
        t tVar3 = (t) CollectionsKt.W(list);
        if (tVar2.f17217t || tVar3.f17217t) {
            return null;
        }
        int i17 = tVar2.f17213p;
        int i18 = this.f17193m;
        int i19 = this.l;
        if (i11 < 0) {
            if (Math.min((i17 + tVar2.f17215r) - i19, (tVar3.f17213p + tVar3.f17215r) - i18) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i19 - i17, i18 - tVar3.f17213p) <= i11) {
            return null;
        }
        int size = list.size();
        int i21 = 0;
        while (i21 < size) {
            t tVar4 = (t) list.get(i21);
            boolean z12 = tVar4.f17201c;
            int[] iArr = tVar4.f17221x;
            if (!tVar4.f17217t) {
                tVar4.f17213p += i11;
                int length = iArr.length;
                for (int i22 = 0; i22 < length; i22++) {
                    int i23 = i22 & 1;
                    if ((z12 && i23 != 0) || (!z12 && i23 == 0)) {
                        iArr[i22] = iArr[i22] + i11;
                    }
                }
                if (z11) {
                    int size2 = tVar4.f17200b.size();
                    int i24 = 0;
                    while (i24 < size2) {
                        h2.b0 b0VarA = tVar4.f17211n.a(i24, tVar4.l);
                        if (b0VarA != null) {
                            long j9 = b0VarA.l;
                            if (z12) {
                                i12 = i21;
                                i13 = (int) (j9 >> 32);
                                i14 = ((int) (j9 & 4294967295L)) + i11;
                            } else {
                                i12 = i21;
                                i13 = ((int) (j9 >> 32)) + i11;
                                i14 = (int) (j9 & 4294967295L);
                            }
                            b0VarA.l = (((long) i14) & 4294967295L) | (((long) i13) << 32);
                        } else {
                            i12 = i21;
                        }
                        i24++;
                        i21 = i12;
                    }
                }
            }
            i21++;
        }
        return new s(this.f17182a, i16, this.f17184c || i11 > 0, i11, this.f17186e, this.f17187f, this.f17188g, this.f17189h, this.f17190i, this.f17191j, this.f17192k, this.l, this.f17193m, this.f17194n, this.f17195o, this.f17196p, this.f17197q, this.f17198r);
    }

    public final long f() {
        v0 v0Var = this.f17186e;
        return (((long) v0Var.b()) << 32) | (((long) v0Var.getHeight()) & 4294967295L);
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f17186e.getHeight();
    }
}
