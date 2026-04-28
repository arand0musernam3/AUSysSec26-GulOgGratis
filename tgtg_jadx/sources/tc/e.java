package tc;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f39929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f39930b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qc.f f39931c;

    public e(Drawable drawable, boolean z11, qc.f fVar) {
        this.f39929a = drawable;
        this.f39930b = z11;
        this.f39931c = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Intrinsics.areEqual(this.f39929a, eVar.f39929a) && this.f39930b == eVar.f39930b && this.f39931c == eVar.f39931c;
    }

    public final int hashCode() {
        return this.f39931c.hashCode() + r8.k.e(this.f39929a.hashCode() * 31, 31, this.f39930b);
    }
}
