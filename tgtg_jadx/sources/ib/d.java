package ib;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f23708a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f23709b;

    public d(boolean z11, Uri uri) {
        uri.getClass();
        this.f23708a = uri;
        this.f23709b = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        d dVar = (d) obj;
        return Intrinsics.areEqual(this.f23708a, dVar.f23708a) && this.f23709b == dVar.f23709b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f23709b) + (this.f23708a.hashCode() * 31);
    }
}
