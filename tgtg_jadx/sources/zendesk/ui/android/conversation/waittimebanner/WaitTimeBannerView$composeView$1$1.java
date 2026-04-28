package zendesk.ui.android.conversation.waittimebanner;

import i4.v;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import m3.b1;
import m3.i;
import m3.m;
import m3.n;
import m3.s;
import y3.j;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWaitTimeBannerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaitTimeBannerView.kt\nzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerView$composeView$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,87:1\n1247#2,6:88\n1247#2,6:94\n85#3:100\n113#3,2:101\n*S KotlinDebug\n*F\n+ 1 WaitTimeBannerView.kt\nzendesk/ui/android/conversation/waittimebanner/WaitTimeBannerView$composeView$1$1\n*L\n59#1:88,6\n70#1:94,6\n59#1:100\n59#1:101,2\n*E\n"})
public final class WaitTimeBannerView$composeView$1$1 implements Function2<n, Integer, Unit> {
    final /* synthetic */ WaitTimeBannerView this$0;

    public WaitTimeBannerView$composeView$1$1(WaitTimeBannerView waitTimeBannerView) {
        this.this$0 = waitTimeBannerView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b1 invoke$lambda$1$lambda$0() {
        return i.w(Boolean.FALSE);
    }

    private static final boolean invoke$lambda$2(b1 b1Var) {
        return ((Boolean) b1Var.getValue()).booleanValue();
    }

    private static final void invoke$lambda$3(b1 b1Var, boolean z11) {
        b1Var.setValue(Boolean.valueOf(z11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(b1 b1Var, boolean z11) {
        invoke$lambda$3(b1Var, z11);
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
        Object[] objArr = new Object[0];
        s sVar2 = (s) nVar;
        sVar2.a0(1849434622);
        Object objM = sVar2.M();
        m3.f fVar = m.f29332a;
        if (objM == fVar) {
            objM = new g();
            sVar2.k0(objM);
        }
        sVar2.q(false);
        b1 b1Var = (b1) j.e(objArr, null, (Function0) objM, sVar2, 3072, 6);
        WaitTimeBannerType waitTimeBannerType = (WaitTimeBannerType) this.this$0.bannerType.getValue();
        long j9 = ((v) this.this$0.onBackgroundColor.getValue()).f23317a;
        long j11 = ((v) this.this$0.onBackgroundColor.getValue()).f23317a;
        long j12 = ((v) this.this$0.onBackgroundColor.getValue()).f23317a;
        long j13 = ((v) this.this$0.onBackgroundColor.getValue()).f23317a;
        long j14 = ((v) this.this$0.focusedBorderColor.getValue()).f23317a;
        long j15 = ((v) this.this$0.backgroundColor.getValue()).f23317a;
        boolean zInvoke$lambda$2 = invoke$lambda$2(b1Var);
        sVar2.a0(5004770);
        boolean zF = sVar2.f(b1Var);
        Object objM2 = sVar2.M();
        if (zF || objM2 == fVar) {
            objM2 = new h(b1Var, 0);
            sVar2.k0(objM2);
        }
        sVar2.q(false);
        WaitTimeBannerKt.m1010WaitTimeBannercgPJBOs(waitTimeBannerType, j9, j13, j14, j11, j12, j15, zInvoke$lambda$2, (Function1) objM2, null, sVar2, 0, 512);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((n) obj, ((Number) obj2).intValue());
        return Unit.f26487a;
    }
}
