package n20;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30290a;

    public a(float f11) {
        this.f30290a = f11;
    }

    @Override // n20.d
    public final float a(RectF rectF) {
        return this.f30290a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f30290a == ((a) obj).f30290a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f30290a)});
    }

    public final String toString() {
        return this.f30290a + "px";
    }
}
