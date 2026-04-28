package com.tgtg.componentlibrary.component.p000switch;

import c60.c;
import com.braze.Constants;
import defpackage.g;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u0012\u0004\b\u0010\u0010\u0003\u001a\u0004\b\u000f\u0010\u000bR \u0010\u0013\u001a\u00020\u00128\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0003\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0018\u001a\u00020\u00128\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0019\u0010\u0016R \u0010\u001b\u001a\u00020\u00128\u0006X\u0087D¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u001c\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/tgtg/componentlibrary/component/switch/PantrySwitchDoc;", "", "<init>", "()V", "", "PantrySwitch", "(Lm3/n;I)V", "", Constants.BRAZE_PUSH_CONTENT_KEY, "Ljava/lang/String;", "getSize", "()Ljava/lang/String;", "getSize$annotations", "size", "b", "getState", "getState$annotations", "state", "", "selected", "Z", "getSelected", "()Z", "getSelected$annotations", "disabled", "getDisabled", "getDisabled$annotations", "focused", "getFocused", "getFocused$annotations", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantrySwitchDoc.figma.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantrySwitchDoc.figma.kt\ncom/tgtg/componentlibrary/component/switch/PantrySwitchDoc\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,56:1\n1128#2,6:57\n1128#2,6:63\n*S KotlinDebug\n*F\n+ 1 PantrySwitchDoc.figma.kt\ncom/tgtg/componentlibrary/component/switch/PantrySwitchDoc\n*L\n45#1:57,6\n50#1:63,6\n*E\n"})
public final class PantrySwitchDoc {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final String size = (String) ((Pair) y.x(new Pair[]{new Pair("Large", "Large"), new Pair("Small", "Small")})).f26486b;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final String state = (String) ((Pair) y.x(new Pair[]{new Pair("Idle", "Idle"), new Pair("Hover", "Hover"), new Pair("Pressed", "Pressed"), new Pair("Focused", "Focused")})).f26486b;

    public final void PantrySwitch(@Nullable n nVar, int i11) {
        int i12;
        s sVar = (s) nVar;
        sVar.c0(-307063028);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(this) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if (sVar.R(i12 & 1, (i12 & 3) != 2)) {
            String str = this.size;
            boolean zAreEqual = Intrinsics.areEqual(str, "Large");
            f fVar = m.f29332a;
            if (zAreEqual) {
                sVar.a0(1265176858);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new g(27);
                    sVar.k0(objM);
                }
                PantrySwitchKt.LargePantrySwitch(false, null, (Function1) objM, true, sVar, MLKEMEngine.KyberPolyBytes, 2);
                sVar.q(false);
            } else if (Intrinsics.areEqual(str, "Small")) {
                sVar.a0(1265182170);
                Object objM2 = sVar.M();
                if (objM2 == fVar) {
                    objM2 = new g(28);
                    sVar.k0(objM2);
                }
                PantrySwitchKt.SmallPantrySwitch(false, null, (Function1) objM2, true, sVar, MLKEMEngine.KyberPolyBytes, 2);
                sVar.q(false);
            } else {
                sVar.a0(566087990);
                sVar.q(false);
            }
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(this, i11, 1);
        }
    }

    public final boolean getDisabled() {
        return false;
    }

    public final boolean getFocused() {
        return false;
    }

    public final boolean getSelected() {
        return false;
    }

    @NotNull
    public final String getSize() {
        return this.size;
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

    public static /* synthetic */ void getSize$annotations() {
    }

    public static /* synthetic */ void getState$annotations() {
    }
}
