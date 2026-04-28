package com.tgtg.componentlibrary.component.chip.impl;

import b4.d;
import b4.k;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import cg.x0;
import com.tgtg.componentlibrary.component.chip.impl.ChipSurfaceKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.m2;
import d2.p;
import g3.o2;
import g3.z2;
import i4.v0;
import j5.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.f;
import m3.m;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w.a0;
import wd.a;
import x60.i;
import z4.o;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u009f\u0001\u0010\u001b\u001a\u00020\u00172\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lb4/t;", "modifier", "", "isEnabled", "isFocused", "Li4/v0;", "shape", "Lz5/f;", "minWidth", "minHeight", "focusRingBorderSize", "focusRingPadding", "Li4/v;", "focusRingColor", "containerColor", "borderWidth", "borderColor", "isElevated", "", "contentDescription", "stateDescription", "innerModifier", "Lkotlin/Function0;", "", "content", "ChipSurface-s0JfZVI", "(Lb4/t;ZZLi4/v0;FFFFJJFJZLjava/lang/String;Ljava/lang/String;Lb4/t;Lkotlin/jvm/functions/Function2;Lm3/n;III)V", "ChipSurface", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nChipSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChipSurface.kt\ncom/tgtg/componentlibrary/component/chip/impl/ChipSurfaceKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,91:1\n75#2:92\n1128#3,6:93\n1128#3,6:130\n70#4:99\n68#4,8:100\n70#4:136\n68#4,8:137\n77#4:170\n77#4:174\n81#5,6:108\n88#5,6:123\n81#5,6:145\n88#5,6:160\n96#5:169\n96#5:173\n391#6,9:114\n400#6:129\n391#6,9:151\n400#6,3:166\n401#6,2:171\n*S KotlinDebug\n*F\n+ 1 ChipSurface.kt\ncom/tgtg/componentlibrary/component/chip/impl/ChipSurfaceKt\n*L\n43#1:92\n56#1:93,6\n80#1:130,6\n44#1:99\n44#1:100,8\n63#1:136\n63#1:137,8\n63#1:170\n44#1:174\n44#1:108,6\n44#1:123,6\n63#1:145,6\n63#1:160,6\n63#1:169\n44#1:173\n44#1:114,9\n44#1:129\n63#1:151,9\n63#1:166,3\n44#1:171,2\n*E\n"})
public final class ChipSurfaceKt {
    /* JADX INFO: renamed from: ChipSurface-s0JfZVI, reason: not valid java name */
    public static final void m726ChipSurfaces0JfZVI(@Nullable t tVar, final boolean z11, final boolean z12, @NotNull v0 v0Var, final float f11, final float f12, final float f13, final float f14, final long j9, final long j11, final float f15, final long j12, final boolean z13, @NotNull final String str, @NotNull final String str2, @NotNull final t tVar2, @NotNull Function2<? super n, ? super Integer, Unit> function2, @Nullable n nVar, final int i11, final int i12, final int i13) {
        int i14;
        int i15;
        int i16;
        v0 v0Var2;
        s sVar;
        final t tVar3;
        boolean z14;
        t tVarB;
        int i17;
        Function2<? super n, ? super Integer, Unit> function22 = function2;
        v0Var.getClass();
        str.getClass();
        str2.getClass();
        tVar2.getClass();
        function22.getClass();
        s sVar2 = (s) nVar;
        sVar2.c0(-1466543661);
        int i18 = i13 & 1;
        if (i18 != 0) {
            i15 = i11 | 6;
            i14 = i18;
        } else {
            i14 = i18;
            if ((i11 & 6) == 0) {
                i15 = i11 | (sVar2.f(tVar) ? 4 : 2);
            } else {
                i15 = i11;
            }
        }
        if ((i11 & 48) == 0) {
            i15 |= sVar2.g(z11) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i15 |= sVar2.g(z12) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i15 |= sVar2.f(v0Var) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i15 |= sVar2.c(f11) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i15 |= sVar2.c(f12) ? 131072 : 65536;
        }
        if ((i11 & 1572864) == 0) {
            i15 |= sVar2.c(f13) ? 1048576 : 524288;
        }
        if ((i11 & 12582912) == 0) {
            i15 |= sVar2.c(f14) ? 8388608 : 4194304;
        }
        if ((i11 & 100663296) == 0) {
            i15 |= sVar2.e(j9) ? 67108864 : 33554432;
        }
        if ((i11 & 805306368) == 0) {
            i15 |= sVar2.e(j11) ? 536870912 : 268435456;
        }
        if ((i12 & 6) == 0) {
            i16 = i12 | (sVar2.c(f15) ? 4 : 2);
        } else {
            i16 = i12;
        }
        if ((i12 & 48) == 0) {
            i16 |= sVar2.e(j12) ? 32 : 16;
        }
        if ((i12 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= sVar2.g(z13) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i16 |= sVar2.f(str) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i12 & 24576) == 0) {
            i16 |= sVar2.f(str2) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((i12 & 196608) == 0) {
            i16 |= sVar2.f(tVar2) ? 131072 : 65536;
        }
        if ((i12 & 1572864) == 0) {
            i16 |= sVar2.h(function22) ? 1048576 : 524288;
        }
        int i19 = i16;
        if (sVar2.R(i15 & 1, ((i15 & 306783379) == 306783378 && (599187 & i19) == 599186) ? false : true)) {
            t tVarG = q.f5711a;
            t tVar4 = i14 != 0 ? tVarG : tVar;
            i iVar = (i) sVar2.j(PantryThemeKt.getLocalPantryShadow());
            o oVar = o2.f19198a;
            t tVar5 = tVar4;
            sVar = sVar2;
            v0Var2 = v0Var;
            t tVarU = a.u(tVar4.then(z2.f19875b), z12, f13, j9, f14, v0Var2);
            f fVar = m.f29332a;
            if (z11) {
                z14 = false;
                sVar.a0(-1393886369);
                sVar.q(false);
                tVarB = tVarG;
            } else {
                sVar.a0(-1393963962);
                Object objM = sVar.M();
                if (objM == fVar) {
                    objM = new im.a(28);
                    sVar.k0(objM);
                }
                tVarB = r.b(tVarG, (Function1) objM);
                z14 = false;
                sVar.q(false);
            }
            t tVarThen = tVarU.then(tVarB);
            k kVar = d.f5687e;
            u0 u0VarD = p.d(kVar, z14);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = b4.a.c(tVarThen, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(u0VarD, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            if (z13) {
                tVarG = f4.g.g(tVarG, v0Var2, iVar.f43950a);
            }
            t tVarK = v1.n.k(v1.n.j(f4.g.b(m2.p(tVarG, f11, f12, 0.0f, 0.0f, 12), v0Var2), j11, v0Var2), f15, j12, v0Var2);
            boolean z15 = ((i19 & 7168) == 2048) | ((57344 & i19) == 16384);
            Object objM2 = sVar.M();
            if (z15 || objM2 == fVar) {
                i17 = i19;
                objM2 = new x0(str, str2, 7);
                sVar.k0(objM2);
            } else {
                i17 = i19;
            }
            t tVarThen2 = r.c(tVarK, false, (Function1) objM2).then(tVar2);
            u0 u0VarD2 = p.d(kVar, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = b4.a.c(tVarThen2, sVar);
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
            function22 = function2;
            a0.x((i17 >> 18) & 14, function22, sVar, true, true);
            tVar3 = tVar5;
        } else {
            v0Var2 = v0Var;
            sVar = sVar2;
            sVar.U();
            tVar3 = tVar;
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            final Function2<? super n, ? super Integer, Unit> function23 = function22;
            final v0 v0Var3 = v0Var2;
            w1VarS.f29476d = new Function2() { // from class: k60.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iF = m3.i.F(i11 | 1);
                    int iF2 = m3.i.F(i12);
                    ChipSurfaceKt.m726ChipSurfaces0JfZVI(tVar3, z11, z12, v0Var3, f11, f12, f13, f14, j9, j11, f15, j12, z13, str, str2, tVar2, function23, (n) obj, iF, iF2, i13);
                    return Unit.f26487a;
                }
            };
        }
    }
}
