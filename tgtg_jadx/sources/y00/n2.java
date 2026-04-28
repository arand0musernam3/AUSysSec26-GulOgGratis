package y00;

import android.os.Bundle;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class n2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f45007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f45008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t2 f45009c;

    public n2(t2 t2Var, AtomicReference atomicReference, int i11) {
        this.f45007a = i11;
        switch (i11) {
            case 1:
                this.f45008b = atomicReference;
                Objects.requireNonNull(t2Var);
                this.f45009c = t2Var;
                break;
            case 2:
                this.f45009c = t2Var;
                this.f45008b = atomicReference;
                break;
            default:
                this.f45008b = atomicReference;
                Objects.requireNonNull(t2Var);
                this.f45009c = t2Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f45007a) {
            case 0:
                AtomicReference atomicReference = this.f45008b;
                synchronized (atomicReference) {
                    try {
                        try {
                            n1 n1Var = (n1) this.f45009c.f21216b;
                            atomicReference.set(Long.valueOf(n1Var.f44985d.x(n1Var.r().v(), g0.f44769c0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            case 1:
                AtomicReference atomicReference2 = this.f45008b;
                synchronized (atomicReference2) {
                    try {
                        try {
                            n1 n1Var2 = (n1) this.f45009c.f21216b;
                            atomicReference2.set(Double.valueOf(n1Var2.f44985d.z(n1Var2.r().v(), g0.f44775e0)));
                        } finally {
                        }
                    } finally {
                    }
                }
                return;
            default:
                t2 t2Var = this.f45009c;
                e1 e1Var = ((n1) t2Var.f21216b).f44986e;
                n1.k(e1Var);
                Bundle bundleC0 = e1Var.f44718o.c0();
                m3 m3VarP = ((n1) t2Var.f21216b).p();
                AtomicReference atomicReference3 = this.f45008b;
                m3VarP.p();
                m3VarP.q();
                m3VarP.D(new h7.h1(8, m3VarP, atomicReference3, m3VarP.F(false), bundleC0));
                return;
        }
    }
}
