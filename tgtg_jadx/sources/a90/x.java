package a90;

import a3.r2;
import kotlin.coroutines.CoroutineContext;
import v80.e2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v f1053a = new v("NO_THREAD_ELEMENTS", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r2 f1054b = new r2(1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r2 f1055c = new r2(2);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r2 f1056d = new r2(3);

    public static final void a(CoroutineContext coroutineContext, Object obj) {
        if (obj == f1053a) {
            return;
        }
        if (!(obj instanceof b0)) {
            Object objFold = coroutineContext.fold(null, f1055c);
            objFold.getClass();
            ((e2) objFold).Q(coroutineContext, obj);
            return;
        }
        b0 b0Var = (b0) obj;
        e2[] e2VarArr = b0Var.f1011c;
        int length = e2VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            e2 e2Var = e2VarArr[length];
            e2Var.getClass();
            e2Var.Q(coroutineContext, b0Var.f1010b[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }

    public static final Object b(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f1054b);
        objFold.getClass();
        return objFold;
    }

    public static final Object c(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = b(coroutineContext);
        }
        return obj == 0 ? f1053a : obj instanceof Integer ? coroutineContext.fold(new b0(((Number) obj).intValue(), coroutineContext), f1056d) : ((e2) obj).i0(coroutineContext);
    }
}
