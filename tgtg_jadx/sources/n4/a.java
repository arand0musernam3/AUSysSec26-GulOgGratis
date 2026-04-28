package n4;

import b0.z;
import i4.c0;
import i4.f;
import i4.w;
import k4.d;
import kotlin.jvm.internal.Intrinsics;
import z5.j;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f30496f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f30497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30498h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f30499i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f30500j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public w f30501k;

    public a(f fVar, long j9) {
        int i11;
        int i12;
        this.f30496f = fVar;
        this.f30497g = j9;
        if (((int) 0) < 0 || ((int) 0) < 0 || (i11 = (int) (j9 >> 32)) < 0 || (i12 = (int) (4294967295L & j9)) < 0 || i11 > fVar.f23242a.getWidth() || i12 > fVar.f23242a.getHeight()) {
            i4.a.f("Failed requirement.");
            throw null;
        }
        this.f30499i = j9;
        this.f30500j = 1.0f;
    }

    @Override // n4.b
    public final boolean a(float f11) {
        this.f30500j = f11;
        return true;
    }

    @Override // n4.b
    public final boolean e(w wVar) {
        this.f30501k = wVar;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f30496f, aVar.f30496f) && j.b(0L, 0L) && l.a(this.f30497g, aVar.f30497g) && this.f30498h == aVar.f30498h;
    }

    @Override // n4.b
    public final long h() {
        return z.z(this.f30499i);
    }

    public final int hashCode() {
        return Integer.hashCode(this.f30498h) + e0.f.b(e0.f.b(this.f30496f.hashCode() * 31, 31, 0L), 31, this.f30497g);
    }

    @Override // n4.b
    public final void i(d dVar) {
        int iRound = Math.round(Float.intBitsToFloat((int) (dVar.d() >> 32)));
        int iRound2 = Math.round(Float.intBitsToFloat((int) (dVar.d() & 4294967295L)));
        float f11 = this.f30500j;
        w wVar = this.f30501k;
        int i11 = this.f30498h;
        d.n0(dVar, this.f30496f, this.f30497g, (((long) iRound) << 32) | (((long) iRound2) & 4294967295L), f11, wVar, i11, 328);
    }

    public final String toString() {
        return "BitmapPainter(image=" + this.f30496f + ", srcOffset=" + ((Object) j.e(0L)) + ", srcSize=" + ((Object) l.b(this.f30497g)) + ", filterQuality=" + ((Object) c0.a(this.f30498h)) + ')';
    }
}
