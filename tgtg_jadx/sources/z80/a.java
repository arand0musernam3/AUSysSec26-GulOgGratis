package z80;

import java.util.Arrays;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c[] f47352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f47353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f47354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f47355d;

    public final c b() {
        c cVarC;
        y yVar;
        synchronized (this) {
            try {
                c[] cVarArrD = this.f47352a;
                if (cVarArrD == null) {
                    cVarArrD = d();
                    this.f47352a = cVarArrD;
                } else if (this.f47353b >= cVarArrD.length) {
                    Object[] objArrCopyOf = Arrays.copyOf(cVarArrD, cVarArrD.length * 2);
                    this.f47352a = (c[]) objArrCopyOf;
                    cVarArrD = (c[]) objArrCopyOf;
                }
                int i11 = this.f47354c;
                do {
                    cVarC = cVarArrD[i11];
                    if (cVarC == null) {
                        cVarC = c();
                        cVarArrD[i11] = cVarC;
                    }
                    i11++;
                    if (i11 >= cVarArrD.length) {
                        i11 = 0;
                    }
                } while (!cVarC.a(this));
                this.f47354c = i11;
                this.f47353b++;
                yVar = this.f47355d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (yVar != null) {
            yVar.v(1);
        }
        return cVarC;
    }

    public abstract c c();

    public abstract c[] d();

    public final void e(c cVar) {
        y yVar;
        int i11;
        x70.c[] cVarArrB;
        synchronized (this) {
            try {
                int i12 = this.f47353b - 1;
                this.f47353b = i12;
                yVar = this.f47355d;
                if (i12 == 0) {
                    this.f47354c = 0;
                }
                cVar.getClass();
                cVarArrB = cVar.b(this);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (x70.c cVar2 : cVarArrB) {
            if (cVar2 != null) {
                u70.o oVar = u70.q.f40850b;
                cVar2.resumeWith(Unit.f26487a);
            }
        }
        if (yVar != null) {
            yVar.v(-1);
        }
    }

    public final y f() {
        y yVar;
        synchronized (this) {
            yVar = this.f47355d;
            if (yVar == null) {
                int i11 = this.f47353b;
                yVar = new y(1, Integer.MAX_VALUE, x80.a.DROP_OLDEST);
                yVar.i(Integer.valueOf(i11));
                this.f47355d = yVar;
            }
        }
        return yVar;
    }
}
