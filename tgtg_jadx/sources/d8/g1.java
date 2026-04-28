package d8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 extends OutputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FileOutputStream f14621a;

    public g1(FileOutputStream fileOutputStream) {
        this.f14621a = fileOutputStream;
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f14621a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        bArr.getClass();
        this.f14621a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(int i11) throws IOException {
        this.f14621a.write(i11);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i11, int i12) throws IOException {
        bArr.getClass();
        this.f14621a.write(bArr, i11, i12);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
