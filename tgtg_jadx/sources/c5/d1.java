package c5;

import android.view.Choreographer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v80.l f7158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f7159b;

    public d1(v80.l lVar, e1 e1Var, Function1 function1) {
        this.f7158a = lVar;
        this.f7159b = function1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j9) {
        Object pVar;
        Function1 function1 = this.f7159b;
        try {
            u70.o oVar = u70.q.f40850b;
            pVar = function1.invoke(Long.valueOf(j9));
        } catch (Throwable th2) {
            u70.o oVar2 = u70.q.f40850b;
            pVar = new u70.p(th2);
        }
        this.f7158a.resumeWith(pVar);
    }
}
