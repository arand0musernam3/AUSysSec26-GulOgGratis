package zendesk.core.ui.android.internal.local;

import android.content.Context;
import s70.c;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class LocaleProvider_Factory implements c {
    private final c contextProvider;

    private LocaleProvider_Factory(c cVar) {
        this.contextProvider = cVar;
    }

    public static LocaleProvider_Factory create(c cVar) {
        return new LocaleProvider_Factory(cVar);
    }

    public static LocaleProvider newInstance(Context context) {
        return new LocaleProvider(context);
    }

    @Override // t70.a
    public LocaleProvider get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
