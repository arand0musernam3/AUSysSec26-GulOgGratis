package r90;

import kotlin.reflect.KClass;
import y9.w;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f37804c = new a();

    @Override // y9.w
    public final w E(KClass kClass, Object obj) {
        return obj != null ? new b(kClass, obj, this) : this;
    }

    @Override // y9.w
    public final Object t(KClass kClass) {
        return null;
    }

    public final String toString() {
        return "{}";
    }
}
