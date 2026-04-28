package id;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InputStream f23798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23799c = 1073741824;

    public /* synthetic */ n(InputStream inputStream, int i11) {
        this.f23797a = i11;
        this.f23798b = inputStream;
    }

    @Override // java.io.InputStream
    public final int available() {
        switch (this.f23797a) {
        }
        return this.f23799c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        switch (this.f23797a) {
            case 0:
                this.f23798b.close();
                break;
            default:
                this.f23798b.close();
                break;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        switch (this.f23797a) {
            case 0:
                int i11 = this.f23798b.read();
                if (i11 == -1) {
                    this.f23799c = 0;
                }
                return i11;
            default:
                int i12 = this.f23798b.read();
                if (i12 == -1) {
                    this.f23799c = 0;
                }
                return i12;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j9) {
        switch (this.f23797a) {
        }
        return this.f23798b.skip(j9);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        switch (this.f23797a) {
            case 0:
                int i11 = this.f23798b.read(bArr);
                if (i11 == -1) {
                    this.f23799c = 0;
                }
                return i11;
            default:
                int i12 = this.f23798b.read(bArr);
                if (i12 == -1) {
                    this.f23799c = 0;
                }
                return i12;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        switch (this.f23797a) {
            case 0:
                int i13 = this.f23798b.read(bArr, i11, i12);
                if (i13 == -1) {
                    this.f23799c = 0;
                }
                return i13;
            default:
                int i14 = this.f23798b.read(bArr, i11, i12);
                if (i14 == -1) {
                    this.f23799c = 0;
                }
                return i14;
        }
    }
}
