package w0;

import android.os.Looper;
import com.google.android.gms.internal.measurement.w5;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import m0.m;
import o30.y0;
import y00.l1;
import y00.n1;
import y00.t2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements Executor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile d f42809c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f42811b;

    public d(int i11) {
        this.f42810a = i11;
        switch (i11) {
            case 1:
                this.f42811b = new w5(Looper.getMainLooper(), 5);
                break;
            default:
                this.f42811b = Executors.newFixedThreadPool(2, new m(2));
                break;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f42810a) {
            case 0:
                ((ExecutorService) this.f42811b).execute(runnable);
                break;
            case 1:
                ((w5) this.f42811b).post(runnable);
                break;
            case 2:
                ((sb.a) this.f42811b).f38958c.post(runnable);
                break;
            case 3:
                ((Executor) this.f42811b).execute(new y0(3, runnable));
                break;
            case 4:
                ((w5) this.f42811b).post(runnable);
                break;
            default:
                l1 l1Var = ((n1) ((t2) this.f42811b).f21216b).f44988g;
                n1.m(l1Var);
                l1Var.y(runnable);
                break;
        }
    }

    public d(Looper looper) {
        this.f42810a = 4;
        this.f42811b = new w5(looper, 3);
    }

    public /* synthetic */ d(Object obj, int i11) {
        this.f42810a = i11;
        this.f42811b = obj;
    }
}
