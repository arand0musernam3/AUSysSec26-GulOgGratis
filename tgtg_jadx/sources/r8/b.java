package r8;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f37755a;

    public b(float[] fArr) {
        this.f37755a = fArr;
        if (fArr.length == 8) {
            return;
        }
        i4.a.f("Points array size should be 8");
        throw null;
    }

    public final float a() {
        return this.f37755a[6];
    }

    public final float b() {
        return this.f37755a[7];
    }

    public final f c(g gVar) {
        float[] fArr = new float[8];
        f fVar = new f(fArr);
        float[] fArr2 = this.f37755a;
        System.arraycopy(fArr2, 0, fArr, 0, fArr2.length);
        fVar.e(gVar, 0);
        fVar.e(gVar, 2);
        fVar.e(gVar, 4);
        fVar.e(gVar, 6);
        return fVar;
    }

    public final boolean d() {
        float[] fArr = this.f37755a;
        return Math.abs(fArr[0] - a()) < 1.0E-4f && Math.abs(fArr[1] - b()) < 1.0E-4f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return Arrays.equals(this.f37755a, ((b) obj).f37755a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f37755a);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("anchor0: (");
        float[] fArr = this.f37755a;
        sb2.append(fArr[0]);
        sb2.append(", ");
        sb2.append(fArr[1]);
        sb2.append(") control0: (");
        sb2.append(fArr[2]);
        sb2.append(", ");
        sb2.append(fArr[3]);
        sb2.append("), control1: (");
        sb2.append(fArr[4]);
        sb2.append(", ");
        sb2.append(fArr[5]);
        sb2.append("), anchor1: (");
        sb2.append(a());
        sb2.append(", ");
        sb2.append(b());
        sb2.append(')');
        return sb2.toString();
    }
}
