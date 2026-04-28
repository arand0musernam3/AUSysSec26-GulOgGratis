package com.tgtg.componentlibrary.component.iconbutton;

import c60.c;
import com.braze.Constants;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonSize;
import com.tgtg.componentlibrary.component.iconbutton.model.IconButtonVariant;
import com.tgtg.componentlibrary.component.iconbutton.variant.AccentPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.IconOnlyPantryIconButtonKt;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import e0.f;
import kotlin.Metadata;
import kotlin.Pair;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import q60.a;
import q60.b;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001d\u001a\u00020\u001c8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0003\u001a\u0004\b\u001f\u0010 R \u0010\"\u001a\u00020\u001c8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\"\u0010\u001e\u0012\u0004\b$\u0010\u0003\u001a\u0004\b#\u0010 R \u0010%\u001a\u00020\u001c8\u0006X\u0087D¢\u0006\u0012\n\u0004\b%\u0010\u001e\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010 ¨\u0006("}, d2 = {"Lcom/tgtg/componentlibrary/component/iconbutton/PantryIconButtonDoc;", "", "<init>", "()V", "", "PantryIconButton", "(Lm3/n;I)V", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", Constants.BRAZE_PUSH_CONTENT_KEY, "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", "getVariant", "()Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonVariant;", "getVariant$annotations", "variant", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;", "b", "Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;", "getSize", "()Lcom/tgtg/componentlibrary/component/iconbutton/model/IconButtonSize;", "getSize$annotations", "size", "", "c", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "getState$annotations", "state", "", "focused", "Z", "getFocused", "()Z", "getFocused$annotations", "loading", "getLoading", "getLoading$annotations", "disabled", "getDisabled", "getDisabled$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryIconButtonDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryIconButtonDoc.figma.kt\ncom/tgtg/componentlibrary/component/iconbutton/PantryIconButtonDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,183:1\n1128#2,6:184\n1128#2,6:190\n1128#2,6:196\n1128#2,6:202\n1128#2,6:208\n1128#2,6:214\n1128#2,6:220\n1128#2,6:226\n1128#2,6:232\n*S KotlinDebug\n*F\n+ 1 PantryIconButtonDoc.figma.kt\ncom/tgtg/componentlibrary/component/iconbutton/PantryIconButtonDoc\n*L\n103#1:184,6\n109#1:190,6\n115#1:196,6\n133#1:202,6\n139#1:208,6\n145#1:214,6\n163#1:220,6\n169#1:226,6\n175#1:232,6\n*E\n"})
public final class PantryIconButtonDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final IconButtonVariant variant = (IconButtonVariant) ((Pair) y.x(new Pair[]{new Pair("Subtle", IconButtonVariant.Subtle), new Pair("Accent", IconButtonVariant.Accent), new Pair("Icon only", IconButtonVariant.IconOnly)})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final IconButtonSize size = (IconButtonSize) ((Pair) y.x(new Pair[]{new Pair("Medium", IconButtonSize.Medium), new Pair("Small", IconButtonSize.Small), new Pair("Tiny", IconButtonSize.Tiny)})).f26486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final String state = (String) ((Pair) y.x(new Pair[]{new Pair("Idle", "Idle"), new Pair("Hover", "Hover"), new Pair("Pressed", "Pressed")})).f26486b;

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[IconButtonSize.values().length];
            try {
                iArr[IconButtonSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconButtonSize.Small.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconButtonSize.Tiny.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[IconButtonVariant.values().length];
            try {
                iArr2[IconButtonVariant.Subtle.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[IconButtonVariant.Accent.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[IconButtonVariant.IconOnly.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public final void PantryIconButton(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-1418473414);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Function2 function2M815getLambda$476304915$app_release = ComposableSingletons$PantryIconButtonDoc_figmaKt.INSTANCE.m815getLambda$476304915$app_release();
            int i13 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
            IconButtonVariant iconButtonVariant = this.variant;
            if (i13 == 1) {
                sVar.a0(-1648307831);
                a(iconButtonVariant, function2M815getLambda$476304915$app_release, sVar, ((i12 << 12) & 57344) | 3072);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-1648301048);
                b(iconButtonVariant, function2M815getLambda$476304915$app_release, sVar, ((i12 << 12) & 57344) | 3072);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw f.v(sVar, -1648308982, false);
                }
                sVar.a0(-1648294329);
                c(iconButtonVariant, function2M815getLambda$476304915$app_release, sVar, ((i12 << 12) & 57344) | 3072);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 17);
        }
    }

    public final void a(IconButtonVariant iconButtonVariant, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-843839634);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(iconButtonVariant.ordinal()) ? 4 : 2) | i11;
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
            i12 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[iconButtonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            if (i13 == 1) {
                sVar.a0(818938173);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new a(11);
                    sVar.k0(objM);
                }
                int i14 = i12 << 6;
                SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM, null, null, true, false, function2, sVar, (i14 & 7168) | 6 | (i14 & 57344) | (i14 & 458752), 6);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(818945085);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new a(12);
                    sVar.k0(objM2);
                }
                int i15 = i12 << 6;
                AccentPantryIconButtonKt.MediumAccentPantryIconButton((Function0) objM2, null, null, true, false, function2, sVar, (i15 & 7168) | 6 | (i15 & 57344) | (i15 & 458752), 6);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw f.v(sVar, 818936852, false);
                }
                sVar.a0(818952063);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new a(13);
                    sVar.k0(objM3);
                }
                int i16 = i12 << 6;
                IconOnlyPantryIconButtonKt.MediumIconOnlyPantryIconButton((Function0) objM3, null, null, true, false, function2, sVar, (i16 & 7168) | 6 | (i16 & 57344) | (i16 & 458752), 6);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(this, iconButtonVariant, function2, i11, 2);
        }
    }

    public final void b(IconButtonVariant iconButtonVariant, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(1142478392);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(iconButtonVariant.ordinal()) ? 4 : 2) | i11;
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
            i12 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[iconButtonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            if (i13 == 1) {
                sVar.a0(-1589885594);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new a(8);
                    sVar.k0(objM);
                }
                int i14 = i12 << 6;
                SubtlePantryIconButtonKt.SmallSubtlePantryIconButton((Function0) objM, null, null, true, false, function2, sVar, (i14 & 7168) | 6 | (i14 & 57344) | (i14 & 458752), 6);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-1589878714);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new a(9);
                    sVar.k0(objM2);
                }
                int i15 = i12 << 6;
                AccentPantryIconButtonKt.SmallAccentPantryIconButton((Function0) objM2, null, null, true, false, function2, sVar, (i15 & 7168) | 6 | (i15 & 57344) | (i15 & 458752), 6);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw f.v(sVar, -1589886917, false);
                }
                sVar.a0(-1589871768);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new a(10);
                    sVar.k0(objM3);
                }
                int i16 = i12 << 6;
                IconOnlyPantryIconButtonKt.SmallIconOnlyPantryIconButton((Function0) objM3, null, null, true, false, function2, sVar, (i16 & 7168) | 6 | (i16 & 57344) | (i16 & 458752), 6);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(this, iconButtonVariant, function2, i11, 1);
        }
    }

    public final void c(IconButtonVariant iconButtonVariant, Function2 function2, n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(553655683);
        if ((i11 & 6) == 0) {
            i12 = (sVar.d(iconButtonVariant.ordinal()) ? 4 : 2) | i11;
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
            i12 |= sVar.h(function2) ? NewHope.SENDB_BYTES : 1024;
        }
        if (sVar.R(i12 & 1, (i12 & 1171) != 1170)) {
            int i13 = WhenMappings.$EnumSwitchMapping$1[iconButtonVariant.ordinal()];
            m3.f fVar = m.f29332a;
            if (i13 == 1) {
                sVar.a0(-512825904);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new a(14);
                    sVar.k0(objM);
                }
                int i14 = i12 << 6;
                SubtlePantryIconButtonKt.TinySubtlePantryIconButton((Function0) objM, null, null, true, false, function2, sVar, (i14 & 7168) | 6 | (i14 & 57344) | (i14 & 458752), 6);
                sVar.q(false);
            } else if (i13 == 2) {
                sVar.a0(-512819056);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new a(6);
                    sVar.k0(objM2);
                }
                int i15 = i12 << 6;
                AccentPantryIconButtonKt.TinyAccentPantryIconButton((Function0) objM2, null, null, true, false, function2, sVar, (i15 & 7168) | 6 | (i15 & 57344) | (i15 & 458752), 6);
                sVar.q(false);
            } else {
                if (i13 != 3) {
                    throw f.v(sVar, -512827229, false);
                }
                sVar.a0(-512812142);
                Object objM3 = sVar.M();
                if (objM3 == fVar) {
                    objM3 = new a(7);
                    sVar.k0(objM3);
                }
                int i16 = i12 << 6;
                IconOnlyPantryIconButtonKt.TinyIconOnlyPantryIconButton((Function0) objM3, null, null, true, false, function2, sVar, (i16 & 7168) | 6 | (i16 & 57344) | (i16 & 458752), 6);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new b(this, iconButtonVariant, function2, i11, 0);
        }
    }

    public final boolean getDisabled() {
        return false;
    }

    public final boolean getFocused() {
        return false;
    }

    public final boolean getLoading() {
        return false;
    }

    @NotNull
    public final IconButtonSize getSize() {
        return this.size;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    @NotNull
    public final IconButtonVariant getVariant() {
        return this.variant;
    }

    public static /* synthetic */ void getDisabled$annotations() {
    }

    public static /* synthetic */ void getFocused$annotations() {
    }

    public static /* synthetic */ void getLoading$annotations() {
    }

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }

    public static /* synthetic */ void getVariant$annotations() {
    }
}
