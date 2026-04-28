package p40;

import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f34429a;

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) {
        int i13;
        if (i11 < 0 || i11 > bArr.length || i12 < 0 || (i13 = i11 + i12) > bArr.length || i13 < 0) {
            throw new IndexOutOfBoundsException();
        }
        this.f34429a += (long) i12;
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        this.f34429a += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public final void write(int i11) {
        this.f34429a++;
    }
}
