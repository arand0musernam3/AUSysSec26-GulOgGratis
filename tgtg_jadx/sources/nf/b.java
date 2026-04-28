package nf;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f30823a = new b(1);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qf.d dVar = (qf.d) obj;
        dVar.getClass();
        sf.b bVar = dVar instanceof sf.b ? (sf.b) dVar : null;
        if (bVar != null) {
            f0.B(bVar.d().f45854c, bVar.d().f45857f, null, new sf.a(bVar, null, 0), 2);
        }
        return Unit.f26487a;
    }
}
