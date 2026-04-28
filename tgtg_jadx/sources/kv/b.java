package kv;

import com.app.tgtg.tasks.RedeemWorker;
import z70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public /* synthetic */ Object f26678j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ RedeemWorker f26679k;
    public int l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RedeemWorker redeemWorker, c cVar) {
        super(cVar);
        this.f26679k = redeemWorker;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f26678j = obj;
        this.l |= Integer.MIN_VALUE;
        return this.f26679k.d(this);
    }
}
