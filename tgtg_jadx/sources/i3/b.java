package i3;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import z4.l1;
import z4.m1;
import zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m1 f23100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f23101c;

    public /* synthetic */ b(int i11, int i12, m1 m1Var) {
        this.f23099a = i12;
        this.f23100b = m1Var;
        this.f23101c = i11;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f23099a) {
            case 0:
                ((l1) obj).j(this.f23100b, -this.f23101c, 0, 0.0f);
                return Unit.f26487a;
            case 1:
                ((l1) obj).j(this.f23100b, 0, -this.f23101c, 0.0f);
                return Unit.f26487a;
            default:
                return AiDisclaimerKt.AiDisclaimer_vc5YOHI$lambda$7$lambda$6$lambda$5$lambda$4(this.f23100b, this.f23101c, (l1) obj);
        }
    }
}
