package d10;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import o30.m0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements m, e, d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Executor f13715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f13716c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f13717d;

    public l(Executor executor, OnCompleteListener onCompleteListener) {
        this.f13714a = 1;
        this.f13716c = new Object();
        this.f13715b = executor;
        this.f13717d = onCompleteListener;
    }

    @Override // d10.m
    public final void a(Task task) {
        switch (this.f13714a) {
            case 0:
                if (task.l()) {
                    synchronized (this.f13716c) {
                        try {
                            if (((c) this.f13717d) != null) {
                                this.f13715b.execute(new a8.f(this, 4));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            case 1:
                synchronized (this.f13716c) {
                    try {
                        if (((OnCompleteListener) this.f13717d) == null) {
                            return;
                        }
                        this.f13715b.execute(new x0.f(this, task, false, 7));
                        return;
                    } finally {
                    }
                }
            case 2:
                if (task.isSuccessful() || task.l()) {
                    return;
                }
                synchronized (this.f13716c) {
                    try {
                        if (((d) this.f13717d) != null) {
                            this.f13715b.execute(new m0(this, task, false, 6));
                        }
                    } finally {
                    }
                }
                return;
            case 3:
                if (task.isSuccessful()) {
                    synchronized (this.f13716c) {
                        try {
                            if (((e) this.f13717d) != null) {
                                this.f13715b.execute(new x0.f(this, task, false, 8));
                            }
                        } finally {
                        }
                    }
                    return;
                }
                return;
            default:
                this.f13715b.execute(new m0(this, task, false, 7));
                return;
        }
    }

    @Override // d10.m
    public final void b() {
        switch (this.f13714a) {
            case 0:
                synchronized (this.f13716c) {
                    this.f13717d = null;
                    break;
                }
                return;
            case 1:
                synchronized (this.f13716c) {
                    this.f13717d = null;
                    break;
                }
                return;
            case 2:
                synchronized (this.f13716c) {
                    this.f13717d = null;
                    break;
                }
                return;
            case 3:
                synchronized (this.f13716c) {
                    this.f13717d = null;
                    break;
                }
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // d10.c
    public void onCanceled() {
        ((o) this.f13717d).s();
    }

    @Override // d10.d
    public void onFailure(Exception exc) {
        ((o) this.f13717d).r(exc);
    }

    @Override // d10.e
    public void onSuccess(Object obj) {
        ((o) this.f13717d).p(obj);
    }

    public l(Executor executor, c cVar) {
        this.f13714a = 0;
        this.f13716c = new Object();
        this.f13715b = executor;
        this.f13717d = cVar;
    }

    public l(Executor executor, d dVar) {
        this.f13714a = 2;
        this.f13716c = new Object();
        this.f13715b = executor;
        this.f13717d = dVar;
    }

    public l(Executor executor, e eVar) {
        this.f13714a = 3;
        this.f13716c = new Object();
        this.f13715b = executor;
        this.f13717d = eVar;
    }

    public l(Executor executor, f fVar, o oVar) {
        this.f13714a = 4;
        this.f13715b = executor;
        this.f13716c = fVar;
        this.f13717d = oVar;
    }
}
