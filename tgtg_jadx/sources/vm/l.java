package vm;

import b4.t;
import com.app.tgtg.model.local.BasketManager;
import com.app.tgtg.model.remote.item.Picture;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import d2.m2;
import g3.s0;
import g3.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.s;
import um.u;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class l implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f42467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f42468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ BaseItemMnuV2 f42469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f42470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ BasketManager f42471e;

    public /* synthetic */ l(BaseItemMnuV2 baseItemMnuV2, float f11, BasketManager basketManager, u uVar, int i11) {
        this.f42467a = 2;
        this.f42469c = baseItemMnuV2;
        this.f42470d = f11;
        this.f42471e = basketManager;
        this.f42468b = uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f42467a) {
            case 0:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final u uVar = this.f42468b;
                    boolean zH = sVar.h(uVar);
                    final BaseItemMnuV2 baseItemMnuV2 = this.f42469c;
                    boolean zH2 = zH | sVar.h(baseItemMnuV2);
                    Object objM = sVar.M();
                    if (zH2 || objM == m3.m.f29332a) {
                        final int i11 = 1;
                        objM = new Function0() { // from class: vm.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        uVar.j(baseItemMnuV2.m393getItemIdFvU5WIY(), f70.i.BASKET_RECOMMENDATION);
                                        break;
                                    default:
                                        BaseItemMnuV2 baseItemMnuV22 = baseItemMnuV2;
                                        String strM393getItemIdFvU5WIY = baseItemMnuV22.m393getItemIdFvU5WIY();
                                        Integer numValueOf = Integer.valueOf(baseItemMnuV22.getAvailableStock());
                                        Picture coverPicture = baseItemMnuV22.getCoverPicture();
                                        uVar.h(new dn.o(new dn.n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, baseItemMnuV22.getItemType()), null, 0, 0, null));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar.k0(objM);
                    }
                    nv.c.a((Function0) objM, u3.e.e(853752019, sVar, new l(uVar, baseItemMnuV2, this.f42470d, this.f42471e, 1)), sVar, 48);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    t tVarD = m2.d(b4.q.f5711a, 1.0f);
                    g3.u uVarP = s0.p(lv.s.I, sVar2, 6);
                    v vVarQ = s0.q(0, 0.0f, 0.0f, 0.0f, 62);
                    final u uVar2 = this.f42468b;
                    boolean zH3 = sVar2.h(uVar2);
                    final BaseItemMnuV2 baseItemMnuV22 = this.f42469c;
                    boolean zH4 = zH3 | sVar2.h(baseItemMnuV22);
                    Object objM2 = sVar2.M();
                    if (zH4 || objM2 == m3.m.f29332a) {
                        final int i12 = 0;
                        objM2 = new Function0() { // from class: vm.j
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i12) {
                                    case 0:
                                        uVar2.j(baseItemMnuV22.m393getItemIdFvU5WIY(), f70.i.BASKET_RECOMMENDATION);
                                        break;
                                    default:
                                        BaseItemMnuV2 baseItemMnuV222 = baseItemMnuV22;
                                        String strM393getItemIdFvU5WIY = baseItemMnuV222.m393getItemIdFvU5WIY();
                                        Integer numValueOf = Integer.valueOf(baseItemMnuV222.getAvailableStock());
                                        Picture coverPicture = baseItemMnuV222.getCoverPicture();
                                        uVar2.h(new dn.o(new dn.n(strM393getItemIdFvU5WIY, numValueOf, coverPicture != null ? coverPicture.getPictureId() : null, baseItemMnuV222.getItemType()), null, 0, 0, null));
                                        break;
                                }
                                return Unit.f26487a;
                            }
                        };
                        sVar2.k0(objM2);
                    }
                    s0.c((Function0) objM2, tVarD, false, null, uVarP, vVarQ, u3.e.e(1751174408, sVar2, new oo.d(baseItemMnuV22, this.f42470d, this.f42471e, uVar2)), sVar2, 100663344, 204);
                } else {
                    sVar2.U();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                nx.d.f(this.f42469c, this.f42470d, this.f42471e, this.f42468b, (m3.n) obj, m3.i.F(49));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ l(u uVar, BaseItemMnuV2 baseItemMnuV2, float f11, BasketManager basketManager, int i11) {
        this.f42467a = i11;
        this.f42468b = uVar;
        this.f42469c = baseItemMnuV2;
        this.f42470d = f11;
        this.f42471e = basketManager;
    }
}
