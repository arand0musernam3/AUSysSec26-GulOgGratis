package n20;

import android.graphics.RectF;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f30296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f30297b;

    public b(float f11, d dVar) {
        while (dVar instanceof b) {
            dVar = ((b) dVar).f30296a;
            f11 += ((b) dVar).f30297b;
        }
        this.f30296a = dVar;
        this.f30297b = f11;
    }

    @Override // n20.d
    public final float a(RectF rectF) {
        return Math.max(0.0f, this.f30296a.a(rectF) + this.f30297b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f30296a.equals(bVar.f30296a) && this.f30297b == bVar.f30297b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f30296a, Float.valueOf(this.f30297b)});
    }
}
