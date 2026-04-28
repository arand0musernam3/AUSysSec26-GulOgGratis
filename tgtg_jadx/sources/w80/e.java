package w80;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import mn.g;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.p;
import u70.q;
import v80.l;
import v80.p0;
import y70.f;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f43298a = 0;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object pVar;
        try {
            o oVar = q.f40850b;
            pVar = new c(b(Looper.getMainLooper()));
        } catch (Throwable th2) {
            o oVar2 = q.f40850b;
            pVar = new p(th2);
        }
        if (pVar instanceof p) {
            pVar = null;
        }
    }

    public static final void a(l lVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        choreographer2.postFrameCallback(new d(lVar));
    }

    public static final Handler b(Looper looper) throws IllegalAccessException, InvocationTargetException {
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    public static final Object c(g gVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            l lVar = new l(1, f.b(gVar));
            lVar.t();
            choreographer2.postFrameCallback(new d(lVar));
            Object objS = lVar.s();
            y70.a aVar = y70.a.COROUTINE_SUSPENDED;
            return objS;
        }
        l lVar2 = new l(1, f.b(gVar));
        lVar2.t();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            a(lVar2);
        } else {
            c90.f fVar = p0.f42144a;
            a90.p.f1044a.u0(lVar2.f42119e, new a8.f(lVar2, 19));
        }
        Object objS2 = lVar2.s();
        y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
        return objS2;
    }
}
