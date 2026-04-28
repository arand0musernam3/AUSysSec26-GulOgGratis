package x0;

import android.os.Bundle;
import androidx.camera.camera2.compat.quirk.ExtraCroppingQuirk;
import java.util.EnumMap;
import java.util.List;
import org.chromium.support_lib_boundary.WebSettingsBoundaryInterface;
import v80.j0;
import y00.a2;
import y00.h1;
import y00.n1;
import y00.u0;
import y00.w0;
import z5.q;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public class e implements c, y30.a, mg.i, zc.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f43625b;

    public e(int i11) {
        this.f43624a = i11;
        switch (i11) {
            case 2:
                this.f43625b = new EnumMap(a2.class);
                break;
            case 8:
                this.f43625b = (ExtraCroppingQuirk) y.c.a().b(ExtraCroppingQuirk.class);
                break;
            default:
                this.f43625b = new x4.b();
                break;
        }
    }

    @Override // zc.e
    public void a() {
        j0 j0Var = (j0) this.f43625b;
        if (j0Var.g()) {
            j0Var.a(null);
        }
    }

    public long b(long j9) {
        x4.b bVar = (x4.b) this.f43625b;
        bVar.getClass();
        if (q.b(j9) <= 0.0f || q.c(j9) <= 0.0f) {
            y4.a.b("maximumVelocity should be a positive value. You specified=" + ((Object) q.g(j9)));
        }
        return ba0.g.g(bVar.f43824a.b(q.b(j9)), bVar.f43825b.b(q.c(j9)));
    }

    @Override // mg.i
    public void c(int i11) {
        mg.i iVar = (mg.i) this.f43625b;
        if (iVar != null) {
            iVar.c(i11);
        }
    }

    public void d() {
        ((WebSettingsBoundaryInterface) this.f43625b).setAlgorithmicDarkeningAllowed(true);
    }

    public void e() {
        ((WebSettingsBoundaryInterface) this.f43625b).setForceDark(2);
    }

    public void f() {
        ((WebSettingsBoundaryInterface) this.f43625b).setForceDarkBehavior(1);
    }

    public void g(boolean z11, boolean z12, List list, String str, int i11) {
        u0 u0Var;
        h1 h1Var = (h1) this.f43625b;
        int i12 = i11 - 1;
        if (i12 == 0) {
            w0 w0Var = ((n1) h1Var.f21216b).f44987f;
            n1.m(w0Var);
            u0Var = w0Var.f45266n;
        } else if (i12 != 1) {
            if (i12 == 3) {
                w0 w0Var2 = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var2);
                u0Var = w0Var2.f45267o;
            } else if (i12 != 4) {
                w0 w0Var3 = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var3);
                u0Var = w0Var3.f45265m;
            } else if (z11) {
                w0 w0Var4 = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var4);
                u0Var = w0Var4.f45264k;
            } else if (z12) {
                w0 w0Var5 = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var5);
                u0Var = w0Var5.f45263j;
            } else {
                w0 w0Var6 = ((n1) h1Var.f21216b).f44987f;
                n1.m(w0Var6);
                u0Var = w0Var6.l;
            }
        } else if (z11) {
            w0 w0Var7 = ((n1) h1Var.f21216b).f44987f;
            n1.m(w0Var7);
            u0Var = w0Var7.f45261h;
        } else if (z12) {
            w0 w0Var8 = ((n1) h1Var.f21216b).f44987f;
            n1.m(w0Var8);
            u0Var = w0Var8.f45260g;
        } else {
            w0 w0Var9 = ((n1) h1Var.f21216b).f44987f;
            n1.m(w0Var9);
            u0Var = w0Var9.f45262i;
        }
        int size = list.size();
        if (size == 1) {
            u0Var.b(list.get(0), str);
            return;
        }
        if (size == 2) {
            u0Var.c(str, list.get(0), list.get(1));
        } else if (size != 3) {
            u0Var.a(str);
        } else {
            u0Var.d(str, list.get(0), list.get(1), list.get(2));
        }
    }

    @Override // y30.a
    public void h(Bundle bundle) {
        ((r30.b) ((r30.a) this.f43625b)).a("clx", "_ae", bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void i(y00.a2 r3, int r4) {
        /*
            r2 = this;
            y00.h r0 = y00.h.UNSET
            r1 = -30
            if (r4 == r1) goto L1e
            r1 = -20
            if (r4 == r1) goto L1b
            r1 = -10
            if (r4 == r1) goto L18
            if (r4 == 0) goto L1b
            r1 = 30
            if (r4 == r1) goto L15
            goto L20
        L15:
            y00.h r0 = y00.h.INITIALIZATION
            goto L20
        L18:
            y00.h r0 = y00.h.MANIFEST
            goto L20
        L1b:
            y00.h r0 = y00.h.API
            goto L20
        L1e:
            y00.h r0 = y00.h.TCF
        L20:
            java.lang.Object r4 = r2.f43625b
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            r4.put(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x0.e.i(y00.a2, int):void");
    }

    public void j(a2 a2Var, y00.h hVar) {
        ((EnumMap) this.f43625b).put(a2Var, hVar);
    }

    @Override // x0.c
    public void onFailure(Throwable th2) {
        ((e6.i) this.f43625b).d(th2);
    }

    @Override // x0.c
    public void onSuccess(Object obj) {
        e6.i iVar = (e6.i) this.f43625b;
        try {
            iVar.b(obj);
        } catch (Throwable th2) {
            iVar.d(th2);
        }
    }

    @Override // mg.i
    public void q(mg.a aVar, int i11) {
        aVar.getClass();
        mg.i iVar = (mg.i) this.f43625b;
        if (iVar != null) {
            iVar.q(aVar, i11);
        }
    }

    public String toString() {
        switch (this.f43624a) {
            case 2:
                StringBuilder sb2 = new StringBuilder("1");
                for (a2 a2Var : a2.values()) {
                    y00.h hVar = (y00.h) ((EnumMap) this.f43625b).get(a2Var);
                    if (hVar == null) {
                        hVar = y00.h.UNSET;
                    }
                    sb2.append(hVar.c());
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public e(EnumMap enumMap) {
        this.f43624a = 2;
        EnumMap enumMap2 = new EnumMap(a2.class);
        this.f43625b = enumMap2;
        enumMap2.putAll(enumMap);
    }

    public /* synthetic */ e(Object obj, int i11) {
        this.f43624a = i11;
        this.f43625b = obj;
    }
}
