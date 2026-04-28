package n90;

import com.adyen.checkout.components.core.Address;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@i90.h(with = z.class)
public final class y extends g0 {

    @NotNull
    public static final y INSTANCE = new y();

    @Override // n90.g0
    public final String b() {
        return Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // n90.g0
    public final boolean d() {
        return false;
    }

    @NotNull
    public final KSerializer serializer() {
        return z.f30789a;
    }
}
