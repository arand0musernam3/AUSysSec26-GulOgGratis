package v9;

import android.adservices.measurement.MeasurementManager;
import android.net.Uri;
import android.view.InputEvent;
import d40.t1;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.f0;
import v80.l;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends t1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MeasurementManager f42181g;

    public c(MeasurementManager measurementManager) {
        measurementManager.getClass();
        this.f42181g = measurementManager;
    }

    public static Object P(c cVar, a aVar, x70.c<? super Unit> cVar2) {
        new l(1, y70.f.b(cVar2)).t();
        MeasurementManager measurementManager = cVar.f42181g;
        throw null;
    }

    public static Object Q(c cVar, x70.c<? super Integer> cVar2) {
        l lVar = new l(1, y70.f.b(cVar2));
        lVar.t();
        cVar.f42181g.getMeasurementApiStatus(new l0.b(0), new d7.d(lVar));
        Object objS = lVar.s();
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        return objS;
    }

    public static Object S(c cVar, Uri uri, InputEvent inputEvent, x70.c<? super Unit> cVar2) {
        l lVar = new l(1, y70.f.b(cVar2));
        lVar.t();
        cVar.f42181g.registerSource(uri, inputEvent, new l0.b(0), new d7.d(lVar));
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    public static Object T(c cVar, d dVar, x70.c<? super Unit> cVar2) {
        Object objN = f0.n(new rf.c(cVar, null, 16), cVar2);
        return objN == y70.a.COROUTINE_SUSPENDED ? objN : Unit.f26487a;
    }

    public static Object U(c cVar, Uri uri, x70.c<? super Unit> cVar2) {
        l lVar = new l(1, y70.f.b(cVar2));
        lVar.t();
        cVar.f42181g.registerTrigger(uri, new l0.b(0), new d7.d(lVar));
        Object objS = lVar.s();
        return objS == y70.a.COROUTINE_SUSPENDED ? objS : Unit.f26487a;
    }

    public static Object W(c cVar, e eVar, x70.c<? super Unit> cVar2) {
        new l(1, y70.f.b(cVar2)).t();
        MeasurementManager measurementManager = cVar.f42181g;
        throw null;
    }

    public static Object Y(c cVar, f fVar, x70.c<? super Unit> cVar2) {
        new l(1, y70.f.b(cVar2)).t();
        MeasurementManager measurementManager = cVar.f42181g;
        throw null;
    }

    @Override // d40.t1
    @Nullable
    public Object B(@NotNull x70.c<? super Integer> cVar) {
        return Q(this, cVar);
    }

    @Override // d40.t1
    @Nullable
    public Object F(@NotNull Uri uri, @Nullable InputEvent inputEvent, @NotNull x70.c<? super Unit> cVar) {
        return S(this, uri, inputEvent, cVar);
    }

    @Override // d40.t1
    @Nullable
    public Object G(@NotNull Uri uri, @NotNull x70.c<? super Unit> cVar) {
        return U(this, uri, cVar);
    }

    @Nullable
    public Object O(@NotNull a aVar, @NotNull x70.c<? super Unit> cVar) {
        return P(this, aVar, cVar);
    }

    @Nullable
    public Object R(@NotNull d dVar, @NotNull x70.c<? super Unit> cVar) {
        return T(this, dVar, cVar);
    }

    @Nullable
    public Object V(@NotNull e eVar, @NotNull x70.c<? super Unit> cVar) {
        return W(this, eVar, cVar);
    }

    @Nullable
    public Object X(@NotNull f fVar, @NotNull x70.c<? super Unit> cVar) {
        return Y(this, fVar, cVar);
    }
}
