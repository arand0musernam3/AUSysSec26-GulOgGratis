package tq;

import cg.j;
import com.app.tgtg.R;
import jd.f;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import o30.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f40416a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f40417b;

    public /* synthetic */ a(f fVar, int i11) {
        this.f40416a = 1;
        this.f40417b = fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f40416a;
        m3.f fVar = m.f29332a;
        f fVar2 = this.f40417b;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    String strU = f0.U(sVar, R.string.c2c_always_on_invite_friends_screen_toolbar_title);
                    boolean zH = sVar.h(fVar2);
                    Object objM = sVar.M();
                    if (zH || objM == fVar) {
                        objM = new b(fVar2, 2);
                        sVar.k0(objM);
                    }
                    j.s(strU, null, 0L, 0L, (Function0) objM, null, null, null, sVar, 0, 238);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                w.b.h(fVar2, (n) obj, i.F(1));
                break;
            case 2:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    String strU2 = f0.U(sVar2, R.string.c2c_always_on_invite_friends_screen_toolbar_title);
                    boolean zH2 = sVar2.h(fVar2);
                    Object objM2 = sVar2.M();
                    if (zH2 || objM2 == fVar) {
                        objM2 = new b(fVar2, 3);
                        sVar2.k0(objM2);
                    }
                    j.s(strU2, null, 0L, 0L, (Function0) objM2, null, null, null, sVar2, 0, 238);
                } else {
                    sVar2.U();
                }
                break;
            case 3:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String strU3 = f0.U(sVar3, R.string.c2c_v3_invite_friends_screen_header);
                    boolean zH3 = sVar3.h(fVar2);
                    Object objM3 = sVar3.M();
                    if (zH3 || objM3 == fVar) {
                        objM3 = new b(fVar2, 4);
                        sVar3.k0(objM3);
                    }
                    j.s(strU3, null, 0L, 0L, (Function0) objM3, null, null, null, sVar3, 0, 238);
                } else {
                    sVar3.U();
                }
                break;
            default:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    String strU4 = f0.U(sVar4, R.string.c2c_v3_invite_friends_screen_header);
                    boolean zH4 = sVar4.h(fVar2);
                    Object objM4 = sVar4.M();
                    if (zH4 || objM4 == fVar) {
                        objM4 = new b(fVar2, 10);
                        sVar4.k0(objM4);
                    }
                    j.s(strU4, null, 0L, 0L, (Function0) objM4, null, null, null, sVar4, 0, 238);
                } else {
                    sVar4.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(f fVar, int i11, byte b8) {
        this.f40416a = i11;
        this.f40417b = fVar;
    }
}
