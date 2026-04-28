package zendesk.android.internal.frontendevents.di;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.android.internal.frontendevents.FrontendEventsApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class FrontendEventsModule_ProvidesFrontendEventsApiFactory implements c {
    private final FrontendEventsModule module;
    private final c retrofitProvider;

    private FrontendEventsModule_ProvidesFrontendEventsApiFactory(FrontendEventsModule frontendEventsModule, c cVar) {
        this.module = frontendEventsModule;
        this.retrofitProvider = cVar;
    }

    public static FrontendEventsModule_ProvidesFrontendEventsApiFactory create(FrontendEventsModule frontendEventsModule, c cVar) {
        return new FrontendEventsModule_ProvidesFrontendEventsApiFactory(frontendEventsModule, cVar);
    }

    public static FrontendEventsApi providesFrontendEventsApi(FrontendEventsModule frontendEventsModule, o0 o0Var) {
        FrontendEventsApi frontendEventsApiProvidesFrontendEventsApi = frontendEventsModule.providesFrontendEventsApi(o0Var);
        x0.o(frontendEventsApiProvidesFrontendEventsApi);
        return frontendEventsApiProvidesFrontendEventsApi;
    }

    @Override // t70.a
    public FrontendEventsApi get() {
        return providesFrontendEventsApi(this.module, (o0) this.retrofitProvider.get());
    }
}
