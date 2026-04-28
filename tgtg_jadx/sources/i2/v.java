package i2;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.n0;
import kotlin.jvm.functions.Function1;
import z1.h2;
import z4.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f22908c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f22909d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h2 f22910e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22911f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f22912g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22913h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f22914i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g f22915j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f22916k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f22917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a2.p f22918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final v0 f22919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f22920p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final List f22921q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f22922r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final v80.b0 f22923s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final z5.c f22924t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f22925u;

    public v(List list, int i11, int i12, int i13, h2 h2Var, int i14, int i15, int i16, g gVar, g gVar2, float f11, int i17, boolean z11, a2.p pVar, v0 v0Var, boolean z12, List list2, List list3, v80.b0 b0Var, z5.c cVar, long j9) {
        this.f22906a = list;
        this.f22907b = i11;
        this.f22908c = i12;
        this.f22909d = i13;
        this.f22910e = h2Var;
        this.f22911f = i14;
        this.f22912g = i15;
        this.f22913h = i16;
        this.f22914i = gVar;
        this.f22915j = gVar2;
        this.f22916k = f11;
        this.l = i17;
        this.f22917m = z11;
        this.f22918n = pVar;
        this.f22919o = v0Var;
        this.f22920p = z12;
        this.f22921q = list2;
        this.f22922r = list3;
        this.f22923s = b0Var;
        this.f22924t = cVar;
        this.f22925u = j9;
    }

    @Override // z4.v0
    public final void a() {
        this.f22919o.a();
    }

    @Override // z4.v0
    public final int b() {
        return this.f22919o.b();
    }

    @Override // z4.v0
    public final Map c() {
        return this.f22919o.c();
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f22919o.d();
    }

    public final v e(int i11) {
        int i12;
        int i13 = this.f22907b + this.f22908c;
        if (this.f22920p) {
            return null;
        }
        List list = this.f22906a;
        if (list.isEmpty() || this.f22914i == null || (i12 = this.l - i11) < 0 || i12 >= i13) {
            return null;
        }
        float f11 = this.f22916k - (i13 != 0 ? i11 / i13 : 0.0f);
        if (this.f22915j == null || f11 >= 0.5f || f11 <= -0.5f) {
            return null;
        }
        g gVar = (g) CollectionsKt.O(list);
        g gVar2 = (g) CollectionsKt.W(list);
        int i14 = this.f22912g;
        int i15 = this.f22911f;
        if (i11 < 0) {
            if (Math.min((gVar.f22855j + i13) - i15, (gVar2.f22855j + i13) - i14) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i15 - gVar.f22855j, i14 - gVar2.f22855j) <= i11) {
            return null;
        }
        int size = list.size();
        for (int i16 = 0; i16 < size; i16++) {
            ((g) list.get(i16)).a(i11);
        }
        List list2 = this.f22921q;
        int size2 = list2.size();
        for (int i17 = 0; i17 < size2; i17++) {
            ((g) list2.get(i17)).a(i11);
        }
        List list3 = this.f22922r;
        int size3 = list3.size();
        for (int i18 = 0; i18 < size3; i18++) {
            ((g) list3.get(i18)).a(i11);
        }
        return new v(this.f22906a, this.f22907b, this.f22908c, this.f22909d, this.f22910e, this.f22911f, this.f22912g, this.f22913h, this.f22914i, this.f22915j, f11, i12, this.f22917m || i11 > 0, this.f22918n, this.f22919o, this.f22920p, this.f22921q, this.f22922r, this.f22923s, this.f22924t, this.f22925u);
    }

    public final long f() {
        v0 v0Var = this.f22919o;
        return (((long) v0Var.b()) << 32) | (((long) v0Var.getHeight()) & 4294967295L);
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f22919o.getHeight();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public v(n0 n0Var, int i11, int i12, int i13, h2 h2Var, int i14, int i15, int i16, a2.p pVar, v0 v0Var, v80.b0 b0Var, z5.c cVar, long j9) {
        n0 n0Var2 = n0.f26529a;
        this(n0Var, i11, i12, i13, h2Var, i14, i15, i16, null, null, 0.0f, 0, false, pVar, v0Var, false, n0Var2, n0Var2, b0Var, cVar, j9);
    }
}
