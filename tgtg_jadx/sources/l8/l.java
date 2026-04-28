package l8;

import com.google.firebase.messaging.a0;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends h0.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ h0.g f27467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ThreadPoolExecutor f27468g;

    public l(h0.g gVar, ThreadPoolExecutor threadPoolExecutor) {
        super(14);
        this.f27467f = gVar;
        this.f27468g = threadPoolExecutor;
    }

    @Override // h0.g
    public final void B(Throwable th2) {
        ThreadPoolExecutor threadPoolExecutor = this.f27468g;
        try {
            this.f27467f.B(th2);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // h0.g
    public final void C(a0 a0Var) {
        ThreadPoolExecutor threadPoolExecutor = this.f27468g;
        try {
            this.f27467f.C(a0Var);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
