package o90;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class t extends z70.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public u70.b f32198j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b20.b f32199k;
    public LinkedHashMap l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f32200m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f32201n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public /* synthetic */ Object f32202o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ b20.b f32203p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f32204q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(b20.b bVar, z70.a aVar) {
        super(aVar);
        this.f32203p = bVar;
    }

    @Override // z70.a
    public final Object invokeSuspend(Object obj) {
        this.f32202o = obj;
        this.f32204q |= Integer.MIN_VALUE;
        return b20.b.d(this.f32203p, null, this);
    }
}
