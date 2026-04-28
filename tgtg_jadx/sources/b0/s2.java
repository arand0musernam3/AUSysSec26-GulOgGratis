package b0;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends z70.i implements Function1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f5407j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ x2 f5408k;
    public final /* synthetic */ ArrayList l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f5409m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f5410n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f5411o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(x2 x2Var, ArrayList arrayList, int i11, int i12, int i13, x70.c cVar) {
        super(1, cVar);
        this.f5408k = x2Var;
        this.l = arrayList;
        this.f5409m = i11;
        this.f5410n = i12;
        this.f5411o = i13;
    }

    @Override // z70.a
    public final x70.c create(x70.c cVar) {
        return new s2(this.f5408k, this.l, this.f5409m, this.f5410n, this.f5411o, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((s2) create((x70.c) obj)).invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        x2 x2Var;
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f5407j;
        if (i11 == 0) {
            ba0.g.M(obj);
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControlImpl#issueSingleCaptureAsync");
            }
            v80.q qVar = x2.l;
            ArrayList arrayList = this.l;
            Iterator it = arrayList.iterator();
            loop0: while (true) {
                boolean zHasNext = it.hasNext();
                x2Var = this.f5408k;
                if (!zHasNext) {
                    break;
                }
                s0.r0 r0Var = (s0.r0) it.next();
                if (Collections.unmodifiableList(r0Var.f38438a).isEmpty()) {
                    break;
                }
                List listUnmodifiableList = Collections.unmodifiableList(r0Var.f38438a);
                listUnmodifiableList.getClass();
                Iterator it2 = listUnmodifiableList.iterator();
                while (it2.hasNext()) {
                    if (((Map) x2Var.f5493c.f79f.getValue()).get((s0.x0) it2.next()) == null) {
                        break loop0;
                    }
                }
            }
            x2.m(arrayList.size(), "Capture request failed due to invalid surface");
            q2 q2VarN = x2.n(x2Var.f5501k);
            if (wd.a.B(3, "CXCP")) {
                Log.d("CXCP", "UseCaseCameraRequestControl: Submitting still captures to capture pipeline");
            }
            o oVar = (o) x2Var.f5498h.getValue();
            e0.m1 m1Var = q2VarN.f5376d;
            m1Var.getClass();
            int i12 = m1Var.f15368a;
            b bVarA = q2VarN.f5373a.a();
            this.f5407j = 1;
            obj = oVar.a(arrayList, i12, bVarA, this.f5409m, this.f5410n, this.f5411o, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                com.braze.h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return (List) obj;
    }
}
