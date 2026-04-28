package z5;

import b0.a0;
import com.braze.h2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f47274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f47275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.a f47276c;

    public e(float f11, float f12, a6.a aVar) {
        this.f47274a = f11;
        this.f47275b = f12;
        this.f47276c = aVar;
    }

    @Override // z5.c
    public final float X() {
        return this.f47275b;
    }

    @Override // z5.c
    public final float a() {
        return this.f47274a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f47274a, eVar.f47274a) == 0 && Float.compare(this.f47275b, eVar.f47275b) == 0 && Intrinsics.areEqual(this.f47276c, eVar.f47276c);
    }

    public final int hashCode() {
        return this.f47276c.hashCode() + r8.k.a(Float.hashCode(this.f47274a) * 31, this.f47275b, 31);
    }

    @Override // z5.c
    public final long l(float f11) {
        return a0.F(this.f47276c.a(f11), 4294967296L);
    }

    @Override // z5.c
    public final float t(long j9) {
        if (p.a(o.b(j9), 4294967296L)) {
            return this.f47276c.b(o.c(j9));
        }
        h2.b("Only Sp can convert to Px");
        return 0.0f;
    }

    public final String toString() {
        return "DensityWithConverter(density=" + this.f47274a + ", fontScale=" + this.f47275b + ", converter=" + this.f47276c + ')';
    }
}
