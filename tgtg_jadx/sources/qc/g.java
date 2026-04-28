package qc;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f36904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f36905b;

    public g(Drawable drawable, boolean z11) {
        this.f36904a = drawable;
        this.f36905b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Intrinsics.areEqual(this.f36904a, gVar.f36904a) && this.f36905b == gVar.f36905b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f36905b) + (this.f36904a.hashCode() * 31);
    }
}
