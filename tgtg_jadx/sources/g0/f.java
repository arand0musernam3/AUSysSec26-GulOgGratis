package g0;

import android.os.Handler;
import android.os.HandlerThread;
import j0.h;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f18053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f18054c;

    public /* synthetic */ f(g gVar, h hVar, int i11) {
        this.f18052a = i11;
        this.f18053b = gVar;
        this.f18054c = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f18052a) {
            case 0:
                g gVar = this.f18053b;
                gVar.f18055a.getClass();
                HandlerThread handlerThread = new HandlerThread("CXCP-Camera-H", gVar.f18058d);
                handlerThread.start();
                this.f18054c.a(j0.e.THREAD, new d1.e(handlerThread, 15));
                return new Handler(handlerThread.getLooper());
            default:
                g gVar2 = this.f18053b;
                Executor executor = gVar2.f18055a.f15307a;
                if (executor != null) {
                    return executor;
                }
                ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(1, new h0.a(gVar2.f18058d, h0.c.b(h0.c.f20961b, "CXCP-Camera-E")));
                executorServiceNewFixedThreadPool.getClass();
                this.f18054c.a(j0.e.THREAD, new d1.e(executorServiceNewFixedThreadPool, 16));
                return executorServiceNewFixedThreadPool;
        }
    }
}
