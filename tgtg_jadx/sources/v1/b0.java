package v1;

import android.view.KeyEvent;
import c5.u3;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import z1.y3;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class b0 extends g {
    public w4.v M;

    @Override // v1.g, b5.i2
    public final void F() {
        super.F();
        if (this.M != null) {
            this.M = null;
            S0(false);
        }
    }

    @Override // v1.g
    public final w4.m0 P0() {
        return null;
    }

    @Override // v1.g
    public final boolean X0(KeyEvent keyEvent) {
        return false;
    }

    @Override // v1.g
    public final void Y0(KeyEvent keyEvent) {
        this.f41727w.invoke();
    }

    @Override // v1.g, b5.i2
    public final void p0(w4.n nVar, w4.o oVar, long j9) {
        super.p0(nVar, oVar, j9);
        if (oVar != w4.o.Main) {
            if (oVar != w4.o.Final || this.M == null) {
                return;
            }
            List list = nVar.f43165a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                w4.v vVar = (w4.v) list.get(i11);
                if (vVar.b() && !Intrinsics.areEqual(vVar, this.M)) {
                    this.M = null;
                    S0(false);
                    return;
                }
            }
            return;
        }
        w4.v vVar2 = this.M;
        if (vVar2 == null) {
            if (y3.g(nVar, true, false)) {
                w4.v vVar3 = (w4.v) nVar.f43165a.get(0);
                vVar3.a();
                this.M = vVar3;
                if (this.f41726v) {
                    U0(vVar3.f43180c, false);
                    return;
                }
                return;
            }
            return;
        }
        List list2 = nVar.f43165a;
        int size2 = list2.size();
        for (int i12 = 0; i12 < size2; i12++) {
            if (!w4.u.c((w4.v) list2.get(i12))) {
                long jX0 = b5.m.g(this).f5889z.x0(((u3) b5.o.e(this, c5.x1.f7426s)).d());
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX0 >> 32)) - ((int) (j9 >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jX0 & 4294967295L)) - ((int) (j9 & 4294967295L))) / 2.0f)) & 4294967295L);
                int size3 = list2.size();
                for (int i13 = 0; i13 < size3; i13++) {
                    w4.v vVar4 = (w4.v) list2.get(i13);
                    if (vVar4.b() || w4.u.f(vVar4, j9, jFloatToRawIntBits)) {
                        this.M = null;
                        S0(false);
                        return;
                    }
                }
                return;
            }
        }
        ((w4.v) list2.get(0)).a();
        if (this.f41726v) {
            T0(vVar2.f43180c, false);
            this.f41727w.invoke();
        }
        this.M = null;
    }
}
