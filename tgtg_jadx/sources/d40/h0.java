package d40;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f14169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f14170b;

    public h0(String str, byte[] bArr) {
        this.f14169a = str;
        this.f14170b = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        h0 h0Var = (h0) r1Var;
        if (this.f14169a.equals(h0Var.f14169a)) {
            return Arrays.equals(this.f14170b, r1Var instanceof h0 ? ((h0) r1Var).f14170b : h0Var.f14170b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14169a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f14170b);
    }

    public final String toString() {
        return "File{filename=" + this.f14169a + ", contents=" + Arrays.toString(this.f14170b) + "}";
    }
}
