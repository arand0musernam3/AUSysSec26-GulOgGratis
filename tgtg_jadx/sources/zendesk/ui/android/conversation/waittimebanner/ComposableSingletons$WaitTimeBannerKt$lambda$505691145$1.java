package zendesk.ui.android.conversation.waittimebanner;

import b4.q;
import b4.t;
import b5.j;
import d2.i;
import d2.w;
import d2.y;
import g3.p0;
import g3.r0;
import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.d3;
import m3.m;
import m3.n;
import m3.s;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: renamed from: zendesk.ui.android.conversation.waittimebanner.ComposableSingletons$WaitTimeBannerKt$lambda$-505691145$1, reason: invalid class name */
/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitTimeBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/ComposableSingletons$WaitTimeBannerKt$lambda$-505691145$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,374:1\n113#2:375\n87#3:376\n83#3,10:377\n94#3:423\n79#4,6:387\n86#4,3:402\n89#4,2:411\n93#4:422\n347#5,9:393\n356#5:413\n357#5,2:420\n4206#6,6:405\n1247#7,6:414\n*S KotlinDebug\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/ComposableSingletons$WaitTimeBannerKt$lambda$-505691145$1\n*L\n354#1:375\n353#1:376\n353#1:377,10\n353#1:423\n353#1:387,6\n353#1:402,3\n353#1:411,2\n353#1:422\n353#1:393,9\n353#1:413\n353#1:420,2\n353#1:405,6\n365#1:414,6\n*E\n"})
public final class ComposableSingletons$WaitTimeBannerKt$lambda$505691145$1 implements Function2<n, Integer, Unit> {
    public static final ComposableSingletons$WaitTimeBannerKt$lambda$505691145$1 INSTANCE = new ComposableSingletons$WaitTimeBannerKt$lambda$505691145$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(boolean z11) {
        return Unit.f26487a;
    }

    public final void invoke(n nVar, int i11) {
        if ((i11 & 3) == 2) {
            s sVar = (s) nVar;
            if (sVar.B()) {
                sVar.U();
                return;
            }
        }
        y yVarA = w.a(i.g(20), b4.d.f5694m, nVar, 6);
        int iS = m3.i.s(nVar);
        s sVar2 = (s) nVar;
        u3.i iVarL = sVar2.l();
        t tVarC = b4.a.c(q.f5711a, nVar);
        j.R.getClass();
        b5.h hVar = b5.i.f5839b;
        sVar2.e0();
        if (sVar2.S) {
            sVar2.k(hVar);
        } else {
            sVar2.n0();
        }
        m3.i.C(yVarA, b5.i.f5843f, nVar);
        m3.i.C(iVarL, b5.i.f5842e, nVar);
        b5.g gVar = b5.i.f5844g;
        if (sVar2.S || !Intrinsics.areEqual(sVar2.M(), Integer.valueOf(iS))) {
            e0.f.y(iS, sVar2, iS, gVar);
        }
        m3.i.C(tVarC, b5.i.f5841d, nVar);
        WaitTimeBannerType.Cleared cleared = WaitTimeBannerType.Cleared.INSTANCE;
        d3 d3Var = r0.f19375a;
        long j9 = ((p0) sVar2.j(d3Var)).f19280o;
        long j11 = ((p0) sVar2.j(d3Var)).f19280o;
        long j12 = v.f23312e;
        long j13 = ((p0) sVar2.j(d3Var)).f19280o;
        long j14 = ((p0) sVar2.j(d3Var)).f19280o;
        long j15 = ((p0) sVar2.j(d3Var)).f19281p;
        sVar2.a0(1849434622);
        Object objM = sVar2.M();
        if (objM == m.f29332a) {
            objM = new a(0);
            sVar2.k0(objM);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(cleared, j9, j11, j12, j13, j14, j15, false, (Function1) objM, null, nVar, 113249286, 512);
        sVar2.q(true);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((n) obj, ((Number) obj2).intValue());
        return Unit.f26487a;
    }
}
