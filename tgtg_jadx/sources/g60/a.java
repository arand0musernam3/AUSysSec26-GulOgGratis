package g60;

import b0.z;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bx.o;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.discover.herocomponent.DiscoverSheetView;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.tgtg.componentlibrary.component.button.ComposableSingletons$DemoPantryButtonKt;
import com.tgtg.componentlibrary.component.button.ComposableSingletons$PantryButtonDoc_figmaKt;
import com.tgtg.componentlibrary.component.button.ComposableSingletons$PantryButtonKt;
import com.tgtg.componentlibrary.component.button.DemoPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.AccentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.ComposableSingletons$AccentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.ComposableSingletons$NegativePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.ComposableSingletons$PrimaryPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.ComposableSingletons$SubtlePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.ComposableSingletons$TextTransparentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.NegativePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.PrimaryPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.SubtlePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.TextTransparentPantryButtonKt;
import com.tgtg.componentlibrary.component.checkbox.ComposableSingletons$DemoPantryCheckboxKt;
import com.tgtg.componentlibrary.component.checkbox.DemoPantryCheckboxKt;
import com.tgtg.componentlibrary.component.checkbox.PantryCheckboxKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.i;
import d2.w;
import d2.y;
import g3.i2;
import g60.a;
import h2.l1;
import h2.n0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.m;
import m3.n;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20055a;

    public /* synthetic */ a(int i11) {
        this.f20055a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f20055a;
        q qVar = q.f5711a;
        m3.f fVar = m.f29332a;
        int i12 = 2;
        int i13 = 3;
        int i14 = 1;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryButtonKt composableSingletons$DemoPantryButtonKt = ComposableSingletons$DemoPantryButtonKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    DemoPantryButtonKt.DemoPantryButton(sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryButtonKt composableSingletons$DemoPantryButtonKt2 = ComposableSingletons$DemoPantryButtonKt.INSTANCE;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    DemoPantryButtonKt.DemoPantryButton(sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 2:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryButtonDoc_figmaKt composableSingletons$PantryButtonDoc_figmaKt = ComposableSingletons$PantryButtonDoc_figmaKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (!sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    sVar3.U();
                }
                break;
            case 3:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryButtonKt composableSingletons$PantryButtonKt = new Object() { // from class: com.tgtg.componentlibrary.component.button.ComposableSingletons$PantryButtonKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f12967a = new d(new a(3), false, 1968608557);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1968608557$app_release() {
                        return f12967a;
                    }
                };
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar4.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ = d2.c.z(qVar, mVar.f44015k);
                    d2.b bVar = i.f13801a;
                    y yVarA = w.a(i.g(mVar.l), b4.d.f5694m, sVar4, 0);
                    int iHashCode = Long.hashCode(sVar4.T);
                    u3.i iVarL = sVar4.l();
                    t tVarC = b4.a.c(tVarZ, sVar4);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar4.e0();
                    if (sVar4.S) {
                        sVar4.k(hVar);
                    } else {
                        sVar4.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar4);
                    m3.i.C(iVarL, b5.i.f5842e, sVar4);
                    m3.i.v(sVar4, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar4, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar4);
                    PrimaryPantryButtonKt.PreviewPrimaryButtons(sVar4, 0);
                    SubtlePantryButtonKt.PreviewSubtleButtons(sVar4, 0);
                    TextTransparentPantryButtonKt.PreviewTextTransparentButtons(sVar4, 0);
                    AccentPantryButtonKt.PreviewAccentButtons(sVar4, 0);
                    NegativePantryButtonKt.PreviewNegativeButtons(sVar4, 0);
                    sVar4.q(true);
                } else {
                    sVar4.U();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                z.n((n) obj, m3.i.F(1));
                break;
            case 5:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    m0.c.L(b4.a.d(qVar, 1.0f), Integer.valueOf(R.string.added_to_favorites_snack_message), Integer.valueOf(R.drawable.system_icon_heart_active_primary_30), true, sVar5, 3078);
                } else {
                    sVar5.U();
                }
                break;
            case 6:
                int i15 = DiscoverSheetView.f9147q;
                ((BasicItem) obj).getClass();
                ((String) obj2).getClass();
                break;
            case 7:
                ((Integer) obj2).getClass();
                gn.a.f((n) obj, m3.i.F(1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                o.B((n) obj, m3.i.F(1));
                break;
            case 9:
                Map mapB = ((l1) obj2).b();
                if (mapB.isEmpty()) {
                }
                break;
            case 10:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$AccentPantryButtonKt composableSingletons$AccentPantryButtonKt = ComposableSingletons$AccentPantryButtonKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    x60.m mVar2 = (x60.m) sVar6.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ2 = d2.c.z(qVar, mVar2.f44015k);
                    d2.b bVar2 = i.f13801a;
                    y yVarA2 = w.a(i.g(mVar2.l), b4.d.f5694m, sVar6, 0);
                    int iHashCode2 = Long.hashCode(sVar6.T);
                    u3.i iVarL2 = sVar6.l();
                    t tVarC2 = b4.a.c(tVarZ2, sVar6);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar6.e0();
                    if (sVar6.S) {
                        sVar6.k(hVar2);
                    } else {
                        sVar6.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar6);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar6);
                    m3.i.v(sVar6, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar6, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar6);
                    Object objM = sVar6.M();
                    if (objM == fVar) {
                        objM = new h60.b(0);
                        sVar6.k0(objM);
                    }
                    AccentPantryButtonKt.LargeAccentPantryButton("Large Accent", (Function0) objM, null, null, false, false, null, null, sVar6, 54, 252);
                    Object objM2 = sVar6.M();
                    if (objM2 == fVar) {
                        objM2 = new h60.b(1);
                        sVar6.k0(objM2);
                    }
                    AccentPantryButtonKt.MediumAccentPantryButton("Medium Accent", (Function0) objM2, null, null, false, false, null, null, sVar6, 54, 252);
                    Object objM3 = sVar6.M();
                    if (objM3 == fVar) {
                        objM3 = new h60.b(2);
                        sVar6.k0(objM3);
                    }
                    AccentPantryButtonKt.SmallAccentPantryButton("Small Accent", (Function0) objM3, null, null, false, false, null, null, sVar6, 54, 252);
                    sVar6.q(true);
                } else {
                    sVar6.U();
                }
                break;
            case 11:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$NegativePantryButtonKt composableSingletons$NegativePantryButtonKt = ComposableSingletons$NegativePantryButtonKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    x60.m mVar3 = (x60.m) sVar7.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ3 = d2.c.z(qVar, mVar3.f44015k);
                    d2.b bVar3 = i.f13801a;
                    y yVarA3 = w.a(i.g(mVar3.l), b4.d.f5694m, sVar7, 0);
                    int iHashCode3 = Long.hashCode(sVar7.T);
                    u3.i iVarL3 = sVar7.l();
                    t tVarC3 = b4.a.c(tVarZ3, sVar7);
                    j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar7.e0();
                    if (sVar7.S) {
                        sVar7.k(hVar3);
                    } else {
                        sVar7.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar7);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar7);
                    m3.i.v(sVar7, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar7, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar7);
                    Object objM4 = sVar7.M();
                    if (objM4 == fVar) {
                        objM4 = new h60.b(3);
                        sVar7.k0(objM4);
                    }
                    NegativePantryButtonKt.LargeNegativePantryButton("Large Negative", (Function0) objM4, null, null, false, false, null, null, sVar7, 54, 252);
                    Object objM5 = sVar7.M();
                    if (objM5 == fVar) {
                        objM5 = new h60.b(4);
                        sVar7.k0(objM5);
                    }
                    NegativePantryButtonKt.MediumNegativePantryButton("Medium Negative", (Function0) objM5, null, null, false, false, null, null, sVar7, 54, 252);
                    Object objM6 = sVar7.M();
                    if (objM6 == fVar) {
                        objM6 = new h60.b(5);
                        sVar7.k0(objM6);
                    }
                    NegativePantryButtonKt.SmallNegativePantryButton("Small Negative", (Function0) objM6, null, null, false, false, null, null, sVar7, 54, 252);
                    sVar7.q(true);
                } else {
                    sVar7.U();
                }
                break;
            case 12:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$PrimaryPantryButtonKt composableSingletons$PrimaryPantryButtonKt = ComposableSingletons$PrimaryPantryButtonKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    x60.m mVar4 = (x60.m) sVar8.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ4 = d2.c.z(qVar, mVar4.f44015k);
                    d2.b bVar4 = i.f13801a;
                    y yVarA4 = w.a(i.g(mVar4.l), b4.d.f5694m, sVar8, 0);
                    int iHashCode4 = Long.hashCode(sVar8.T);
                    u3.i iVarL4 = sVar8.l();
                    t tVarC4 = b4.a.c(tVarZ4, sVar8);
                    j.R.getClass();
                    h hVar4 = b5.i.f5839b;
                    sVar8.e0();
                    if (sVar8.S) {
                        sVar8.k(hVar4);
                    } else {
                        sVar8.n0();
                    }
                    m3.i.C(yVarA4, b5.i.f5843f, sVar8);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar8);
                    m3.i.v(sVar8, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar8, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar8);
                    Object objM7 = sVar8.M();
                    if (objM7 == fVar) {
                        objM7 = new h60.b(6);
                        sVar8.k0(objM7);
                    }
                    PrimaryPantryButtonKt.LargePrimaryPantryButton("Large Primary", (Function0) objM7, null, null, false, false, null, null, sVar8, 54, 252);
                    Object objM8 = sVar8.M();
                    if (objM8 == fVar) {
                        objM8 = new h60.b(7);
                        sVar8.k0(objM8);
                    }
                    PrimaryPantryButtonKt.MediumPrimaryPantryButton("Medium Primary", (Function0) objM8, null, null, false, false, null, null, sVar8, 54, 252);
                    Object objM9 = sVar8.M();
                    if (objM9 == fVar) {
                        objM9 = new h60.b(8);
                        sVar8.k0(objM9);
                    }
                    PrimaryPantryButtonKt.SmallPrimaryPantryButton("Small Primary", (Function0) objM9, null, null, false, false, null, null, sVar8, 54, 252);
                    sVar8.q(true);
                } else {
                    sVar8.U();
                }
                break;
            case 13:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$SubtlePantryButtonKt composableSingletons$SubtlePantryButtonKt = ComposableSingletons$SubtlePantryButtonKt.INSTANCE;
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x60.m mVar5 = (x60.m) sVar9.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ5 = d2.c.z(qVar, mVar5.f44015k);
                    d2.b bVar5 = i.f13801a;
                    y yVarA5 = w.a(i.g(mVar5.l), b4.d.f5694m, sVar9, 0);
                    int iHashCode5 = Long.hashCode(sVar9.T);
                    u3.i iVarL5 = sVar9.l();
                    t tVarC5 = b4.a.c(tVarZ5, sVar9);
                    j.R.getClass();
                    h hVar5 = b5.i.f5839b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(hVar5);
                    } else {
                        sVar9.n0();
                    }
                    m3.i.C(yVarA5, b5.i.f5843f, sVar9);
                    m3.i.C(iVarL5, b5.i.f5842e, sVar9);
                    m3.i.v(sVar9, Integer.valueOf(iHashCode5), b5.i.f5844g);
                    m3.i.z(sVar9, b5.i.f5845h);
                    m3.i.C(tVarC5, b5.i.f5841d, sVar9);
                    Object objM10 = sVar9.M();
                    if (objM10 == fVar) {
                        objM10 = new h60.b(9);
                        sVar9.k0(objM10);
                    }
                    SubtlePantryButtonKt.LargeSubtlePantryButton("Large Subtle", (Function0) objM10, null, null, false, false, null, null, sVar9, 54, 252);
                    Object objM11 = sVar9.M();
                    if (objM11 == fVar) {
                        objM11 = new h60.b(10);
                        sVar9.k0(objM11);
                    }
                    SubtlePantryButtonKt.MediumSubtlePantryButton("Medium Subtle", (Function0) objM11, null, null, false, false, null, null, sVar9, 54, 252);
                    Object objM12 = sVar9.M();
                    if (objM12 == fVar) {
                        objM12 = new h60.b(11);
                        sVar9.k0(objM12);
                    }
                    SubtlePantryButtonKt.SmallSubtlePantryButton("Small Subtle", (Function0) objM12, null, null, false, false, null, null, sVar9, 54, 252);
                    sVar9.q(true);
                } else {
                    sVar9.U();
                }
                break;
            case 14:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$TextTransparentPantryButtonKt composableSingletons$TextTransparentPantryButtonKt = ComposableSingletons$TextTransparentPantryButtonKt.INSTANCE;
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    x60.m mVar6 = (x60.m) sVar10.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ6 = d2.c.z(qVar, mVar6.f44015k);
                    d2.b bVar6 = i.f13801a;
                    y yVarA6 = w.a(i.g(mVar6.l), b4.d.f5694m, sVar10, 0);
                    int iHashCode6 = Long.hashCode(sVar10.T);
                    u3.i iVarL6 = sVar10.l();
                    t tVarC6 = b4.a.c(tVarZ6, sVar10);
                    j.R.getClass();
                    h hVar6 = b5.i.f5839b;
                    sVar10.e0();
                    if (sVar10.S) {
                        sVar10.k(hVar6);
                    } else {
                        sVar10.n0();
                    }
                    m3.i.C(yVarA6, b5.i.f5843f, sVar10);
                    m3.i.C(iVarL6, b5.i.f5842e, sVar10);
                    m3.i.v(sVar10, Integer.valueOf(iHashCode6), b5.i.f5844g);
                    m3.i.z(sVar10, b5.i.f5845h);
                    m3.i.C(tVarC6, b5.i.f5841d, sVar10);
                    Object objM13 = sVar10.M();
                    if (objM13 == fVar) {
                        objM13 = new h60.b(12);
                        sVar10.k0(objM13);
                    }
                    TextTransparentPantryButtonKt.LargeTextTransparentPantryButton("Large Text Transparent", (Function0) objM13, null, null, false, false, null, null, sVar10, 54, 252);
                    Object objM14 = sVar10.M();
                    if (objM14 == fVar) {
                        objM14 = new h60.b(13);
                        sVar10.k0(objM14);
                    }
                    TextTransparentPantryButtonKt.MediumTextTransparentPantryButton("Medium Text Transparent", (Function0) objM14, null, null, false, false, null, null, sVar10, 54, 252);
                    Object objM15 = sVar10.M();
                    if (objM15 == fVar) {
                        objM15 = new h60.b(14);
                        sVar10.k0(objM15);
                    }
                    TextTransparentPantryButtonKt.SmallTextTransparentPantryButton("Small Text Transparent", (Function0) objM15, null, null, false, false, null, null, sVar10, 54, 252);
                    sVar10.q(true);
                } else {
                    sVar10.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                break;
            case 16:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar11, 0), f0.U(sVar11, R.string.voice_over_back), null, 0L, sVar11, 8, 12);
                } else {
                    sVar11.U();
                }
                break;
            case 17:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_arrow_back_neutral_80, sVar12, 0), f0.U(sVar12, R.string.voice_over_back), null, 0L, sVar12, 8, 12);
                } else {
                    sVar12.U();
                }
                break;
            case 18:
                ((Integer) obj2).getClass();
                na0.a.T((n) obj, m3.i.F(1));
                break;
            case 19:
                i2.b bVar7 = (i2.b) obj2;
                break;
            case 20:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    Object objM16 = sVar13.M();
                    if (objM16 == fVar) {
                        objM16 = m3.i.w(Boolean.TRUE);
                        sVar13.k0(objM16);
                    }
                    b1 b1Var = (b1) objM16;
                    PantryCheckboxKt.PantryCheckbox(((Boolean) b1Var.component1()).booleanValue(), b1Var.component2(), null, true, sVar13, 3072, 4);
                } else {
                    sVar13.U();
                }
                break;
            case 21:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt2 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar14 = (s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    Object objM17 = sVar14.M();
                    if (objM17 == fVar) {
                        objM17 = m3.i.w(Boolean.FALSE);
                        sVar14.k0(objM17);
                    }
                    b1 b1Var2 = (b1) objM17;
                    PantryCheckboxKt.PantryCheckbox(((Boolean) b1Var2.component1()).booleanValue(), b1Var2.component2(), null, true, sVar14, 3072, 4);
                } else {
                    sVar14.U();
                }
                break;
            case 22:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt3 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    Object objM18 = sVar15.M();
                    if (objM18 == fVar) {
                        objM18 = m3.i.w(l5.a.On);
                        sVar15.k0(objM18);
                    }
                    b1 b1Var3 = (b1) objM18;
                    l5.a aVar = (l5.a) b1Var3.getValue();
                    Object objM19 = sVar15.M();
                    if (objM19 == fVar) {
                        objM19 = new n0(b1Var3, i12);
                        sVar15.k0(objM19);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar, (Function0) objM19, null, true, sVar15, 3120, 4);
                } else {
                    sVar15.U();
                }
                break;
            case 23:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt4 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar16 = (s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    Object objM20 = sVar16.M();
                    if (objM20 == fVar) {
                        objM20 = m3.i.w(l5.a.Off);
                        sVar16.k0(objM20);
                    }
                    b1 b1Var4 = (b1) objM20;
                    l5.a aVar2 = (l5.a) b1Var4.getValue();
                    Object objM21 = sVar16.M();
                    if (objM21 == fVar) {
                        objM21 = new n0(b1Var4, i13);
                        sVar16.k0(objM21);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar2, (Function0) objM21, null, true, sVar16, 3120, 4);
                } else {
                    sVar16.U();
                }
                break;
            case 24:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt5 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar17 = (s) nVar17;
                if (sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    Object objM22 = sVar17.M();
                    if (objM22 == fVar) {
                        objM22 = m3.i.w(l5.a.Indeterminate);
                        sVar17.k0(objM22);
                    }
                    b1 b1Var5 = (b1) objM22;
                    l5.a aVar3 = (l5.a) b1Var5.getValue();
                    Object objM23 = sVar17.M();
                    if (objM23 == fVar) {
                        objM23 = new n0(b1Var5, i14);
                        sVar17.k0(objM23);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar3, (Function0) objM23, null, true, sVar17, 3120, 4);
                } else {
                    sVar17.U();
                }
                break;
            case 25:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt6 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    l5.a aVar4 = l5.a.On;
                    Object objM24 = sVar18.M();
                    if (objM24 == fVar) {
                        objM24 = new hw.f(16);
                        sVar18.k0(objM24);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar4, (Function0) objM24, null, false, sVar18, 3126, 4);
                } else {
                    sVar18.U();
                }
                break;
            case 26:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt7 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    l5.a aVar5 = l5.a.Off;
                    Object objM25 = sVar19.M();
                    if (objM25 == fVar) {
                        objM25 = new hw.f(17);
                        sVar19.k0(objM25);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar5, (Function0) objM25, null, false, sVar19, 3126, 4);
                } else {
                    sVar19.U();
                }
                break;
            case 27:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt8 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    l5.a aVar6 = l5.a.Indeterminate;
                    Object objM26 = sVar20.M();
                    if (objM26 == fVar) {
                        objM26 = new hw.f(18);
                        sVar20.k0(objM26);
                    }
                    PantryCheckboxKt.PantryTristateCheckbox(aVar6, (Function0) objM26, null, false, sVar20, 3126, 4);
                } else {
                    sVar20.U();
                }
                break;
            case 28:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt9 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar21 = (s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    DemoPantryCheckboxKt.DemoPantryCheckbox(sVar21, 0);
                } else {
                    sVar21.U();
                }
                break;
            default:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryCheckboxKt composableSingletons$DemoPantryCheckboxKt10 = ComposableSingletons$DemoPantryCheckboxKt.INSTANCE;
                s sVar22 = (s) nVar22;
                if (sVar22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    DemoPantryCheckboxKt.DemoPantryCheckbox(sVar22, 0);
                } else {
                    sVar22.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11, int i12) {
        this.f20055a = i12;
    }
}
