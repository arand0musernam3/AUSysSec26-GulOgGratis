package zendesk.messaging.android.internal.rest;

import s70.c;
import zendesk.core.ui.android.internal.local.LocaleProvider;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes4.dex */
public final class HeaderFactory_Factory implements c {
    private final c localeProvider;

    private HeaderFactory_Factory(c cVar) {
        this.localeProvider = cVar;
    }

    public static HeaderFactory_Factory create(c cVar) {
        return new HeaderFactory_Factory(cVar);
    }

    public static HeaderFactory newInstance(LocaleProvider localeProvider) {
        return new HeaderFactory(localeProvider);
    }

    @Override // t70.a
    public HeaderFactory get() {
        return newInstance((LocaleProvider) this.localeProvider.get());
    }
}
