package com.tgtg.componentlibrary.component.chip.type.filterchip;

import c60.c;
import com.braze.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import m60.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0014\u0010\u0010\u0012\u0004\b\u0016\u0010\u0003\u001a\u0004\b\u0015\u0010\u0012R \u0010\u0017\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u0012\u0004\b\u0019\u0010\u0003\u001a\u0004\b\u0018\u0010\u0012R \u0010\u001a\u001a\u00020\u000e8\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001a\u0010\u0010\u0012\u0004\b\u001c\u0010\u0003\u001a\u0004\b\u001b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/tgtg/componentlibrary/component/chip/type/filterchip/PantryFilterChipDoc;", "", "<init>", "()V", "", "PantryFilterChip", "(Lm3/n;I)V", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "getState$annotations", "state", "", "focused", "Z", "getFocused", "()Z", "getFocused$annotations", "elevation", "getElevation", "getElevation$annotations", "selected", "getSelected", "getSelected$annotations", "disabled", "getDisabled", "getDisabled$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryFilterChipDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryFilterChipDoc.figma.kt\ncom/tgtg/componentlibrary/component/chip/type/filterchip/PantryFilterChipDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,42:1\n1128#2,6:43\n*S KotlinDebug\n*F\n+ 1 PantryFilterChipDoc.figma.kt\ncom/tgtg/componentlibrary/component/chip/type/filterchip/PantryFilterChipDoc\n*L\n36#1:43,6\n*E\n"})
public final class PantryFilterChipDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String state = (String) ((Pair) y.x(new Pair[]{new Pair("Idle", "Idle"), new Pair("Hover", "Hover"), new Pair("Pressed", "Pressed")})).f26486b;

    public final void PantryFilterChip(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(237640478);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = new a(0);
                sVar.k0(objM);
            }
            PantryFilterChipKt.PantryFilterChip("Label", (Function0) objM, null, null, null, false, true, false, null, null, sVar, 54, 796);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 14);
        }
    }

    public final boolean getDisabled() {
        return false;
    }

    public final boolean getElevation() {
        return false;
    }

    public final boolean getFocused() {
        return false;
    }

    public final boolean getSelected() {
        return false;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public static /* synthetic */ void getDisabled$annotations() {
    }

    public static /* synthetic */ void getElevation$annotations() {
    }

    public static /* synthetic */ void getFocused$annotations() {
    }

    public static /* synthetic */ void getSelected$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
