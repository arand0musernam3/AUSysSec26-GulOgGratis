package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/v1;", "Lb5/h1;", "Ld2/y1;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPadding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,477:1\n111#2:478\n111#2:479\n111#2:480\n111#2:481\n122#2:486\n122#2:487\n122#2:488\n122#2:489\n93#3,4:482\n*S KotlinDebug\n*F\n+ 1 Padding.kt\nandroidx/compose/foundation/layout/PaddingElement\n*L\n346#1:478\n347#1:479\n348#1:480\n349#1:481\n336#1:486\n337#1:487\n338#1:488\n339#1:489\n345#1:482,4\n*E\n"})
final class v1 extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f13950d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f13951e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function1 f13952f;

    public v1(float f11, float f12, float f13, float f14, Function1 function1) {
        this.f13948b = f11;
        this.f13949c = f12;
        this.f13950d = f13;
        this.f13951e = f14;
        this.f13952f = function1;
        boolean z11 = true;
        boolean z12 = (f11 >= 0.0f || Float.isNaN(f11)) & (f12 >= 0.0f || Float.isNaN(f12)) & (f13 >= 0.0f || Float.isNaN(f13));
        if (f14 < 0.0f && !Float.isNaN(f14)) {
            z11 = false;
        }
        if (!z12 || !z11) {
            e2.a.a("Padding must be non-negative");
        }
    }

    @Override // b5.h1
    public final b4.s create() {
        y1 y1Var = new y1();
        y1Var.f13975o = this.f13948b;
        y1Var.f13976p = this.f13949c;
        y1Var.f13977q = this.f13950d;
        y1Var.f13978r = this.f13951e;
        y1Var.f13979s = true;
        return y1Var;
    }

    public final boolean equals(Object obj) {
        v1 v1Var = obj instanceof v1 ? (v1) obj : null;
        return v1Var != null && z5.f.c(this.f13948b, v1Var.f13948b) && z5.f.c(this.f13949c, v1Var.f13949c) && z5.f.c(this.f13950d, v1Var.f13950d) && z5.f.c(this.f13951e, v1Var.f13951e);
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + r8.k.a(r8.k.a(r8.k.a(Float.hashCode(this.f13948b) * 31, this.f13949c, 31), this.f13950d, 31), this.f13951e, 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13952f.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        y1 y1Var = (y1) sVar;
        y1Var.f13975o = this.f13948b;
        y1Var.f13976p = this.f13949c;
        y1Var.f13977q = this.f13950d;
        y1Var.f13978r = this.f13951e;
        y1Var.f13979s = true;
    }
}
