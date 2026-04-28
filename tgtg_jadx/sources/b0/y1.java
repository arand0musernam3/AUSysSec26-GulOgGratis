package b0;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f5510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5512c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v80.q f5513d;

    public y1(ArrayList arrayList, int i11, int i12, v80.q qVar) {
        this.f5510a = arrayList;
        this.f5511b = i11;
        this.f5512c = i12;
        this.f5513d = qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return Intrinsics.areEqual(this.f5510a, y1Var.f5510a) && this.f5511b == y1Var.f5511b && this.f5512c == y1Var.f5512c && Intrinsics.areEqual(this.f5513d, y1Var.f5513d);
    }

    public final int hashCode() {
        return this.f5513d.hashCode() + r8.k.b(this.f5512c, r8.k.b(this.f5511b, this.f5510a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CaptureRequest(captureConfigs=" + this.f5510a + ", captureMode=" + this.f5511b + ", flashType=" + this.f5512c + ", result=" + this.f5513d + ')';
    }
}
