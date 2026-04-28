package zendesk.messaging.android.internal.validation;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class ValidationRules_Factory implements c {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class InstanceHolder {
        static final ValidationRules_Factory INSTANCE = new ValidationRules_Factory();

        private InstanceHolder() {
        }
    }

    public static ValidationRules_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ValidationRules newInstance() {
        return new ValidationRules();
    }

    @Override // t70.a
    public ValidationRules get() {
        return newInstance();
    }
}
