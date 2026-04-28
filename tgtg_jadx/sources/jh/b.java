package jh;

import com.app.tgtg.model.remote.badge.BadgeProgress;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import m3.g1;
import z4.z;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BadgeProgress f25252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g1 f25253c;

    public /* synthetic */ b(BadgeProgress badgeProgress, g1 g1Var, int i11) {
        this.f25251a = i11;
        this.f25252b = badgeProgress;
        this.f25253c = g1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i11 = this.f25251a;
        ((z) obj).getClass();
        switch (i11) {
            case 0:
                BadgeProgress badgeProgress = this.f25252b;
                this.f25253c.i(badgeProgress.getCurrentProgress() / badgeProgress.getMaxProgress());
                break;
            default:
                BadgeProgress badgeProgress2 = this.f25252b;
                this.f25253c.i(badgeProgress2.getCurrentProgress() / badgeProgress2.getMaxProgress());
                break;
        }
        return Unit.f26487a;
    }
}
