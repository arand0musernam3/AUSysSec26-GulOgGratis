package c60;

import com.app.tgtg.feature.orderview.charity.CharityOrderActivity;
import com.app.tgtg.model.remote.item.AverageItemRating;
import com.app.tgtg.model.remote.item.response.HeroComponentResponse;
import com.app.tgtg.model.remote.manufacturer.response.PickupOptionLocal;
import com.app.tgtg.model.remote.order.UpdateNotificationType;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarDoc;
import com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelDoc;
import com.tgtg.componentlibrary.component.button.PantryButtonDoc;
import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxDoc;
import com.tgtg.componentlibrary.component.chip.type.choicechip.PantryChoiceChipDoc;
import com.tgtg.componentlibrary.component.chip.type.filterchip.PantryFilterChipDoc;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.PantrySelectionChipDoc;
import com.tgtg.componentlibrary.component.iconbutton.PantryIconButtonDoc;
import com.tgtg.componentlibrary.component.p000switch.PantrySwitchDoc;
import com.tgtg.componentlibrary.component.pageheader.PantryPageHeaderDoc;
import com.tgtg.componentlibrary.component.radiobutton.PantryRadioButtonDoc;
import com.tgtg.componentlibrary.component.spinner.PantrySpinnerDoc;
import g2.k;
import g2.l;
import g3.d7;
import h2.j;
import i2.m;
import i2.r;
import i2.w;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import m3.i;
import m3.n;
import m3.s;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import v1.u;
import w2.z;
import wi.p;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f7773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7774c;

    public /* synthetic */ c(int i11, t5.a aVar) {
        this.f7772a = 23;
        this.f7773b = i11;
        this.f7774c = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f7772a;
        int i12 = 2;
        int i13 = this.f7773b;
        Object obj3 = this.f7774c;
        switch (i11) {
            case 0:
                ((Integer) obj2).getClass();
                ((PantryAvatarDoc) obj3).PantryAvatar((n) obj, i.F(i13 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((PantrySwitchDoc) obj3).PantrySwitch((n) obj, i.F(i13 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                v0.n.a(i13, (z) obj3, (n) obj, i.F(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((PantryBadgeLabelDoc) obj3).PantryBadgeLabel((n) obj, i.F(i13 | 1));
                break;
            case 4:
                f2.n nVar = (f2.n) obj3;
                n nVar2 = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar2;
                if (sVar.R(1 & iIntValue, (iIntValue & 3) != 2)) {
                    j jVarJ = nVar.f17135b.f17132c.j(i13);
                    ((f2.i) jVarJ.f21141c).f17126c.invoke(nVar.f17136c, Integer.valueOf(i13 - jVarJ.f21139a), sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 5:
                k kVar = (k) obj3;
                n nVar3 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar3;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j jVarJ2 = kVar.f18175b.f18172d.j(i13);
                    ((g2.f) jVarJ2.f21141c).f18167d.invoke(l.f18177a, Integer.valueOf(i13 - jVarJ2.f21139a), sVar2, 6);
                } else {
                    sVar2.U();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((PantryButtonDoc) obj3).PantryButton((n) obj, i.F(i13 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                gn.a.o((HeroComponentResponse) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                int i14 = CharityOrderActivity.f9162o;
                ((CharityOrderActivity) obj3).L((n) obj, i.F(i13 | 1));
                break;
            case 9:
                r rVar = (r) obj3;
                n nVar4 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                s sVar3 = (s) nVar4;
                if (sVar3.R(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    j jVarJ3 = rVar.f22891b.k().j(i13);
                    ((m) jVarJ3.f21141c).f22869b.invoke(w.f22926a, Integer.valueOf(i13 - jVarJ3.f21139a), sVar3, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                ((PantryCheckboxDoc) obj3).PantryCheckbox((n) obj, i.F(i13 | 1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ii.l.p((UpdateNotificationType) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                ((PantryChoiceChipDoc) obj3).PantryChoiceChip((n) obj, i.F(i13 | 1));
                break;
            case 13:
                ((Integer) obj2).getClass();
                lp.r.c(i13, i.F(1), (Function1) obj3, (n) obj);
                break;
            case 14:
                ((Integer) obj2).getClass();
                ((PantryFilterChipDoc) obj3).PantryFilterChip((n) obj, i.F(i13 | 1));
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                ((Integer) obj2).getClass();
                ((PantrySelectionChipDoc) obj3).PantrySelectionChip((n) obj, i.F(i13 | 1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                on.d.b(i13, (Function2) obj3, (n) obj, i.F(49));
                break;
            case 17:
                ((Integer) obj2).getClass();
                ((PantryIconButtonDoc) obj3).PantryIconButton((n) obj, i.F(i13 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                rk.e.L((AverageItemRating) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                ((PantryPageHeaderDoc) obj3).PantryPageHeader((n) obj, i.F(i13 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                si.a.a(i13, (List) obj3, (n) obj, i.F(1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                ((PantryRadioButtonDoc) obj3).RadioButton((n) obj, i.F(i13 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                ug.c.e((tg.i) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 23:
                t5.a aVar = (t5.a) obj3;
                n nVar5 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                s sVar4 = (s) nVar5;
                if (sVar4.R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    String strU = f0.U(sVar4, i13);
                    boolean zH = sVar4.h(aVar);
                    Object objM = sVar4.M();
                    if (zH || objM == m3.m.f29332a) {
                        objM = new us.b(i12, aVar);
                        sVar4.k0(objM);
                    }
                    cg.j.s(strU, null, 0L, 0L, (Function0) objM, null, null, null, sVar4, 0, 238);
                } else {
                    sVar4.U();
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                v1.n.f((u) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                ((PantrySpinnerDoc) obj3).PantrySpinner((n) obj, i.F(i13 | 1));
                break;
            case 26:
                ((Integer) obj2).intValue();
                vi.c.d((d7) obj3, (n) obj, i.F(i13 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                wi.m.f((PickupOptionLocal) obj3, (n) obj, i.F(i13 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                p.b((wi.d) obj3, i13, (n) obj, i.F(1));
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(Object obj, int i11, int i12) {
        this.f7772a = i12;
        this.f7774c = obj;
        this.f7773b = i11;
    }

    public /* synthetic */ c(Object obj, int i11, int i12, int i13) {
        this.f7772a = i13;
        this.f7773b = i11;
        this.f7774c = obj;
    }

    public /* synthetic */ c(u uVar, int i11) {
        this.f7772a = 24;
        this.f7774c = uVar;
        this.f7773b = i11;
    }

    public /* synthetic */ c(wi.d dVar, int i11, int i12) {
        this.f7772a = 28;
        this.f7774c = dVar;
        this.f7773b = i11;
    }
}
