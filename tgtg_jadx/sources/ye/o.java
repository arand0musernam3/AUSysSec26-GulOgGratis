package ye;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f45918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f45919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f45920c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f45921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f45922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final p f45923f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f45924g;

    public o(long j9, long j11, float f11, float f12, p pVar, ArrayList arrayList) {
        this.f45918a = j9;
        this.f45919b = j11;
        this.f45921d = f11;
        this.f45922e = f12;
        this.f45923f = pVar;
        this.f45924g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f45918a == oVar.f45918a && this.f45919b == oVar.f45919b && this.f45920c == oVar.f45920c && Float.compare(this.f45921d, oVar.f45921d) == 0 && Float.compare(this.f45922e, oVar.f45922e) == 0 && Intrinsics.areEqual(this.f45923f, oVar.f45923f) && Intrinsics.areEqual(this.f45924g, oVar.f45924g);
    }

    public final int hashCode() {
        return this.f45924g.hashCode() + ((this.f45923f.hashCode() + r8.k.a(r8.k.a(r8.k.b(this.f45920c, e0.f.b(Long.hashCode(this.f45918a) * 31, 31, this.f45919b), 31), this.f45921d, 31), this.f45922e, 31)) * 31);
    }

    public final String toString() {
        return "RageClickSession(firstClickTime=" + this.f45918a + ", lastClickTime=" + this.f45919b + ", clickCount=" + this.f45920c + ", firstClickX=" + this.f45921d + ", firstClickY=" + this.f45922e + ", targetInfo=" + this.f45923f + ", clicks=" + this.f45924g + ')';
    }
}
