package sn;

import ii.m0;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import m3.b1;
import vj.j;
import z4.c0;
import z4.z;
import z5.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f39056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f39057b;

    public /* synthetic */ c(b1 b1Var, int i11) {
        this.f39056a = i11;
        this.f39057b = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f39056a) {
            case 0:
                this.f39057b.setValue((z5.f) obj);
                return Unit.f26487a;
            case 1:
                this.f39057b.setValue((z) obj);
                return Unit.f26487a;
            case 2:
                List list = (List) obj;
                list.getClass();
                this.f39057b.setValue(list);
                return Unit.f26487a;
            case 3:
                z zVar = (z) obj;
                zVar.getClass();
                int iU = (int) (zVar.u() & 4294967295L);
                int i11 = (iU * 50) / 100;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (4294967295L & zVar.S(0L)));
                float f11 = iU + fIntBitsToFloat;
                z zVarK = zVar.K();
                if (zVarK != null) {
                    h4.c cVarV = c0.i(zVarK).v(zVarK, true);
                    float f12 = cVarV.f21381b;
                    float f13 = cVarV.f21383d - fIntBitsToFloat;
                    float f14 = i11;
                    b1 b1Var = this.f39057b;
                    if (f13 <= f14 || f12 >= f11 - f14) {
                        if (b1Var != null) {
                            b1Var.setValue(Boolean.FALSE);
                        }
                    } else if (b1Var != null) {
                        b1Var.setValue(Boolean.TRUE);
                    }
                }
                return Unit.f26487a;
            case 4:
                z zVar2 = (z) obj;
                zVar2.getClass();
                this.f39057b.setValue(new l(zVar2.u()));
                return Unit.f26487a;
            case 5:
                z zVar3 = (z) obj;
                zVar3.getClass();
                this.f39057b.setValue(zVar3);
                return Unit.f26487a;
            case 6:
                Integer num = (Integer) obj;
                num.intValue();
                this.f39057b.setValue(num);
                return Unit.f26487a;
            case 7:
                m0 m0Var = (m0) obj;
                m0Var.getClass();
                this.f39057b.setValue(m0Var);
                return Unit.f26487a;
            case 8:
                this.f39057b.setValue(new z5.f(((z5.f) obj).f47277a));
                return Unit.f26487a;
            case 9:
                this.f39057b.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 10:
                this.f39057b.setValue(Boolean.FALSE);
                return Unit.f26487a;
            case 11:
                j jVar = (j) obj;
                jVar.getClass();
                b1 b1Var2 = this.f39057b;
                List list2 = (List) b1Var2.getValue();
                b1Var2.setValue(list2.contains(jVar) ? CollectionsKt.Z(list2, jVar) : CollectionsKt.e0(list2, jVar));
                return Unit.f26487a;
            case 12:
                this.f39057b.setValue(new l(((l) obj).f47286a));
                return Unit.f26487a;
            case 13:
                Float f15 = (Float) obj;
                f15.getClass();
                ((Function1) this.f39057b.getValue()).invoke(f15);
                return Unit.f26487a;
            default:
                Float f16 = (Float) obj;
                f16.getClass();
                return Float.valueOf(((Number) ((Function1) this.f39057b.getValue()).invoke(f16)).floatValue());
        }
    }
}
