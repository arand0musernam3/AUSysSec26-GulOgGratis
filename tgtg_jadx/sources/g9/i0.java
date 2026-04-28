package g9;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f20141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f20145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public KClass f20147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Object f20148k;

    public i0(boolean z11, boolean z12, int i11, boolean z13, boolean z14, int i12, int i13, int i14, int i15) {
        this.f20138a = z11;
        this.f20139b = z12;
        this.f20140c = i11;
        this.f20141d = z13;
        this.f20142e = z14;
        this.f20143f = i12;
        this.f20144g = i13;
        this.f20145h = i14;
        this.f20146i = i15;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return this.f20138a == i0Var.f20138a && this.f20139b == i0Var.f20139b && this.f20140c == i0Var.f20140c && Intrinsics.areEqual((Object) null, (Object) null) && Intrinsics.areEqual(this.f20147j, i0Var.f20147j) && Intrinsics.areEqual(this.f20148k, i0Var.f20148k) && this.f20141d == i0Var.f20141d && this.f20142e == i0Var.f20142e && this.f20143f == i0Var.f20143f && this.f20144g == i0Var.f20144g && this.f20145h == i0Var.f20145h && this.f20146i == i0Var.f20146i;
    }

    public final int hashCode() {
        int i11 = (((((this.f20138a ? 1 : 0) * 31) + (this.f20139b ? 1 : 0)) * 31) + this.f20140c) * 961;
        KClass kClass = this.f20147j;
        int iHashCode = (i11 + (kClass != null ? kClass.hashCode() : 0)) * 31;
        Object obj = this.f20148k;
        return ((((((((((((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31) + (this.f20141d ? 1 : 0)) * 31) + (this.f20142e ? 1 : 0)) * 31) + this.f20143f) * 31) + this.f20144g) * 31) + this.f20145h) * 31) + this.f20146i;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i0.class.getSimpleName());
        sb2.append("(");
        if (this.f20138a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f20139b) {
            sb2.append("restoreState ");
        }
        int i11 = this.f20146i;
        int i12 = this.f20145h;
        int i13 = this.f20144g;
        int i14 = this.f20143f;
        if (i14 != -1 || i13 != -1 || i12 != -1 || i11 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i14));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i13));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i12));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(")");
        }
        return sb2.toString();
    }
}
