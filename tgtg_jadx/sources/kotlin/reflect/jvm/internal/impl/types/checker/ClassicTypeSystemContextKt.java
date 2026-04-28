package kotlin.reflect.jvm.internal.impl.types.checker;

import kotlin.reflect.jvm.internal.impl.types.SpecialTypesKt;
import kotlin.reflect.jvm.internal.impl.types.UnwrappedType;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class ClassicTypeSystemContextKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final UnwrappedType makeDefinitelyNotNullOrNotNullInternal(UnwrappedType unwrappedType) {
        return SpecialTypesKt.makeDefinitelyNotNullOrNotNull$default(unwrappedType, false, 1, null);
    }
}
