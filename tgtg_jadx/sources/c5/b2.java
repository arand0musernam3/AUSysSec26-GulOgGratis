package c5;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 implements y3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y3.f f7122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f7123b;

    public b2(y3.f fVar, c2 c2Var) {
        this.f7122a = fVar;
        this.f7123b = c2Var;
    }

    @Override // y3.e
    public final boolean a(Object obj) {
        return this.f7122a.a(obj);
    }

    @Override // y3.e
    public final Map b() {
        return this.f7122a.b();
    }

    @Override // y3.e
    public final Object c(String str) {
        return this.f7122a.c(str);
    }

    @Override // y3.e
    public final y3.d d(String str, Function0 function0) {
        return this.f7122a.d(str, function0);
    }
}
