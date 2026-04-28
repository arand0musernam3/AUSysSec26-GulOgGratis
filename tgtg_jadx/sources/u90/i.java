package u90;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends t90.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t f40911e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j f40912f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, t tVar, j jVar) {
        super(str, true);
        this.f40911e = tVar;
        this.f40912f = jVar;
    }

    @Override // t90.a
    public final long a() throws InterruptedException {
        s sVar;
        t tVar = this.f40911e;
        try {
            sVar = tVar.c();
        } catch (Throwable th2) {
            sVar = new s(tVar, null, th2, 2);
        }
        j jVar = this.f40912f;
        if (!((CopyOnWriteArrayList) jVar.f40916d).contains(tVar)) {
            return -1L;
        }
        ((LinkedBlockingDeque) jVar.f40917e).put(sVar);
        return -1L;
    }
}
