package o8;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends MediaDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f32049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f32050b;

    public a(g gVar) {
        this.f32050b = gVar;
    }

    @Override // android.media.MediaDataSource
    public final long getSize() {
        return -1L;
    }

    @Override // android.media.MediaDataSource
    public final int readAt(long j9, byte[] bArr, int i11, int i12) {
        g gVar = this.f32050b;
        DataInputStream dataInputStream = gVar.f32051a;
        if (i12 == 0) {
            return 0;
        }
        if (j9 >= 0) {
            try {
                long j11 = this.f32049a;
                if (j11 != j9) {
                    if (j11 < 0 || j9 < j11 + ((long) dataInputStream.available())) {
                        gVar.e(j9);
                        this.f32049a = j9;
                    }
                }
                if (i12 > dataInputStream.available()) {
                    i12 = dataInputStream.available();
                }
                int i13 = gVar.read(bArr, i11, i12);
                if (i13 >= 0) {
                    this.f32049a += (long) i13;
                    return i13;
                }
            } catch (IOException unused) {
            }
            this.f32049a = -1L;
            return -1;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
