package d8;

import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Ref.IntRef f14723j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public /* synthetic */ Object f14724k;
    public final /* synthetic */ y l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14725m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, z70.c cVar) {
        super(cVar);
        this.l = yVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f14724k = obj;
        this.f14725m |= Integer.MIN_VALUE;
        return this.l.j(null, false, this);
    }
}
