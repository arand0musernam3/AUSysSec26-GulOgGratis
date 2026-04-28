package com.tgtg.componentlibrary.component.checkbox;

import c60.c;
import com.braze.Constants;
import hw.f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import l5.a;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0014\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0013\u0010\u0003\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0018\u0010\u0019R \u0010\u001b\u001a\u00020\u00158\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/tgtg/componentlibrary/component/checkbox/PantryCheckboxDoc;", "", "<init>", "()V", "", "PantryCheckbox", "(Lm3/n;I)V", "Ll5/a;", Constants.BRAZE_PUSH_CONTENT_KEY, "Ll5/a;", "getSelected", "()Ll5/a;", "getSelected$annotations", "selected", "", "b", "Ljava/lang/String;", "getState", "()Ljava/lang/String;", "getState$annotations", "state", "", "disabled", "Z", "getDisabled", "()Z", "getDisabled$annotations", "focused", "getFocused", "getFocused$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryCheckboxDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryCheckboxDoc.figma.kt\ncom/tgtg/componentlibrary/component/checkbox/PantryCheckboxDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,44:1\n1128#2,6:45\n*S KotlinDebug\n*F\n+ 1 PantryCheckboxDoc.figma.kt\ncom/tgtg/componentlibrary/component/checkbox/PantryCheckboxDoc\n*L\n39#1:45,6\n*E\n"})
public final class PantryCheckboxDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final a selected = (a) ((Pair) y.x(new Pair[]{new Pair("False", a.Off), new Pair("True", a.On), new Pair("Indeterminate", a.Indeterminate)})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String state = (String) ((Pair) y.x(new Pair[]{new Pair("Idle", "Idle"), new Pair("Hover", "Hover"), new Pair("Pressed", "Pressed")})).f26486b;

    public final void PantryCheckbox(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-173478006);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = new f(19);
                sVar.k0(objM);
            }
            PantryCheckboxKt.PantryTristateCheckbox(this.selected, (Function0) objM, null, true, sVar, 48, 4);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 10);
        }
    }

    public final boolean getDisabled() {
        return false;
    }

    public final boolean getFocused() {
        return false;
    }

    @NotNull
    public final a getSelected() {
        return this.selected;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public static /* synthetic */ void getDisabled$annotations() {
    }

    public static /* synthetic */ void getFocused$annotations() {
    }

    public static /* synthetic */ void getSelected$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
