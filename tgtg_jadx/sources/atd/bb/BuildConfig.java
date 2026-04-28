package atd.bb;

import java.io.BufferedInputStream;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class BuildConfig extends BufferedInputStream {
    public BuildConfig(InputStream inputStream) {
        super(inputStream);
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }
}
