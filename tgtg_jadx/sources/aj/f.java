package aj;

import d40.t1;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends t1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f1497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f1498h;

    public f(String str, byte[] bArr) {
        str.getClass();
        bArr.getClass();
        this.f1497g = str;
        this.f1498h = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(f.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        f fVar = (f) obj;
        return Intrinsics.areEqual(this.f1497g, fVar.f1497g) && Arrays.equals(this.f1498h, fVar.f1498h);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f1498h) + (this.f1497g.hashCode() * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("AesDecrypt(alias=", this.f1497g, ", ciphertext=", Arrays.toString(this.f1498h), ")");
    }
}
