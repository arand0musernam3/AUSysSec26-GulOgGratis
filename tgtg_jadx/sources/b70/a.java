package b70;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f6053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f6054b;

    public a(byte[] bArr, byte[] bArr2) {
        bArr.getClass();
        bArr2.getClass();
        this.f6053a = bArr;
        this.f6054b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(a.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        a aVar = (a) obj;
        return Arrays.equals(this.f6053a, aVar.f6053a) && Arrays.equals(this.f6054b, aVar.f6054b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f6054b) + (Arrays.hashCode(this.f6053a) * 31);
    }

    public final String toString() {
        return org.bouncycastle.jcajce.provider.asymmetric.a.d("AesPayload(iv=", Arrays.toString(this.f6053a), ", data=", Arrays.toString(this.f6054b), ")");
    }
}
