package zendesk.guidekit.android.internal.di.module;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.guidekit.android.internal.rest.HelpCenterApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class HelpCenterModule_ProvidesFrontendEventsApiFactory implements c {
    private final HelpCenterModule module;
    private final c retrofitProvider;

    private HelpCenterModule_ProvidesFrontendEventsApiFactory(HelpCenterModule helpCenterModule, c cVar) {
        this.module = helpCenterModule;
        this.retrofitProvider = cVar;
    }

    public static HelpCenterModule_ProvidesFrontendEventsApiFactory create(HelpCenterModule helpCenterModule, c cVar) {
        return new HelpCenterModule_ProvidesFrontendEventsApiFactory(helpCenterModule, cVar);
    }

    public static HelpCenterApi providesFrontendEventsApi(HelpCenterModule helpCenterModule, o0 o0Var) {
        HelpCenterApi helpCenterApiProvidesFrontendEventsApi = helpCenterModule.providesFrontendEventsApi(o0Var);
        x0.o(helpCenterApiProvidesFrontendEventsApi);
        return helpCenterApiProvidesFrontendEventsApi;
    }

    @Override // t70.a
    public HelpCenterApi get() {
        return providesFrontendEventsApi(this.module, (o0) this.retrofitProvider.get());
    }
}
