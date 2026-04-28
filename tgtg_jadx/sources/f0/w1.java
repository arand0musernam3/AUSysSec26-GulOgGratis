package f0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u2 f16951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Integer f16952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h0.d f16953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f16954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h0.d f16955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final h0.d f16956g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h0.d f16957h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e0.l f16958i;

    public w1(String str, u2 u2Var, Integer num, h0.d dVar, Throwable th2, h0.d dVar2, h0.d dVar3, h0.d dVar4, e0.l lVar) {
        str.getClass();
        u2Var.getClass();
        this.f16950a = str;
        this.f16951b = u2Var;
        this.f16952c = num;
        this.f16953d = dVar;
        this.f16954e = th2;
        this.f16955f = dVar2;
        this.f16956g = dVar3;
        this.f16957h = dVar4;
        this.f16958i = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1)) {
            return false;
        }
        w1 w1Var = (w1) obj;
        return Intrinsics.areEqual(this.f16950a, w1Var.f16950a) && this.f16951b == w1Var.f16951b && Intrinsics.areEqual(this.f16952c, w1Var.f16952c) && Intrinsics.areEqual(this.f16953d, w1Var.f16953d) && Intrinsics.areEqual(this.f16954e, w1Var.f16954e) && Intrinsics.areEqual(this.f16955f, w1Var.f16955f) && Intrinsics.areEqual(this.f16956g, w1Var.f16956g) && Intrinsics.areEqual(this.f16957h, w1Var.f16957h) && Intrinsics.areEqual(this.f16958i, w1Var.f16958i);
    }

    public final int hashCode() {
        int iHashCode = (this.f16951b.hashCode() + (this.f16950a.hashCode() * 31)) * 31;
        Integer num = this.f16952c;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        h0.d dVar = this.f16953d;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : Long.hashCode(dVar.f20962a))) * 31;
        Throwable th2 = this.f16954e;
        int iHashCode4 = (iHashCode3 + (th2 == null ? 0 : th2.hashCode())) * 31;
        h0.d dVar2 = this.f16955f;
        int iHashCode5 = (iHashCode4 + (dVar2 == null ? 0 : Long.hashCode(dVar2.f20962a))) * 31;
        h0.d dVar3 = this.f16956g;
        int iHashCode6 = (iHashCode5 + (dVar3 == null ? 0 : Long.hashCode(dVar3.f20962a))) * 31;
        h0.d dVar4 = this.f16957h;
        int iHashCode7 = (iHashCode6 + (dVar4 == null ? 0 : Long.hashCode(dVar4.f20962a))) * 31;
        e0.l lVar = this.f16958i;
        return iHashCode7 + (lVar != null ? Integer.hashCode(lVar.f15363a) : 0);
    }

    public final String toString() {
        return "CameraStateClosed(cameraId=" + ((Object) e0.s.b(this.f16950a)) + ", cameraClosedReason=" + this.f16951b + ", cameraRetryCount=" + this.f16952c + ", cameraRetryDurationNs=" + this.f16953d + ", cameraException=" + this.f16954e + ", cameraOpenDurationNs=" + this.f16955f + ", cameraActiveDurationNs=" + this.f16956g + ", cameraClosingDurationNs=" + this.f16957h + ", cameraErrorCode=" + this.f16958i + ')';
    }
}
