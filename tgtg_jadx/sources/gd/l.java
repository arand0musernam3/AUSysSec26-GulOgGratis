package gd;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.ObjectRef f20392j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f20393k;
    public final /* synthetic */ m l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f20394m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, z70.c cVar) {
        super(cVar);
        this.l = mVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f20393k = obj;
        this.f20394m |= Integer.MIN_VALUE;
        return this.l.a(this);
    }
}
