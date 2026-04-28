package uo;

import com.app.tgtg.model.remote.PushNotificationsSettings;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import v80.b0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends z70.i implements Function2 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f41471j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f41472k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f41473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PushNotificationsSettings f41474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f41475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ h f41476p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, x70.c cVar) {
        super(2, cVar);
        this.f41476p = hVar;
    }

    @Override // z70.a
    public final x70.c create(Object obj, x70.c cVar) {
        return new f(this.f41476p, cVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((b0) obj, (x70.c) obj2)).invokeSuspend(Unit.f26487a);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ca  */
    @Override // z70.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 556
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uo.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
