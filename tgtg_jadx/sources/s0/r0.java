package s0;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f38435f = new g("camerax.core.captureConfig.rotation", Integer.TYPE, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f38436g = new g("camerax.core.captureConfig.jpegQuality", Integer.class, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f38437h = new g("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f38438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l1 f38439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f38440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f38441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k2 f38442e;

    public r0(ArrayList arrayList, l1 l1Var, int i11, ArrayList arrayList2, k2 k2Var) {
        this.f38438a = arrayList;
        this.f38439b = l1Var;
        this.f38440c = i11;
        this.f38441d = Collections.unmodifiableList(arrayList2);
        this.f38442e = k2Var;
    }

    public final Range a() {
        Range range = (Range) this.f38439b.i(f38437h, n.f38401h);
        Objects.requireNonNull(range);
        return range;
    }
}
