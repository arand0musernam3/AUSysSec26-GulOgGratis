package p60;

import b4.d;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.app.tgtg.model.remote.item.response.BasicItem;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.ComposableSingletons$TextOnlySelectionChipKt;
import com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.TextOnlySelectionChipKt;
import com.tgtg.componentlibrary.component.iconbutton.ComposableSingletons$DemoPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.ComposableSingletons$PantryIconButtonDoc_figmaKt;
import com.tgtg.componentlibrary.component.iconbutton.ComposableSingletons$PantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.DemoPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.i;
import d2.w;
import d2.y;
import g3.i2;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import n90.p;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.jetbrains.annotations.NotNull;
import p60.a;
import ph.g;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34534a;

    public /* synthetic */ a(int i11) {
        this.f34534a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f34534a;
        q qVar = q.f5711a;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$TextOnlySelectionChipKt composableSingletons$TextOnlySelectionChipKt = ComposableSingletons$TextOnlySelectionChipKt.INSTANCE;
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ = c.z(qVar, mVar.f44015k);
                    b bVar = i.f13801a;
                    y yVarA = w.a(i.g(mVar.l), d.f5694m, sVar, 0);
                    int iHashCode = Long.hashCode(sVar.T);
                    u3.i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarZ, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    Object objM = sVar.M();
                    if (objM == m3.m.f29332a) {
                        objM = new p(29);
                        sVar.k0(objM);
                    }
                    TextOnlySelectionChipKt.TextOnlySelectionChip("Text Only Selection Chip", false, (Function0) objM, null, null, false, false, null, sVar, 438, 248);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                break;
            case 2:
                ((Integer) obj).intValue();
                BasicItem basicItem = (BasicItem) obj2;
                basicItem.getClass();
                break;
            case 3:
                ((Integer) obj2).getClass();
                g.c((n) obj, m3.i.F(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                g.d((n) obj, m3.i.F(1));
                break;
            case 5:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_close_neutral_80, sVar2, 0), f0.U(sVar2, R.string.voice_over_close), null, 0L, sVar2, 8, 12);
                } else {
                    sVar2.U();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                po.c.i((n) obj, m3.i.F(1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                po.c.l((n) obj, m3.i.F(1));
                break;
            case 8:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar3, 0), null, null, 0L, sVar3, 56, 12);
                } else {
                    sVar3.U();
                }
                break;
            case 9:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt2 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar4, 0), null, null, 0L, sVar4, 56, 12);
                } else {
                    sVar4.U();
                }
                break;
            case 10:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt3 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar5, 0), null, null, 0L, sVar5, 56, 12);
                } else {
                    sVar5.U();
                }
                break;
            case 11:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt4 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar6, 0), null, null, 0L, sVar6, 56, 12);
                } else {
                    sVar6.U();
                }
                break;
            case 12:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt5 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar7, 0), null, null, 0L, sVar7, 56, 12);
                } else {
                    sVar7.U();
                }
                break;
            case 13:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt6 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar8, 0), null, null, 0L, sVar8, 56, 12);
                } else {
                    sVar8.U();
                }
                break;
            case 14:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt7 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar9 = (s) nVar9;
                if (!sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    sVar9.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt8 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar10 = (s) nVar10;
                if (!sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    sVar10.U();
                }
                break;
            case 16:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt9 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar11 = (s) nVar11;
                if (!sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    sVar11.U();
                }
                break;
            case 17:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt10 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar12 = (s) nVar12;
                if (!sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    sVar12.U();
                }
                break;
            case 18:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt11 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar13 = (s) nVar13;
                if (!sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    sVar13.U();
                }
                break;
            case 19:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt12 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar14 = (s) nVar14;
                if (!sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    sVar14.U();
                }
                break;
            case 20:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt13 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar15 = (s) nVar15;
                if (!sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    sVar15.U();
                }
                break;
            case 21:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt14 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar16 = (s) nVar16;
                if (!sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    sVar16.U();
                }
                break;
            case 22:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt15 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar17 = (s) nVar17;
                if (!sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    sVar17.U();
                }
                break;
            case 23:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt16 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar18 = (s) nVar18;
                if (sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    DemoPantryIconButtonKt.DemoPantryIconButton(sVar18, 0);
                } else {
                    sVar18.U();
                }
                break;
            case 24:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt17 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar19 = (s) nVar19;
                if (sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    DemoPantryIconButtonKt.DemoPantryIconButton(sVar19, 0);
                } else {
                    sVar19.U();
                }
                break;
            case 25:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt18 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar20 = (s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    DemoPantryIconButtonKt.DemoPantryIconButton(sVar20, 0);
                } else {
                    sVar20.U();
                }
                break;
            case 26:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryIconButtonKt composableSingletons$DemoPantryIconButtonKt19 = ComposableSingletons$DemoPantryIconButtonKt.INSTANCE;
                s sVar21 = (s) nVar21;
                if (sVar21.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    DemoPantryIconButtonKt.DemoPantryIconButton(sVar21, 0);
                } else {
                    sVar21.U();
                }
                break;
            case 27:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryIconButtonDoc_figmaKt composableSingletons$PantryIconButtonDoc_figmaKt = ComposableSingletons$PantryIconButtonDoc_figmaKt.INSTANCE;
                s sVar22 = (s) nVar22;
                if (sVar22.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar22, 0), null, null, 0L, sVar22, 56, 12);
                } else {
                    sVar22.U();
                }
                break;
            case 28:
                n nVar23 = (n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryIconButtonKt composableSingletons$PantryIconButtonKt = new Object() { // from class: com.tgtg.componentlibrary.component.iconbutton.ComposableSingletons$PantryIconButtonKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final u3.d f13146a = new u3.d(new a(28), false, 1917585833);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$1917585833$app_release() {
                        return f13146a;
                    }
                };
                s sVar23 = (s) nVar23;
                if (sVar23.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    m mVar2 = (m) sVar23.j(PantryThemeKt.getLocalPantrySpacing());
                    t tVarZ2 = c.z(qVar, mVar2.f44015k);
                    b bVar2 = i.f13801a;
                    y yVarA2 = w.a(i.g(mVar2.l), d.f5694m, sVar23, 0);
                    int iHashCode2 = Long.hashCode(sVar23.T);
                    u3.i iVarL2 = sVar23.l();
                    t tVarC2 = b4.a.c(tVarZ2, sVar23);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar23.e0();
                    if (sVar23.S) {
                        sVar23.k(hVar2);
                    } else {
                        sVar23.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar23);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar23);
                    m3.i.v(sVar23, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar23, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar23);
                    SubtlePantryIconButtonKt.PreviewSubtleIconButtons(sVar23, 0);
                    IconOnlyPantryIconButtonKt.PreviewIconOnlyIconButtons(sVar23, 0);
                    AccentPantryIconButtonKt.PreviewAccentIconButtons(sVar23, 0);
                    sVar23.q(true);
                } else {
                    sVar23.U();
                }
                break;
            default:
                n nVar24 = (n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                s sVar24 = (s) nVar24;
                if (sVar24.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    cg.j.o(sVar24, 0);
                } else {
                    sVar24.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
