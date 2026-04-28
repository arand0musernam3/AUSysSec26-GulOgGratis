package f0;

import android.media.ImageWriter;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {
    public static final ImageWriter a(int i11, Surface surface) {
        ImageWriter imageWriterNewInstance = ImageWriter.newInstance(surface, 1, i11);
        imageWriterNewInstance.getClass();
        return imageWriterNewInstance;
    }
}
