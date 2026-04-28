package ky;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f26711b;

    public k(String str, ArrayList arrayList) {
        str.getClass();
        this.f26710a = str;
        this.f26711b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return Intrinsics.areEqual(this.f26710a, kVar.f26710a) && Intrinsics.areEqual(this.f26711b, kVar.f26711b);
    }

    public final int hashCode() {
        return this.f26711b.hashCode() + (this.f26710a.hashCode() * 31);
    }

    public final String toString() {
        return "MediaCodecInfo(name=" + this.f26710a + ", capabilities=" + this.f26711b + ')';
    }
}
