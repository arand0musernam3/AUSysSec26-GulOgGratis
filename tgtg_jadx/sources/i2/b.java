package i2;

import kotlin.jvm.functions.Function0;
import m3.k1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e0 {
    public static final ub.a J = y3.j.b(new g60.a(19), new hb0.q(8));
    public final k1 I;

    public b(int i11, float f11, Function0 function0) {
        super(f11, i11);
        this.I = m3.i.w(function0);
    }

    @Override // i2.e0
    public final int o() {
        return ((Number) ((Function0) this.I.getValue()).invoke()).intValue();
    }
}
