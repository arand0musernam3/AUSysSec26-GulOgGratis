package qm;

import b4.d;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.app.tgtg.R;
import com.tgtg.componentlibrary.component.avatar.PantryAvatarKt;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.ComposableSingletons$SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.component.pageheader.ComposableSingletons$DemoPantryPageHeaderKt;
import com.tgtg.componentlibrary.component.pageheader.DemoPantryPageHeaderKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.c;
import d2.m2;
import d2.p;
import d2.w;
import d2.y;
import g3.b9;
import g3.i2;
import g3.k8;
import g3.m5;
import g3.r9;
import i4.v;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import m3.b1;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import o00.x0;
import o30.f0;
import org.bouncycastle.iana.AEADAlgorithm;
import rk.e;
import u3.i;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37193a;

    public /* synthetic */ a(int i11) {
        this.f37193a = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f37193a;
        f fVar = m.f29332a;
        q qVar = q.f5711a;
        int i12 = 2;
        int i13 = 3;
        switch (i11) {
            case 0:
                n nVar = (n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s sVar = (s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t tVarA = c.A(qVar, lv.t.f28253g, lv.t.f28251e);
                    u0 u0VarD = p.d(d.f5687e, false);
                    int iHashCode = Long.hashCode(sVar.T);
                    i iVarL = sVar.l();
                    t tVarC = b4.a.c(tVarA, sVar);
                    j.R.getClass();
                    h hVar = b5.i.f5839b;
                    sVar.e0();
                    if (sVar.S) {
                        sVar.k(hVar);
                    } else {
                        sVar.n0();
                    }
                    m3.i.C(u0VarD, b5.i.f5843f, sVar);
                    m3.i.C(iVarL, b5.i.f5842e, sVar);
                    m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
                    m3.i.z(sVar, b5.i.f5845h);
                    m3.i.C(tVarC, b5.i.f5841d, sVar);
                    m5.a(m2.m(qVar, 16), lv.s.f28215a, 2, 0L, 0, 0.0f, sVar, 438, 56);
                    sVar.q(true);
                } else {
                    sVar.U();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                b.a((n) obj, m3.i.F(1));
                break;
            case 2:
                n nVar2 = (n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                s sVar2 = (s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar2, 0), null, null, 0L, sVar2, 56, 12);
                } else {
                    sVar2.U();
                }
                break;
            case 3:
                n nVar3 = (n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt2 = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                s sVar3 = (s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar3, 0), null, null, 0L, sVar3, 56, 12);
                } else {
                    sVar3.U();
                }
                break;
            case 4:
                n nVar4 = (n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt3 = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                s sVar4 = (s) nVar4;
                if (sVar4.R(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar4, 0), null, null, 0L, sVar4, 56, 12);
                } else {
                    sVar4.U();
                }
                break;
            case 5:
                n nVar5 = (n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$AccentPantryIconButtonKt composableSingletons$AccentPantryIconButtonKt4 = ComposableSingletons$AccentPantryIconButtonKt.INSTANCE;
                s sVar5 = (s) nVar5;
                if (sVar5.R(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    x60.m mVar = (x60.m) sVar5.j(PantryThemeKt.getLocalPantrySpacing());
                    Object objM = sVar5.M();
                    if (objM == fVar) {
                        objM = m3.i.w(Boolean.FALSE);
                        sVar5.k0(objM);
                    }
                    b1 b1Var = (b1) objM;
                    t tVarZ = c.z(qVar, mVar.f44015k);
                    d2.b bVar = d2.i.f13801a;
                    y yVarA = w.a(d2.i.g(mVar.l), d.f5694m, sVar5, 0);
                    int iHashCode2 = Long.hashCode(sVar5.T);
                    i iVarL2 = sVar5.l();
                    t tVarC2 = b4.a.c(tVarZ, sVar5);
                    j.R.getClass();
                    h hVar2 = b5.i.f5839b;
                    sVar5.e0();
                    if (sVar5.S) {
                        sVar5.k(hVar2);
                    } else {
                        sVar5.n0();
                    }
                    m3.i.C(yVarA, b5.i.f5843f, sVar5);
                    m3.i.C(iVarL2, b5.i.f5842e, sVar5);
                    m3.i.v(sVar5, Integer.valueOf(iHashCode2), b5.i.f5844g);
                    m3.i.z(sVar5, b5.i.f5845h);
                    m3.i.C(tVarC2, b5.i.f5841d, sVar5);
                    Object objM2 = sVar5.M();
                    if (objM2 == fVar) {
                        objM2 = new pi.b(b1Var, 5);
                        sVar5.k0(objM2);
                    }
                    AccentPantryIconButtonKt.MediumAccentPantryIconButton((Function0) objM2, null, null, false, ((Boolean) b1Var.getValue()).booleanValue(), ComposableSingletons$AccentPantryIconButtonKt.f13168a, sVar5, 196614, 14);
                    Object objM3 = sVar5.M();
                    if (objM3 == fVar) {
                        objM3 = new pi.b(b1Var, 6);
                        sVar5.k0(objM3);
                    }
                    AccentPantryIconButtonKt.SmallAccentPantryIconButton((Function0) objM3, null, null, false, ((Boolean) b1Var.getValue()).booleanValue(), ComposableSingletons$AccentPantryIconButtonKt.f13169b, sVar5, 196614, 14);
                    Object objM4 = sVar5.M();
                    if (objM4 == fVar) {
                        objM4 = new pi.b(b1Var, 7);
                        sVar5.k0(objM4);
                    }
                    AccentPantryIconButtonKt.TinyAccentPantryIconButton((Function0) objM4, null, null, false, ((Boolean) b1Var.getValue()).booleanValue(), ComposableSingletons$AccentPantryIconButtonKt.f13170c, sVar5, 196614, 14);
                    sVar5.q(true);
                } else {
                    sVar5.U();
                }
                break;
            case 6:
                n nVar6 = (n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                s sVar6 = (s) nVar6;
                if (sVar6.R(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar6, 0), null, null, 0L, sVar6, 56, 12);
                } else {
                    sVar6.U();
                }
                break;
            case 7:
                n nVar7 = (n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt2 = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                s sVar7 = (s) nVar7;
                if (sVar7.R(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar7, 0), null, null, 0L, sVar7, 56, 12);
                } else {
                    sVar7.U();
                }
                break;
            case 8:
                n nVar8 = (n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt3 = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                s sVar8 = (s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar8, 0), null, null, 0L, sVar8, 56, 12);
                } else {
                    sVar8.U();
                }
                break;
            case 9:
                n nVar9 = (n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$IconOnlyPantryIconButtonKt composableSingletons$IconOnlyPantryIconButtonKt4 = ComposableSingletons$IconOnlyPantryIconButtonKt.INSTANCE;
                s sVar9 = (s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    x60.m mVar2 = (x60.m) sVar9.j(PantryThemeKt.getLocalPantrySpacing());
                    Object objM5 = sVar9.M();
                    if (objM5 == fVar) {
                        objM5 = m3.i.w(Boolean.FALSE);
                        sVar9.k0(objM5);
                    }
                    b1 b1Var2 = (b1) objM5;
                    t tVarZ2 = c.z(qVar, mVar2.f44015k);
                    d2.b bVar2 = d2.i.f13801a;
                    y yVarA2 = w.a(d2.i.g(mVar2.l), d.f5694m, sVar9, 0);
                    int iHashCode3 = Long.hashCode(sVar9.T);
                    i iVarL3 = sVar9.l();
                    t tVarC3 = b4.a.c(tVarZ2, sVar9);
                    j.R.getClass();
                    h hVar3 = b5.i.f5839b;
                    sVar9.e0();
                    if (sVar9.S) {
                        sVar9.k(hVar3);
                    } else {
                        sVar9.n0();
                    }
                    m3.i.C(yVarA2, b5.i.f5843f, sVar9);
                    m3.i.C(iVarL3, b5.i.f5842e, sVar9);
                    m3.i.v(sVar9, Integer.valueOf(iHashCode3), b5.i.f5844g);
                    m3.i.z(sVar9, b5.i.f5845h);
                    m3.i.C(tVarC3, b5.i.f5841d, sVar9);
                    Object objM6 = sVar9.M();
                    if (objM6 == fVar) {
                        objM6 = new pi.b(b1Var2, 8);
                        sVar9.k0(objM6);
                    }
                    IconOnlyPantryIconButtonKt.MediumIconOnlyPantryIconButton((Function0) objM6, null, null, false, ((Boolean) b1Var2.getValue()).booleanValue(), ComposableSingletons$IconOnlyPantryIconButtonKt.f13172a, sVar9, 196614, 14);
                    Object objM7 = sVar9.M();
                    if (objM7 == fVar) {
                        objM7 = new pi.b(b1Var2, 9);
                        sVar9.k0(objM7);
                    }
                    IconOnlyPantryIconButtonKt.SmallIconOnlyPantryIconButton((Function0) objM7, null, null, false, ((Boolean) b1Var2.getValue()).booleanValue(), ComposableSingletons$IconOnlyPantryIconButtonKt.f13173b, sVar9, 196614, 14);
                    Object objM8 = sVar9.M();
                    if (objM8 == fVar) {
                        objM8 = new pi.b(b1Var2, 10);
                        sVar9.k0(objM8);
                    }
                    IconOnlyPantryIconButtonKt.TinyIconOnlyPantryIconButton((Function0) objM8, null, null, false, ((Boolean) b1Var2.getValue()).booleanValue(), ComposableSingletons$IconOnlyPantryIconButtonKt.f13174c, sVar9, 196614, 14);
                    sVar9.q(true);
                } else {
                    sVar9.U();
                }
                break;
            case 10:
                n nVar10 = (n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                s sVar10 = (s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar10, 0), null, null, 0L, sVar10, 56, 12);
                } else {
                    sVar10.U();
                }
                break;
            case 11:
                n nVar11 = (n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt2 = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                s sVar11 = (s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar11, 0), null, null, 0L, sVar11, 56, 12);
                } else {
                    sVar11.U();
                }
                break;
            case 12:
                n nVar12 = (n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt3 = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                s sVar12 = (s) nVar12;
                if (sVar12.R(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.plus, sVar12, 0), null, null, 0L, sVar12, 56, 12);
                } else {
                    sVar12.U();
                }
                break;
            case 13:
                n nVar13 = (n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                ComposableSingletons$SubtlePantryIconButtonKt composableSingletons$SubtlePantryIconButtonKt4 = ComposableSingletons$SubtlePantryIconButtonKt.INSTANCE;
                s sVar13 = (s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    x60.m mVar3 = (x60.m) sVar13.j(PantryThemeKt.getLocalPantrySpacing());
                    Object objM9 = sVar13.M();
                    if (objM9 == fVar) {
                        objM9 = m3.i.w(Boolean.FALSE);
                        sVar13.k0(objM9);
                    }
                    b1 b1Var3 = (b1) objM9;
                    t tVarZ3 = c.z(qVar, mVar3.f44015k);
                    d2.b bVar3 = d2.i.f13801a;
                    y yVarA3 = w.a(d2.i.g(mVar3.l), d.f5694m, sVar13, 0);
                    int iHashCode4 = Long.hashCode(sVar13.T);
                    i iVarL4 = sVar13.l();
                    t tVarC4 = b4.a.c(tVarZ3, sVar13);
                    j.R.getClass();
                    h hVar4 = b5.i.f5839b;
                    sVar13.e0();
                    if (sVar13.S) {
                        sVar13.k(hVar4);
                    } else {
                        sVar13.n0();
                    }
                    m3.i.C(yVarA3, b5.i.f5843f, sVar13);
                    m3.i.C(iVarL4, b5.i.f5842e, sVar13);
                    m3.i.v(sVar13, Integer.valueOf(iHashCode4), b5.i.f5844g);
                    m3.i.z(sVar13, b5.i.f5845h);
                    m3.i.C(tVarC4, b5.i.f5841d, sVar13);
                    Object objM10 = sVar13.M();
                    if (objM10 == fVar) {
                        objM10 = new pi.b(b1Var3, 11);
                        sVar13.k0(objM10);
                    }
                    SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM10, null, null, false, ((Boolean) b1Var3.getValue()).booleanValue(), ComposableSingletons$SubtlePantryIconButtonKt.f13176a, sVar13, 196614, 14);
                    Object objM11 = sVar13.M();
                    if (objM11 == fVar) {
                        objM11 = new pi.b(b1Var3, 12);
                        sVar13.k0(objM11);
                    }
                    SubtlePantryIconButtonKt.SmallSubtlePantryIconButton((Function0) objM11, null, null, false, ((Boolean) b1Var3.getValue()).booleanValue(), ComposableSingletons$SubtlePantryIconButtonKt.f13177b, sVar13, 196614, 14);
                    Object objM12 = sVar13.M();
                    if (objM12 == fVar) {
                        objM12 = new pi.b(b1Var3, 13);
                        sVar13.k0(objM12);
                    }
                    SubtlePantryIconButtonKt.TinySubtlePantryIconButton((Function0) objM12, null, null, false, ((Boolean) b1Var3.getValue()).booleanValue(), ComposableSingletons$SubtlePantryIconButtonKt.f13178c, sVar13, 196614, 14);
                    sVar13.q(true);
                } else {
                    sVar13.U();
                }
                break;
            case 14:
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                n nVar14 = (n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                s sVar14 = (s) nVar14;
                if (!sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    sVar14.U();
                }
                break;
            case 16:
                ((Integer) obj2).getClass();
                e.H((n) obj, m3.i.F(1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                e.h((n) obj, m3.i.F(1));
                break;
            case 18:
                n nVar15 = (n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                s sVar15 = (s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_close_neutral_80, sVar15, 0), null, m2.u(qVar, null, 3), v.f23315h, sVar15, 3512, 0);
                } else {
                    sVar15.U();
                }
                break;
            case 19:
                ((Integer) obj2).intValue();
                s sVar16 = (s) ((n) obj);
                sVar16.a0(-1141682146);
                sVar16.q(false);
                break;
            case 20:
                ((Integer) obj2).intValue();
                s sVar17 = (s) ((n) obj);
                sVar17.a0(1077484210);
                sVar17.q(false);
                break;
            case 21:
                n nVar16 = (n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                s sVar18 = (s) nVar16;
                if (sVar18.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar18, 0), f0.U(sVar18, R.string.voice_over_close), null, null, null, 0.0f, null, sVar18, 8, 124);
                } else {
                    sVar18.U();
                }
                break;
            case 22:
                n nVar17 = (n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                s sVar19 = (s) nVar17;
                if (sVar19.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    v1.n.d(x0.z(R.drawable.system_icon_close_neutral_80, sVar19, 0), f0.U(sVar19, R.string.voice_over_close), null, null, null, 0.0f, null, sVar19, 8, 124);
                } else {
                    sVar19.U();
                }
                break;
            case 23:
                n nVar18 = (n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar20 = (s) nVar18;
                if (sVar20.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    PantryAvatarKt.PantryAvatar(null, null, "JM", null, AvatarVariant.Text, null, sVar20, 24960, 43);
                } else {
                    sVar20.U();
                }
                break;
            case 24:
                n nVar19 = (n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt2 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar21 = (s) nVar19;
                if (sVar21.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    DemoPantryPageHeaderKt.a(R.drawable.plus, sVar21, 0);
                } else {
                    sVar21.U();
                }
                break;
            case 25:
                n nVar20 = (n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt3 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar22 = (s) nVar20;
                if (sVar22.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Earn 100 DKK", null, null, null, null, sVar22, 6, 30);
                } else {
                    sVar22.U();
                }
                break;
            case 26:
                n nVar21 = (n) obj;
                int iIntValue21 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt4 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar23 = (s) nVar21;
                if (sVar23.R(iIntValue21 & 1, (iIntValue21 & 3) != 2)) {
                    r9.d("Tab 1", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar23, 6, 0, 262142);
                } else {
                    sVar23.U();
                }
                break;
            case 27:
                n nVar22 = (n) obj;
                int iIntValue22 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt5 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar24 = (s) nVar22;
                if (sVar24.R(iIntValue22 & 1, (iIntValue22 & 3) != 2)) {
                    r9.d("Tab 2", null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, sVar24, 6, 0, 262142);
                } else {
                    sVar24.U();
                }
                break;
            case 28:
                n nVar23 = (n) obj;
                int iIntValue23 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt6 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar25 = (s) nVar23;
                if (sVar25.R(iIntValue23 & 1, (iIntValue23 & 3) != 2)) {
                    Object objM13 = sVar25.M();
                    if (objM13 == fVar) {
                        objM13 = new s60.b(i12);
                        sVar25.k0(objM13);
                    }
                    k8.b(true, (Function0) objM13, null, false, ComposableSingletons$DemoPantryPageHeaderKt.f13184e, 0L, 0L, sVar25, 24630, 492);
                    Object objM14 = sVar25.M();
                    if (objM14 == fVar) {
                        objM14 = new s60.b(i13);
                        sVar25.k0(objM14);
                    }
                    k8.b(false, (Function0) objM14, null, false, ComposableSingletons$DemoPantryPageHeaderKt.f13185f, 0L, 0L, sVar25, 24630, 492);
                } else {
                    sVar25.U();
                }
                break;
            default:
                n nVar24 = (n) obj;
                int iIntValue24 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryPageHeaderKt composableSingletons$DemoPantryPageHeaderKt7 = ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE;
                s sVar26 = (s) nVar24;
                if (sVar26.R(iIntValue24 & 1, (iIntValue24 & 3) != 2)) {
                    b9.b(null, 0L, 0L, null, null, ComposableSingletons$DemoPantryPageHeaderKt.f13186g, sVar26, 1572870);
                } else {
                    sVar26.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ a(int i11, int i12) {
        this.f37193a = i12;
    }
}
