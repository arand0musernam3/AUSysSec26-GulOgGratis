package g3;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w4 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f19696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f19697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b2.l f19698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d9 f19699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i4.v0 f19700f;

    public /* synthetic */ w4(boolean z11, boolean z12, b2.l lVar, d9 d9Var, i4.v0 v0Var, int i11) {
        this.f19695a = i11;
        this.f19696b = z11;
        this.f19697c = z12;
        this.f19698d = lVar;
        this.f19699e = d9Var;
        this.f19700f = v0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i11 = this.f19695a;
        m3.n nVar = (m3.n) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i11) {
            case 0:
                m3.s sVar = (m3.s) nVar;
                if (sVar.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q4.f19349a.a(this.f19696b, this.f19697c, this.f19698d, null, this.f19699e, this.f19700f, 0.0f, 0.0f, sVar, 100663296, 200);
                } else {
                    sVar.U();
                }
                break;
            default:
                m3.s sVar2 = (m3.s) nVar;
                if (sVar2.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                    q4.f19349a.a(this.f19696b, this.f19697c, this.f19698d, null, this.f19699e, this.f19700f, 0.0f, 0.0f, sVar2, 100663296, 200);
                } else {
                    sVar2.U();
                }
                break;
        }
        return Unit.f26487a;
    }
}
