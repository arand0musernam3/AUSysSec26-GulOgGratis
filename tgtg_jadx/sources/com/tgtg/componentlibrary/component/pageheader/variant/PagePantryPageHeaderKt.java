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
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u001a\u0097\u0001\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u000f\u0010\u0011\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"", MessageBundle.TITLE_ENTRY, "Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;", "state", "Lkotlin/Function0;", "", "onBackClick", "Lb4/t;", "modifier", "supportingText", "backContentDescription", "trailingAction1", "trailingAction2", "ctaSlot", "tabs", "PagePantryPageHeader", "(Ljava/lang/String;Lcom/tgtg/componentlibrary/component/pageheader/model/PageHeaderState;Lkotlin/jvm/functions/Function0;Lb4/t;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lm3/n;II)V", "PreviewPagePageHeaders", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class PagePantryPageHeaderKt {
    /* JADX WARN: Removed duplicated region for block: B:104:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PagePantryPageHeader(@org.jetbrains.annotations.NotNull java.lang.String r32, @org.jetbrains.annotations.NotNull com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState r33, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.Unit> r34, @org.jetbrains.annotations.Nullable b4.t r35, @org.jetbrains.annotations.Nullable java.lang.String r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r38, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r39, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r40, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r41, @org.jetbrains.annotations.Nullable m3.n r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.pageheader.variant.PagePantryPageHeaderKt.PagePantryPageHeader(java.lang.String, com.tgtg.componentlibrary.component.pageheader.model.PageHeaderState, kotlin.jvm.functions.Function0, b4.t, java.lang.String, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void PreviewPagePageHeaders(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1157096630);
        if (sVar.R(i11 & 1, i11 != 0)) {
            PantryThemeKt.PantryTheme(false, null, ComposableSingletons$PagePantryPageHeaderKt.INSTANCE.getLambda$205560$app_release(), sVar, MLKEMEngine.KyberPolyBytes, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, 13);
        }
    }
}
