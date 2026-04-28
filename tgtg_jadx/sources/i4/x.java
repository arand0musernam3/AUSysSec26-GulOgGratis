package i4;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import com.adyen.checkout.components.core.Address;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f23331b;

    public final float[] a() {
        float[] fArr = this.f23331b;
        if (fArr != null) {
            return fArr;
        }
        ColorFilter colorFilter = this.f23318a;
        if (!(colorFilter instanceof ColorMatrixColorFilter)) {
            a.f("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
            return null;
        }
        ColorMatrix colorMatrix = new ColorMatrix();
        ((ColorMatrixColorFilter) colorFilter).getColorMatrix(colorMatrix);
        float[] array = colorMatrix.getArray();
        this.f23331b = array;
        return array;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x) && Arrays.equals(a(), ((x) obj).a());
    }

    public final int hashCode() {
        float[] fArr = this.f23331b;
        if (fArr != null) {
            return Arrays.hashCode(fArr);
        }
        return 0;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("ColorMatrixColorFilter(colorMatrix=");
        float[] fArr = this.f23331b;
        if (fArr == null) {
            str = Address.ADDRESS_NULL_PLACEHOLDER;
        } else {
            str = "ColorMatrix(values=" + Arrays.toString(fArr) + ')';
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
