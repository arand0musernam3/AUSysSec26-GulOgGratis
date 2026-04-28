package o90;

import kotlin.text.StringsKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f32160a;

    static {
        Object pVar;
        try {
            u70.o oVar = u70.q.f40850b;
            String property = System.getProperty("kotlinx.serialization.json.pool.size");
            pVar = property != null ? StringsKt.toIntOrNull(property) : null;
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        Integer num = (Integer) (pVar instanceof u70.p ? null : pVar);
        f32160a = num != null ? num.intValue() : 2097152;
    }
}
