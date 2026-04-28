package n20;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30375a;

    public l(float f11) {
        this.f30375a = f11;
    }

    @Override // n20.d
    public final float a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f30375a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l) && this.f30375a == ((l) obj).f30375a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f30375a)});
    }

    public final String toString() {
        return r8.k.i((int) (this.f30375a * 100.0f), "%", new StringBuilder());
    }
}
