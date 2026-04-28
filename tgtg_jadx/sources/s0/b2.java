package s0;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements Runnable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Object f38296h = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f38297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k1 f38298b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f38300d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f38299c = new AtomicBoolean(true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f38301e = f38296h;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f38302f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38303g = false;

    public b2(AtomicReference atomicReference, Executor executor, k1 k1Var) {
        this.f38300d = atomicReference;
        this.f38297a = executor;
        this.f38298b = k1Var;
    }

    public final void a(int i11) {
        synchronized (this) {
            try {
                if (this.f38299c.get()) {
                    if (i11 <= this.f38302f) {
                        return;
                    }
                    this.f38302f = i11;
                    if (this.f38303g) {
                        return;
                    }
                    this.f38303g = true;
                    try {
                        this.f38297a.execute(this);
                    } catch (Throwable unused) {
                        synchronized (this) {
                            this.f38303g = false;
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            try {
                if (!this.f38299c.get()) {
                    this.f38303g = false;
                    return;
                }
                Object obj = this.f38300d.get();
                int i11 = this.f38302f;
                while (true) {
                    if (!Objects.equals(this.f38301e, obj)) {
                        this.f38301e = obj;
                        boolean z11 = obj instanceof m;
                        k1 k1Var = this.f38298b;
                        if (z11) {
                            k1Var.onError(null);
                        } else {
                            k1Var.j(obj);
                        }
                    }
                    synchronized (this) {
                        try {
                            if (i11 == this.f38302f || !this.f38299c.get()) {
                                break;
                            }
                            obj = this.f38300d.get();
                            i11 = this.f38302f;
                        } finally {
                        }
                    }
                }
                this.f38303g = false;
            } finally {
            }
        }
    }
}
