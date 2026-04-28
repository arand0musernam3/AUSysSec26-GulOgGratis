package com.tgtg.componentlibrary.component.button;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.button.model.ButtonSize;
import com.tgtg.componentlibrary.component.button.model.ButtonVariant;
import com.tgtg.componentlibrary.component.button.variant.AccentPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.NegativePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.PrimaryPantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.SubtlePantryButtonKt;
import com.tgtg.componentlibrary.component.button.variant.TextTransparentPantryButtonKt;
import e0.f;
import g60.b;
import g60.d;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\"\u001a\u00020\u001c8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 R \u0010$\u001a\u00020#8\u0006X\u0087D¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0003\u001a\u0004\b&\u0010'R \u0010)\u001a\u00020#8\u0006X\u0087D¢\u0006\u0012\n\u0004\b)\u0010%\u0012\u0004\b+\u0010\u0003\u001a\u0004\b*\u0010'R \u0010,\u001a\u00020#8\u0006X\u0087D¢\u0006\u0012\n\u0004\b,\u0010%\u0012\u0004\b.\u0010\u0003\u001a\u0004\b-\u0010'R \u0010/\u001a\u00020#8\u0006X\u0087D¢\u0006\u0012\n\u0004\b/\u0010%\u0012\u0004\b1\u0010\u0003\u001a\u0004\b0\u0010'R \u00102\u001a\u00020#8\u0006X\u0087D¢\u0006\u0012\n\u0004\b2\u0010%\u0012\u0004\b4\u0010\u0003\u001a\u0004\b3\u0010'¨\u00065"}, d2 = {"Lcom/tgtg/componentlibrary/component/button/PantryButtonDoc;", "", "<init>", "()V", "", "PantryButton", "(Lm3/n;I)V", "Lkotlin/Function0;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lkotlin/jvm/functions/Function2;", "getSelectIcon", "()Lkotlin/jvm/functions/Function2;", "getSelectIcon$annotations", "selectIcon", "Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "b", "Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "getVariant", "()Lcom/tgtg/componentlibrary/component/button/model/ButtonVariant;", "getVariant$annotations", "variant", "Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "c", "Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "getSize", "()Lcom/tgtg/componentlibrary/component/button/model/ButtonSize;", "getSize$annotations", "size", "", Constants.BRAZE_PUSH_NOTIFICATION_SOUND_DEFAULT_VALUE, "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "getState$annotations", "state", "", "leading", "Z", "getLeading", "()Z", "getLeading$annotations", "trailing", "getTrailing", "getTrailing$annotations", "focused", "getFocused", "getFocused$annotations", "disabled", "getDisabled", "getDisabled$annotations", "loading", "getLoading", "getLoading$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryButtonDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryButtonDoc.figma.kt\ncom/tgtg/componentlibrary/component/button/PantryButtonDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,268:1\n1128#2,6:269\n1128#2,6:275\n1128#2,6:281\n1128#2,6:287\n1128#2,6:293\n1128#2,6:299\n1128#2,6:305\n1128#2,6:311\n1128#2,6:317\n1128#2,6:323\n1128#2,6:329\n1128#2,6:335\n1128#2,6:341\n1128#2,6:347\n1128#2,6:353\n*S KotlinDebug\n*F\n+ 1 PantryButtonDoc.figma.kt\ncom/tgtg/componentlibrary/component/button/PantryButtonDoc\n*L\n119#1:269,6\n127#1:275,6\n135#1:281,6\n143#1:287,6\n151#1:293,6\n173#1:299,6\n181#1:305,6\n189#1:311,6\n197#1:317,6\n205#1:323,6\n227#1:329,6\n235#1:335,6\n243#1:341,6\n251#1:347,6\n259#1:353,6\n*E\n"})
public final class PantryButtonDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Function2 selectIcon = ComposableSingletons$PantryButtonDoc_figmaKt.INSTANCE.m612getLambda$781620307$app_release();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final ButtonVariant variant = (ButtonVariant) ((Pair) y.x(new Pair[]{new Pair("Primary", ButtonVariant.Primary), new Pair("Subtle", ButtonVariant.Subtle), new Pair("Text transparent", ButtonVariant.TextTransparent), new Pair("Accent", ButtonVariant.Accent), new Pair("Negative", ButtonVariant.Negative)})).f26486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final ButtonSize size = (ButtonSize) ((Pair) y.x(new Pair[]{new Pair("Large", ButtonSize.Large), new Pair("Medium", ButtonSize.Medium), new Pair("Small", ButtonSize.Small)})).f26486b;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final String state = (String) ((Pair) y.x(new Pair[]{new Pair("Idle", "Idle"), new Pair("Hover", "Hover"), new Pair("Pressed", "Pressed")})).f26486b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ButtonSize.values().length];
            try {
                iArr[ButtonSize.Large.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonSize.Medium.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonSize.Small.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ButtonVariant.values().length];
            try {
                iArr2[ButtonVariant.Primary.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ButtonVariant.Subtle.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[ButtonVariant.TextTransparent.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[ButtonVariant.Accent.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[ButtonVariant.Negative.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void PantryButton(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1829915832);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            ButtonVariant buttonVariant = this.variant;
            if (i13 == 1) {
                sVar.a0(-1907482835);
                a(buttonVariant, sVar, (i12 << 15) & 458752);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-1907474418);
                b(buttonVariant, sVar, (i12 << 15) & 458752);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw f.v(sVar, -1907483725, false);
                }
                sVar.a0(-1907466003);
                c(buttonVariant, sVar, (i12 << 15) & 458752);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 6);
        }
    }

    public final void a(ButtonVariant buttonVariant, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1355490058);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(buttonVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(true) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(false) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[buttonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            int i14 = i12;
            if (i13 == 1) {
                sVar.a0(1250865038);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new b(28);
                    sVar.k0(objM);
                }
                int i15 = i14 << 9;
                PrimaryPantryButtonKt.LargePrimaryPantryButton("Label", (Function0) objM, null, null, true, false, null, null, sVar, (i15 & 57344) | 54 | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(1250874541);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new b(29);
                    sVar.k0(objM2);
                }
                int i16 = i14 << 9;
                SubtlePantryButtonKt.LargeSubtlePantryButton("Label", (Function0) objM2, null, null, true, false, null, null, sVar, (i16 & 57344) | 54 | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(1250884310);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new d(0);
                    sVar.k0(objM3);
                }
                int i17 = i14 << 9;
                TextTransparentPantryButtonKt.LargeTextTransparentPantryButton("Label", (Function0) objM3, null, null, true, false, null, null, sVar, (i17 & 57344) | 54 | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(1250894061);
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new d(1);
                    sVar.k0(objM4);
                }
                int i18 = i14 << 9;
                AccentPantryButtonKt.LargeAccentPantryButton("Label", (Function0) objM4, null, null, true, false, null, null, sVar, (i18 & 57344) | 54 | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128), 12);
                sVar.q(false);
            } else {
                if (i13 != 5) {
                    throw f.v(sVar, 1250864580, false);
                }
                sVar.a0(1250903599);
                Object objM5 = sVar.M();
                if (objM5 == fVar) {
                    objM5 = new d(2);
                    sVar.k0(objM5);
                }
                int i19 = i14 << 9;
                NegativePantryButtonKt.LargeNegativePantryButton("Label", (Function0) objM5, null, null, true, false, null, null, sVar, (i19 & 57344) | 54 | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128), 12);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.c(this, buttonVariant, i11, 1);
        }
    }

    public final void b(ButtonVariant buttonVariant, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1830180108);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(buttonVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(true) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(false) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[buttonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            int i14 = i12;
            if (i13 == 1) {
                sVar.a0(2133517593);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new d(8);
                    sVar.k0(objM);
                }
                int i15 = i14 << 9;
                PrimaryPantryButtonKt.MediumPrimaryPantryButton("Label", (Function0) objM, null, null, true, false, null, null, sVar, (i15 & 57344) | 54 | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(2133527128);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new d(9);
                    sVar.k0(objM2);
                }
                int i16 = i14 << 9;
                SubtlePantryButtonKt.MediumSubtlePantryButton("Label", (Function0) objM2, null, null, true, false, null, null, sVar, (i16 & 57344) | 54 | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(2133536929);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new d(10);
                    sVar.k0(objM3);
                }
                int i17 = i14 << 9;
                TextTransparentPantryButtonKt.MediumTextTransparentPantryButton("Label", (Function0) objM3, null, null, true, false, null, null, sVar, (i17 & 57344) | 54 | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(2133546712);
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new b(26);
                    sVar.k0(objM4);
                }
                int i18 = i14 << 9;
                AccentPantryButtonKt.MediumAccentPantryButton("Label", (Function0) objM4, null, null, true, false, null, null, sVar, (i18 & 57344) | 54 | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128), 12);
                sVar.q(false);
            } else {
                if (i13 != 5) {
                    throw f.v(sVar, 2133517139, false);
                }
                sVar.a0(2133556282);
                Object objM5 = sVar.M();
                if (objM5 == fVar) {
                    objM5 = new b(27);
                    sVar.k0(objM5);
                }
                int i19 = i14 << 9;
                NegativePantryButtonKt.MediumNegativePantryButton("Label", (Function0) objM5, null, null, true, false, null, null, sVar, (i19 & 57344) | 54 | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128), 12);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.c(this, buttonVariant, i11, 0);
        }
    }

    public final void c(ButtonVariant buttonVariant, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(156137918);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(buttonVariant.ordinal()) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(true) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(false) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.h(null) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.h(null) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if (sVar.R(i12 & 1, (i12 & 9363) != 9362)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[buttonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            int i14 = i12;
            if (i13 == 1) {
                sVar.a0(-275306174);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new d(3);
                    sVar.k0(objM);
                }
                int i15 = i14 << 9;
                PrimaryPantryButtonKt.SmallPrimaryPantryButton("Label", (Function0) objM, null, null, true, false, null, null, sVar, (i15 & 57344) | 54 | (i15 & 458752) | (i15 & 3670016) | (i15 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-275296671);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new d(4);
                    sVar.k0(objM2);
                }
                int i16 = i14 << 9;
                SubtlePantryButtonKt.SmallSubtlePantryButton("Label", (Function0) objM2, null, null, true, false, null, null, sVar, (i16 & 57344) | 54 | (i16 & 458752) | (i16 & 3670016) | (i16 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 3) {
                sVar.a0(-275286902);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new d(5);
                    sVar.k0(objM3);
                }
                int i17 = i14 << 9;
                TextTransparentPantryButtonKt.SmallTextTransparentPantryButton("Label", (Function0) objM3, null, null, true, false, null, null, sVar, (i17 & 57344) | 54 | (i17 & 458752) | (i17 & 3670016) | (i17 & 29360128), 12);
                sVar.q(false);
            } else if (i13 == 4) {
                sVar.a0(-275277151);
                Object objM4 = sVar.M();
                if (objM4 == fVar) {
                    objM4 = new d(6);
                    sVar.k0(objM4);
                }
                int i18 = i14 << 9;
                AccentPantryButtonKt.SmallAccentPantryButton("Label", (Function0) objM4, null, null, true, false, null, null, sVar, (i18 & 57344) | 54 | (i18 & 458752) | (i18 & 3670016) | (i18 & 29360128), 12);
                sVar.q(false);
            } else {
                if (i13 != 5) {
                    throw f.v(sVar, -275306632, false);
                }
                sVar.a0(-275267613);
                Object objM5 = sVar.M();
                if (objM5 == fVar) {
                    objM5 = new d(7);
                    sVar.k0(objM5);
                }
                int i19 = i14 << 9;
                NegativePantryButtonKt.SmallNegativePantryButton("Label", (Function0) objM5, null, null, true, false, null, null, sVar, (i19 & 57344) | 54 | (i19 & 458752) | (i19 & 3670016) | (i19 & 29360128), 12);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g60.c(this, buttonVariant, i11, 2);
        }
    }

    public final boolean getDisabled() {
        return false;
    }

    public final boolean getFocused() {
        return false;
    }

    public final boolean getLeading() {
        return false;
    }

    public final boolean getLoading() {
        return false;
    }

    @NotNull
    public final Function2<n, Integer, Unit> getSelectIcon() {
        return this.selectIcon;
    }

    @NotNull
    public final ButtonSize getSize() {
        return this.size;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public final boolean getTrailing() {
        return false;
    }

    @NotNull
    public final ButtonVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ void getDisabled$annotations() {
    }

    public static /* synthetic */ void getFocused$annotations() {
    }

    public static /* synthetic */ void getLeading$annotations() {
    }

    public static /* synthetic */ void getLoading$annotations() {
    }

    public static /* synthetic */ void getSelectIcon$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getTrailing$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }
}
