package om;

import android.location.Location;
import com.braze.h2;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import mv.r0;
import v80.b0;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f32658j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f32659k;
    public l l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f32660m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public /* synthetic */ Object f32661n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ l f32662o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(l lVar, x70.c cVar, int i11) {
        super(2, cVar);
        this.f32658j = i11;
        this.f32662o = lVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        switch (this.f32658j) {
            case 0:
                h hVar = new h(this.f32662o, cVar, 0);
                hVar.f32661n = obj;
                return hVar;
            default:
                h hVar2 = new h(this.f32662o, cVar, 1);
                hVar2.f32661n = obj;
                return hVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        b0 b0Var = (b0) obj;
        x70.c cVar = (x70.c) obj2;
        switch (this.f32658j) {
        }
        return ((h) create(b0Var, cVar)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        l lVar2;
        st.b bVar;
        l lVar3;
        l lVar4;
        st.b bVar2;
        switch (this.f32658j) {
            case 0:
                b0 b0Var = (b0) this.f32661n;
                y70.a aVar = y70.a.COROUTINE_SUSPENDED;
                int i11 = this.f32660m;
                try {
                    if (i11 == 0) {
                        ba0.g.M(obj);
                        l lVar5 = this.f32662o;
                        if (lVar5.f32680q == null) {
                            lVar5.f32680q = new Double(r0.k());
                        }
                        this.f32661n = b0Var;
                        this.f32659k = lVar5;
                        this.l = lVar5;
                        this.f32660m = 1;
                        Object objS = l.s(lVar5, this);
                        if (objS != aVar) {
                            lVar = lVar5;
                            obj = objS;
                            lVar2 = lVar;
                        }
                    } else if (i11 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        lVar = this.l;
                        lVar2 = this.f32659k;
                        ba0.g.M(obj);
                    }
                    bVar = (st.b) obj;
                } catch (Throwable th2) {
                    sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th2.getMessage()), new Object[0]);
                }
                if (bVar != null) {
                    lVar.f32681r = bVar;
                    Location locationT = l.t(lVar2);
                    st.b bVar3 = lVar2.f32681r;
                    locationT.setLatitude(bVar3 != null ? bVar3.f39278a : 0.0d);
                    Location locationT2 = l.t(lVar2);
                    st.b bVar4 = lVar2.f32681r;
                    locationT2.setLongitude(bVar4 != null ? bVar4.f39279b : 0.0d);
                } else {
                    f0.j(b0Var, null);
                }
                break;
            default:
                b0 b0Var2 = (b0) this.f32661n;
                y70.a aVar2 = y70.a.COROUTINE_SUSPENDED;
                int i12 = this.f32660m;
                try {
                    if (i12 == 0) {
                        ba0.g.M(obj);
                        l lVar6 = this.f32662o;
                        lVar6.f32680q = new Double(r0.k());
                        this.f32661n = b0Var2;
                        this.f32659k = lVar6;
                        this.l = lVar6;
                        this.f32660m = 1;
                        Object objS2 = l.s(lVar6, this);
                        if (objS2 != aVar2) {
                            lVar3 = lVar6;
                            obj = objS2;
                            lVar4 = lVar3;
                        }
                    } else if (i12 != 1) {
                        h2.b("call to 'resume' before 'invoke' with coroutine");
                    } else {
                        lVar3 = this.l;
                        lVar4 = this.f32659k;
                        ba0.g.M(obj);
                    }
                    bVar2 = (st.b) obj;
                } catch (Throwable th3) {
                    sa0.a.f38953a.i(e0.f.k("Exception Ignored: ", th3.getMessage()), new Object[0]);
                }
                if (bVar2 != null) {
                    lVar3.f32681r = bVar2;
                    Location locationT3 = l.t(lVar4);
                    st.b bVar5 = lVar4.f32681r;
                    locationT3.setLatitude(bVar5 != null ? bVar5.f39278a : 0.0d);
                    Location locationT4 = l.t(lVar4);
                    st.b bVar6 = lVar4.f32681r;
                    locationT4.setLongitude(bVar6 != null ? bVar6.f39279b : 0.0d);
                    if (!lVar4.f32672h) {
                        lVar4.D();
                    }
                } else {
                    f0.j(b0Var2, null);
                }
                break;
        }
        return Unit.f26487a;
    }
}
