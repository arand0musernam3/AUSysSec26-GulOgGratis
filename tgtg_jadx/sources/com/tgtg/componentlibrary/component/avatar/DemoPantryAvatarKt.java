package com.tgtg.componentlibrary.component.avatar;

import b4.a;
import b4.d;
import b4.j;
import b4.q;
import b4.t;
import b5.g;
import com.tgtg.componentlibrary.component.avatar.model.AvatarSize;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconFilledKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIconTransparentKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarIllustrationKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarImageKt;
import com.tgtg.componentlibrary.component.avatar.variant.PantryAvatarTextKt;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.h2;
import d2.i;
import d2.i2;
import d2.m2;
import d2.w;
import d2.y;
import e0.f;
import g3.r9;
import i4.g0;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.d0;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import m5.u0;
import org.jetbrains.annotations.Nullable;
import w.a0;
import x60.h;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"", "DemoPantryAvatar", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDemoPantryAvatar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DemoPantryAvatar.kt\ncom/tgtg/componentlibrary/component/avatar/DemoPantryAvatarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 7 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,188:1\n75#2:189\n75#2:190\n75#2:191\n87#3:192\n85#3,8:193\n94#3:421\n81#4,6:201\n88#4,6:216\n81#4,6:234\n88#4,6:249\n96#4:260\n81#4,6:273\n88#4,6:288\n96#4:299\n81#4,6:312\n88#4,6:327\n96#4:338\n81#4,6:351\n88#4,6:366\n96#4:377\n81#4,6:390\n88#4,6:405\n96#4:416\n96#4:420\n391#5,9:207\n400#5:222\n391#5,9:240\n400#5:255\n401#5,2:258\n391#5,9:279\n400#5:294\n401#5,2:297\n391#5,9:318\n400#5:333\n401#5,2:336\n391#5,9:357\n400#5:372\n401#5,2:375\n391#5,9:396\n400#5:411\n401#5,2:414\n401#5,2:418\n99#6:223\n95#6,10:224\n106#6:261\n99#6:262\n95#6,10:263\n106#6:300\n99#6:301\n95#6,10:302\n106#6:339\n99#6:340\n95#6,10:341\n106#6:378\n99#6:379\n95#6,10:380\n106#6:417\n1915#7,2:256\n1915#7,2:295\n1915#7,2:334\n1915#7,2:373\n1915#7,2:412\n*S KotlinDebug\n*F\n+ 1 DemoPantryAvatar.kt\ncom/tgtg/componentlibrary/component/avatar/DemoPantryAvatarKt\n*L\n35#1:189\n36#1:190\n37#1:191\n39#1:192\n39#1:193,8\n39#1:421\n39#1:201,6\n39#1:216,6\n53#1:234,6\n53#1:249,6\n53#1:260\n71#1:273,6\n71#1:288,6\n71#1:299\n96#1:312,6\n96#1:327,6\n96#1:338\n120#1:351,6\n120#1:366,6\n120#1:377\n144#1:390,6\n144#1:405,6\n144#1:416\n39#1:420\n39#1:207,9\n39#1:222\n53#1:240,9\n53#1:255\n53#1:258,2\n71#1:279,9\n71#1:294\n71#1:297,2\n96#1:318,9\n96#1:333\n96#1:336,2\n120#1:357,9\n120#1:372\n120#1:375,2\n144#1:396,9\n144#1:411\n144#1:414,2\n39#1:418,2\n53#1:223\n53#1:224,10\n53#1:261\n71#1:262\n71#1:263,10\n71#1:300\n96#1:301\n96#1:302,10\n96#1:339\n120#1:340\n120#1:341,10\n120#1:378\n144#1:379\n144#1:380,10\n144#1:417\n57#1:256,2\n75#1:295,2\n100#1:334,2\n124#1:373,2\n148#1:412,2\n*E\n"})
public final class DemoPantryAvatarKt {
    public static final void DemoPantryAvatar(@Nullable n nVar, int i11) {
        j jVar = d.f5693k;
        s sVar = (s) nVar;
        sVar.c0(1919115705);
        int i12 = 0;
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            x60.j jVar2 = (x60.j) sVar.j(PantryThemeKt.getLocalPantryTypography());
            h hVar = (h) sVar.j(PantryThemeKt.getLocalPantryColor());
            t tVarJ = v1.n.j(m2.f13850c, hVar.f43905a, g0.f23254b);
            float f11 = mVar.f44010f;
            float f12 = mVar.f44017n;
            t tVarR = v1.n.r(c.A(tVarJ, f11, mVar.f44011g), v1.n.q(sVar), true);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.f44008d), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarR, sVar);
            b5.j.R.getClass();
            b5.h hVar2 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            g gVar = b5.i.f5843f;
            m3.i.C(yVarA, gVar, sVar);
            g gVar2 = b5.i.f5842e;
            m3.i.C(iVarL, gVar2, sVar);
            Integer numValueOf = Integer.valueOf(iHashCode);
            g gVar3 = b5.i.f5844g;
            m3.i.v(sVar, numValueOf, gVar3);
            b5.d dVar = b5.i.f5845h;
            m3.i.z(sVar, dVar);
            g gVar4 = b5.i.f5841d;
            m3.i.C(tVarC, gVar4, sVar);
            u0 u0Var = jVar2.f43957f;
            u0 u0Var2 = jVar2.f43957f;
            long j9 = hVar.J;
            float f13 = mVar.l;
            q qVar = q.f5711a;
            r9.d("Text Variant All Sizes", c.D(qVar, 0.0f, 0.0f, 0.0f, f13, 7), j9, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var, sVar, 6, 0, 131064);
            i2 i2VarA = h2.a(i.g(f12), jVar, sVar, 48);
            int iHashCode2 = Long.hashCode(sVar.T);
            u3.i iVarL2 = sVar.l();
            t tVarC2 = a.c(qVar, sVar);
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar2);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA, gVar, sVar);
            m3.i.C(iVarL2, gVar2, sVar);
            a0.y(iHashCode2, sVar, gVar3, sVar, dVar);
            m3.i.C(tVarC2, gVar4, sVar);
            sVar.a0(2060546052);
            Iterator it = d0.h(AvatarSize.Small, AvatarSize.Medium, AvatarSize.Large, AvatarSize.XLarge).iterator();
            while (it.hasNext()) {
                PantryAvatarTextKt.PantryAvatarText("JM", null, "User", (AvatarSize) it.next(), sVar, 390, 2);
            }
            sVar.q(false);
            sVar.q(true);
            r9.d("Image Variant All Sizes", null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            i2 i2VarA2 = h2.a(i.g(f12), jVar, sVar, 48);
            int iHashCode3 = Long.hashCode(sVar.T);
            u3.i iVarL3 = sVar.l();
            t tVarC3 = a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar3 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar3);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA2, b5.i.f5843f, sVar);
            m3.i.C(iVarL3, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode3), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC3, b5.i.f5841d, sVar);
            sVar.a0(-652063017);
            Iterator it2 = d0.h(AvatarSize.Small, AvatarSize.Medium, AvatarSize.Large, AvatarSize.XLarge).iterator();
            while (it2.hasNext()) {
                PantryAvatarImageKt.PantryAvatarImage(ComposableSingletons$DemoPantryAvatarKt.INSTANCE.getLambda$857315999$app_release(), null, "Logo", (AvatarSize) it2.next(), sVar, 390, 2);
            }
            sVar.q(false);
            sVar.q(true);
            r9.d("Icon Filled All Sizes", null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            i2 i2VarA3 = h2.a(i.g(f12), jVar, sVar, 48);
            int iHashCode4 = Long.hashCode(sVar.T);
            u3.i iVarL4 = sVar.l();
            t tVarC4 = a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar4 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar4);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA3, b5.i.f5843f, sVar);
            m3.i.C(iVarL4, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode4), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC4, b5.i.f5841d, sVar);
            sVar.a0(-957697620);
            Iterator it3 = d0.h(AvatarSize.Small, AvatarSize.Medium, AvatarSize.Large, AvatarSize.XLarge).iterator();
            while (it3.hasNext()) {
                PantryAvatarIconFilledKt.PantryAvatarIconFilled(ComposableSingletons$DemoPantryAvatarKt.INSTANCE.m548getLambda$1747500778$app_release(), null, "Icon Filled", (AvatarSize) it3.next(), sVar, 390, 2);
            }
            sVar.q(false);
            sVar.q(true);
            r9.d("Icon Transparent All Sizes", null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            i2 i2VarA4 = h2.a(i.g(f12), jVar, sVar, 48);
            int iHashCode5 = Long.hashCode(sVar.T);
            u3.i iVarL5 = sVar.l();
            t tVarC5 = a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar5 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar5);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA4, b5.i.f5843f, sVar);
            m3.i.C(iVarL5, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode5), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC5, b5.i.f5841d, sVar);
            sVar.a0(-1263332139);
            Iterator it4 = d0.h(AvatarSize.Small, AvatarSize.Medium, AvatarSize.Large, AvatarSize.XLarge).iterator();
            while (it4.hasNext()) {
                PantryAvatarIconTransparentKt.PantryAvatarIconTransparent(ComposableSingletons$DemoPantryAvatarKt.INSTANCE.getLambda$751754139$app_release(), null, "Icon Transparent", (AvatarSize) it4.next(), sVar, 390, 2);
            }
            sVar.q(false);
            sVar.q(true);
            r9.d("Illustration All Sizes", null, hVar.J, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, u0Var2, sVar, 6, 0, 131066);
            sVar = sVar;
            i2 i2VarA5 = h2.a(i.g(f12), jVar, sVar, 48);
            int iHashCode6 = Long.hashCode(sVar.T);
            u3.i iVarL6 = sVar.l();
            t tVarC6 = a.c(qVar, sVar);
            b5.j.R.getClass();
            b5.h hVar6 = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar6);
            } else {
                sVar.n0();
            }
            m3.i.C(i2VarA5, b5.i.f5843f, sVar);
            m3.i.C(iVarL6, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode6), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC6, b5.i.f5841d, sVar);
            sVar.a0(-1568966577);
            Iterator it5 = d0.h(AvatarSize.Small, AvatarSize.Medium, AvatarSize.Large, AvatarSize.XLarge).iterator();
            while (it5.hasNext()) {
                PantryAvatarIllustrationKt.PantryAvatarIllustration(ComposableSingletons$DemoPantryAvatarKt.INSTANCE.m549getLambda$25278039$app_release(), null, "Illustration", (AvatarSize) it5.next(), sVar, 390, 2);
            }
            i12 = 0;
            f.D(sVar, false, true, true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, i12);
        }
    }
}
