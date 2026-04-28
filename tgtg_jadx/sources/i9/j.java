package i9;

import g9.a0;
import g9.z;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KClass;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f23516g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u3.d f23517h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function1 f23518i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function1 f23519j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Function1 f23520k;
    public Function1 l;

    public j(i iVar, String str, u3.d dVar) {
        super(iVar, -1, str);
        this.f23516g = iVar;
        this.f23517h = dVar;
    }

    @Override // g9.a0
    public final z a() {
        h hVar = (h) super.a();
        hVar.f23511h = this.f23518i;
        hVar.f23512i = this.f23519j;
        hVar.f23513j = this.f23520k;
        hVar.f23514k = this.l;
        return hVar;
    }

    @Override // g9.a0
    public final z b() {
        return new h(this.f23516g, this.f23517h);
    }

    public j(i iVar, KClass kClass, Map map, u3.d dVar) {
        super(iVar, kClass, map);
        this.f23516g = iVar;
        this.f23517h = dVar;
    }
}
