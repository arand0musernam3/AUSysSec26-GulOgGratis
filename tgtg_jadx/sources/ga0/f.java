package ga0;

import ia0.c0;
import java.io.IOException;
import java.util.Iterator;
import kotlin.jvm.internal.LongCompanionObject;
import u90.o;
import u90.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends t90.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f20283e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f20284f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(r8.k.p(new StringBuilder(), gVar.f20297m, " writer"), true);
        this.f20283e = 0;
        this.f20284f = gVar;
    }

    @Override // t90.a
    public final long a() {
        o oVar;
        switch (this.f20283e) {
            case 0:
                g gVar = (g) this.f20284f;
                try {
                    break;
                } catch (IOException e5) {
                    g.c(gVar, e5, null, 2);
                }
                return gVar.f() ? 0L : -1L;
            case 1:
                s90.g gVar2 = (s90.g) this.f20284f;
                synchronized (gVar2) {
                    if (gVar2.f38946m && !gVar2.f38947n) {
                        try {
                            gVar2.I();
                        } catch (IOException unused) {
                            gVar2.f38948o = true;
                        }
                        try {
                            if (gVar2.t()) {
                                gVar2.G();
                                gVar2.f38944j = 0;
                            }
                        } catch (IOException unused2) {
                            gVar2.f38949p = true;
                            c0 c0Var = gVar2.f38942h;
                            if (c0Var != null) {
                                r90.e.b(c0Var);
                            }
                            gVar2.f38942h = new c0(new ia0.e());
                        }
                    }
                    break;
                }
                return -1L;
            default:
                p pVar = (p) this.f20284f;
                long jNanoTime = System.nanoTime();
                long j9 = (jNanoTime - pVar.f40956a) + 1;
                Iterator it = pVar.f40959d.iterator();
                it.getClass();
                long j11 = LongCompanionObject.MAX_VALUE;
                int i11 = 0;
                int i12 = 0;
                o oVar2 = null;
                o oVar3 = null;
                while (it.hasNext()) {
                    o oVar4 = (o) it.next();
                    oVar4.getClass();
                    synchronized (oVar4) {
                        if (pVar.a(oVar4, jNanoTime) > 0) {
                            i12++;
                        } else {
                            long j12 = j11;
                            long j13 = oVar4.f40955q;
                            if (j13 < j9) {
                                j9 = j13;
                                oVar2 = oVar4;
                            }
                            i11++;
                            if (j13 < j12) {
                                j11 = j13;
                                oVar3 = oVar4;
                            } else {
                                j11 = j12;
                            }
                        }
                    }
                }
                long j14 = j11;
                if (oVar2 != null) {
                    oVar = oVar2;
                } else if (i11 > 5) {
                    oVar = oVar3;
                    j9 = j14;
                } else {
                    j9 = -1;
                    oVar = null;
                }
                if (oVar == null) {
                    if (oVar3 != null) {
                        return (j14 + pVar.f40956a) - jNanoTime;
                    }
                    if (i12 > 0) {
                        return pVar.f40956a;
                    }
                    return -1L;
                }
                synchronized (oVar) {
                    if (oVar.f40954p.isEmpty() && oVar.f40955q == j9) {
                        oVar.f40949j = true;
                        pVar.f40959d.remove(oVar);
                        r90.g.c(oVar.f40944e);
                        if (!pVar.f40959d.isEmpty()) {
                            return 0L;
                        }
                        t90.c cVar = pVar.f40957b;
                        synchronized (cVar.f39869a) {
                            if (cVar.a()) {
                                cVar.f39869a.c(cVar);
                            }
                            break;
                        }
                        return 0L;
                    }
                    return 0L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Object obj, int i11, String str) {
        super(str, true);
        this.f20283e = i11;
        this.f20284f = obj;
    }
}
