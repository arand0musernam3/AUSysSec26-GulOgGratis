package z1;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f46531a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float[] f46532b;

    public h1() {
        float[] fArr = new float[5];
        for (int i11 = 0; i11 < 5; i11++) {
            fArr[i11] = Float.NaN;
        }
        this.f46532b = fArr;
    }

    public final void a(Enum r32, float f11) {
        ArrayList arrayList = this.f46531a;
        arrayList.add(r32);
        if (this.f46532b.length < arrayList.size()) {
            this.f46532b = Arrays.copyOf(this.f46532b, arrayList.size() + 2);
        }
        this.f46532b[arrayList.size() - 1] = f11;
    }
}
