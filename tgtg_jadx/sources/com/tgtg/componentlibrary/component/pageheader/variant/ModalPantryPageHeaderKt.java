package com.tgtg.componentlibrary.component.pageheader.variant;

import com.tgtg.componentlibrary.theme.PantryThemeKt;
import kotlin.Metadata;
import m3.n;
import m3.s;
import m3.w1;
import on.j;
import org.bouncycastle.i18n.MessageBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001aa\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u000f\u0010\u000e\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"", MessageBundle.TITLE_ENTRY, "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "state", "Lkotlin/Function0;", "", "onCloseClick", "Lb4/t;", "modifier", "leadingSlot", "supportingText", "closeContentDescription", "ModalPantryPageHeader", "(Ljava/lang/String;Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;Lkotlin/jvm/functions/Function0;Lb4/t;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Lm3/n;II)V", "PreviewModalPageHeaders", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class ModalPantryPageHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void ModalPantryPageHeader(@org.jetbrains.annotations.NotNull final java.lang.String r27, @org.jetbrains.annotations.NotNull final com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState r28, @org.jetbrains.annotations.NotNull final kotlin.jvm.functions.Function0<kotlin.Unit> r29, @org.jetbrains.annotations.Nullable b4.t r30, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r31, @org.jetbrains.annotations.Nullable java.lang.String r32, @org.jetbrains.annotations.Nullable java.lang.String r33, @org.jetbrains.annotations.Nullable m3.n r34, final int r35, final int r36) {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.pageheader.variant.ModalPantryPageHeaderKt.ModalPantryPageHeader(java.lang.String, com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState, kotlin.jvm.functions.Function0, b4.t, kotlin.jvm.functions.Function2, java.lang.String, java.lang.String, m3.n, int, int):void");
    }

    public static final void PreviewModalPageHeaders(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-583213646);
        if (sVar.R(i11 & 1, i11 != 0)) {
            PantryThemeKt.PantryTheme(false, null, ComposableSingletons$ModalPantryPageHeaderKt.INSTANCE.getLambda$40997748$app_release(), sVar, MLKEMEngine.KyberPolyBytes, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, 12);
        }
    }
}
