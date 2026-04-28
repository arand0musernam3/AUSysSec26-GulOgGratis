package jv;

import com.app.tgtg.services.user.AuthPolling;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f25412j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ AuthPolling f25413k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(AuthPolling authPolling, z70.c cVar) {
        super(cVar);
        this.f25413k = authPolling;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f25412j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f25413k.f(null, this);
    }
}
