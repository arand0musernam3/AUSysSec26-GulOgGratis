package b80;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.n0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public class b {
    public void a(Throwable th2, Throwable th3) throws IllegalAccessException, InvocationTargetException {
        th2.getClass();
        th3.getClass();
        Method method = a.f6060b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    public List b(Throwable th2) {
        Object objInvoke;
        th2.getClass();
        Method method = a.f6061c;
        if (method == null || (objInvoke = method.invoke(th2, null)) == null) {
            return n0.f26529a;
        }
        List listAsList = Arrays.asList((Throwable[]) objInvoke);
        listAsList.getClass();
        return listAsList;
    }
}
