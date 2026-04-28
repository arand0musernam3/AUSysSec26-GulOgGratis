package com.tgtg.componentlibrary.component.badgelabel;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelSize;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant;
import com.tgtg.componentlibrary.component.badgelabel.variant.AccentPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.BasePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.NegativePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.PositivePantryBadgeLabelKt;
import com.tgtg.componentlibrary.component.badgelabel.variant.UnavailablePantryBadgeLabelKt;
import e0.f;
import e60.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function2;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/tgtg/componentlibrary/component/badgelabel/PantryBadgeLabelDoc;", "", "<init>", "()V", "", "PantryBadgeLabel", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", "getVariant", "()Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", "getVariant$annotations", "variant", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "b", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "getSize", "()Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "getSize$annotations", "size", "", "trailing", "Z", "getTrailing", "()Z", "getTrailing$annotations", "leading", "getLeading", "getLeading$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PantryBadgeLabelDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final BadgeLabelVariant variant = (BadgeLabelVariant) ((Pair) y.x(new Pair[]{new Pair("Base", BadgeLabelVariant.Base), new Pair("Positive", BadgeLabelVariant.Positive), new Pair("Attention", BadgeLabelVariant.Attention), new Pair("Negative", BadgeLabelVariant.Negative), new Pair("Accent", BadgeLabelVariant.Accent)})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final BadgeLabelSize size = (BadgeLabelSize) ((Pair) y.x(new Pair[]{new Pair("Medium", BadgeLabelSize.Medium), new Pair("Small", BadgeLabelSize.Small)})).f26486b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BadgeLabelSize.values().length];
            try {
                iArr[BadgeLabelSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BadgeLabelSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BadgeLabelVariant.values().length];
            try {
                iArr2[BadgeLabelVariant.Base.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[BadgeLabelVariant.Positive.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BadgeLabelVariant.Attention.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BadgeLabelVariant.Negative.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BadgeLabelVariant.Accent.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BadgeLabelVariant.Unavailable.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void PantryBadgeLabel(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1895622598);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Function2 function2M576getLambda$1457176199$app_release = ComposableSingletons$PantryBadgeLabelDoc_figmaKt.INSTANCE.m576getLambda$1457176199$app_release();
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            BadgeLabelVariant badgeLabelVariant = this.variant;
            if (i13 == 1) {
                sVar.a0(627195814);
                a(badgeLabelVariant, function2M576getLambda$1457176199$app_release, sVar, (i12 << 9) & 7168);
                sVar.q(false);
            } else {
                if (i13 != 2) {
                    throw f.v(sVar, 627194439, false);
                }
                sVar.a0(627202117);
                b(badgeLabelVariant, function2M576getLambda$1457176199$app_release, sVar, (i12 << 9) & 7168);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 3);
        }
    }

    public final void a(BadgeLabelVariant badgeLabelVariant, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1359612037);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(badgeLabelVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(null) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            switch (WhenMappings.$EnumSwitchMapping$1[badgeLabelVariant.ordinal()]) {
                case 1:
                    sVar.a0(-917101095);
                    int i13 = i12 << 6;
                    BasePantryBadgeLabelKt.MediumBasePantryBadgeLabel("Label", null, null, function2, null, sVar, (i13 & 7168) | 6 | (i13 & 57344), 6);
                    sVar.q(false);
                    break;
                case 2:
                    sVar.a0(-917094659);
                    int i14 = i12 << 6;
                    PositivePantryBadgeLabelKt.MediumPositivePantryBadgeLabel("Label", null, null, function2, null, sVar, (i14 & 7168) | 6 | (i14 & 57344), 6);
                    sVar.q(false);
                    break;
                case 3:
                    sVar.a0(-917088066);
                    int i15 = i12 << 6;
                    AttentionPantryBadgeLabelKt.MediumAttentionPantryBadgeLabel("Label", null, null, function2, null, sVar, (i15 & 7168) | 6 | (i15 & 57344), 6);
                    sVar.q(false);
                    break;
                case 4:
                    sVar.a0(-917081475);
                    int i16 = i12 << 6;
                    NegativePantryBadgeLabelKt.MediumNegativePantryBadgeLabel("Label", null, null, function2, null, sVar, (i16 & 7168) | 6 | (i16 & 57344), 6);
                    sVar.q(false);
                    break;
                case 5:
                    sVar.a0(-917074981);
                    int i17 = i12 << 6;
                    AccentPantryBadgeLabelKt.MediumAccentPantryBadgeLabel("Label", null, null, function2, null, sVar, (i17 & 7168) | 6 | (i17 & 57344), 6);
                    sVar.q(false);
                    break;
                case 6:
                    sVar.a0(-917068384);
                    int i18 = i12 << 6;
                    UnavailablePantryBadgeLabelKt.MediumUnavailablePantryBadgeLabel("Label", null, null, function2, null, sVar, (i18 & 7168) | 6 | (i18 & 57344), 6);
                    sVar.q(false);
                    break;
                default:
                    throw f.v(sVar, -917101761, false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(this, badgeLabelVariant, function2, i11, 0);
        }
    }

    public final void b(BadgeLabelVariant badgeLabelVariant, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1251847867);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(badgeLabelVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(function2) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.h(null) ? 256 : 128;
        }
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            switch (WhenMappings.$EnumSwitchMapping$1[badgeLabelVariant.ordinal()]) {
                case 1:
                    sVar.a0(-434948862);
                    int i13 = i12 << 6;
                    BasePantryBadgeLabelKt.SmallBasePantryBadgeLabel("Label", null, null, function2, null, sVar, (i13 & 7168) | 6 | (i13 & 57344), 6);
                    sVar.q(false);
                    break;
                case 2:
                    sVar.a0(-434942458);
                    int i14 = i12 << 6;
                    PositivePantryBadgeLabelKt.SmallPositivePantryBadgeLabel("Label", null, null, function2, null, sVar, (i14 & 7168) | 6 | (i14 & 57344), 6);
                    sVar.q(false);
                    break;
                case 3:
                    sVar.a0(-434935897);
                    int i15 = i12 << 6;
                    AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel("Label", null, null, function2, null, sVar, (i15 & 7168) | 6 | (i15 & 57344), 6);
                    sVar.q(false);
                    break;
                case 4:
                    sVar.a0(-434929338);
                    int i16 = i12 << 6;
                    NegativePantryBadgeLabelKt.SmallNegativePantryBadgeLabel("Label", null, null, function2, null, sVar, (i16 & 7168) | 6 | (i16 & 57344), 6);
                    sVar.q(false);
                    break;
                case 5:
                    sVar.a0(-434922876);
                    int i17 = i12 << 6;
                    AccentPantryBadgeLabelKt.SmallAccentPantryBadgeLabel("Label", null, null, function2, null, sVar, (i17 & 7168) | 6 | (i17 & 57344), 6);
                    sVar.q(false);
                    break;
                case 6:
                    sVar.a0(-434916311);
                    int i18 = i12 << 6;
                    UnavailablePantryBadgeLabelKt.SmallUnavailablePantryBadgeLabel("Label", null, null, function2, null, sVar, (i18 & 7168) | 6 | (i18 & 57344), 6);
                    sVar.q(false);
                    break;
                default:
                    throw f.v(sVar, -434949533, false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new a(this, badgeLabelVariant, function2, i11, 1);
        }
    }

    public final boolean getLeading() {
        return true;
    }

    @NotNull
    public final BadgeLabelSize getSize() {
        return this.size;
    }

    public final boolean getTrailing() {
        return false;
    }

    @NotNull
    public final BadgeLabelVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ void getLeading$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getTrailing$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }
}
