package b0;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j3 implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5257a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5258b;

    public /* synthetic */ j3(Object obj, int i11) {
        this.f5257a = i11;
        this.f5258b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f5257a) {
            case 0:
                k3 k3Var = (k3) this.f5258b;
                k3Var.f5267c.execute(new a40.l(21, k3Var, runnable));
                break;
            default:
                ((Choreographer) this.f5258b).postFrameCallback(new k8.c(1, runnable));
                break;
        }
    }
}
