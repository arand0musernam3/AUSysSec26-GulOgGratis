package j5;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f24633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f24634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24635c;

    public k(Function0 function0, Function0 function02, boolean z11) {
        this.f24633a = function0;
        this.f24634b = function02;
        this.f24635c = z11;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScrollAxisRange(value=");
        sb2.append(((Number) this.f24633a.invoke()).floatValue());
        sb2.append(", maxValue=");
        sb2.append(((Number) this.f24634b.invoke()).floatValue());
        sb2.append(", reverseScrolling=");
        return r8.k.q(sb2, this.f24635c, ')');
    }
}
