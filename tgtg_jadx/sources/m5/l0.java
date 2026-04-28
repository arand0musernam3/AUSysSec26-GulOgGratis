package m5;

import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.newhope.NewHope;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x5.o f29575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f29576b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5.r f29577c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q5.n f29578d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q5.o f29579e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q5.i f29580f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f29581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f29582h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5.a f29583i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x5.p f29584j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t5.c f29585k;
    public final long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final x5.l f29586m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i4.u0 f29587n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a0 f29588o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k4.e f29589p;

    public l0(long j9, long j11, q5.r rVar, q5.n nVar, q5.o oVar, q5.i iVar, String str, long j12, x5.a aVar, x5.p pVar, t5.c cVar, long j13, x5.l lVar, i4.u0 u0Var, int i11) {
        this((i11 & 1) != 0 ? i4.v.f23315h : j9, (i11 & 2) != 0 ? z5.o.f47289c : j11, (i11 & 4) != 0 ? null : rVar, (i11 & 8) != 0 ? null : nVar, (i11 & 16) != 0 ? null : oVar, (i11 & 32) != 0 ? null : iVar, (i11 & 64) != 0 ? null : str, (i11 & 128) != 0 ? z5.o.f47289c : j12, (i11 & 256) != 0 ? null : aVar, (i11 & 512) != 0 ? null : pVar, (i11 & 1024) != 0 ? null : cVar, (i11 & NewHope.SENDB_BYTES) != 0 ? i4.v.f23315h : j13, (i11 & 4096) != 0 ? null : lVar, (i11 & 8192) != 0 ? null : u0Var, (a0) null);
    }

    public final boolean a(l0 l0Var) {
        if (this == l0Var) {
            return true;
        }
        return z5.o.a(this.f29576b, l0Var.f29576b) && Intrinsics.areEqual(this.f29577c, l0Var.f29577c) && Intrinsics.areEqual(this.f29578d, l0Var.f29578d) && Intrinsics.areEqual(this.f29579e, l0Var.f29579e) && Intrinsics.areEqual(this.f29580f, l0Var.f29580f) && Intrinsics.areEqual(this.f29581g, l0Var.f29581g) && z5.o.a(this.f29582h, l0Var.f29582h) && Intrinsics.areEqual(this.f29583i, l0Var.f29583i) && Intrinsics.areEqual(this.f29584j, l0Var.f29584j) && Intrinsics.areEqual(this.f29585k, l0Var.f29585k) && i4.v.c(this.l, l0Var.l) && Intrinsics.areEqual(this.f29588o, l0Var.f29588o);
    }

    public final boolean b(l0 l0Var) {
        return Intrinsics.areEqual(this.f29575a, l0Var.f29575a) && Intrinsics.areEqual(this.f29586m, l0Var.f29586m) && Intrinsics.areEqual(this.f29587n, l0Var.f29587n) && Intrinsics.areEqual(this.f29589p, l0Var.f29589p);
    }

    public final l0 c(l0 l0Var) {
        if (l0Var == null) {
            return this;
        }
        x5.o oVar = l0Var.f29575a;
        return m0.a(this, oVar.b(), oVar.c(), oVar.a(), l0Var.f29576b, l0Var.f29577c, l0Var.f29578d, l0Var.f29579e, l0Var.f29580f, l0Var.f29581g, l0Var.f29582h, l0Var.f29583i, l0Var.f29584j, l0Var.f29585k, l0Var.l, l0Var.f29586m, l0Var.f29587n, l0Var.f29588o, l0Var.f29589p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return a(l0Var) && b(l0Var);
    }

    public final int hashCode() {
        x5.o oVar = this.f29575a;
        long jB = oVar.b();
        int i11 = i4.v.f23316i;
        u70.b0 b0Var = u70.c0.f40833b;
        int iHashCode = Long.hashCode(jB) * 31;
        i4.r rVarC = oVar.c();
        int iHashCode2 = (Float.hashCode(oVar.a()) + ((iHashCode + (rVarC != null ? rVarC.hashCode() : 0)) * 31)) * 31;
        z5.p[] pVarArr = z5.o.f47288b;
        int iB = e0.f.b(iHashCode2, 31, this.f29576b);
        q5.r rVar = this.f29577c;
        int i12 = (iB + (rVar != null ? rVar.f36049a : 0)) * 31;
        q5.n nVar = this.f29578d;
        int iHashCode3 = (i12 + (nVar != null ? Integer.hashCode(nVar.f36034a) : 0)) * 31;
        q5.o oVar2 = this.f29579e;
        int iHashCode4 = (iHashCode3 + (oVar2 != null ? Integer.hashCode(oVar2.f36035a) : 0)) * 31;
        q5.i iVar = this.f29580f;
        int iHashCode5 = (iHashCode4 + (iVar != null ? iVar.hashCode() : 0)) * 31;
        String str = this.f29581g;
        int iB2 = e0.f.b((iHashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, this.f29582h);
        x5.a aVar = this.f29583i;
        int iHashCode6 = (iB2 + (aVar != null ? Float.hashCode(aVar.f43835a) : 0)) * 31;
        x5.p pVar = this.f29584j;
        int iHashCode7 = (iHashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31;
        t5.c cVar = this.f29585k;
        int iB3 = e0.f.b((iHashCode7 + (cVar != null ? cVar.f39796a.hashCode() : 0)) * 31, 31, this.l);
        x5.l lVar = this.f29586m;
        int i13 = (iB3 + (lVar != null ? lVar.f43856a : 0)) * 31;
        i4.u0 u0Var = this.f29587n;
        int iHashCode8 = (i13 + (u0Var != null ? u0Var.hashCode() : 0)) * 31;
        a0 a0Var = this.f29588o;
        int iHashCode9 = (iHashCode8 + (a0Var != null ? a0Var.hashCode() : 0)) * 31;
        k4.e eVar = this.f29589p;
        return iHashCode9 + (eVar != null ? eVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SpanStyle(color=");
        x5.o oVar = this.f29575a;
        sb2.append((Object) i4.v.i(oVar.b()));
        sb2.append(", brush=");
        sb2.append(oVar.c());
        sb2.append(", alpha=");
        sb2.append(oVar.a());
        sb2.append(", fontSize=");
        sb2.append((Object) z5.o.d(this.f29576b));
        sb2.append(", fontWeight=");
        sb2.append(this.f29577c);
        sb2.append(", fontStyle=");
        sb2.append(this.f29578d);
        sb2.append(", fontSynthesis=");
        sb2.append(this.f29579e);
        sb2.append(", fontFamily=");
        sb2.append(this.f29580f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(this.f29581g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) z5.o.d(this.f29582h));
        sb2.append(", baselineShift=");
        sb2.append(this.f29583i);
        sb2.append(", textGeometricTransform=");
        sb2.append(this.f29584j);
        sb2.append(", localeList=");
        sb2.append(this.f29585k);
        sb2.append(", background=");
        r8.k.x(this.l, ", textDecoration=", sb2);
        sb2.append(this.f29586m);
        sb2.append(", shadow=");
        sb2.append(this.f29587n);
        sb2.append(", platformStyle=");
        sb2.append(this.f29588o);
        sb2.append(", drawStyle=");
        sb2.append(this.f29589p);
        sb2.append(')');
        return sb2.toString();
    }

    public l0(x5.o oVar, long j9, q5.r rVar, q5.n nVar, q5.o oVar2, q5.i iVar, String str, long j11, x5.a aVar, x5.p pVar, t5.c cVar, long j12, x5.l lVar, i4.u0 u0Var, a0 a0Var, k4.e eVar) {
        this.f29575a = oVar;
        this.f29576b = j9;
        this.f29577c = rVar;
        this.f29578d = nVar;
        this.f29579e = oVar2;
        this.f29580f = iVar;
        this.f29581g = str;
        this.f29582h = j11;
        this.f29583i = aVar;
        this.f29584j = pVar;
        this.f29585k = cVar;
        this.l = j12;
        this.f29586m = lVar;
        this.f29587n = u0Var;
        this.f29588o = a0Var;
        this.f29589p = eVar;
    }

    public l0(long j9, long j11, q5.r rVar, q5.n nVar, q5.o oVar, q5.i iVar, String str, long j12, x5.a aVar, x5.p pVar, t5.c cVar, long j13, x5.l lVar, i4.u0 u0Var, a0 a0Var) {
        this(j9 != 16 ? new x5.c(j9) : x5.n.f43858a, j11, rVar, nVar, oVar, iVar, str, j12, aVar, pVar, cVar, j13, lVar, u0Var, a0Var, null);
    }
}
