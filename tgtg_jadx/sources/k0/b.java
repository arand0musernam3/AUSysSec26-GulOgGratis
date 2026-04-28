package k0;

import android.media.ImageWriter;
import e0.o1;
import e0.r1;
import kotlin.reflect.KClass;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements ImageWriter.OnImageReleasedListener, r1, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageWriter f25611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r80.d f25613c = w.b.r(null);

    public b(ImageWriter imageWriter, int i11) {
        this.f25611a = imageWriter;
        this.f25612b = i11;
        imageWriter.getMaxImages();
        imageWriter.getFormat();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f25611a.close();
    }

    @Override // android.media.ImageWriter.OnImageReleasedListener
    public final void onImageReleased(ImageWriter imageWriter) {
        if (this.f25613c.f37785a == null) {
            return;
        }
        org.bouncycastle.jce.provider.a.c();
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        if (k.D(kClass, ImageWriter.class, kClass)) {
            return this.f25611a;
        }
        return null;
    }

    public final String toString() {
        return "ImageWriter-" + o1.a(this.f25611a.getFormat()) + '-' + ((Object) ("Input-" + this.f25612b));
    }
}
