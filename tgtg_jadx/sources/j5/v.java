package j5;

import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import b5.m0;
import kotlin.jvm.internal.Intrinsics;
import q1.g0;
import q1.h0;
import q1.o0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f24702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f24703b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1.o f24704c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o0 f24705d = new o0(2);

    public v(m0 m0Var, f fVar, g0 g0Var) {
        this.f24702a = m0Var;
        this.f24703b = fVar;
        this.f24704c = g0Var;
    }

    public final t a() {
        return new t(this.f24703b, false, this.f24702a, new n());
    }

    public final void b(m0 m0Var, n nVar) {
        m5.h hVar;
        m5.h hVar2;
        o0 o0Var = this.f24705d;
        Object[] objArr = o0Var.f35721a;
        int i11 = o0Var.f35722b;
        boolean z11 = false;
        for (int i12 = 0; i12 < i11; i12++) {
            c4.d dVar = (c4.d) objArr[i12];
            se.b bVar = dVar.f7025a;
            AutofillManager autofillManager = (AutofillManager) bVar.f39010b;
            c5.y yVar = dVar.f7027c;
            n nVarY = m0Var.y();
            int i13 = m0Var.f5866b;
            String str = (nVar == null || (hVar2 = (m5.h) w.d(nVar, x.E)) == null) ? null : hVar2.f29538b;
            String str2 = (nVarY == null || (hVar = (m5.h) w.d(nVarY, x.E)) == null) ? null : hVar.f29538b;
            if (str != str2) {
                if (str == null) {
                    bVar.s(yVar, i13, true);
                } else if (str2 == null) {
                    bVar.s(yVar, i13, z11);
                } else if (Intrinsics.areEqual((c4.e) w.d(nVarY, x.f24723r), c4.m.f7039a)) {
                    autofillManager.notifyValueChanged(yVar, i13, AutofillValue.forText(str2));
                }
            }
            l5.a aVar = nVar != null ? (l5.a) w.d(nVar, x.J) : null;
            l5.a aVar2 = nVarY != null ? (l5.a) w.d(nVarY, x.J) : null;
            if (aVar != aVar2) {
                if (aVar == null) {
                    bVar.s(yVar, i13, true);
                } else if (aVar2 == null) {
                    bVar.s(yVar, i13, false);
                } else if (Intrinsics.areEqual((c4.e) w.d(nVarY, x.f24723r), c4.m.f7040b)) {
                    int i14 = c4.a.$EnumSwitchMapping$0[aVar2.ordinal()];
                    Boolean bool = i14 != 1 ? i14 != 2 ? null : Boolean.FALSE : Boolean.TRUE;
                    if (bool != null) {
                        autofillManager.notifyValueChanged(yVar, i13, AutofillValue.forToggle(bool.booleanValue()));
                    }
                }
            }
            c4.g gVar = nVar != null ? (c4.g) w.d(nVar, x.f24724s) : null;
            c4.g gVar2 = nVarY != null ? (c4.g) w.d(nVarY, x.f24724s) : null;
            if (Intrinsics.areEqual(gVar, gVar2)) {
                z11 = false;
            } else if (gVar == null) {
                bVar.s(yVar, i13, true);
                z11 = false;
            } else if (gVar2 == null) {
                z11 = false;
                bVar.s(yVar, i13, false);
            } else {
                z11 = false;
                autofillManager.notifyValueChanged(yVar, i13, gVar2.f7036a);
            }
            boolean z12 = (nVar == null || !nVar.f24682a.a(x.f24722q)) ? z11 : true;
            boolean z13 = (nVarY == null || !nVarY.f24682a.a(x.f24722q)) ? z11 : true;
            if (z12 != z13) {
                h0 h0Var = dVar.f7032h;
                if (z13) {
                    h0Var.b(i13);
                } else {
                    h0Var.e(i13);
                }
            }
        }
    }
}
