package zendesk.guidekit.android.internal.data;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import v80.b0;
import v80.f0;
import v80.i1;
import zendesk.guidekit.android.internal.rest.BrandsApi;
import zendesk.guidekit.android.internal.rest.HelpCenterApi;
import zendesk.guidekit.android.model.GuideKitSettings;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 *2\u00020\u0001:\u0001*B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019J.\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00162\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u001c\u0010\u0019J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001e0\u0016H\u0086@¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lzendesk/guidekit/android/internal/data/GuideKitRepository;", "", "Lzendesk/guidekit/android/internal/rest/HelpCenterApi;", "helpCenterApi", "Lzendesk/guidekit/android/internal/rest/BrandsApi;", "brandsApi", "Lzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource;", "articleInMemoryDataSource", "Lzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource;", "brandsInMemoryDataSource", "Lzendesk/guidekit/android/model/GuideKitSettings;", "guideKitSettings", "Lv80/b0;", "coroutineScope", "<init>", "(Lzendesk/guidekit/android/internal/rest/HelpCenterApi;Lzendesk/guidekit/android/internal/rest/BrandsApi;Lzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource;Lzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource;Lzendesk/guidekit/android/model/GuideKitSettings;Lv80/b0;)V", "", "articleId", "Lzendesk/guidekit/android/model/GuideLocale;", "guideLocale", "", "baseUrl", "Lu70/q;", "", "sendArticleStatsView-BWLJW6A", "(JLzendesk/guidekit/android/model/GuideLocale;Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "sendArticleStatsView", "Lzendesk/guidekit/android/model/GuideArticle;", "getArticle-BWLJW6A", "getArticle", "Lzendesk/guidekit/android/model/Brand;", "fetchBrandFromInMemory-IoAF18A", "(Lx70/c;)Ljava/lang/Object;", "fetchBrandFromInMemory", "Lzendesk/guidekit/android/internal/rest/HelpCenterApi;", "Lzendesk/guidekit/android/internal/rest/BrandsApi;", "Lzendesk/guidekit/android/internal/data/ArticleInMemoryDataSource;", "Lzendesk/guidekit/android/internal/data/BrandsInMemoryDataSource;", "Lzendesk/guidekit/android/model/GuideKitSettings;", "Lv80/i1;", "initJob", "Lv80/i1;", "Companion", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class GuideKitRepository {

    @NotNull
    private static final String LOG_TAG = "GuideKitRepository";

    @NotNull
    private final ArticleInMemoryDataSource articleInMemoryDataSource;

    @NotNull
    private final BrandsApi brandsApi;

    @NotNull
    private final BrandsInMemoryDataSource brandsInMemoryDataSource;

    @NotNull
    private final GuideKitSettings guideKitSettings;

    @NotNull
    private final HelpCenterApi helpCenterApi;

    @NotNull
    private final i1 initJob;

    public GuideKitRepository(@NotNull HelpCenterApi helpCenterApi, @NotNull BrandsApi brandsApi, @NotNull ArticleInMemoryDataSource articleInMemoryDataSource, @NotNull BrandsInMemoryDataSource brandsInMemoryDataSource, @NotNull GuideKitSettings guideKitSettings, @NotNull b0 b0Var) {
        helpCenterApi.getClass();
        brandsApi.getClass();
        articleInMemoryDataSource.getClass();
        brandsInMemoryDataSource.getClass();
        guideKitSettings.getClass();
        b0Var.getClass();
        this.helpCenterApi = helpCenterApi;
        this.brandsApi = brandsApi;
        this.articleInMemoryDataSource = articleInMemoryDataSource;
        this.brandsInMemoryDataSource = brandsInMemoryDataSource;
        this.guideKitSettings = guideKitSettings;
        this.initJob = f0.B(b0Var, null, null, new GuideKitRepository$initJob$1(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063 A[Catch: Exception -> 0x002e, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x002a, B:29:0x005f, B:31:0x0063, B:33:0x0066, B:19:0x0037, B:25:0x0049, B:22:0x003e), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066 A[Catch: Exception -> 0x002e, TRY_LEAVE, TryCatch #0 {Exception -> 0x002e, blocks: (B:13:0x002a, B:29:0x005f, B:31:0x0063, B:33:0x0066, B:19:0x0037, B:25:0x0049, B:22:0x003e), top: B:40:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: fetchBrandFromInMemory-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m997fetchBrandFromInMemoryIoAF18A(@org.jetbrains.annotations.NotNull x70.c<? super u70.q<zendesk.guidekit.android.model.Brand>> r7) throws java.lang.Exception {
        /*
            r6 = this;
            boolean r0 = r7 instanceof zendesk.guidekit.android.internal.data.GuideKitRepository$fetchBrandFromInMemory$1
            if (r0 == 0) goto L13
            r0 = r7
            zendesk.guidekit.android.internal.data.GuideKitRepository$fetchBrandFromInMemory$1 r0 = (zendesk.guidekit.android.internal.data.GuideKitRepository$fetchBrandFromInMemory$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.data.GuideKitRepository$fetchBrandFromInMemory$1 r0 = new zendesk.guidekit.android.internal.data.GuideKitRepository$fetchBrandFromInMemory$1
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            java.lang.Object r0 = r0.L$0
            java.lang.String r0 = (java.lang.String) r0
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L2e
            goto L5f
        L2e:
            r7 = move-exception
            goto L73
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r7)
            r7 = 0
            return r7
        L37:
            ba0.g.M(r7)     // Catch: java.lang.Exception -> L2e
            goto L49
        L3b:
            ba0.g.M(r7)
            v80.i1 r7 = r6.initJob     // Catch: java.lang.Exception -> L2e
            r0.label = r4     // Catch: java.lang.Exception -> L2e
            java.lang.Object r7 = r7.B(r0)     // Catch: java.lang.Exception -> L2e
            if (r7 != r1) goto L49
            goto L5b
        L49:
            zendesk.guidekit.android.model.GuideKitSettings r7 = r6.guideKitSettings     // Catch: java.lang.Exception -> L2e
            java.lang.String r7 = r7.getChannelId$zendesk_guidekit_guidekit_android()     // Catch: java.lang.Exception -> L2e
            zendesk.guidekit.android.internal.data.BrandsInMemoryDataSource r2 = r6.brandsInMemoryDataSource     // Catch: java.lang.Exception -> L2e
            r0.L$0 = r7     // Catch: java.lang.Exception -> L2e
            r0.label = r3     // Catch: java.lang.Exception -> L2e
            java.lang.Object r0 = r2.getBrand(r7, r0)     // Catch: java.lang.Exception -> L2e
            if (r0 != r1) goto L5c
        L5b:
            return r1
        L5c:
            r5 = r0
            r0 = r7
            r7 = r5
        L5f:
            zendesk.guidekit.android.model.Brand r7 = (zendesk.guidekit.android.model.Brand) r7     // Catch: java.lang.Exception -> L2e
            if (r7 == 0) goto L66
            u70.o r0 = u70.q.f40850b     // Catch: java.lang.Exception -> L2e
            return r7
        L66:
            u70.o r7 = u70.q.f40850b     // Catch: java.lang.Exception -> L2e
            zendesk.guidekit.android.exception.BrandNotFoundException r7 = new zendesk.guidekit.android.exception.BrandNotFoundException     // Catch: java.lang.Exception -> L2e
            r7.<init>(r0)     // Catch: java.lang.Exception -> L2e
            u70.p r0 = new u70.p     // Catch: java.lang.Exception -> L2e
            r0.<init>(r7)     // Catch: java.lang.Exception -> L2e
            return r0
        L73:
            boolean r0 = r7 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L7f
            u70.o r0 = u70.q.f40850b
            u70.p r0 = new u70.p
            r0.<init>(r7)
            return r0
        L7f:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.GuideKitRepository.m997fetchBrandFromInMemoryIoAF18A(x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: getArticle-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m998getArticleBWLJW6A(long r12, @org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.GuideLocale r14, @org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<zendesk.guidekit.android.model.GuideArticle>> r16) {
        /*
            r11 = this;
            r0 = r16
            boolean r1 = r0 instanceof zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$1
            if (r1 == 0) goto L15
            r1 = r0
            zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$1 r1 = (zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$1) r1
            int r2 = r1.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.label = r2
            goto L1a
        L15:
            zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$1 r1 = new zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$1
            r1.<init>(r11, r0)
        L1a:
            java.lang.Object r0 = r1.result
            y70.a r9 = y70.a.COROUTINE_SUSPENDED
            int r2 = r1.label
            r10 = 1
            if (r2 == 0) goto L30
            if (r2 != r10) goto L29
            ba0.g.M(r0)
            goto L46
        L29:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r0)
            r0 = 0
            return r0
        L30:
            ba0.g.M(r0)
            zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$2 r2 = new zendesk.guidekit.android.internal.data.GuideKitRepository$getArticle$2
            r8 = 0
            r3 = r11
            r4 = r12
            r6 = r14
            r7 = r15
            r2.<init>(r3, r4, r6, r7, r8)
            r1.label = r10
            java.lang.Object r0 = v80.f0.H(r2, r1)
            if (r0 != r9) goto L46
            return r9
        L46:
            u70.q r0 = (u70.q) r0
            java.lang.Object r0 = r0.f40851a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.GuideKitRepository.m998getArticleBWLJW6A(long, zendesk.guidekit.android.model.GuideLocale, java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: sendArticleStatsView-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m999sendArticleStatsViewBWLJW6A(long r8, @org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.GuideLocale r10, @org.jetbrains.annotations.NotNull java.lang.String r11, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<kotlin.Unit>> r12) throws java.lang.Exception {
        /*
            r7 = this;
            boolean r0 = r12 instanceof zendesk.guidekit.android.internal.data.GuideKitRepository$sendArticleStatsView$1
            if (r0 == 0) goto L14
            r0 = r12
            zendesk.guidekit.android.internal.data.GuideKitRepository$sendArticleStatsView$1 r0 = (zendesk.guidekit.android.internal.data.GuideKitRepository$sendArticleStatsView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            zendesk.guidekit.android.internal.data.GuideKitRepository$sendArticleStatsView$1 r0 = new zendesk.guidekit.android.internal.data.GuideKitRepository$sendArticleStatsView$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r4.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L33
            if (r1 != r2) goto L2c
            ba0.g.M(r12)     // Catch: java.lang.Exception -> L29
            goto L64
        L29:
            r0 = move-exception
            r8 = r0
            goto L69
        L2c:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L33:
            ba0.g.M(r12)
            java.lang.String r10 = r10.getLocale()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r11)
            java.lang.String r11 = "/api/v2/help_center/"
            r12.append(r11)
            r12.append(r10)
            java.lang.String r10 = "/articles/"
            r12.append(r10)
            java.lang.String r10 = "/stats/view.json"
            java.lang.String r8 = w.a0.j(r8, r10, r12)
            zendesk.guidekit.android.internal.rest.HelpCenterApi r1 = r7.helpCenterApi     // Catch: java.lang.Exception -> L29
            r4.label = r2     // Catch: java.lang.Exception -> L29
            r3 = 0
            r5 = 2
            r6 = 0
            r2 = r8
            java.lang.Object r8 = zendesk.guidekit.android.internal.rest.HelpCenterApi.DefaultImpls.sendArticleStatsView$default(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L29
            if (r8 != r0) goto L64
            return r0
        L64:
            u70.o r8 = u70.q.f40850b
            kotlin.Unit r8 = kotlin.Unit.f26487a
            return r8
        L69:
            boolean r9 = r8 instanceof java.util.concurrent.CancellationException
            if (r9 != 0) goto L75
            u70.o r9 = u70.q.f40850b
            u70.p r9 = new u70.p
            r9.<init>(r8)
            return r9
        L75:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.data.GuideKitRepository.m999sendArticleStatsViewBWLJW6A(long, zendesk.guidekit.android.model.GuideLocale, java.lang.String, x70.c):java.lang.Object");
    }
}
