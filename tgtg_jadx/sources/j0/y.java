package j0;

import e0.l0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f24331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f24332b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f24333c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f24334d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f24335e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f24336f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final r80.a f24337g;

    public y(boolean z11, long j9, long j11, long j12, long j13, x xVar) {
        xVar.getClass();
        this.f24331a = z11;
        this.f24332b = j9;
        this.f24333c = j11;
        this.f24334d = j12;
        this.f24335e = j13;
        this.f24336f = xVar;
        this.f24337g = w.b.p(false);
    }

    public final void a(long j9, Object obj) {
        if (this.f24337g.a()) {
            this.f24336f.a(obj);
            return;
        }
        StringBuilder sb2 = new StringBuilder("Output ");
        sb2.append(this.f24334d);
        sb2.append(" at ");
        sb2.append((Object) l0.a(this.f24332b));
        sb2.append(" for ");
        e40.a.g(w.a0.j(j9, " was completed multiple times!", sb2));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f24331a == yVar.f24331a && this.f24332b == yVar.f24332b && this.f24333c == yVar.f24333c && this.f24334d == yVar.f24334d && this.f24335e == yVar.f24335e && Intrinsics.areEqual(this.f24336f, yVar.f24336f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f24336f.hashCode() + e0.f.b(e0.f.b(e0.f.b(e0.f.b(Boolean.hashCode(this.f24331a) * 31, 31, this.f24332b), 31, this.f24333c), 31, this.f24334d), 31, this.f24335e);
    }

    public final String toString() {
        return "StartedOutput(isOutOfOrder=" + this.f24331a + ", cameraFrameNumber=" + ((Object) l0.a(this.f24332b)) + ", cameraTimestamp=" + ((Object) ("CameraTimestamp(value=" + this.f24333c + ')')) + ", cameraOutputSequence=" + this.f24334d + ", cameraOutputNumber=" + this.f24335e + ", outputListener=" + this.f24336f + ')';
    }
}
