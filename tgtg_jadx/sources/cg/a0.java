package cg;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7920b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f7921c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f7922d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f7923e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f7924f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Function0 f7925g;

    public a0(String str, float f11, float f12, Function0 function0, Function0 function02) {
        str.getClass();
        function0.getClass();
        function02.getClass();
        this.f7919a = str;
        this.f7920b = f11;
        this.f7921c = f12;
        this.f7922d = false;
        this.f7923e = false;
        this.f7924f = function0;
        this.f7925g = function02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return Intrinsics.areEqual(this.f7919a, a0Var.f7919a) && Float.compare(this.f7920b, a0Var.f7920b) == 0 && Float.compare(this.f7921c, a0Var.f7921c) == 0 && this.f7922d == a0Var.f7922d && this.f7923e == a0Var.f7923e && Intrinsics.areEqual(this.f7924f, a0Var.f7924f) && Intrinsics.areEqual(this.f7925g, a0Var.f7925g);
    }

    public final int hashCode() {
        return this.f7925g.hashCode() + ((this.f7924f.hashCode() + r8.k.e(r8.k.e(r8.k.a(r8.k.a(this.f7919a.hashCode() * 31, this.f7920b, 31), this.f7921c, 31), 31, this.f7922d), 31, this.f7923e)) * 31);
    }

    public final String toString() {
        return "LottieMarker(name=" + this.f7919a + ", start=" + this.f7920b + ", stop=" + this.f7921c + ", startReached=" + this.f7922d + ", stopReached=" + this.f7923e + ", actionStart=" + this.f7924f + ", actionStop=" + this.f7925g + ")";
    }
}
