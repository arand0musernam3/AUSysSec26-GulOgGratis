package y00;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class l2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f44914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f44915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f44916c;

    public l2(t2 t2Var, AtomicReference atomicReference, int i11) {
        this.f44914a = i11;
        switch (i11) {
            case 1:
                this.f44915b = atomicReference;
                Objects.requireNonNull(t2Var);
                this.f44916c = t2Var;
                break;
            case 2:
                this.f44915b = atomicReference;
                Objects.requireNonNull(t2Var);
                this.f44916c = t2Var;
                break;
            case 3:
                this.f44916c = t2Var;
                this.f44915b = atomicReference;
                break;
            default:
                this.f44915b = atomicReference;
                Objects.requireNonNull(t2Var);
                this.f44916c = t2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f44914a) {
            case 0:
                AtomicReference atomicReference = this.f44915b;
                synchronized (atomicReference) {
                    try {
                        try {
                            n1 n1Var = (n1) this.f44916c.f21216b;
                            atomicReference.set(Boolean.valueOf(n1Var.f44985d.A(n1Var.r().v(), g0.f44763a0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f44915b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            n1 n1Var2 = (n1) this.f44916c.f21216b;
                            atomicReference2.set(n1Var2.f44985d.w(n1Var2.r().v(), g0.f44766b0));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 2:
                AtomicReference atomicReference3 = this.f44915b;
                synchronized (atomicReference3) {
                    try {
                        try {
                            n1 n1Var3 = (n1) this.f44916c.f21216b;
                            atomicReference3.set(Integer.valueOf(n1Var3.f44985d.y(n1Var3.r().v(), g0.f44772d0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                m3 m3VarP = ((n1) this.f44916c.f21216b).p();
                c4 c4VarD = c4.d(z2.SGTM_CLIENT);
                AtomicReference atomicReference4 = this.f44915b;
                m3VarP.p();
                m3VarP.q();
                m3VarP.D(new h7.h1(9, m3VarP, atomicReference4, m3VarP.F(false), c4VarD));
                return;
        }
    }
}
