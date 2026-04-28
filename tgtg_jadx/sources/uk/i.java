package uk;

import com.app.tgtg.feature.locationpicker.LocationPickerOverlay;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class i implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f41333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f41334b;

    public /* synthetic */ i(q qVar, int i11) {
        this.f41333a = i11;
        this.f41334b = qVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f41333a) {
            case 0:
                break;
            case 1:
                ((LocationPickerOverlay) this.f41334b.f41370x.f35150d).b();
                break;
            case 2:
                q qVar = this.f41334b;
                ((LocationPickerOverlay) qVar.f41370x.f35150d).e();
                st.a aVar = qVar.f41349b;
                if (aVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar = null;
                }
                ((rt.d) aVar).s(new i(qVar, 6));
                break;
            case 3:
                q qVar2 = this.f41334b;
                ((LocationPickerOverlay) qVar2.f41370x.f35150d).b();
                st.a aVar2 = qVar2.f41349b;
                if (aVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mapAdapter");
                    aVar2 = null;
                }
                ((rt.d) aVar2).s(new i(qVar2, 5));
                break;
            case 4:
                c cVar = this.f41334b.f41353f;
                if (cVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewFragment");
                    cVar = null;
                }
                cVar.t();
                break;
            case 5:
                ((LocationPickerOverlay) this.f41334b.f41370x.f35150d).b();
                break;
            default:
                ((LocationPickerOverlay) this.f41334b.f41370x.f35150d).b();
                break;
        }
        return Unit.f26487a;
    }
}
