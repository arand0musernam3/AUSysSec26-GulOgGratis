package c5;

import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p2 implements l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f7318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public o2 f7319b;

    public p2(Function1 function1) {
        this.f7318a = function1;
    }

    @Override // c5.l2
    public final Sequence getInspectableElements() {
        o2 o2Var = this.f7319b;
        if (o2Var == null) {
            o2Var = new o2();
            this.f7318a.invoke(o2Var);
        }
        this.f7319b = o2Var;
        return o2Var.f7309c;
    }

    @Override // c5.l2
    public final String getNameFallback() {
        o2 o2Var = this.f7319b;
        if (o2Var == null) {
            o2Var = new o2();
            this.f7318a.invoke(o2Var);
        }
        this.f7319b = o2Var;
        return o2Var.f7307a;
    }
}
