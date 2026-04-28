package jg;

import com.app.tgtg.model.remote.user.response.AddressField;
import com.app.tgtg.model.remote.user.response.AddressViolation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25163a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressField f25164b;

    public /* synthetic */ b0(AddressField addressField, int i11) {
        this.f25163a = i11;
        this.f25164b = addressField;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AddressViolation addressViolation = (AddressViolation) obj;
        switch (this.f25163a) {
            case 0:
                return Boolean.valueOf((addressViolation != null ? addressViolation.getField() : null) == this.f25164b);
            default:
                return Boolean.valueOf((addressViolation != null ? addressViolation.getField() : null) == this.f25164b);
        }
    }
}
