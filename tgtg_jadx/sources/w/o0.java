package w;

import android.util.Range;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f42738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u0.b f42739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f42740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f42741f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f42742g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f42743h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Range f42744i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f42745j;

    public o0(int i11, int i12, boolean z11, u0.b bVar, boolean z12, boolean z13, boolean z14, boolean z15, Range range, boolean z16) {
        bVar.getClass();
        range.getClass();
        this.f42736a = i11;
        this.f42737b = i12;
        this.f42738c = z11;
        this.f42739d = bVar;
        this.f42740e = z12;
        this.f42741f = z13;
        this.f42742g = z14;
        this.f42743h = z15;
        this.f42744i = range;
        this.f42745j = z16;
    }

    public static o0 a(o0 o0Var, boolean z11, Range range, int i11) {
        int i12 = o0Var.f42736a;
        int i13 = o0Var.f42737b;
        boolean z12 = o0Var.f42738c;
        u0.b bVar = o0Var.f42739d;
        boolean z13 = o0Var.f42740e;
        boolean z14 = o0Var.f42741f;
        boolean z15 = o0Var.f42742g;
        if ((i11 & 256) != 0) {
            range = o0Var.f42744i;
        }
        Range range2 = range;
        boolean z16 = o0Var.f42745j;
        bVar.getClass();
        range2.getClass();
        return new o0(i12, i13, z12, bVar, z13, z14, z15, z11, range2, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return this.f42736a == o0Var.f42736a && this.f42737b == o0Var.f42737b && this.f42738c == o0Var.f42738c && this.f42739d == o0Var.f42739d && this.f42740e == o0Var.f42740e && this.f42741f == o0Var.f42741f && this.f42742g == o0Var.f42742g && this.f42743h == o0Var.f42743h && Intrinsics.areEqual(this.f42744i, o0Var.f42744i) && this.f42745j == o0Var.f42745j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f42745j) + ((this.f42744i.hashCode() + r8.k.e(r8.k.e(r8.k.e(r8.k.e((this.f42739d.hashCode() + r8.k.e(r8.k.b(this.f42737b, Integer.hashCode(this.f42736a) * 31, 31), 31, this.f42738c)) * 31, 31, this.f42740e), 31, this.f42741f), 31, this.f42742g), 31, this.f42743h)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FeatureSettings(cameraMode=");
        sb2.append(this.f42736a);
        sb2.append(", requiredMaxBitDepth=");
        sb2.append(this.f42737b);
        sb2.append(", hasVideoCapture=");
        sb2.append(this.f42738c);
        sb2.append(", videoStabilization=");
        sb2.append(this.f42739d);
        sb2.append(", isUltraHdrOn=");
        sb2.append(this.f42740e);
        sb2.append(", isHighSpeedOn=");
        sb2.append(this.f42741f);
        sb2.append(", isFeatureComboInvocation=");
        sb2.append(this.f42742g);
        sb2.append(", requiresFeatureComboQuery=");
        sb2.append(this.f42743h);
        sb2.append(", targetFpsRange=");
        sb2.append(this.f42744i);
        sb2.append(", isStrictFpsRequired=");
        return r8.k.q(sb2, this.f42745j, ')');
    }
}
