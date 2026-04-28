package m5;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f29660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x5.q f29661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final z f29662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x5.i f29663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f29664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f29665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x5.s f29666i;

    public w(int i11, int i12, long j9, x5.q qVar, z zVar, x5.i iVar, int i13, int i14, x5.s sVar) {
        this.f29658a = i11;
        this.f29659b = i12;
        this.f29660c = j9;
        this.f29661d = qVar;
        this.f29662e = zVar;
        this.f29663f = iVar;
        this.f29664g = i13;
        this.f29665h = i14;
        this.f29666i = sVar;
        if (z5.o.a(j9, z5.o.f47289c) || z5.o.c(j9) >= 0.0f) {
            return;
        }
        s5.a.c("lineHeight can't be negative (" + z5.o.c(j9) + ')');
    }

    public final w a(w wVar) {
        return wVar == null ? this : x.a(this, wVar.f29658a, wVar.f29659b, wVar.f29660c, wVar.f29661d, wVar.f29662e, wVar.f29663f, wVar.f29664g, wVar.f29665h, wVar.f29666i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return this.f29658a == wVar.f29658a && this.f29659b == wVar.f29659b && z5.o.a(this.f29660c, wVar.f29660c) && Intrinsics.areEqual(this.f29661d, wVar.f29661d) && Intrinsics.areEqual(this.f29662e, wVar.f29662e) && Intrinsics.areEqual(this.f29663f, wVar.f29663f) && this.f29664g == wVar.f29664g && this.f29665h == wVar.f29665h && Intrinsics.areEqual(this.f29666i, wVar.f29666i);
    }

    public final int hashCode() {
        int iB = r8.k.b(this.f29659b, Integer.hashCode(this.f29658a) * 31, 31);
        z5.p[] pVarArr = z5.o.f47288b;
        int iB2 = e0.f.b(iB, 31, this.f29660c);
        x5.q qVar = this.f29661d;
        int iHashCode = (iB2 + (qVar != null ? qVar.hashCode() : 0)) * 31;
        z zVar = this.f29662e;
        int iHashCode2 = (iHashCode + (zVar != null ? zVar.hashCode() : 0)) * 31;
        x5.i iVar = this.f29663f;
        int iB3 = r8.k.b(this.f29665h, r8.k.b(this.f29664g, (iHashCode2 + (iVar != null ? iVar.hashCode() : 0)) * 31, 31), 31);
        x5.s sVar = this.f29666i;
        return iB3 + (sVar != null ? sVar.hashCode() : 0);
    }

    public final String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) x5.k.a(this.f29658a)) + ", textDirection=" + ((Object) x5.m.a(this.f29659b)) + ", lineHeight=" + ((Object) z5.o.d(this.f29660c)) + ", textIndent=" + this.f29661d + ", platformStyle=" + this.f29662e + ", lineHeightStyle=" + this.f29663f + ", lineBreak=" + ((Object) x5.e.a(this.f29664g)) + ", hyphens=" + ((Object) x5.d.a(this.f29665h)) + ", textMotion=" + this.f29666i + ')';
    }
}
