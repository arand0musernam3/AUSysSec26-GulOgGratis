package com.tgtg.componentlibrary.component.pageheader;

import b4.q;
import com.tgtg.componentlibrary.component.iconbutton.variant.SubtlePantryIconButtonKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.c;
import d2.m2;
import g3.r9;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import on.j;
import oo.v;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.jetbrains.annotations.Nullable;
import s60.b;
import u3.e;
import x60.h;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryPageHeader", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryPageHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryPageHeader.kt\ncom/tgtg/componentlibrary/component/pageheader/DemoPantryPageHeaderKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,180:1\n75#2:181\n75#2:182\n75#2:183\n1128#3,6:184\n*S KotlinDebug\n*F\n+ 1 DemoPantryPageHeader.kt\ncom/tgtg/componentlibrary/component/pageheader/DemoPantryPageHeaderKt\n*L\n154#1:181\n155#1:182\n156#1:183\n171#1:184,6\n*E\n"})
public final class DemoPantryPageHeaderKt {
    public static final void DemoPantryPageHeader(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(1053115510);
        if (sVar.R(i11 & 1, i11 != 0)) {
            PantryThemeKt.PantryTheme(false, null, ComposableSingletons$DemoPantryPageHeaderKt.INSTANCE.getLambda$521866552$app_release(), sVar, MLKEMEngine.KyberPolyBytes, 3);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new j(i11, 9);
        }
    }

    public static final void a(int i11, n nVar, int i12) {
        int i13;
        s sVar = (s) nVar;
        sVar.c0(355042);
        if ((i12 & 6) == 0) {
            i13 = (sVar.d(i11) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if (sVar.R(i13 & 1, (i13 & 3) != 2)) {
            Object objM = sVar.M();
            if (objM == m.f29332a) {
                objM = new b(22);
                sVar.k0(objM);
            }
            SubtlePantryIconButtonKt.MediumSubtlePantryIconButton((Function0) objM, null, PantryPageHeaderKt.BACK_CONTENT_DESCRIPTION, false, false, e.e(-1543906369, sVar, new j(i11, 10)), sVar, 196998, 26);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new v(i11, i12);
        }
    }

    public static final void b(String str, n nVar, int i11) {
        int i12;
        s sVar;
        s sVar2 = (s) nVar;
        sVar2.c0(1885195287);
        if ((i11 & 6) == 0) {
            i12 = i11 | (sVar2.f(str) ? 4 : 2);
        } else {
            i12 = i11;
        }
        if (sVar2.R(i12 & 1, (i12 & 3) != 2)) {
            x60.m mVar = (x60.m) sVar2.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar = (x60.j) sVar2.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar2.j(PantryThemeKt.getLocalPantryColor());
            sVar = sVar2;
            r9.d(str, c.B(m2.d(q.f5711a, 1.0f), mVar.f44010f, 0.0f, 2), hVar.K, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, jVar.f43961j, sVar, i12 & 14, 0, 131064);
        } else {
            sVar = sVar2;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new ig.c(str, i11, 3);
        }
    }
}
