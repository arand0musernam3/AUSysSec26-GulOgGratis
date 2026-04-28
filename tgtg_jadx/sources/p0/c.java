package p0;

import android.util.Range;
import r8.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends n0.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Range f34098d = new Range(30, 30);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34099a = 60;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34100b = 60;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f34101c = b.FPS_RANGE;

    @Override // n0.b
    public final b a() {
        return this.f34101c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FpsRangeFeature(minFps=");
        sb2.append(this.f34099a);
        sb2.append(", maxFps=");
        return k.o(sb2, this.f34100b, ')');
    }
}
