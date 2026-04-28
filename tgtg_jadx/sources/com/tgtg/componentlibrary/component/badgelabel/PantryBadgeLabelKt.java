package com.tgtg.componentlibrary.component.badgelabel;

import b4.a;
import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import bn.f;
import c60.e;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelColors;
import com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelGeometry;
import d2.h2;
import d2.i2;
import d2.m2;
import d2.p;
import e60.c;
import g3.r9;
import g3.v0;
import i4.g0;
import j5.r;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import l2.g;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.i;
import w.a0;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001ao\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"", TextBundle.TEXT_ENTRY, "Lb4/t;", "modifier", "contentDescription", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;", "variant", "Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;", "size", "", "hasBorder", "Lkotlin/Function0;", "", "leadingIcon", "trailingIcon", "PantryBadgeLabel", "(Ljava/lang/String;Lb4/t;Ljava/lang/String;Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelVariant;Lcom/tgtg/componentlibrary/component/badgelabel/model/BadgeLabelSize;ZLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryBadgeLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/PantryBadgeLabelKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,149:1\n70#2:150\n67#2,9:151\n77#2:223\n70#2:224\n67#2,9:225\n77#2:259\n70#2:260\n67#2,9:261\n77#2:295\n81#3,6:160\n88#3,6:175\n81#3,6:194\n88#3,6:209\n96#3:218\n96#3:222\n81#3,6:234\n88#3,6:249\n96#3:258\n81#3,6:270\n88#3,6:285\n96#3:294\n391#4,9:166\n400#4:181\n391#4,9:200\n400#4,3:215\n401#4,2:220\n391#4,9:240\n400#4,3:255\n391#4,9:276\n400#4,3:291\n1128#5,6:182\n99#6,6:188\n106#6:219\n*S KotlinDebug\n*F\n+ 1 PantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/PantryBadgeLabelKt\n*L\n66#1:150\n66#1:151,9\n66#1:223\n123#1:224\n123#1:225,9\n123#1:259\n144#1:260\n144#1:261,9\n144#1:295\n66#1:160,6\n66#1:175,6\n84#1:194,6\n84#1:209,6\n84#1:218\n66#1:222\n123#1:234,6\n123#1:249,6\n123#1:258\n144#1:270,6\n144#1:285,6\n144#1:294\n66#1:166,9\n66#1:181\n84#1:200,9\n84#1:215,3\n66#1:220,2\n123#1:240,9\n123#1:255,3\n144#1:276,9\n144#1:291,3\n94#1:182,6\n84#1:188,6\n84#1:219\n*E\n"})
public final class PantryBadgeLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryBadgeLabel(@org.jetbrains.annotations.NotNull java.lang.String r21, @org.jetbrains.annotations.Nullable b4.t r22, @org.jetbrains.annotations.Nullable java.lang.String r23, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant r24, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelSize r25, boolean r26, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r27, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r28, @org.jetbrains.annotations.Nullable m3.n r29, int r30, int r31) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.badgelabel.PantryBadgeLabelKt.PantryBadgeLabel(java.lang.String, b4.t, java.lang.String, com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelVariant, com.tgtg.componentlibrary.component.badgelabel.model.BadgeLabelSize, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v9 */
    public static final void a(String str, BadgeLabelGeometry badgeLabelGeometry, Function2 function2, Function2 function22, n nVar, int i11) {
        s sVar;
        int i12;
        q qVar;
        ?? r22;
        s sVar2;
        k kVar = d.f5683a;
        s sVar3 = (s) nVar;
        sVar3.c0(889826718);
        int i13 = i11 | (sVar3.f(str) ? 4 : 2) | (sVar3.f(badgeLabelGeometry) ? 32 : 16) | (sVar3.h(function2) ? 256 : 128) | (sVar3.h(function22) ? NewHope.SENDB_BYTES : 1024);
        if (sVar3.R(i13 & 1, (i13 & 1171) != 1170)) {
            q qVar2 = q.f5711a;
            if (function2 != null) {
                sVar3.a0(289806125);
                t tVarM = m2.m(qVar2, badgeLabelGeometry.m601getIconSizeD9Ej5fM());
                u0 u0VarD = p.d(kVar, false);
                int iHashCode = Long.hashCode(sVar3.T);
                i iVarL = sVar3.l();
                t tVarC = a.c(tVarM, sVar3);
                j.R.getClass();
                Function0 function0 = b5.i.f5839b;
                sVar3.e0();
                if (sVar3.S) {
                    sVar3.k(function0);
                } else {
                    sVar3.n0();
                }
                m3.i.C(u0VarD, b5.i.f5843f, sVar3);
                m3.i.C(iVarL, b5.i.f5842e, sVar3);
                m3.i.v(sVar3, Integer.valueOf(iHashCode), b5.i.f5844g);
                m3.i.z(sVar3, b5.i.f5845h);
                m3.i.C(tVarC, b5.i.f5841d, sVar3);
                function2.invoke(sVar3, Integer.valueOf((i13 >> 6) & 14));
                sVar3.q(true);
                if (str.length() > 0) {
                    sVar3.a0(289935674);
                    p.a(m2.m(qVar2, badgeLabelGeometry.m599getGapD9Ej5fM()), sVar3, 0);
                    sVar3.q(false);
                } else {
                    sVar3.a0(290006788);
                    sVar3.q(false);
                }
                sVar3.q(false);
            } else {
                sVar3.a0(290012740);
                sVar3.q(false);
            }
            if (str.length() > 0) {
                sVar3.a0(290056109);
                int i14 = i13 & 14;
                i12 = i13;
                r22 = 0;
                qVar = qVar2;
                r9.d(str, null, 0L, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, badgeLabelGeometry.getTextStyle(), sVar3, i14, 24960, 110590);
                s sVar4 = sVar3;
                sVar4.q(false);
                sVar2 = sVar4;
            } else {
                s sVar5 = sVar3;
                i12 = i13;
                qVar = qVar2;
                r22 = 0;
                sVar5.a0(290207172);
                sVar5.q(false);
                sVar2 = sVar5;
            }
            if (function22 != null) {
                sVar2.a0(290245612);
                if (str.length() > 0) {
                    sVar2.a0(290273946);
                    p.a(m2.m(qVar, badgeLabelGeometry.m599getGapD9Ej5fM()), sVar2, r22);
                    sVar2.q(r22);
                } else {
                    sVar2.a0(290345060);
                    sVar2.q(r22);
                }
                t tVarM2 = m2.m(qVar, badgeLabelGeometry.m601getIconSizeD9Ej5fM());
                u0 u0VarD2 = p.d(kVar, r22);
                int iHashCode2 = Long.hashCode(sVar2.T);
                i iVarL2 = sVar2.l();
                t tVarC2 = a.c(tVarM2, sVar2);
                j.R.getClass();
                h hVar = b5.i.f5839b;
                sVar2.e0();
                if (sVar2.S) {
                    sVar2.k(hVar);
                } else {
                    sVar2.n0();
                }
                m3.i.C(u0VarD2, b5.i.f5843f, sVar2);
                m3.i.C(iVarL2, b5.i.f5842e, sVar2);
                m3.i.v(sVar2, Integer.valueOf(iHashCode2), b5.i.f5844g);
                m3.i.z(sVar2, b5.i.f5845h);
                m3.i.C(tVarC2, b5.i.f5841d, sVar2);
                a0.x((i12 >> 9) & 14, function22, sVar2, true, r22);
                sVar = sVar2;
            } else {
                sVar2.a0(290453188);
                sVar2.q(r22);
                sVar = sVar2;
            }
        } else {
            s sVar6 = sVar3;
            sVar6.U();
            sVar = sVar6;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c(str, badgeLabelGeometry, function2, function22, i11);
        }
    }

    public static final void b(t tVar, String str, String str2, BadgeLabelColors badgeLabelColors, BadgeLabelGeometry badgeLabelGeometry, boolean z11, Function2 function2, Function2 function22, n nVar, int i11) {
        int i12;
        String str3;
        BadgeLabelGeometry badgeLabelGeometry2 = badgeLabelGeometry;
        s sVar = (s) nVar;
        sVar.c0(-400063568);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str2) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(badgeLabelColors) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.f(badgeLabelGeometry2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.g(z11) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            i12 |= sVar.h(function2) ? 1048576 : 524288;
        }
        if ((12582912 & i11) == 0) {
            i12 |= sVar.h(function22) ? 8388608 : 4194304;
        }
        if (sVar.R(i12 & 1, (4793491 & i12) != 4793490)) {
            t tVarJ = v1.n.j(tVar, badgeLabelColors.m583getContainerColor0d7_KjU(), g.b(badgeLabelGeometry2.m598getCornerRadiusD9Ej5fM()));
            if (z11) {
                tVarJ = v1.n.k(tVarJ, badgeLabelGeometry2.m597getBorderWidthD9Ej5fM(), badgeLabelColors.m582getBorderColor0d7_KjU(), g.b(badgeLabelGeometry2.m598getCornerRadiusD9Ej5fM()));
            }
            u0 u0VarD = p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = a.c(tVarJ, sVar);
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
            b5.g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            t tVarJ2 = v1.n.j(f4.g.b(m2.o(q.f5711a, badgeLabelGeometry2.m605getMinWidthD9Ej5fM(), badgeLabelGeometry2.m604getMinHeightD9Ej5fM(), badgeLabelGeometry2.m603getMaxWidthD9Ej5fM(), badgeLabelGeometry2.m602getMaxHeightD9Ej5fM()), g.b(badgeLabelGeometry.m598getCornerRadiusD9Ej5fM())), badgeLabelColors.m583getContainerColor0d7_KjU(), g0.f23254b);
            boolean z12 = (i12 & 896) == 256;
            Object objM = sVar.M();
            if (z12 || objM == m.f29332a) {
                objM = new e(str2, 19);
                sVar.k0(objM);
            }
            t tVarB = d2.c.B(r.c(tVarJ2, false, (Function1) objM), badgeLabelGeometry.m600getHorizontalPaddingD9Ej5fM(), 0.0f, 2);
            i2 i2VarA = h2.a(d2.i.f13805e, d.f5693k, sVar, 54);
            int iHashCode2 = Long.hashCode(sVar.T);
            i iVarL2 = sVar.l();
            t tVarC2 = a.c(tVarB, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            str3 = str;
            badgeLabelGeometry2 = badgeLabelGeometry;
            m3.i.a(b3.i.u(badgeLabelColors.m584getContentColor0d7_KjU(), v0.f19606a), u3.e.e(-1893028154, sVar, new c(str3, badgeLabelGeometry2, function2, function22)), sVar, 56);
            sVar.q(true);
            sVar.q(true);
        } else {
            str3 = str;
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(tVar, str3, str2, badgeLabelColors, badgeLabelGeometry2, z11, function2, function22, i11);
        }
    }
}
