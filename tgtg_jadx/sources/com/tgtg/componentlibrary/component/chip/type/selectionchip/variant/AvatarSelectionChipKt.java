package com.tgtg.componentlibrary.component.chip.type.selectionchip.variant;

import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import m3.n;
import m3.s;
import m3.w1;
import on.j;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001ai\u0010\r\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", TextBundle.TEXT_ENTRY, "", "isSelected", "Lkotlin/Function0;", "", "onClick", "Lb4/t;", "modifier", "contentDescription", "isEnabled", "isElevated", "avatar", "AvatarSelectionChip", "(Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lb4/t;Ljava/lang/String;ZZLkotlin/jvm/functions/Function2;Lm3/n;II)V", "PreviewAvatarSelectionChip", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class AvatarSelectionChipKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void AvatarSelectionChip(@org.jetbrains.annotations.NotNull java.lang.String r25, boolean r26, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r27, @org.jetbrains.annotations.Nullable b4.t r28, @org.jetbrains.annotations.Nullable java.lang.String r29, boolean r30, boolean r31, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r32, @org.jetbrains.annotations.Nullable m3.n r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.chip.type.selectionchip.variant.AvatarSelectionChipKt.AvatarSelectionChip(java.lang.String, boolean, kotlin.jvm.functions.Function0, b4.t, java.lang.String, boolean, boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void PreviewAvatarSelectionChip(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1095788917);
        if (sVar.R(i11 & 1, i11 != 0)) {
            PantryThemeKt.PantryTheme(false, null, ComposableSingletons$AvatarSelectionChipKt.INSTANCE.m806getLambda$213249843$app_release(), sVar, MLKEMEngine.KyberPolyBytes, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, 1);
        }
    }
}
