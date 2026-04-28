package pi;

import androidx.lifecycle.m1;
import i2.e0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f35353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m f35354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b0 f35355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e0 f35356d;

    public /* synthetic */ c(b0 b0Var, i2.b bVar, m mVar) {
        this.f35353a = 0;
        this.f35355c = b0Var;
        this.f35356d = bVar;
        this.f35354b = mVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f35353a) {
            case 0:
                f0.B(this.f35355c, null, null, new nk.j(this.f35356d, this.f35354b, (x70.c) null, 9), 3);
                break;
            case 1:
                m mVar = this.f35354b;
                mVar.getClass();
                f0.B(m1.d(mVar), null, null, new j(mVar, null, 1), 3);
                mVar.a();
                f0.B(this.f35355c, null, null, new i2.p(this.f35356d, null, 3), 3);
                cv.i iVar = cv.i.ACTION_WEEK_PLANNED_DONATIONS_CLICKED;
                dv.b bVarE = h0.g.E(new Pair(dv.a.EXPLORE_WEEK_AFTER, new dv.c(Boolean.TRUE)), new Pair(dv.a.EXPLORE_WEEK_BEFORE, new dv.c(Boolean.FALSE)));
                iVar.getClass();
                mVar.f35401d.c(iVar, bVarE);
                break;
            default:
                m mVar2 = this.f35354b;
                mVar2.getClass();
                f0.B(m1.d(mVar2), null, null, new j(mVar2, null, 2), 3);
                mVar2.a();
                f0.B(this.f35355c, null, null, new i2.p(this.f35356d, null, 4), 3);
                cv.i iVar2 = cv.i.ACTION_WEEK_PLANNED_DONATIONS_CLICKED;
                dv.b bVarE2 = h0.g.E(new Pair(dv.a.EXPLORE_WEEK_AFTER, new dv.c(Boolean.FALSE)), new Pair(dv.a.EXPLORE_WEEK_BEFORE, new dv.c(Boolean.TRUE)));
                iVar2.getClass();
                mVar2.f35401d.c(iVar2, bVarE2);
                break;
        }
        return Unit.f26487a;
    }

    public /* synthetic */ c(m mVar, b0 b0Var, i2.b bVar, int i11) {
        this.f35353a = i11;
        this.f35354b = mVar;
        this.f35355c = b0Var;
        this.f35356d = bVar;
    }
}
