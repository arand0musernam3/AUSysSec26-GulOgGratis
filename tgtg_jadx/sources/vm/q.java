package vm;

import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import m3.s;
import um.u;
import ym.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class q implements i80.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f42488a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f42489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f42490c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f42491d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z f42492e;

    public q(List list, u uVar, String str, int i11, z zVar) {
        this.f42488a = list;
        this.f42489b = uVar;
        this.f42490c = str;
        this.f42491d = i11;
        this.f42492e = zVar;
    }

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i11;
        BaseItemMnuV2 baseItemMnuV2;
        f2.d dVar = (f2.d) obj;
        int iIntValue = ((Number) obj2).intValue();
        m3.n nVar = (m3.n) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i11 = (((s) nVar).f(dVar) ? 4 : 2) | iIntValue2;
        } else {
            i11 = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i11 |= ((s) nVar).d(iIntValue) ? 32 : 16;
        }
        boolean z11 = true;
        s sVar = (s) nVar;
        if (sVar.R(i11 & 1, (i11 & 147) != 146)) {
            BaseItemMnuV2 baseItemMnuV22 = (BaseItemMnuV2) this.f42488a.get(iIntValue);
            sVar.a0(655567920);
            u uVar = this.f42489b;
            boolean zH = sVar.h(uVar) | sVar.h(baseItemMnuV22);
            if ((((i11 & 112) ^ 48) <= 32 || !sVar.d(iIntValue)) && (i11 & 48) != 32) {
                z11 = false;
            }
            boolean z12 = zH | z11;
            String str = this.f42490c;
            boolean zF = z12 | sVar.f(str);
            Object objM = sVar.M();
            if (zF || objM == m3.m.f29332a) {
                baseItemMnuV2 = baseItemMnuV22;
                objM = new ph.d(uVar, baseItemMnuV2, iIntValue, str, 1);
                sVar.k0(objM);
            } else {
                baseItemMnuV2 = baseItemMnuV22;
            }
            nv.c.a((Function0) objM, u3.e.e(1228515947, sVar, new o(baseItemMnuV2, this.f42491d, uVar, this.f42492e)), sVar, 48);
            sVar.q(false);
        } else {
            sVar.U();
        }
        return Unit.f26487a;
    }
}
