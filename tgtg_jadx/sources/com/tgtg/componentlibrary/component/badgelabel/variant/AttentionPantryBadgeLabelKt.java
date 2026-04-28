package com.tgtg.componentlibrary.component.badgelabel.variant;

import b4.a;
import b4.d;
import b4.q;
import b4.t;
import b5.h;
import b5.j;
import com.tgtg.componentlibrary.theme.PantryThemeKt;
import d2.b;
import d2.c;
import d2.i;
import d2.w;
import d2.y;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.n;
import m3.s;
import m3.w1;
import org.bouncycastle.i18n.TextBundle;
import org.jetbrains.annotations.Nullable;
import x60.m;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\u001aQ\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\t\u0010\n\u001aQ\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00002\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"", TextBundle.TEXT_ENTRY, "Lb4/t;", "modifier", "contentDescription", "Lkotlin/Function0;", "", "leadingIcon", "trailingIcon", "MediumAttentionPantryBadgeLabel", "(Ljava/lang/String;Lb4/t;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lm3/n;II)V", "SmallAttentionPantryBadgeLabel", "PreviewAttentionBadgeLabels", "(Lm3/n;I)V", "app_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttentionPantryBadgeLabel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttentionPantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/variant/AttentionPantryBadgeLabelKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n*L\n1#1,69:1\n75#2:70\n87#3:71\n85#3,8:72\n94#3:105\n81#4,6:80\n88#4,6:95\n96#4:104\n391#5,9:86\n400#5,3:101\n*S KotlinDebug\n*F\n+ 1 AttentionPantryBadgeLabel.kt\ncom/tgtg/componentlibrary/component/badgelabel/variant/AttentionPantryBadgeLabelKt\n*L\n60#1:70\n61#1:71\n61#1:72,8\n61#1:105\n61#1:80,6\n61#1:95,6\n61#1:104\n61#1:86,9\n61#1:101,3\n*E\n"})
public final class AttentionPantryBadgeLabelKt {
    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void MediumAttentionPantryBadgeLabel(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.Nullable b4.t r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable m3.n r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt.MediumAttentionPantryBadgeLabel(java.lang.String, b4.t, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }

    public static final void PreviewAttentionBadgeLabels(@Nullable n nVar, int i11) {
        s sVar = (s) nVar;
        sVar.c0(-1424475449);
        if (sVar.R(i11 & 1, i11 != 0)) {
            m mVar = (m) sVar.j(PantryThemeKt.getLocalPantrySpacing());
            t tVarZ = c.z(q.f5711a, mVar.f44015k);
            b bVar = i.f13801a;
            y yVarA = w.a(i.g(mVar.l), d.f5694m, sVar, 0);
            int iHashCode = Long.hashCode(sVar.T);
            u3.i iVarL = sVar.l();
            t tVarC = a.c(tVarZ, sVar);
            j.R.getClass();
            h hVar = b5.i.f5839b;
            sVar.e0();
            if (sVar.S) {
                sVar.k(hVar);
            } else {
                sVar.n0();
            }
            m3.i.C(yVarA, b5.i.f5843f, sVar);
            m3.i.C(iVarL, b5.i.f5842e, sVar);
            m3.i.v(sVar, Integer.valueOf(iHashCode), b5.i.f5844g);
            m3.i.z(sVar, b5.i.f5845h);
            m3.i.C(tVarC, b5.i.f5841d, sVar);
            MediumAttentionPantryBadgeLabel("Medium Attention", null, null, null, null, sVar, 6, 30);
            SmallAttentionPantryBadgeLabel("Small Attention", null, null, null, null, sVar, 6, 30);
            sVar.q(true);
        } else {
            sVar.U();
        }
        w1 w1VarS = sVar.s();
        if (w1VarS != null) {
            w1VarS.f29476d = new c60.b(i11, 4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void SmallAttentionPantryBadgeLabel(@org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.Nullable b4.t r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r21, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function2<? super m3.n, ? super java.lang.Integer, kotlin.Unit> r22, @org.jetbrains.annotations.Nullable m3.n r23, int r24, int r25) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tgtg.componentlibrary.component.badgelabel.variant.AttentionPantryBadgeLabelKt.SmallAttentionPantryBadgeLabel(java.lang.String, b4.t, java.lang.String, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, m3.n, int, int):void");
    }
}
