package c80;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class b extends b80.b {
    @Override // b80.b
    public final void a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        th2.getClass();
        th3.getClass();
        Integer num = a.f7801b;
        if (num == null || num.intValue() >= 19) {
            th2.addSuppressed(th3);
        } else {
            super.a(th2, th3);
        }
    }

    @Override // b80.b
    public final List b(Throwable th2) {
        th2.getClass();
        Integer num = a.f7801b;
        if (num != null && num.intValue() < 19) {
            return super.b(th2);
        }
        Throwable[] suppressed = th2.getSuppressed();
        suppressed.getClass();
        List listAsList = Arrays.asList(suppressed);
        listAsList.getClass();
        return listAsList;
    }
}
