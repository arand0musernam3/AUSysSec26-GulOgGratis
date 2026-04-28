package x2;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.LongRef f43759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Ref.LongRef f43760k;
    public /* synthetic */ Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ w f43761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f43762n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(w wVar, z70.c cVar) {
        super(cVar);
        this.f43761m = wVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.l = obj;
        this.f43762n |= Integer.MIN_VALUE;
        return w.a(this.f43761m, null, this);
    }
}
