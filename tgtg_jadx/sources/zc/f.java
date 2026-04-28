package zc;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f47436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f47437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Throwable f47438c;

    public f(Drawable drawable, k kVar, Throwable th2) {
        this.f47436a = drawable;
        this.f47437b = kVar;
        this.f47438c = th2;
    }

    @Override // zc.l
    public final Drawable a() {
        return this.f47436a;
    }

    @Override // zc.l
    public final k b() {
        return this.f47437b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f47436a, fVar.f47436a) && Intrinsics.areEqual(this.f47437b, fVar.f47437b) && Intrinsics.areEqual(this.f47438c, fVar.f47438c);
    }

    public final int hashCode() {
        Drawable drawable = this.f47436a;
        return this.f47438c.hashCode() + ((this.f47437b.hashCode() + ((drawable != null ? drawable.hashCode() : 0) * 31)) * 31);
    }
}
