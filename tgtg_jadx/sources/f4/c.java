package f4;

import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements z5.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f17292a = k.f17299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public lz.i f17293b;

    @Override // z5.c
    public final float X() {
        return this.f17292a.a().X();
    }

    @Override // z5.c
    public final float a() {
        return this.f17292a.a().a();
    }

    public final lz.i b(Function1 function1) {
        lz.i iVar = new lz.i(14, false);
        iVar.f28446b = function1;
        this.f17293b = iVar;
        return iVar;
    }
}
