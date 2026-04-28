package c5;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lc5/w;", "Lb5/h1;", "Lc5/m;", "Lc5/y;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ y f7398b;

    public w(y yVar) {
        this.f7398b = yVar;
    }

    @Override // b5.h1
    public final b4.s create() {
        return new m(this.f7398b);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f7398b.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "rootModifier";
    }

    @Override // b5.h1
    public final /* bridge */ /* synthetic */ void update(b4.s sVar) {
    }
}
