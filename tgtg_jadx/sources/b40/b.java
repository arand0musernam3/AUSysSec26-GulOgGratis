package b40;

import com.google.android.gms.tasks.Task;
import d10.g;
import d10.o;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l0.b f5736a = new l0.b(0);

    public static o a(Task task, Task task2) {
        d10.a aVar = new d10.a();
        g gVar = new g(aVar.f13696a);
        a aVar2 = new a(gVar, new AtomicBoolean(false), aVar, 0);
        l0.b bVar = f5736a;
        task.j(bVar, aVar2);
        task2.j(bVar, aVar2);
        return gVar.f13697a;
    }
}
