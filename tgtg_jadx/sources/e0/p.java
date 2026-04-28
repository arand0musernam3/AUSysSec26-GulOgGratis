package e0;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.constraintlayout.widget.z f15391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15392c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f15393d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f15394e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15395f;

    /* JADX WARN: Removed duplicated region for block: B:32:0x0070  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p(boolean r6, androidx.constraintlayout.widget.z r7, int r8, boolean r9, int r10) {
        /*
            r5 = this;
            r0 = r10 & 2
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            int r6 = android.os.Build.VERSION.SDK_INT
            r0 = 30
            if (r6 < r0) goto Le
            r6 = r1
            goto Lf
        Le:
            r6 = r2
        Lf:
            r0 = r10 & 4
            if (r0 == 0) goto L1a
            androidx.constraintlayout.widget.z r7 = new androidx.constraintlayout.widget.z
            e0.q r0 = e0.q.AT_LEAST
            r7.<init>(r2, r0)
        L1a:
            r0 = r10 & 16
            if (r0 == 0) goto L1f
            r8 = r2
        L1f:
            r0 = r10 & 32
            if (r0 == 0) goto L70
            java.util.Map r0 = f0.n1.f16782c
            int r0 = android.os.Build.VERSION.SDK_INT
            r3 = 27
            if (r0 > r3) goto L2c
            goto L70
        L2c:
            java.lang.String r3 = android.os.Build.HARDWARE
            java.lang.String r4 = "samsungexynos7870"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r4)
            if (r4 == 0) goto L37
            goto L70
        L37:
            java.lang.String r4 = "qcom"
            boolean r3 = kotlin.text.y.k(r3, r4, r1)
            if (r3 == 0) goto L43
            r3 = 31
            if (r0 <= r3) goto L70
        L43:
            java.lang.Object r0 = f0.n1.f16783d
            java.lang.String r3 = android.os.Build.BRAND
            r3.getClass()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            java.lang.Object r0 = r0.get(r3)
            java.util.Set r0 = (java.util.Set) r0
            if (r0 == 0) goto L6e
            java.lang.String r3 = android.os.Build.MODEL
            r3.getClass()
            java.lang.String r3 = r3.toLowerCase(r4)
            r3.getClass()
            boolean r0 = r0.contains(r3)
            if (r0 != r1) goto L6e
            goto L70
        L6e:
            r0 = r2
            goto L71
        L70:
            r0 = r1
        L71:
            r3 = r10 & 64
            if (r3 == 0) goto L76
            r9 = r2
        L76:
            r10 = r10 & 128(0x80, float:1.8E-43)
            if (r10 == 0) goto L7b
            r1 = r2
        L7b:
            r5.<init>()
            r5.f15390a = r6
            r5.f15391b = r7
            r5.f15392c = r8
            r5.f15393d = r0
            r5.f15394e = r9
            r5.f15395f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.p.<init>(boolean, androidx.constraintlayout.widget.z, int, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f15390a == pVar.f15390a && Intrinsics.areEqual(this.f15391b, pVar.f15391b) && Intrinsics.areEqual((Object) null, (Object) null) && this.f15392c == pVar.f15392c && this.f15393d == pVar.f15393d && this.f15394e == pVar.f15394e && this.f15395f == pVar.f15395f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f15395f) + r8.k.e(r8.k.e(r8.k.b(this.f15392c, (this.f15391b.hashCode() + r8.k.e(Boolean.hashCode(false) * 31, 31, this.f15390a)) * 961, 31), 31, this.f15393d), 31, this.f15394e);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Flags(configureBlankSessionOnStop=false, abortCapturesOnStop=");
        sb2.append(this.f15390a);
        sb2.append(", awaitRepeatingRequestBeforeCapture=");
        sb2.append(this.f15391b);
        sb2.append(", awaitRepeatingRequestOnDisconnect=null, finalizeSessionOnCloseBehavior=");
        sb2.append((Object) ("FinalizeSessionOnCloseBehavior(value=" + this.f15392c + ')'));
        sb2.append(", closeCaptureSessionOnDisconnect=");
        sb2.append(this.f15393d);
        sb2.append(", closeCameraDeviceOnClose=");
        sb2.append(this.f15394e);
        sb2.append(", enableRestartDelays=");
        return r8.k.q(sb2, this.f15395f, ')');
    }
}
