package com.tgtg.componentlibrary.component.p000switch;

import a.a;
import b2.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.d;
import com.braze.models.FeatureFlag;
import com.tgtg.componentlibrary.component.p000switch.ext.SwitchColorExtKt;
import com.tgtg.componentlibrary.component.p000switch.model.SwitchGeometry;
import com.tgtg.componentlibrary.component.p000switch.model.ThumbGeometry;
import d2.m2;
import d2.p;
import d2.u;
import e0.f;
import f4.g;
import g3.s5;
import g3.v0;
import g3.w7;
import i4.v;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import t1.u1;
import u3.i;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\b\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\t\u001a?\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\t\u001aU\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00002\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\f\u0010\u0011\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "checked", "Lb4/t;", "modifier", "Lkotlin/Function1;", "", "onCheckedChange", FeatureFlag.ENABLED, "LargePantrySwitch", "(ZLb4/t;Lkotlin/jvm/functions/Function1;ZLm3/n;II)V", "SmallPantrySwitch", "Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;", "switchGeometry", "Lkotlin/Function0;", "thumbContent", "PantrySwitch", "(ZLkotlin/jvm/functions/Function1;Lcom/tgtg/componentlibrary/component/switch/model/SwitchGeometry;Lb4/t;ZLkotlin/jvm/functions/Function2;Lm3/n;II)V", "isFocused", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantrySwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/PantrySwitchKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,518:1\n75#2:519\n75#2:520\n75#2:521\n75#2:522\n75#2:523\n75#2:524\n75#2:525\n75#2:526\n75#2:527\n75#2:528\n75#2:529\n75#2:530\n75#2:543\n1128#3,6:531\n1128#3,6:537\n1128#3,6:652\n1128#3,6:658\n1128#3,6:664\n1128#3,6:670\n1128#3,6:676\n1128#3,6:682\n1128#3,6:688\n1128#3,6:694\n49#4:544\n60#4:608\n70#5:545\n68#5,8:546\n70#5:576\n67#5,9:577\n70#5:609\n68#5,8:610\n77#5:643\n77#5:647\n77#5:651\n81#6,6:554\n88#6,6:569\n81#6,6:586\n88#6,6:601\n81#6,6:618\n88#6,6:633\n96#6:642\n96#6:646\n96#6:650\n391#7,9:560\n400#7:575\n391#7,9:592\n400#7:607\n391#7,9:624\n400#7,3:639\n401#7,2:644\n401#7,2:648\n85#8:700\n*S KotlinDebug\n*F\n+ 1 PantrySwitch.kt\ncom/tgtg/componentlibrary/component/switch/PantrySwitchKt\n*L\n76#1:519\n77#1:520\n78#1:521\n79#1:522\n80#1:523\n119#1:524\n120#1:525\n121#1:526\n122#1:527\n123#1:528\n162#1:529\n163#1:530\n232#1:543\n164#1:531,6\n175#1:537,6\n434#1:652,6\n445#1:658,6\n456#1:664,6\n467#1:670,6\n478#1:676,6\n489#1:682,6\n500#1:688,6\n511#1:694,6\n258#1:544\n285#1:608\n251#1:545\n251#1:546,8\n263#1:576\n263#1:577,9\n271#1:609\n271#1:610,8\n271#1:643\n263#1:647\n251#1:651\n251#1:554,6\n251#1:569,6\n263#1:586,6\n263#1:601,6\n271#1:618,6\n271#1:633,6\n271#1:642\n263#1:646\n251#1:650\n251#1:560,9\n251#1:575\n263#1:592,9\n263#1:607\n271#1:624,9\n271#1:639,3\n263#1:644,2\n251#1:648,2\n249#1:700\n*E\n"})
public final class PantrySwitchKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LargePantrySwitch(boolean r21, @org.jetbrains.annotations.Nullable b4.t r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23, boolean r24, @org.jetbrains.annotations.Nullable m3.n r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt.LargePantrySwitch(boolean, b4.t, kotlin.jvm.functions.Function1, boolean, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantrySwitch(boolean r47, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r48, @org.jetbrains.annotations.NotNull com.tgtg.componentlibrary.component.p000switch.model.SwitchGeometry r49, @org.jetbrains.annotations.Nullable b4.t r50, boolean r51, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r52, @org.jetbrains.annotations.Nullable m3.n r53, int r54, int r55) {
        /*
            Method dump skipped, instruction units count: 433
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt.PantrySwitch(boolean, kotlin.jvm.functions.Function1, com.tgtg.componentlibrary.component.switch.model.SwitchGeometry, b4.t, boolean, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SmallPantrySwitch(boolean r21, @org.jetbrains.annotations.Nullable b4.t r22, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r23, boolean r24, @org.jetbrains.annotations.Nullable m3.n r25, int r26, int r27) {
        /*
            Method dump skipped, instruction units count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.p000switch.PantrySwitchKt.SmallPantrySwitch(boolean, b4.t, kotlin.jvm.functions.Function1, boolean, m3.n, int, int):void");
    }

    public static final void a(ThumbGeometry thumbGeometry, boolean z11, t tVar, n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1666605271);
        int i12 = (sVar.f(thumbGeometry) ? 4 : 2) | i11 | (sVar.g(z11) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (sVar.R(i12 & 1, (i12 & 147) != 146)) {
            tVar = q.f5711a;
            p.a(v1.n.j(m2.m(z11 ? g.g(tVar, thumbGeometry.getThumbShape(), thumbGeometry.getThumbShadow()) : tVar, thumbGeometry.m953getThumbDiameterD9Ej5fM()), ((v) sVar.j(v0.f19606a)).f23317a, thumbGeometry.getThumbShape()), sVar, 0);
        } else {
            sVar.U();
        }
        t tVar2 = tVar;
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new d((Object) thumbGeometry, z11, tVar2, i11, 3);
        }
    }

    public static final void b(t tVar, boolean z11, boolean z12, w7 w7Var, SwitchGeometry switchGeometry, Function2 function2, u1 u1Var, k kVar, n nVar, int i11) {
        int i12;
        Function2 function22;
        w7 w7Var2;
        boolean z13;
        k kVar2 = kVar;
        s sVar = (s) nVar;
        sVar.c0(418173355);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(w7Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(switchGeometry) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.h(function2) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(u1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.f(kVar2) ? 8388608 : 4194304;
        }
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            b1 b1VarV = a.v(kVar2, sVar, (i12 >> 21) & 14);
            b4.k kVar3 = b4.d.f5687e;
            t tVarU = wd.a.u(m2.u(tVar, kVar3, 2), ((Boolean) b1VarV.getValue()).booleanValue(), switchGeometry.m948getTrackOutlineWidthD9Ej5fM(), SwitchColorExtKt.borderColor(w7Var, z12, z11), switchGeometry.m948getTrackOutlineWidthD9Ej5fM() + switchGeometry.m947getTrackOutlinePaddingD9Ej5fM(), switchGeometry.getTrackShape());
            u0 u0VarD = p.d(kVar3, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarU, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            b5.g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            b5.g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            b5.g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            int i13 = i12;
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            float fM949getTrackWidthD9Ej5fM = switchGeometry.m949getTrackWidthD9Ej5fM();
            float fM946getTrackHeightD9Ej5fM = switchGeometry.m946getTrackHeightD9Ej5fM();
            q qVar = q.f5711a;
            t tVarJ = v1.n.j(m2.j(qVar, fM949getTrackWidthD9Ej5fM, fM946getTrackHeightD9Ej5fM), SwitchColorExtKt.trackColor(w7Var, z12, z11), switchGeometry.getTrackShape());
            u0 u0VarD2 = p.d(b4.d.f5683a, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarJ, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            kVar2 = kVar;
            z13 = z12;
            w7Var2 = w7Var;
            t tVarJ2 = v1.n.j(v1.b1.a(u.f13938a.a(qVar, b4.d.f5686d).then(new ThumbElement(kVar2, switchGeometry, u1Var, z11)), kVar2, s5.a(switchGeometry.getThumbGeometry().m953getThumbDiameterD9Ej5fM() / 2, 4, 0L, false)), SwitchColorExtKt.thumbColor(w7Var2, z13, z11), switchGeometry.getThumbGeometry().getThumbShape());
            u0 u0VarD3 = p.d(kVar3, false);
            int iHashCode3 = Long.hashCode(sVar.T);
            i iVarL3 = sVar.l();
            t tVarC3 = b4.a.c(tVarJ2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD3, gVar, sVar);
            m3.i.C(iVarL3, gVar2, sVar);
            a0.y(iHashCode3, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            function22 = function2;
            m3.i.a(b3.i.u(SwitchColorExtKt.iconColor(w7Var2, z13, z11), v0.f19606a), function22, sVar, ((i13 >> 12) & 112) | 8);
            f.D(sVar, true, true, true);
        } else {
            function22 = function2;
            w7Var2 = w7Var;
            z13 = z12;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new g(tVar, z11, z13, w7Var2, switchGeometry, function22, u1Var, kVar2, i11);
        }
    }
}
