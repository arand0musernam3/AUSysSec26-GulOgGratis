package a6;

import java.util.Arrays;
import n20.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float[] f830b;

    public c(float[] fArr, float[] fArr2) {
        if (fArr.length != fArr2.length || fArr.length == 0) {
            i4.a.f("Array lengths must match and be nonzero");
            throw null;
        }
        this.f829a = fArr;
        this.f830b = fArr2;
    }

    @Override // a6.a
    public final float a(float f11) {
        return f.m(f11, this.f830b, this.f829a);
    }

    @Override // a6.a
    public final float b(float f11) {
        return f.m(f11, this.f829a, this.f830b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f829a, cVar.f829a) && Arrays.equals(this.f830b, cVar.f830b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f830b) + (Arrays.hashCode(this.f829a) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FontScaleConverter{fromSpValues=");
        String string = Arrays.toString(this.f829a);
        string.getClass();
        sb2.append(string);
        sb2.append(", toDpValues=");
        String string2 = Arrays.toString(this.f830b);
        string2.getClass();
        sb2.append(string2);
        sb2.append('}');
        return sb2.toString();
    }
}
