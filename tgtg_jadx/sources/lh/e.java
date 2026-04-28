package lh;

import kotlin.jvm.internal.Intrinsics;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class e extends f0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27785e;

    public e(String str) {
        this.f27785e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && Intrinsics.areEqual(this.f27785e, ((e) obj).f27785e);
    }

    public final int hashCode() {
        String str = this.f27785e;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return w.a0.p("Load(fillerType=", this.f27785e, ")");
    }
}
