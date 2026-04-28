package u3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref;
import lw.o;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Throwable f40642b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f40641a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f40643c = new a(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public o0 f40644d = new o0();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public o0 f40645e = new o0();

    public final m3.g a(b bVar, Function0 function0) {
        int i11;
        int i12;
        int i13;
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        synchronized (this.f40641a) {
            Throwable th2 = this.f40642b;
            if (th2 != null) {
                bVar.b(th2);
                return m3.f.f29270b;
            }
            a aVar = this.f40643c;
            do {
                i11 = aVar.get();
                i12 = i11 + 1;
            } while (!aVar.compareAndSet(i11, i12));
            boolean z11 = (134217727 & i12) == 1;
            intRef.element = (i12 >>> 27) & 15;
            this.f40644d.g(bVar);
            if (z11 && function0 != null) {
                try {
                    function0.invoke();
                } catch (Throwable th3) {
                    synchronized (this.f40641a) {
                        try {
                            if (this.f40642b == null) {
                                this.f40642b = th3;
                                o0 o0Var = this.f40644d;
                                Object[] objArr = o0Var.f35721a;
                                int i14 = o0Var.f35722b;
                                for (int i15 = 0; i15 < i14; i15++) {
                                    ((b) objArr[i15]).b(th3);
                                }
                                this.f40644d.j();
                                a aVar2 = this.f40643c;
                                do {
                                    i13 = aVar2.get();
                                } while (!aVar2.compareAndSet(i13, ((((i13 >>> 27) & 15) + 1) & 15) << 27));
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
            return new k8.d(new o(bVar, this, intRef, 23));
        }
    }

    public final void b(Function1 function1) {
        int i11;
        synchronized (this.f40641a) {
            try {
                o0 o0Var = this.f40644d;
                this.f40644d = this.f40645e;
                this.f40645e = o0Var;
                a aVar = this.f40643c;
                do {
                    i11 = aVar.get();
                } while (!aVar.compareAndSet(i11, ((((i11 >>> 27) & 15) + 1) & 15) << 27));
                int i12 = o0Var.f35722b;
                for (int i13 = 0; i13 < i12; i13++) {
                    function1.invoke(o0Var.b(i13));
                }
                o0Var.j();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
