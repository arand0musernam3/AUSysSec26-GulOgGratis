package a90;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f1049a = 0;

    static {
        Object pVar;
        Object pVar2;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            u70.o oVar = u70.q.f40850b;
            pVar = z70.a.class.getCanonicalName();
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        if (u70.q.a(pVar) != null) {
            pVar = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            pVar2 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            u70.o oVar3 = u70.q.f40850b;
            pVar2 = new u70.p(th3);
        }
        if (u70.q.a(pVar2) != null) {
            pVar2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
