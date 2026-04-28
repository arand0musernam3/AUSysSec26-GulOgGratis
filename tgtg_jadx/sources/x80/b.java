package x80;

import com.braze.h2;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.functions.Function1;
import v80.f0;
import v80.n2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class b implements n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f44032a = k.f44069p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public v80.l f44033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ i f44034c;

    public b(i iVar) {
        this.f44034c = iVar;
    }

    @Override // v80.n2
    public final void a(a90.t tVar, int i11) {
        v80.l lVar = this.f44033b;
        if (lVar != null) {
            lVar.a(tVar, i11);
        }
    }

    public final Object b(z70.c cVar) throws Throwable {
        q qVarR;
        Boolean bool;
        Object obj = this.f44032a;
        boolean z11 = true;
        if (obj == k.f44069p || obj == k.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = i.f44048i;
            i iVar = this.f44034c;
            q qVar = (q) atomicReferenceFieldUpdater.get(iVar);
            while (true) {
                if (iVar.z()) {
                    this.f44032a = k.l;
                    Throwable thS = iVar.s();
                    if (thS != null) {
                        int i11 = a90.u.f1049a;
                        throw thS;
                    }
                    z11 = false;
                } else {
                    long andIncrement = i.f44044e.getAndIncrement(iVar);
                    long j9 = k.f44056b;
                    long j11 = andIncrement / j9;
                    int i12 = (int) (andIncrement % j9);
                    if (qVar.f1048c != j11) {
                        qVarR = iVar.r(j11, qVar);
                        if (qVarR == null) {
                            continue;
                        }
                    } else {
                        qVarR = qVar;
                    }
                    Object objK = iVar.K(qVarR, i12, andIncrement, null);
                    a90.v vVar = k.f44066m;
                    oo.s sVar = null;
                    if (objK == vVar) {
                        h2.b("unreachable");
                        return null;
                    }
                    a90.v vVar2 = k.f44068o;
                    if (objK == vVar2) {
                        if (andIncrement < iVar.w()) {
                            qVarR.a();
                        }
                        qVar = qVarR;
                    } else {
                        if (objK == k.f44067n) {
                            i iVar2 = this.f44034c;
                            v80.l lVarU = f0.u(y70.f.b(cVar));
                            try {
                                this.f44033b = lVarU;
                                Object objK2 = iVar2.K(qVarR, i12, andIncrement, this);
                                Function1 function1 = iVar2.f44052b;
                                if (objK2 == vVar) {
                                    a(qVarR, i12);
                                } else {
                                    if (objK2 == vVar2) {
                                        if (andIncrement < iVar2.w()) {
                                            qVarR.a();
                                        }
                                        q qVar2 = (q) i.f44048i.get(iVar2);
                                        while (true) {
                                            if (iVar2.z()) {
                                                v80.l lVar = this.f44033b;
                                                lVar.getClass();
                                                this.f44033b = null;
                                                this.f44032a = k.l;
                                                Throwable thS2 = iVar.s();
                                                if (thS2 == null) {
                                                    u70.o oVar = u70.q.f40850b;
                                                    lVar.resumeWith(Boolean.FALSE);
                                                } else {
                                                    u70.o oVar2 = u70.q.f40850b;
                                                    lVar.resumeWith(new u70.p(thS2));
                                                }
                                            } else {
                                                long andIncrement2 = i.f44044e.getAndIncrement(iVar2);
                                                long j12 = k.f44056b;
                                                long j13 = andIncrement2 / j12;
                                                int i13 = (int) (andIncrement2 % j12);
                                                if (qVar2.f1048c != j13) {
                                                    q qVarR2 = iVar2.r(j13, qVar2);
                                                    if (qVarR2 != null) {
                                                        qVar2 = qVarR2;
                                                    }
                                                }
                                                Object objK3 = iVar2.K(qVar2, i13, andIncrement2, this);
                                                if (objK3 == k.f44066m) {
                                                    a(qVar2, i13);
                                                    break;
                                                }
                                                if (objK3 == k.f44068o) {
                                                    if (andIncrement2 < iVar2.w()) {
                                                        qVar2.a();
                                                    }
                                                } else {
                                                    if (objK3 == k.f44067n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    qVar2.a();
                                                    this.f44032a = objK3;
                                                    this.f44033b = null;
                                                    bool = Boolean.TRUE;
                                                    if (function1 != null) {
                                                        sVar = new oo.s(12, objK3, function1);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        qVarR.a();
                                        this.f44032a = objK2;
                                        this.f44033b = null;
                                        bool = Boolean.TRUE;
                                        if (function1 != null) {
                                            sVar = new oo.s(12, objK2, function1);
                                        }
                                    }
                                    lVarU.k(bool, sVar);
                                }
                                Object objS = lVarU.s();
                                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                                return objS;
                            } catch (Throwable th2) {
                                lVarU.B();
                                throw th2;
                            }
                        }
                        qVarR.a();
                        this.f44032a = objK;
                    }
                }
            }
        }
        return Boolean.valueOf(z11);
    }

    public final Object c() throws Throwable {
        Object obj = this.f44032a;
        a90.v vVar = k.f44069p;
        if (obj == vVar) {
            h2.b("`hasNext()` has not been invoked");
            return null;
        }
        this.f44032a = vVar;
        if (obj != k.l) {
            return obj;
        }
        Throwable thU = this.f44034c.u();
        int i11 = a90.u.f1049a;
        throw thU;
    }
}
