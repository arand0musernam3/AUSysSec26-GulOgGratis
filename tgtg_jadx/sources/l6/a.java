package l6;

import f6.t;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends k6.g {

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final /* synthetic */ int f27387n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public float f27388o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(t tVar, k6.l lVar, int i11) {
        super(tVar, lVar);
        this.f27387n0 = i11;
    }

    @Override // k6.g, k6.b, k6.h
    public final void apply() {
        switch (this.f27387n0) {
            case 0:
                Iterator it = this.f26049m0.iterator();
                while (it.hasNext()) {
                    k6.b bVarB = this.f26047k0.b(it.next());
                    bVarB.g();
                    Object obj = this.N;
                    if (obj != null) {
                        bVarB.o(obj);
                    } else {
                        Object obj2 = this.O;
                        if (obj2 != null) {
                            bVarB.f26000d0 = k6.j.START_TO_END;
                            bVarB.O = obj2;
                        } else {
                            bVarB.o(0);
                        }
                    }
                    Object obj3 = this.P;
                    if (obj3 != null) {
                        bVarB.f26000d0 = k6.j.END_TO_START;
                        bVarB.P = obj3;
                    } else {
                        Object obj4 = this.Q;
                        if (obj4 != null) {
                            bVarB.i(obj4);
                        } else {
                            bVarB.i(0);
                        }
                    }
                    float f11 = this.f27388o0;
                    if (f11 != 0.5f) {
                        bVarB.f26007h = f11;
                    }
                }
                break;
            default:
                Iterator it2 = this.f26049m0.iterator();
                while (it2.hasNext()) {
                    k6.b bVarB2 = this.f26047k0.b(it2.next());
                    bVarB2.h();
                    Object obj5 = this.R;
                    if (obj5 != null) {
                        bVarB2.p(obj5);
                    } else {
                        Object obj6 = this.S;
                        if (obj6 != null) {
                            bVarB2.f26000d0 = k6.j.TOP_TO_BOTTOM;
                            bVarB2.S = obj6;
                        } else {
                            bVarB2.p(0);
                        }
                    }
                    Object obj7 = this.U;
                    if (obj7 != null) {
                        bVarB2.f26000d0 = k6.j.BOTTOM_TO_TOP;
                        bVarB2.U = obj7;
                    } else {
                        Object obj8 = this.V;
                        if (obj8 != null) {
                            bVarB2.e(obj8);
                        } else {
                            bVarB2.e(0);
                        }
                    }
                    float f12 = this.f27388o0;
                    if (f12 != 0.5f) {
                        bVarB2.f26009i = f12;
                    }
                }
                break;
        }
    }
}
