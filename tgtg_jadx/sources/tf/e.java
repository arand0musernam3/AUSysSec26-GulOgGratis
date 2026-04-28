package tf;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f40121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f40122b;

    public e(j jVar, of.a aVar) {
        this.f40122b = jVar;
        this.f40121a = new WeakReference(aVar);
    }

    public final void a(Function1 function1) {
        of.a aVar = (of.a) this.f40121a.get();
        if (aVar == null) {
            return;
        }
        try {
            function1.invoke(aVar);
        } catch (Exception e5) {
            this.f40122b.f40139h.a("Exception in subscriber callback: " + e5.getMessage());
        }
    }
}
