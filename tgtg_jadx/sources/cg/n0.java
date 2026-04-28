package cg;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import zendesk.ui.android.conversation.aidisclaimer.AiDisclaimerKt;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class n0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8033a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f8034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f8035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b4.t f8036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f8037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f8040h;

    public /* synthetic */ n0(long j9, long j11, b4.t tVar, String str, m5.u0 u0Var, int i11, int i12) {
        this.f8034b = j9;
        this.f8035c = j11;
        this.f8036d = tVar;
        this.f8037e = str;
        this.f8040h = u0Var;
        this.f8038f = i11;
        this.f8039g = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f8033a) {
            case 0:
                ((Integer) obj2).getClass();
                j.n(this.f8036d, this.f8037e, (String) this.f8040h, this.f8034b, this.f8035c, (m3.n) obj, m3.i.F(this.f8038f | 1), this.f8039g);
                return Unit.f26487a;
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return AiDisclaimerKt.AiDisclaimer_vc5YOHI$lambda$8(this.f8034b, this.f8035c, this.f8036d, this.f8037e, (m5.u0) this.f8040h, this.f8038f, this.f8039g, (m3.n) obj, iIntValue);
        }
    }

    public /* synthetic */ n0(b4.t tVar, String str, String str2, long j9, long j11, int i11, int i12) {
        this.f8036d = tVar;
        this.f8037e = str;
        this.f8040h = str2;
        this.f8034b = j9;
        this.f8035c = j11;
        this.f8038f = i11;
        this.f8039g = i12;
    }
}
