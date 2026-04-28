package zendesk.ui.android.conversation.waittimebanner;

import b4.q;
import b4.t;
import b5.j;
import d2.i;
import d2.w;
import d2.y;
import g3.s0;
import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.m;
import m3.n;
import m3.s;
import zendesk.ui.android.conversation.waittimebanner.WaitTimeBannerType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitTimeBanner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,374:1\n113#2:375\n87#3:376\n83#3,10:377\n94#3:441\n79#4,6:387\n86#4,3:402\n89#4,2:411\n93#4:440\n347#5,9:393\n356#5:413\n357#5,2:438\n4206#6,6:405\n1247#7,6:414\n1247#7,6:420\n1247#7,6:426\n1247#7,6:432\n*S KotlinDebug\n*F\n+ 1 WaitTimeBanner.kt\nzendesk/ui/android/conversation/waittimebanner/ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1\n*L\n272#1:375\n271#1:376\n271#1:377,10\n271#1:441\n271#1:387,6\n271#1:402,3\n271#1:411,2\n271#1:440\n271#1:393,9\n271#1:413\n271#1:438,2\n271#1:405,6\n283#1:414,6\n302#1:420,6\n323#1:426,6\n341#1:432,6\n*E\n"})
public final class ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1 implements Function2<n, Integer, Unit> {
    public static final ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1 INSTANCE = new ComposableSingletons$WaitTimeBannerKt$lambda$1458536225$1();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$1$lambda$0(boolean z11) {
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$3$lambda$2(boolean z11) {
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$5$lambda$4(boolean z11) {
        return Unit.f26487a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7$lambda$6(boolean z11) {
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
        WaitTimeBannerType.Assigned assigned = WaitTimeBannerType.Assigned.INSTANCE;
        long j9 = s0.y(nVar).f19280o;
        long j11 = s0.y(nVar).f19280o;
        long j12 = v.f23312e;
        long j13 = s0.y(nVar).f19280o;
        long j14 = s0.y(nVar).f19280o;
        long j15 = s0.y(nVar).f19281p;
        sVar2.a0(1849434622);
        Object objM = sVar2.M();
        m3.f fVar = m.f29332a;
        if (objM == fVar) {
            objM = new a(1);
            sVar2.k0(objM);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(assigned, j9, j11, j12, j13, j14, j15, false, (Function1) objM, null, nVar, 113249286, 512);
        WaitTimeBannerType.Queued queued = new WaitTimeBannerType.Queued(true, new ResponseTime(1800000004532567453L, 9000000674532536754L), false, 0, 0, 24, null);
        long j16 = s0.y(nVar).f19280o;
        long j17 = s0.y(nVar).f19280o;
        long j18 = s0.y(nVar).f19280o;
        long j19 = s0.y(nVar).f19280o;
        long j21 = s0.y(nVar).f19281p;
        sVar2.a0(1849434622);
        Object objM2 = sVar2.M();
        if (objM2 == fVar) {
            objM2 = new a(2);
            sVar2.k0(objM2);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(queued, j16, j17, j12, j18, j19, j21, false, (Function1) objM2, null, nVar, 113249280, 512);
        WaitTimeBannerType.Queued queued2 = new WaitTimeBannerType.Queued(true, new ResponseTime(1800000004532567453L, 9000000674532536754L), true, 50, 50);
        long j22 = s0.y(nVar).f19280o;
        long j23 = s0.y(nVar).f19280o;
        long j24 = s0.y(nVar).f19280o;
        long j25 = s0.y(nVar).f19280o;
        long j26 = s0.y(nVar).f19281p;
        sVar2.a0(1849434622);
        Object objM3 = sVar2.M();
        if (objM3 == fVar) {
            objM3 = new a(3);
            sVar2.k0(objM3);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(queued2, j22, j23, j12, j24, j25, j26, false, (Function1) objM3, null, nVar, 113249280, 512);
        WaitTimeBannerType.Queued queued3 = new WaitTimeBannerType.Queued(false, new ResponseTime(0L, 0L, 3, null), true, 11, 11);
        long j27 = s0.y(nVar).f19280o;
        long j28 = s0.y(nVar).f19280o;
        long j29 = s0.y(nVar).f19280o;
        long j31 = s0.y(nVar).f19280o;
        long j32 = s0.y(nVar).f19281p;
        sVar2.a0(1849434622);
        Object objM4 = sVar2.M();
        if (objM4 == fVar) {
            objM4 = new a(4);
            sVar2.k0(objM4);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(queued3, j27, j28, j12, j29, j31, j32, false, (Function1) objM4, null, nVar, 113249280, 512);
        sVar2.q(true);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((n) obj, ((Number) obj2).intValue());
        return Unit.f26487a;
    }
}
