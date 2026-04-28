package d7;

import android.os.Handler;
import android.os.Looper;
import c50.w;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f14565b;

    public e(int i11) {
        this.f14564a = i11;
        switch (i11) {
            case 5:
                this.f14565b = new Handler(Looper.getMainLooper());
                break;
            case 6:
                this.f14565b = new Handler(Looper.getMainLooper());
                break;
            default:
                this.f14565b = new Handler(Looper.getMainLooper());
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f14564a) {
            case 0:
                runnable.getClass();
                Handler handler = this.f14565b;
                if (!handler.post(runnable)) {
                    w.k(handler);
                    break;
                }
                break;
            case 1:
                runnable.getClass();
                Handler handler2 = this.f14565b;
                if (!handler2.post(runnable)) {
                    w.k(handler2);
                    break;
                }
                break;
            case 2:
                runnable.getClass();
                Handler handler3 = this.f14565b;
                if (!handler3.post(runnable)) {
                    w.k(handler3);
                    break;
                }
                break;
            case 3:
                this.f14565b.post(runnable);
                break;
            case 4:
                this.f14565b.post(runnable);
                break;
            case 5:
                this.f14565b.post(runnable);
                break;
            default:
                this.f14565b.post(runnable);
                break;
        }
    }

    public /* synthetic */ e(Handler handler, int i11) {
        this.f14564a = i11;
        this.f14565b = handler;
    }

    public e(Handler handler) {
        this.f14564a = 2;
        handler.getClass();
        this.f14565b = handler;
    }
}
