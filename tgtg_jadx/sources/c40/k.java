package c40;

import c50.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends InputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f7074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f7075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f7076c;

    public k(m mVar, j jVar) {
        this.f7076c = mVar;
        this.f7074a = mVar.H(jVar.f7072a + 4);
        this.f7075b = jVar.f7073b;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i11, int i12) throws IOException {
        if (bArr == null) {
            w.l("buffer");
            return 0;
        }
        if ((i11 | i12) < 0 || i12 > bArr.length - i11) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i13 = this.f7075b;
        if (i13 <= 0) {
            return -1;
        }
        if (i12 > i13) {
            i12 = i13;
        }
        int i14 = this.f7074a;
        m mVar = this.f7076c;
        mVar.A(i14, bArr, i11, i12);
        this.f7074a = mVar.H(this.f7074a + i12);
        this.f7075b -= i12;
        return i12;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        m mVar = this.f7076c;
        RandomAccessFile randomAccessFile = mVar.f7078a;
        if (this.f7075b == 0) {
            return -1;
        }
        randomAccessFile.seek(this.f7074a);
        int i11 = randomAccessFile.read();
        this.f7074a = mVar.H(this.f7074a + 1);
        this.f7075b--;
        return i11;
    }
}
