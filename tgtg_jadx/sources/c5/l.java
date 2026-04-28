package c5;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z4.m1 f7282b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(z4.m1 m1Var, int i11) {
        super(1);
        this.f7281a = i11;
        this.f7282b = m1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f7281a) {
            case 0:
                ((z4.l1) obj).j(this.f7282b, 0, 0, 0.0f);
                break;
            case 1:
                z4.l1.o((z4.l1) obj, this.f7282b, 0, 0);
                break;
            case 2:
                z4.l1.o((z4.l1) obj, this.f7282b, 0, 0);
                break;
            case 3:
                z4.l1 l1Var = (z4.l1) obj;
                l1Var.getClass();
                z4.l1.o(l1Var, this.f7282b, 0, 0);
                break;
            case 4:
                ((z4.l1) obj).j(this.f7282b, 0, 0, 0.0f);
                break;
            case 5:
                ((z4.l1) obj).j(this.f7282b, 0, 0, 0.0f);
                break;
            case 6:
                ((z4.l1) obj).j(this.f7282b, 0, 0, 0.0f);
                break;
            default:
                z4.l1.p((z4.l1) obj, this.f7282b, 0, 0);
                break;
        }
        return Unit.f26487a;
    }
}
