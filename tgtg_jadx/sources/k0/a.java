package k0;

import android.media.Image;
import android.os.Build;
import e0.o1;
import f0.u;
import kotlin.reflect.KClass;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f25606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f25607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f25608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f25609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f25610e;

    public a(Image image) {
        this.f25606a = image;
        this.f25607b = image.getFormat();
        this.f25608c = image.getWidth();
        this.f25609d = image.getHeight();
        this.f25610e = image.getTimestamp();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.f25606a.close();
    }

    @Override // e0.r1
    public final Object t(KClass kClass) {
        boolean zD = k.D(kClass, Image.class, kClass);
        Image image = this.f25606a;
        if (zD) {
            return image;
        }
        if (Build.VERSION.SDK_INT > 27) {
            return u.l(image, kClass);
        }
        return null;
    }

    public final String toString() {
        return "Image-" + o1.a(this.f25607b) + "-w" + this.f25608c + 'h' + this.f25609d + "-t" + this.f25610e;
    }
}
