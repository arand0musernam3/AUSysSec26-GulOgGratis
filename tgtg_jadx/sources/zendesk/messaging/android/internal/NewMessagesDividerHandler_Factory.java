package zendesk.messaging.android.internal;

import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class NewMessagesDividerHandler_Factory implements c {

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    public static final class InstanceHolder {
        static final NewMessagesDividerHandler_Factory INSTANCE = new NewMessagesDividerHandler_Factory();

        private InstanceHolder() {
        }
    }

    public static NewMessagesDividerHandler_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static NewMessagesDividerHandler newInstance() {
        return new NewMessagesDividerHandler();
    }

    @Override // t70.a
    public NewMessagesDividerHandler get() {
        return newInstance();
    }
}
