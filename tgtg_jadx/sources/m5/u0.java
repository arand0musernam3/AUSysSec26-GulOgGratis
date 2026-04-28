package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u0 f29654d = new u0(0, 0, null, null, 0, 0, 0, 0, 16777215);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l0 f29655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f29656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f29657c;

    public u0(long j9, long j11, q5.r rVar, q5.i iVar, long j12, int i11, int i12, long j13, int i13) {
        this(new l0((i13 & 1) != 0 ? i4.v.f23315h : j9, (i13 & 2) != 0 ? z5.o.f47289c : j11, (i13 & 4) != 0 ? null : rVar, (q5.n) null, (q5.o) null, (i13 & 32) != 0 ? null : iVar, (String) null, (i13 & 128) != 0 ? z5.o.f47289c : j12, (x5.a) null, (x5.p) null, (t5.c) null, i4.v.f23315h, (i13 & 4096) != 0 ? null : x5.l.f43855d, (i4.u0) null, (a0) null), new w((32768 & i13) != 0 ? 0 : i11, (65536 & i13) == 0 ? i12 : 0, (i13 & 131072) != 0 ? z5.o.f47289c : j13, null, null, null, 0, 0, null), null);
    }

    public static u0 a(u0 u0Var, long j9, long j11, q5.r rVar, q5.i iVar, long j12, x5.l lVar, int i11, long j13, b0 b0Var, x5.i iVar2, int i12) {
        long jB = (i12 & 1) != 0 ? u0Var.f29655a.f29575a.b() : j9;
        long j14 = (i12 & 2) != 0 ? u0Var.f29655a.f29576b : j11;
        q5.r rVar2 = (i12 & 4) != 0 ? u0Var.f29655a.f29577c : rVar;
        l0 l0Var = u0Var.f29655a;
        q5.n nVar = l0Var.f29578d;
        q5.o oVar = l0Var.f29579e;
        q5.i iVar3 = (i12 & 32) != 0 ? l0Var.f29580f : iVar;
        String str = (i12 & 64) != 0 ? l0Var.f29581g : "tnum";
        long j15 = (i12 & 128) != 0 ? l0Var.f29582h : j12;
        x5.a aVar = l0Var.f29583i;
        x5.p pVar = l0Var.f29584j;
        t5.c cVar = l0Var.f29585k;
        long j16 = l0Var.l;
        x5.l lVar2 = (i12 & 4096) != 0 ? l0Var.f29586m : lVar;
        i4.u0 u0Var2 = l0Var.f29587n;
        k4.e eVar = l0Var.f29589p;
        int i13 = (i12 & 32768) != 0 ? u0Var.f29656b.f29658a : i11;
        w wVar = u0Var.f29656b;
        int i14 = wVar.f29659b;
        long j17 = (i12 & 131072) != 0 ? wVar.f29660c : j13;
        x5.q qVar = wVar.f29661d;
        b0 b0Var2 = (i12 & 524288) != 0 ? u0Var.f29657c : b0Var;
        return new u0(new l0(i4.v.c(jB, l0Var.f29575a.b()) ? l0Var.f29575a : jB != 16 ? new x5.c(jB) : x5.n.f43858a, j14, rVar2, nVar, oVar, iVar3, str, j15, aVar, pVar, cVar, j16, lVar2, u0Var2, b0Var2 != null ? b0Var2.f29517a : null, eVar), new w(i13, i14, j17, qVar, b0Var2 != null ? b0Var2.f29518b : null, (i12 & 1048576) != 0 ? wVar.f29663f : iVar2, wVar.f29664g, wVar.f29665h, wVar.f29666i), b0Var2);
    }

    public static u0 e(u0 u0Var, long j9, long j11, q5.r rVar, long j12, x5.l lVar, int i11, long j13, int i12) {
        long j14 = (i12 & 1) != 0 ? i4.v.f23315h : j9;
        long j15 = (i12 & 2) != 0 ? z5.o.f47289c : j11;
        q5.r rVar2 = (i12 & 4) != 0 ? null : rVar;
        long j16 = (i12 & 128) != 0 ? z5.o.f47289c : j12;
        long j17 = i4.v.f23315h;
        x5.l lVar2 = (i12 & 4096) != 0 ? null : lVar;
        int i13 = (32768 & i12) != 0 ? 0 : i11;
        long j18 = (i12 & 131072) != 0 ? z5.o.f47289c : j13;
        l0 l0VarA = m0.a(u0Var.f29655a, j14, null, Float.NaN, j15, rVar2, null, null, null, null, j16, null, null, null, j17, lVar2, null, null, null);
        w wVarA = x.a(u0Var.f29656b, i13, 0, j18, null, null, null, 0, 0, null);
        return (u0Var.f29655a == l0VarA && u0Var.f29656b == wVarA) ? u0Var : new u0(l0VarA, wVarA);
    }

    public final long b() {
        return this.f29655a.f29575a.b();
    }

    public final boolean c(u0 u0Var) {
        if (this != u0Var) {
            return Intrinsics.areEqual(this.f29656b, u0Var.f29656b) && this.f29655a.a(u0Var.f29655a);
        }
        return true;
    }

    public final u0 d(u0 u0Var) {
        return (u0Var == null || Intrinsics.areEqual(u0Var, f29654d)) ? this : new u0(this.f29655a.c(u0Var.f29655a), this.f29656b.a(u0Var.f29656b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return Intrinsics.areEqual(this.f29655a, u0Var.f29655a) && Intrinsics.areEqual(this.f29656b, u0Var.f29656b) && Intrinsics.areEqual(this.f29657c, u0Var.f29657c);
    }

    public final int hashCode() {
        int iHashCode = (this.f29656b.hashCode() + (this.f29655a.hashCode() * 31)) * 31;
        b0 b0Var = this.f29657c;
        return iHashCode + (b0Var != null ? b0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TextStyle(color=");
        sb2.append((Object) i4.v.i(b()));
        sb2.append(", brush=");
        l0 l0Var = this.f29655a;
        sb2.append(l0Var.f29575a.c());
        sb2.append(", alpha=");
        sb2.append(l0Var.f29575a.a());
        sb2.append(", fontSize=");
        sb2.append((Object) z5.o.d(l0Var.f29576b));
        sb2.append(", fontWeight=");
        sb2.append(l0Var.f29577c);
        sb2.append(", fontStyle=");
        sb2.append(l0Var.f29578d);
        sb2.append(", fontSynthesis=");
        sb2.append(l0Var.f29579e);
        sb2.append(", fontFamily=");
        sb2.append(l0Var.f29580f);
        sb2.append(", fontFeatureSettings=");
        sb2.append(l0Var.f29581g);
        sb2.append(", letterSpacing=");
        sb2.append((Object) z5.o.d(l0Var.f29582h));
        sb2.append(", baselineShift=");
        sb2.append(l0Var.f29583i);
        sb2.append(", textGeometricTransform=");
        sb2.append(l0Var.f29584j);
        sb2.append(", localeList=");
        sb2.append(l0Var.f29585k);
        sb2.append(", background=");
        r8.k.x(l0Var.l, ", textDecoration=", sb2);
        sb2.append(l0Var.f29586m);
        sb2.append(", shadow=");
        sb2.append(l0Var.f29587n);
        sb2.append(", drawStyle=");
        sb2.append(l0Var.f29589p);
        sb2.append(", textAlign=");
        w wVar = this.f29656b;
        sb2.append((Object) x5.k.a(wVar.f29658a));
        sb2.append(", textDirection=");
        sb2.append((Object) x5.m.a(wVar.f29659b));
        sb2.append(", lineHeight=");
        sb2.append((Object) z5.o.d(wVar.f29660c));
        sb2.append(", textIndent=");
        sb2.append(wVar.f29661d);
        sb2.append(", platformStyle=");
        sb2.append(this.f29657c);
        sb2.append(", lineHeightStyle=");
        sb2.append(wVar.f29663f);
        sb2.append(", lineBreak=");
        sb2.append((Object) x5.e.a(wVar.f29664g));
        sb2.append(", hyphens=");
        sb2.append((Object) x5.d.a(wVar.f29665h));
        sb2.append(", textMotion=");
        sb2.append(wVar.f29666i);
        sb2.append(')');
        return sb2.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u0(l0 l0Var, w wVar) {
        a0 a0Var = l0Var.f29588o;
        z zVar = wVar.f29662e;
        this(l0Var, wVar, (a0Var == null && zVar == null) ? null : new b0(a0Var, zVar));
    }

    public u0(l0 l0Var, w wVar, b0 b0Var) {
        this.f29655a = l0Var;
        this.f29656b = wVar;
        this.f29657c = b0Var;
    }
}
