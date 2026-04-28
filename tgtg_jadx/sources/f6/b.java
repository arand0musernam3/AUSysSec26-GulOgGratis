package f6;

import kotlin.reflect.KProperty;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends k80.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f17371b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar, float f11, String str) {
        super(Float.valueOf(f11));
        this.f17371b = cVar;
        this.f17370a = str;
    }

    @Override // k80.b
    public final void afterChange(KProperty kProperty, Object obj, Object obj2) {
        ((Number) obj).floatValue();
        float fFloatValue = ((Number) obj2).floatValue();
        if (Float.isNaN(fFloatValue)) {
            return;
        }
        j6.f fVar = this.f17371b.f17374b;
        String name = this.f17370a;
        if (name == null) {
            name = kProperty.getName();
        }
        fVar.A(name, new j6.e(fFloatValue));
    }
}
