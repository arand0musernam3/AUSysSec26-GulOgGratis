package rb;

import com.google.firebase.messaging.r;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f37846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayDeque f37847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Runnable f37848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f37849e;

    public k(Executor executor, int i11) {
        this.f37845a = i11;
        switch (i11) {
            case 1:
                executor.getClass();
                this.f37846b = executor;
                this.f37847c = new ArrayDeque();
                this.f37849e = new Object();
                break;
            default:
                this.f37846b = executor;
                this.f37847c = new ArrayDeque();
                this.f37849e = new Object();
                break;
        }
    }

    public final void a() {
        switch (this.f37845a) {
            case 0:
                Runnable runnable = (Runnable) this.f37847c.poll();
                this.f37848d = runnable;
                if (runnable != null) {
                    this.f37846b.execute(runnable);
                    return;
                }
                return;
            case 1:
                synchronized (this.f37849e) {
                    Object objPoll = this.f37847c.poll();
                    Runnable runnable2 = (Runnable) objPoll;
                    this.f37848d = runnable2;
                    if (objPoll != null) {
                        this.f37846b.execute(runnable2);
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f37849e) {
                    try {
                        Runnable runnable3 = (Runnable) this.f37847c.poll();
                        this.f37848d = runnable3;
                        if (runnable3 != null) {
                            ((w0.a) this.f37846b).execute(runnable3);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f37845a) {
            case 0:
                synchronized (this.f37849e) {
                    try {
                        this.f37847c.add(new x0.f(17, this, runnable));
                        if (this.f37848d == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
            case 1:
                runnable.getClass();
                synchronized (this.f37849e) {
                    this.f37847c.offer(new v30.a(runnable, this));
                    if (this.f37848d == null) {
                        a();
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f37849e) {
                    try {
                        this.f37847c.add(new r(24, this, runnable));
                        if (this.f37848d == null) {
                            a();
                        }
                    } finally {
                    }
                    break;
                }
                return;
        }
    }

    public k(w0.a aVar) {
        this.f37845a = 2;
        this.f37849e = new Object();
        this.f37847c = new ArrayDeque();
        this.f37846b = aVar;
    }
}
