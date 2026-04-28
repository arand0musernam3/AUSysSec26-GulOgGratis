package vy;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class p extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f42599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f42600b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f42599a = bArr;
        this.f42600b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            boolean z11 = b0Var instanceof p;
            p pVar = (p) b0Var;
            if (Arrays.equals(this.f42599a, z11 ? pVar.f42599a : pVar.f42599a)) {
                p pVar2 = (p) b0Var;
                if (Arrays.equals(this.f42600b, z11 ? pVar2.f42600b : pVar2.f42600b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f42599a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f42600b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f42599a) + ", encryptedBlob=" + Arrays.toString(this.f42600b) + "}";
    }
}
