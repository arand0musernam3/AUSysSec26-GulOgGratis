package o8;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends b {
    public g(InputStream inputStream) {
        super(inputStream);
        if (inputStream.markSupported()) {
            this.f32051a.mark(Integer.MAX_VALUE);
        } else {
            i4.a.f("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
            throw null;
        }
    }

    public final void e(long j9) throws IOException {
        int i11 = this.f32052b;
        if (i11 > j9) {
            this.f32052b = 0;
            this.f32051a.reset();
        } else {
            j9 -= (long) i11;
        }
        a((int) j9);
    }

    public g(byte[] bArr) {
        super(bArr);
        this.f32051a.mark(Integer.MAX_VALUE);
    }
}
