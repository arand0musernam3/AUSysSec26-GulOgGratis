package s0;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c2 f38344e = c2.DEFAULT;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e2[] f38345f = {e2.S720P_16_9, e2.S1080P_4_3, e2.S1080P_16_9, e2.S1440P_16_9, e2.UHD, e2.X_VGA};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f38346g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final LinkedHashMap f38347h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g2 f38348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e2 f38349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f38350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f38351d;

    static {
        Map mapE = kotlin.collections.x0.e(new Pair(g2.YUV, 35), new Pair(g2.JPEG, 256), new Pair(g2.JPEG_R, 4101), new Pair(g2.RAW, 32), new Pair(g2.PRIV, 34));
        f38346g = mapE;
        Set<Map.Entry> setEntrySet = mapE.entrySet();
        int iA = kotlin.collections.w0.a(kotlin.collections.e0.o(setEntrySet, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        for (Map.Entry entry : setEntrySet) {
            linkedHashMap.put(Integer.valueOf(((Number) entry.getValue()).intValue()), (g2) entry.getKey());
        }
        f38347h = linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    public i2(g2 g2Var, e2 e2Var, c2 c2Var) {
        g2Var.getClass();
        e2Var.getClass();
        c2Var.getClass();
        this.f38348a = g2Var;
        this.f38349b = e2Var;
        this.f38350c = c2Var;
        Integer num = (Integer) f38346g.get(g2Var);
        this.f38351d = num != null ? num.intValue() : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i2)) {
            return false;
        }
        i2 i2Var = (i2) obj;
        return this.f38348a == i2Var.f38348a && this.f38349b == i2Var.f38349b && this.f38350c == i2Var.f38350c;
    }

    public final int hashCode() {
        return this.f38350c.hashCode() + ((this.f38349b.hashCode() + (this.f38348a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SurfaceConfig(configType=" + this.f38348a + ", configSize=" + this.f38349b + ", streamUseCase=" + this.f38350c + ')';
    }
}
