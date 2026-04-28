package zendesk.guidekit.android.internal.di.module;

import o00.x0;
import oa0.o0;
import s70.c;
import zendesk.guidekit.android.internal.rest.BrandsApi;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class BrandsModule_ProvidesBrandsApiFactory implements c {
    private final BrandsModule module;
    private final c retrofitProvider;

    private BrandsModule_ProvidesBrandsApiFactory(BrandsModule brandsModule, c cVar) {
        this.module = brandsModule;
        this.retrofitProvider = cVar;
    }

    public static BrandsModule_ProvidesBrandsApiFactory create(BrandsModule brandsModule, c cVar) {
        return new BrandsModule_ProvidesBrandsApiFactory(brandsModule, cVar);
    }

    public static BrandsApi providesBrandsApi(BrandsModule brandsModule, o0 o0Var) {
        BrandsApi brandsApiProvidesBrandsApi = brandsModule.providesBrandsApi(o0Var);
        x0.o(brandsApiProvidesBrandsApi);
        return brandsApiProvidesBrandsApi;
    }

    @Override // t70.a
    public BrandsApi get() {
        return providesBrandsApi(this.module, (o0) this.retrofitProvider.get());
    }
}
