package of;

import kotlin.jvm.internal.Intrinsics;
import w.a0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f32485b;

    public c(String str, long j9) {
        this.f32484a = str;
        this.f32485b = j9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.areEqual(this.f32484a, cVar.f32484a) && this.f32485b == cVar.f32485b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f32485b) + (this.f32484a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Increment(key=");
        sb2.append(this.f32484a);
        sb2.append(", value=");
        return a0.r(sb2, this.f32485b, ')');
    }
}
