package z4;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends Lambda implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f47148a = new j(2);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.s sVar = (m3.s) nVar;
        if (!sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
