package uk;

import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f41343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ double f41344c;

    public /* synthetic */ o(double d3, com.braze.models.p pVar) {
        this.f41342a = 2;
        this.f41344c = d3;
        this.f41343b = pVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41342a) {
            case 0:
                ((LocationPickerOverlay) ((q) this.f41343b).f41370x.f35150d).c(this.f41344c);
                return Unit.f26487a;
            case 1:
                ((LocationPickerOverlay) ((q) this.f41343b).f41370x.f35150d).c(this.f41344c);
                return Unit.f26487a;
            default:
                return com.braze.models.p.a(this.f41344c, (com.braze.models.p) this.f41343b);
        }
    }

    public /* synthetic */ o(q qVar, double d3, int i11) {
        this.f41342a = i11;
        this.f41343b = qVar;
        this.f41344c = d3;
    }
}
