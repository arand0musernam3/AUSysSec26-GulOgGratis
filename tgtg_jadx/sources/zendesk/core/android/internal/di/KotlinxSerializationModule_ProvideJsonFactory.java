package zendesk.core.android.internal.di;

import o00.x0;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class KotlinxSerializationModule_ProvideJsonFactory implements c {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class InstanceHolder {
        static final KotlinxSerializationModule_ProvideJsonFactory INSTANCE = new KotlinxSerializationModule_ProvideJsonFactory();

        private InstanceHolder() {
        }
    }

    public static KotlinxSerializationModule_ProvideJsonFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static n90.c provideJson() {
        n90.c cVarProvideJson = KotlinxSerializationModule.INSTANCE.provideJson();
        x0.o(cVarProvideJson);
        return cVarProvideJson;
    }

    @Override // t70.a
    public n90.c get() {
        return provideJson();
    }
}
