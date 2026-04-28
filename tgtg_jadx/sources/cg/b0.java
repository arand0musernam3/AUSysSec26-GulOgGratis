package cg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f7936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f7937c;

    public b0(String str, Function0 function0, c0 c0Var) {
        str.getClass();
        this.f7935a = str;
        this.f7936b = function0;
        this.f7937c = c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f7935a, b0Var.f7935a) && Intrinsics.areEqual(this.f7936b, b0Var.f7936b) && Intrinsics.areEqual(this.f7937c, b0Var.f7937c);
    }

    public final int hashCode() {
        int iHashCode = this.f7935a.hashCode() * 31;
        Function0 function0 = this.f7936b;
        int iHashCode2 = (iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31;
        c0 c0Var = this.f7937c;
        return iHashCode2 + (c0Var != null ? c0Var.hashCode() : 0);
    }

    public final String toString() {
        return "LottieMarkerData(name=" + this.f7935a + ", action=" + this.f7936b + ", hapticAction=" + this.f7937c + ")";
    }
}
