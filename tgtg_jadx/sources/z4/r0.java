package z4;

import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends l1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47221b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f47222c;

    public /* synthetic */ r0(Object obj, int i11) {
        this.f47221b = i11;
        this.f47222c = obj;
    }

    @Override // z5.c
    public final float X() {
        switch (this.f47221b) {
            case 0:
                return ((b5.u0) this.f47222c).X();
            default:
                return ((c5.y) this.f47222c).getDensity().X();
        }
    }

    @Override // z5.c
    public final float a() {
        switch (this.f47221b) {
            case 0:
                return ((b5.u0) this.f47222c).a();
            default:
                return ((c5.y) this.f47222c).getDensity().a();
        }
    }

    @Override // z4.l1
    public float c(q qVar, float f11) {
        float fIntBitsToFloat;
        int iE;
        switch (this.f47221b) {
            case 0:
                Function2 function2 = qVar.f47198a;
                if (function2 != null) {
                    break;
                } else {
                    b5.u0 u0Var = (b5.u0) this.f47222c;
                    if (!u0Var.f5997k) {
                        b5.u0 u0Var2 = u0Var;
                        while (true) {
                            androidx.recyclerview.widget.b bVar = u0Var2.f5998m;
                            float f12 = Float.NaN;
                            if (bVar != null && (iE = kotlin.collections.y.E((q[]) bVar.f3664b, qVar)) >= 0) {
                                f12 = ((float[]) bVar.f3665c)[iE];
                            }
                            if (!Float.isNaN(f12)) {
                                u0Var2.u0(u0Var.I0(), qVar);
                                z zVarF0 = u0Var2.F0();
                                z zVarF02 = u0Var.F0();
                                switch (qVar.f47199b) {
                                    case 0:
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (zVarF02.g(zVarF0, (((long) Float.floatToRawIntBits(((int) (zVarF0.u() >> 32)) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L)) & 4294967295L));
                                        break;
                                    default:
                                        fIntBitsToFloat = Float.intBitsToFloat((int) (zVarF02.g(zVarF0, (((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(((int) (zVarF0.u() & 4294967295L)) / 2.0f)) & 4294967295L)) >> 32));
                                        break;
                                }
                            } else {
                                b5.u0 u0VarM0 = u0Var2.M0();
                                if (u0VarM0 == null) {
                                    u0Var2.u0(u0Var.I0(), qVar);
                                } else {
                                    u0Var2 = u0VarM0;
                                }
                            }
                            break;
                        }
                    }
                }
                break;
        }
        return f11;
    }

    @Override // z4.l1
    public final z5.m e() {
        switch (this.f47221b) {
            case 0:
                return ((b5.u0) this.f47222c).getLayoutDirection();
            default:
                return ((c5.y) this.f47222c).getLayoutDirection();
        }
    }

    @Override // z4.l1
    public final int g() {
        switch (this.f47221b) {
            case 0:
                return ((b5.u0) this.f47222c).e0();
            default:
                return ((c5.y) this.f47222c).getRoot().H.f5942p.f47183a;
        }
    }
}
