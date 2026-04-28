package g2;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import z1.h2;
import z4.v0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f18208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f18210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f18211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final v0 f18212e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f18213f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f18214g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v80.b0 f18215h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z5.c f18216i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f18217j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Function1 f18218k;
    public final Function1 l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List f18219m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f18220n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f18221o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f18222p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final h2 f18223q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f18224r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18225s;

    public r(t tVar, int i11, boolean z11, float f11, v0 v0Var, float f12, boolean z12, v80.b0 b0Var, z5.c cVar, int i12, Function1 function1, Function1 function12, List list, int i13, int i14, int i15, h2 h2Var, int i16, int i17) {
        this.f18208a = tVar;
        this.f18209b = i11;
        this.f18210c = z11;
        this.f18211d = f11;
        this.f18212e = v0Var;
        this.f18213f = f12;
        this.f18214g = z12;
        this.f18215h = b0Var;
        this.f18216i = cVar;
        this.f18217j = i12;
        this.f18218k = function1;
        this.l = function12;
        this.f18219m = list;
        this.f18220n = i13;
        this.f18221o = i14;
        this.f18222p = i15;
        this.f18223q = h2Var;
        this.f18224r = i16;
        this.f18225s = i17;
    }

    @Override // z4.v0
    public final void a() {
        this.f18212e.a();
    }

    @Override // z4.v0
    public final int b() {
        return this.f18212e.b();
    }

    @Override // z4.v0
    public final Map c() {
        return this.f18212e.c();
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f18212e.d();
    }

    public final r e(int i11, boolean z11) {
        t tVar;
        int i12;
        if (this.f18214g) {
            return null;
        }
        List list = this.f18219m;
        if (list.isEmpty() || (tVar = this.f18208a) == null) {
            return null;
        }
        int i13 = tVar.f18254g;
        int i14 = this.f18209b - i11;
        if (i14 < 0 || i14 >= i13) {
            return null;
        }
        s sVar = (s) CollectionsKt.O(list);
        s sVar2 = (s) CollectionsKt.W(list);
        if (sVar.f18247w || sVar2.f18247w) {
            return null;
        }
        int i15 = this.f18221o;
        int i16 = this.f18220n;
        h2 h2Var = this.f18223q;
        if (i11 < 0) {
            if (Math.min((b0.z.x(sVar, h2Var) + sVar.f18239o) - i16, (b0.z.x(sVar2, h2Var) + sVar2.f18239o) - i15) <= (-i11)) {
                return null;
            }
        } else if (Math.min(i16 - b0.z.x(sVar, h2Var), i15 - b0.z.x(sVar2, h2Var)) <= i11) {
            return null;
        }
        int size = list.size();
        int i17 = 0;
        while (i17 < size) {
            s sVar3 = (s) list.get(i17);
            sVar3.getClass();
            if (!sVar3.f18247w) {
                long j9 = sVar3.f18244t;
                sVar3.f18244t = (((long) (((int) (j9 & 4294967295L)) + i11)) & 4294967295L) | (((long) ((int) (j9 >> 32))) << 32);
                if (z11) {
                    int size2 = sVar3.f18232g.size();
                    int i18 = 0;
                    while (i18 < size2) {
                        h2.b0 b0VarA = sVar3.f18235j.a(i18, sVar3.f18227b);
                        if (b0VarA != null) {
                            long j11 = b0VarA.l;
                            i12 = i17;
                            b0VarA.l = (((long) (((int) (j11 & 4294967295L)) + i11)) & 4294967295L) | (((long) ((int) (j11 >> 32))) << 32);
                        } else {
                            i12 = i17;
                        }
                        i18++;
                        i17 = i12;
                    }
                }
            }
            i17++;
        }
        return new r(this.f18208a, i14, this.f18210c || i11 > 0, i11, this.f18212e, this.f18213f, this.f18214g, this.f18215h, this.f18216i, this.f18217j, this.f18218k, this.l, this.f18219m, this.f18220n, this.f18221o, this.f18222p, this.f18223q, this.f18224r, this.f18225s);
    }

    public final long f() {
        v0 v0Var = this.f18212e;
        return (((long) v0Var.b()) << 32) | (((long) v0Var.getHeight()) & 4294967295L);
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f18212e.getHeight();
    }
}
