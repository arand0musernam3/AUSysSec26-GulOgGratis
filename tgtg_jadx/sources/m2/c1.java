package m2;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c1 f28788g = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f28789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f28790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f28791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f28792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function1 f28793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f28794f;

    public c1(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, Function1 function16) {
        this.f28789a = function1;
        this.f28790b = function12;
        this.f28791c = function13;
        this.f28792d = function14;
        this.f28793e = function15;
        this.f28794f = function16;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return this.f28789a == c1Var.f28789a && this.f28790b == c1Var.f28790b && this.f28791c == c1Var.f28791c && this.f28792d == c1Var.f28792d && this.f28793e == c1Var.f28793e && this.f28794f == c1Var.f28794f;
    }

    public final int hashCode() {
        Function1 function1 = this.f28789a;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function12 = this.f28790b;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1 function13 = this.f28791c;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1 function14 = this.f28792d;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1 function15 = this.f28793e;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1 function16 = this.f28794f;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public /* synthetic */ c1() {
        this(null, null, null, null, null, null);
    }
}
