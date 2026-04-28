package pz;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class k extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final byte[] f35672i;

    public k(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.f35672i = bArr;
    }

    @Override // pz.j
    public final byte[] U() {
        return this.f35672i;
    }
}
