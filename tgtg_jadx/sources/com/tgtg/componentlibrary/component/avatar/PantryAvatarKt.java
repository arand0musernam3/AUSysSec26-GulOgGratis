package com.tgtg.componentlibrary.component.avatar;

import a3.u2;
import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.g;
import b5.h;
import b5.j;
import c60.e;
import c60.f;
import com.tgtg.componentlibrary.component.avatar.model.AvatarColors;
import com.tgtg.componentlibrary.component.avatar.model.AvatarGeometry;
import com.tgtg.componentlibrary.component.avatar.model.AvatarVariant;
import d2.c;
import d2.m2;
import d2.p;
import g3.r9;
import g3.v0;
import i80.n;
import j5.r;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.b0;
import m3.m;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.bouncycastle.pqc.crypto.newhope.NewHope;
import org.brotli.dec.BrotliInputStream;
import u3.i;
import w.a0;
import x5.k;
import z4.u0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a]\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lb4/t;", "modifier", "Lkotlin/Function1;", "", "content", "", TextBundle.TEXT_ENTRY, "contentDescription", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;", "variant", "Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;", "size", "PantryAvatar", "(Lb4/t;Li80/n;Ljava/lang/String;Ljava/lang/String;Lcom/tgtg/componentlibrary/component/avatar/model/AvatarVariant;Lcom/tgtg/componentlibrary/component/avatar/model/AvatarSize;Lm3/n;II)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPantryAvatar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PantryAvatar.kt\ncom/tgtg/componentlibrary/component/avatar/PantryAvatarKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Row.kt\nandroidx/compose/foundation/layout/RowKt\n*L\n1#1,192:1\n70#2:193\n67#2,9:194\n70#2:231\n68#2,8:232\n77#2:265\n77#2:269\n81#3,6:203\n88#3,6:218\n81#3,6:240\n88#3,6:255\n96#3:264\n96#3:268\n81#3,6:277\n88#3,6:292\n96#3:301\n391#4,9:209\n400#4:224\n391#4,9:246\n400#4,3:261\n401#4,2:266\n391#4,9:283\n400#4,3:298\n1128#5,6:225\n75#6:270\n99#7,6:271\n106#7:302\n*S KotlinDebug\n*F\n+ 1 PantryAvatar.kt\ncom/tgtg/componentlibrary/component/avatar/PantryAvatarKt\n*L\n71#1:193\n71#1:194,9\n96#1:231\n96#1:232,8\n96#1:265\n71#1:269\n71#1:203,6\n71#1:218,6\n96#1:240,6\n96#1:255,6\n96#1:264\n71#1:268\n152#1:277,6\n152#1:292,6\n152#1:301\n71#1:209,9\n71#1:224\n96#1:246,9\n96#1:261,3\n71#1:266,2\n152#1:283,9\n152#1:298,3\n90#1:225,6\n129#1:270\n152#1:271,6\n152#1:302\n*E\n"})
public final class PantryAvatarKt {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AvatarVariant.values().length];
            try {
                iArr[AvatarVariant.IconTransparent.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AvatarVariant.IconFilled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void PantryAvatar(@org.jetbrains.annotations.Nullable b4.t r18, @org.jetbrains.annotations.Nullable i80.n r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.avatar.model.AvatarVariant r22, @org.jetbrains.annotations.Nullable com.tgtg.componentlibrary.component.avatar.model.AvatarSize r23, @org.jetbrains.annotations.Nullable m3.n r24, int r25, int r26) {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.avatar.PantryAvatarKt.PantryAvatar(b4.t, i80.n, java.lang.String, java.lang.String, com.tgtg.componentlibrary.component.avatar.model.AvatarVariant, com.tgtg.componentlibrary.component.avatar.model.AvatarSize, m3.n, int, int):void");
    }

    public static final void a(t tVar, n nVar, String str, String str2, AvatarVariant avatarVariant, AvatarColors avatarColors, AvatarGeometry avatarGeometry, m3.n nVar2, int i11) {
        int i12;
        AvatarGeometry avatarGeometry2;
        String upperCase;
        boolean z11;
        s sVar = (s) nVar2;
        sVar.c0(1839642882);
        if ((i11 & 6) == 0) {
            i12 = (sVar.f(tVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= sVar.h(nVar) ? 32 : 16;
        }
        if ((i11 & MLKEMEngine.KyberPolyBytes) == 0) {
            i12 |= sVar.f(str) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= sVar.f(str2) ? NewHope.SENDB_BYTES : 1024;
        }
        if ((i11 & 24576) == 0) {
            i12 |= sVar.d(avatarVariant.ordinal()) ? BrotliInputStream.DEFAULT_INTERNAL_BUFFER_SIZE : 8192;
        }
        if ((196608 & i11) == 0) {
            i12 |= sVar.f(avatarColors) ? 131072 : 65536;
        }
        if ((1572864 & i11) == 0) {
            avatarGeometry2 = avatarGeometry;
            i12 |= sVar.f(avatarGeometry2) ? 1048576 : 524288;
        } else {
            avatarGeometry2 = avatarGeometry;
        }
        if (sVar.R(i12 & 1, (599187 & i12) != 599186)) {
            if (str != null) {
                upperCase = b0.x(2, str).toUpperCase(Locale.ROOT);
                upperCase.getClass();
            } else {
                upperCase = null;
            }
            if (upperCase == null) {
                upperCase = "";
            }
            t tVarM = m2.m(tVar, avatarGeometry2.m573getSizeD9Ej5fM());
            u0 u0VarD = p.d(d.f5683a, false);
            int iHashCode = Long.hashCode(sVar.T);
            i iVarL = sVar.l();
            t tVarC = a.c(tVarM, sVar);
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
            t tVarM2 = m2.f13850c;
            String str3 = upperCase;
            t tVarK = v1.n.k(v1.n.j(f4.g.b(tVarM2, l2.g.b(avatarGeometry2.m571getCornerRadiusD9Ej5fM())), avatarColors.m560getContainerColor0d7_KjU(), l2.g.b(avatarGeometry.m571getCornerRadiusD9Ej5fM())), avatarGeometry.m569getBorderWidthD9Ej5fM(), avatarColors.m559getBorderColor0d7_KjU(), l2.g.b(avatarGeometry.m571getCornerRadiusD9Ej5fM()));
            AvatarVariant avatarVariant2 = AvatarVariant.Text;
            q qVar = q.f5711a;
            t tVarThen = tVarK.then(avatarVariant == avatarVariant2 ? c.z(qVar, avatarGeometry.m572getPaddingD9Ej5fM()) : qVar);
            boolean z12 = (i12 & 7168) == 2048;
            Object objM = sVar.M();
            if (z12 || objM == m.f29332a) {
                objM = new e(str2, 0);
                sVar.k0(objM);
            }
            t tVarC2 = r.c(tVarThen, false, (Function1) objM);
            u0 u0VarD2 = p.d(d.f5687e, false);
            int iHashCode2 = Long.hashCode(sVar.T);
            i iVarL2 = sVar.l();
            t tVarC3 = a.c(tVarC2, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(u0VarD2, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC3, gVar4, sVar);
            if (nVar != null) {
                sVar.a0(1211103005);
                int i13 = WhenMappings.$EnumSwitchMapping$0[avatarVariant.ordinal()];
                z11 = true;
                if (i13 == 1 || i13 == 2) {
                    tVarM2 = m2.m(qVar, avatarGeometry.m570getContentSizeD9Ej5fM());
                }
                m3.i.a(b3.i.u(avatarColors.m561getContentColor0d7_KjU(), v0.f19606a), u3.e.e(2110015166, sVar, new u2(3, nVar, (Object) tVarM2)), sVar, 56);
                sVar.q(false);
            } else {
                z11 = true;
                if (str3.length() > 0) {
                    sVar.a0(1211661563);
                    r9.d(str3, null, avatarColors.m561getContentColor0d7_KjU(), 0L, null, 0L, null, new k(3), 0L, 0, false, 0, 0, null, avatarGeometry.getTextStyle(), sVar, 0, 0, 130042);
                    sVar.q(false);
                } else {
                    sVar.a0(1211876300);
                    sVar.q(false);
                }
            }
            sVar.q(z11);
            sVar.q(z11);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new f(tVar, nVar, str, str2, avatarVariant, avatarColors, avatarGeometry, i11, 0);
        }
    }
}
