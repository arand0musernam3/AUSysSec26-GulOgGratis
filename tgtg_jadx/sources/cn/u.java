package cn;

import cn.u;
import com.app.tgtg.R;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliveryCategoryCarousel;
import com.app.tgtg.feature.main.fragments.delivery.parcelfeed.compose.vertitems.DeliverySortingBottomSheet;
import com.app.tgtg.model.remote.item.response.BaseItemMnuV2;
import com.google.android.gms.internal.measurement.cg;
import com.tgtg.componentlibrary.component.badgelabel.ComposableSingletons$DemoPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.ComposableSingletons$PantryBadgeLabelDoc_figmaKt;
import com.tgtg.componentlibrary.component.badgelabel.DemoPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.p000switch.ComposableSingletons$DemoPantrySwitchKt;
import com.tgtg.componentlibrary.component.p000switch.DemoPantrySwitchKt;
import d8.l0;
import g3.i2;
import g3.r9;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import m3.n;
import o00.x0;
import org.bouncycastle.iana.AEADAlgorithm;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import u3.d;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class u implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8589a;

    public /* synthetic */ u(int i11) {
        this.f8589a = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8589a) {
            case 0:
                ((Integer) obj2).intValue();
                int i11 = DeliveryCategoryCarousel.f9125q;
                ((String) obj).getClass();
                break;
            case 1:
                int i12 = DeliveryCategoryCarousel.f9125q;
                ((String) obj).getClass();
                ((String) obj2).getClass();
                break;
            case 2:
                ((Integer) obj2).getClass();
                cg.b((m3.n) obj, m3.i.F(1));
                break;
            case 3:
                ((Boolean) obj2).booleanValue();
                int i13 = DeliverySortingBottomSheet.f9133m;
                break;
            case 4:
                ((Integer) obj).intValue();
                BaseItemMnuV2 baseItemMnuV2 = (BaseItemMnuV2) obj2;
                baseItemMnuV2.getClass();
                break;
            case 5:
                m3.n nVar = (m3.n) obj;
                int iIntValue = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantrySwitchKt composableSingletons$DemoPantrySwitchKt = new Object() { // from class: com.tgtg.componentlibrary.component.switch.ComposableSingletons$DemoPantrySwitchKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13270a = new d(new u(5, 0), false, 2067780807);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13271b = new d(new u(6, 0), false, 629561019);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$2067780807$app_release() {
                        return f13270a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$629561019$app_release() {
                        return f13271b;
                    }
                };
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    DemoPantrySwitchKt.DemoPantrySwitch(sVar, 0);
                } else {
                    sVar.U();
                }
                break;
            case 6:
                m3.n nVar2 = (m3.n) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantrySwitchKt composableSingletons$DemoPantrySwitchKt2 = new Object() { // from class: com.tgtg.componentlibrary.component.switch.ComposableSingletons$DemoPantrySwitchKt

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final d f13270a = new d(new u(5, 0), false, 2067780807);

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final d f13271b = new d(new u(6, 0), false, 629561019);

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$2067780807$app_release() {
                        return f13270a;
                    }

                    @NotNull
                    public final Function2<n, Integer, Unit> getLambda$629561019$app_release() {
                        return f13271b;
                    }
                };
                m3.s sVar2 = (m3.s) nVar2;
                if (sVar2.R(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    DemoPantrySwitchKt.DemoPantrySwitch(sVar2, 0);
                } else {
                    sVar2.U();
                }
                break;
            case 7:
                m3.n nVar3 = (m3.n) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                m3.s sVar3 = (m3.s) nVar3;
                if (sVar3.R(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.system_icon_close_neutral_80, sVar3, 0), null, d2.c.z(v1.n.j(b4.q.f5711a, lv.s.U, l2.g.b(40)), 8), i4.v.f23315h, sVar3, 3128, 0);
                } else {
                    sVar3.U();
                }
                break;
            case 8:
                break;
            case 9:
                l0 l0Var = (l0) obj;
                Throwable cancellationException = (Throwable) obj2;
                l0Var.getClass();
                v80.q qVar = l0Var.f14650b;
                if (cancellationException == null) {
                    cancellationException = new CancellationException("DataStore scope was cancelled before updateData could complete");
                }
                qVar.h0(cancellationException);
                break;
            case 10:
                m3.n nVar4 = (m3.n) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar4 = (m3.s) nVar4;
                if (sVar4.R(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.heart, sVar4, 0), "Medium Icon Only", null, 0L, sVar4, 56, 12);
                } else {
                    sVar4.U();
                }
                break;
            case 11:
                m3.n nVar5 = (m3.n) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt2 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar5 = (m3.s) nVar5;
                if (sVar5.R(1 & iIntValue5, (iIntValue5 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.heart, sVar5, 0), "Small Icon Only", null, 0L, sVar5, 56, 12);
                } else {
                    sVar5.U();
                }
                break;
            case 12:
                m3.n nVar6 = (m3.n) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt3 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar6 = (m3.s) nVar6;
                if (sVar6.R(1 & iIntValue6, (iIntValue6 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.heart, sVar6, 0), "Medium Icon Only", null, 0L, sVar6, 56, 12);
                } else {
                    sVar6.U();
                }
                break;
            case 13:
                m3.n nVar7 = (m3.n) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt4 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar7 = (m3.s) nVar7;
                if (sVar7.R(1 & iIntValue7, (iIntValue7 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.heart, sVar7, 0), "Small Icon Only", null, 0L, sVar7, 56, 12);
                } else {
                    sVar7.U();
                }
                break;
            case 14:
                m3.n nVar8 = (m3.n) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt5 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar8 = (m3.s) nVar8;
                if (sVar8.R(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    DemoPantryBadgeLabelKt.DemoPantryBadgeLabel(sVar8, 0);
                } else {
                    sVar8.U();
                }
                break;
            case AEADAlgorithm.AEAD_AES_SIV_CMAC_256 /* 15 */:
                m3.n nVar9 = (m3.n) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt6 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar9 = (m3.s) nVar9;
                if (sVar9.R(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    DemoPantryBadgeLabelKt.DemoPantryBadgeLabel(sVar9, 0);
                } else {
                    sVar9.U();
                }
                break;
            case 16:
                m3.n nVar10 = (m3.n) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt7 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar10 = (m3.s) nVar10;
                if (sVar10.R(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    DemoPantryBadgeLabelKt.DemoPantryBadgeLabel(sVar10, 0);
                } else {
                    sVar10.U();
                }
                break;
            case 17:
                m3.n nVar11 = (m3.n) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                ComposableSingletons$DemoPantryBadgeLabelKt composableSingletons$DemoPantryBadgeLabelKt8 = ComposableSingletons$DemoPantryBadgeLabelKt.INSTANCE;
                m3.s sVar11 = (m3.s) nVar11;
                if (sVar11.R(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    DemoPantryBadgeLabelKt.DemoPantryBadgeLabel(sVar11, 0);
                } else {
                    sVar11.U();
                }
                break;
            case 18:
                m3.n nVar12 = (m3.n) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                ComposableSingletons$PantryBadgeLabelDoc_figmaKt composableSingletons$PantryBadgeLabelDoc_figmaKt = ComposableSingletons$PantryBadgeLabelDoc_figmaKt.INSTANCE;
                m3.s sVar12 = (m3.s) nVar12;
                if (sVar12.R(1 & iIntValue12, (iIntValue12 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.heart, sVar12, 0), null, null, 0L, sVar12, 56, 12);
                } else {
                    sVar12.U();
                }
                break;
            case 19:
                m3.n nVar13 = (m3.n) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                m3.s sVar13 = (m3.s) nVar13;
                if (sVar13.R(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    i2.a(x0.z(R.drawable.filter_icon, sVar13, 0), o30.f0.U(sVar13, R.string.a11y_filters_cta_show_all_filters), null, 0L, sVar13, 8, 12);
                } else {
                    sVar13.U();
                }
                break;
            case 20:
                m3.n nVar14 = (m3.n) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                m3.s sVar14 = (m3.s) nVar14;
                if (sVar14.R(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    r9.d(o30.f0.U(sVar14, R.string.login_charity_contact_how_to_reach_email_hint), null, lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar14, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar14.U();
                }
                break;
            case 21:
                m3.n nVar15 = (m3.n) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                m3.s sVar15 = (m3.s) nVar15;
                if (sVar15.R(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    r9.d(o30.f0.U(sVar15, R.string.login_charity_contact_how_to_reach_country_hint), null, lv.s.E, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, lv.v.f28274n, sVar15, MLKEMEngine.KyberPolyBytes, 12582912, 131066);
                } else {
                    sVar15.U();
                }
                break;
            case 22:
                m3.n nVar16 = (m3.n) obj;
                int iIntValue16 = ((Integer) obj2).intValue();
                m3.s sVar16 = (m3.s) nVar16;
                if (sVar16.R(iIntValue16 & 1, (iIntValue16 & 3) != 2)) {
                    v1.n.d(x0.z(R.drawable.ic_chevron_down_neutral_80, sVar16, 0), null, null, null, null, 0.0f, null, sVar16, 56, 124);
                } else {
                    sVar16.U();
                }
                break;
            case 23:
                f2.c0 c0Var = (f2.c0) obj2;
                break;
            case 24:
                m3.n nVar17 = (m3.n) obj;
                int iIntValue17 = ((Integer) obj2).intValue();
                m3.s sVar17 = (m3.s) nVar17;
                if (!sVar17.R(iIntValue17 & 1, (iIntValue17 & 3) != 2)) {
                    sVar17.U();
                }
                break;
            case 25:
                ((Integer) obj2).intValue();
                break;
            case 26:
                g2.b0 b0Var = (g2.b0) obj2;
                break;
            case 27:
                m3.n nVar18 = (m3.n) obj;
                int iIntValue18 = ((Integer) obj2).intValue();
                m3.s sVar18 = (m3.s) nVar18;
                if (!sVar18.R(iIntValue18 & 1, (iIntValue18 & 3) != 2)) {
                    sVar18.U();
                }
                break;
            case 28:
                m3.n nVar19 = (m3.n) obj;
                int iIntValue19 = ((Integer) obj2).intValue();
                m3.s sVar19 = (m3.s) nVar19;
                if (!sVar19.R(iIntValue19 & 1, (iIntValue19 & 3) != 2)) {
                    sVar19.U();
                }
                break;
            default:
                m3.n nVar20 = (m3.n) obj;
                int iIntValue20 = ((Integer) obj2).intValue();
                m3.s sVar20 = (m3.s) nVar20;
                if (sVar20.R(iIntValue20 & 1, (iIntValue20 & 3) != 2)) {
                    g3.m.f19068a.a(null, 0.0f, 0.0f, null, 0L, sVar20, 196608);
                } else {
                    sVar20.U();
                }
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ u(int i11, byte b8) {
        this.f8589a = i11;
    }
}
