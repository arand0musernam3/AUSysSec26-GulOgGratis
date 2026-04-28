package d2;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Ld2/j;", "Lb5/h1;", "Ld2/l;", "foundation-layout"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAspectRatio.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/layout/internal/InlineClassHelperKt\n*L\n1#1,240:1\n93#2,4:241\n*S KotlinDebug\n*F\n+ 1 AspectRatio.kt\nandroidx/compose/foundation/layout/AspectRatioElement\n*L\n79#1:241,4\n*E\n"})
final class j extends b5.h1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f13814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f13815c;

    public j(float f11, Function1 function1) {
        this.f13814b = f11;
        this.f13815c = function1;
        if (f11 > 0.0f) {
            return;
        }
        e2.a.a("aspectRatio " + f11 + " must be > 0");
    }

    @Override // b5.h1
    public final b4.s create() {
        l lVar = new l();
        lVar.f13825o = this.f13814b;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        j jVar = obj instanceof j ? (j) obj : null;
        if (jVar == null || this.f13814b != jVar.f13814b) {
            return false;
        }
        ((j) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.f13814b) * 31);
    }

    @Override // b5.h1
    public final void inspectableProperties(c5.o2 o2Var) {
        this.f13815c.invoke(o2Var);
    }

    @Override // b5.h1
    public final void update(b4.s sVar) {
        ((l) sVar).f13825o = this.f13814b;
    }
}
