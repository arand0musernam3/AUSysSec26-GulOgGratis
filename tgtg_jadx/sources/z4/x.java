package z4;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f47242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f47243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Map f47244c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function1 f47245d;

    public x(int i11, int i12, Map map, Function1 function1) {
        this.f47242a = i11;
        this.f47243b = i12;
        this.f47244c = map;
        this.f47245d = function1;
    }

    @Override // z4.v0
    public final int b() {
        return this.f47242a;
    }

    @Override // z4.v0
    public final Map c() {
        return this.f47244c;
    }

    @Override // z4.v0
    public final Function1 d() {
        return this.f47245d;
    }

    @Override // z4.v0
    public final int getHeight() {
        return this.f47243b;
    }

    @Override // z4.v0
    public final void a() {
    }
}
