package zendesk.guidekit.android.internal.data;

import s70.c;
import v80.b0;
import zendesk.guidekit.android.internal.rest.BrandsApi;
import zendesk.guidekit.android.internal.rest.HelpCenterApi;
import zendesk.guidekit.android.model.GuideKitSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
public final class GuideKitRepository_Factory implements c {
    private final c articleInMemoryDataSourceProvider;
    private final c brandsApiProvider;
    private final c brandsInMemoryDataSourceProvider;
    private final c coroutineScopeProvider;
    private final c guideKitSettingsProvider;
    private final c helpCenterApiProvider;

    private GuideKitRepository_Factory(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        this.helpCenterApiProvider = cVar;
        this.brandsApiProvider = cVar2;
        this.articleInMemoryDataSourceProvider = cVar3;
        this.brandsInMemoryDataSourceProvider = cVar4;
        this.guideKitSettingsProvider = cVar5;
        this.coroutineScopeProvider = cVar6;
    }

    public static GuideKitRepository_Factory create(c cVar, c cVar2, c cVar3, c cVar4, c cVar5, c cVar6) {
        return new GuideKitRepository_Factory(cVar, cVar2, cVar3, cVar4, cVar5, cVar6);
    }

    public static GuideKitRepository newInstance(HelpCenterApi helpCenterApi, BrandsApi brandsApi, ArticleInMemoryDataSource articleInMemoryDataSource, BrandsInMemoryDataSource brandsInMemoryDataSource, GuideKitSettings guideKitSettings, b0 b0Var) {
        return new GuideKitRepository(helpCenterApi, brandsApi, articleInMemoryDataSource, brandsInMemoryDataSource, guideKitSettings, b0Var);
    }

    @Override // t70.a
    public GuideKitRepository get() {
        return newInstance((HelpCenterApi) this.helpCenterApiProvider.get(), (BrandsApi) this.brandsApiProvider.get(), (ArticleInMemoryDataSource) this.articleInMemoryDataSourceProvider.get(), (BrandsInMemoryDataSource) this.brandsInMemoryDataSourceProvider.get(), (GuideKitSettings) this.guideKitSettingsProvider.get(), (b0) this.coroutineScopeProvider.get());
    }
}
