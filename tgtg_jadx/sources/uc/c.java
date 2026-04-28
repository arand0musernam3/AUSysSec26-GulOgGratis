package uc;

import kotlin.jvm.internal.Ref;
import zc.k;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f41005j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f41006k;
    public Object l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f41007m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Ref.ObjectRef f41008n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Ref.ObjectRef f41009o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Ref.ObjectRef f41010p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Ref.ObjectRef f41011q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f41012r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ h f41013s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f41014t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, z70.c cVar) {
        super(cVar);
        this.f41013s = hVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f41012r = obj;
        this.f41014t |= Integer.MIN_VALUE;
        return h.b(this.f41013s, null, null, null, null, this);
    }
}
