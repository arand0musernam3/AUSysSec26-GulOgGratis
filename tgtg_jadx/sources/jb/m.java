package jb;

import com.braze.h2;
import com.braze.models.BrazeGeofence;
import kotlin.Unit;
import v80.f0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends z70.i implements i80.o {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f24903j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Throwable f24904k;
    public /* synthetic */ long l;

    @Override // i80.o
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long jLongValue = ((Number) obj3).longValue();
        m mVar = new m(4, (x70.c) obj4);
        mVar.f24904k = (Throwable) obj2;
        mVar.l = jLongValue;
        return mVar.invokeSuspend(Unit.f26487a);
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        y70.a aVar = y70.a.COROUTINE_SUSPENDED;
        int i11 = this.f24903j;
        if (i11 == 0) {
            ba0.g.M(obj);
            Throwable th2 = this.f24904k;
            long j9 = this.l;
            ib.w.d().c(n.f24905a, "Cannot check for unfinished work", th2);
            long jMin = Math.min(j9 * ((long) BrazeGeofence.DEFAULT_NOTIFICATION_RESPONSIVENESS_MS), n.f24906b);
            this.f24903j = 1;
            if (f0.o(jMin, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                h2.b("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ba0.g.M(obj);
        }
        return Boolean.TRUE;
    }
}
