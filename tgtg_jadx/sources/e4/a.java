package e4;

import b4.s;
import b5.h1;
import c5.o2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Le4/a;", "Lb5/h1;", "Le4/i;", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a extends h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f15727b;

    public a(b bVar) {
        this.f15727b = bVar;
    }

    @Override // b5.h1
    public final s create() {
        return this.f15727b.f15728a;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return this.f15727b.f15728a.hashCode();
    }

    @Override // b5.h1
    public final void inspectableProperties(o2 o2Var) {
        o2Var.f7307a = "RootDragAndDropNode";
    }

    @Override // b5.h1
    public final /* bridge */ /* synthetic */ void update(s sVar) {
    }
}
