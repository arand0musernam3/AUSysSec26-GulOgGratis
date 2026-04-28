package zendesk.guidekit.android.internal;

import com.braze.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u70.o;
import u70.p;
import u70.q;
import z70.c;
import z70.e;
import zendesk.guidekit.android.GuideKit;
import zendesk.guidekit.android.internal.data.GuideKitRepository;
import zendesk.guidekit.android.model.GuideArticleUrl;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0012\u0010\u000fJ\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\f2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzendesk/guidekit/android/internal/DefaultGuideKit;", "Lzendesk/guidekit/android/GuideKit;", "Lzendesk/guidekit/android/internal/data/GuideKitRepository;", "guideKitRepository", "<init>", "(Lzendesk/guidekit/android/internal/data/GuideKitRepository;)V", "", Constants.BRAZE_WEBVIEW_URL_EXTRA, "", "articleId", "Lzendesk/guidekit/android/model/GuideLocale;", "guideLocale", "Lu70/q;", "", "sendArticleStatsView-BWLJW6A", "(Ljava/lang/String;JLzendesk/guidekit/android/model/GuideLocale;Lx70/c;)Ljava/lang/Object;", "sendArticleStatsView", "Lzendesk/guidekit/android/model/GuideArticle;", "getArticle-BWLJW6A", "getArticle", "Lzendesk/guidekit/android/model/GuideArticleUrl;", "getGuideArticleLink-IoAF18A", "(Ljava/lang/String;)Ljava/lang/Object;", "getGuideArticleLink", "", "isValidGuideUrl", "(Ljava/lang/String;Lx70/c;)Ljava/lang/Object;", "Lzendesk/guidekit/android/internal/data/GuideKitRepository;", "zendesk.guidekit_guidekit-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultGuideKit implements GuideKit {

    @NotNull
    private final GuideKitRepository guideKitRepository;

    /* JADX INFO: renamed from: zendesk.guidekit.android.internal.DefaultGuideKit$isValidGuideUrl$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.guidekit.android.internal.DefaultGuideKit", f = "DefaultGuideKit.kt", l = {86}, m = "isValidGuideUrl")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(x70.c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DefaultGuideKit.this.isValidGuideUrl(null, this);
        }
    }

    public DefaultGuideKit(@NotNull GuideKitRepository guideKitRepository) {
        guideKitRepository.getClass();
        this.guideKitRepository = guideKitRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // zendesk.guidekit.android.GuideKit
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: getArticle-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo994getArticleBWLJW6A(@org.jetbrains.annotations.NotNull java.lang.String r8, long r9, @org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.GuideLocale r11, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<zendesk.guidekit.android.model.GuideArticle>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof zendesk.guidekit.android.internal.DefaultGuideKit$getArticle$1
            if (r0 == 0) goto L14
            r0 = r12
            zendesk.guidekit.android.internal.DefaultGuideKit$getArticle$1 r0 = (zendesk.guidekit.android.internal.DefaultGuideKit$getArticle$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zendesk.guidekit.android.internal.DefaultGuideKit$getArticle$1 r0 = new zendesk.guidekit.android.internal.DefaultGuideKit$getArticle$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r8 = r12.f40851a
            return r8
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L34:
            ba0.g.M(r12)
            java.lang.String r5 = zendesk.core.android.internal.StringKtxKt.parseUrl(r8)
            zendesk.guidekit.android.internal.data.GuideKitRepository r1 = r7.guideKitRepository
            r6.label = r2
            r2 = r9
            r4 = r11
            java.lang.Object r8 = r1.m998getArticleBWLJW6A(r2, r4, r5, r6)
            if (r8 != r0) goto L48
            return r0
        L48:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.DefaultGuideKit.mo994getArticleBWLJW6A(java.lang.String, long, zendesk.guidekit.android.model.GuideLocale, x70.c):java.lang.Object");
    }

    @Override // zendesk.guidekit.android.GuideKit
    @NotNull
    /* JADX INFO: renamed from: getGuideArticleLink-IoAF18A */
    public Object mo995getGuideArticleLinkIoAF18A(@NotNull String url) {
        url.getClass();
        try {
            o oVar = q.f40850b;
            return GuideArticleUrl.INSTANCE.from(url);
        } catch (Exception e5) {
            o oVar2 = q.f40850b;
            return new p(e5);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // zendesk.guidekit.android.GuideKit
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object isValidGuideUrl(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull x70.c<? super java.lang.Boolean> r6) throws java.lang.Exception {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.guidekit.android.internal.DefaultGuideKit.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.guidekit.android.internal.DefaultGuideKit$isValidGuideUrl$1 r0 = (zendesk.guidekit.android.internal.DefaultGuideKit.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.guidekit.android.internal.DefaultGuideKit$isValidGuideUrl$1 r0 = new zendesk.guidekit.android.internal.DefaultGuideKit$isValidGuideUrl$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2f
            java.lang.Object r5 = r0.L$0
            java.lang.String r5 = (java.lang.String) r5
            ba0.g.M(r6)
            u70.q r6 = (u70.q) r6
            java.lang.Object r6 = r6.f40851a
            goto L46
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L36:
            ba0.g.M(r6)
            zendesk.guidekit.android.internal.data.GuideKitRepository r6 = r4.guideKitRepository
            r0.L$0 = r5
            r0.label = r3
            java.lang.Object r6 = r6.m997fetchBrandFromInMemoryIoAF18A(r0)
            if (r6 != r1) goto L46
            return r1
        L46:
            java.lang.Throwable r0 = u70.q.a(r6)
            if (r0 != 0) goto L5d
            zendesk.guidekit.android.model.Brand r6 = (zendesk.guidekit.android.model.Brand) r6
            zendesk.guidekit.android.model.GuideArticleUrl$Companion r0 = zendesk.guidekit.android.model.GuideArticleUrl.INSTANCE
            java.lang.String r6 = r6.getHostMapping()
            boolean r5 = r0.isValidGuideUrl(r5, r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L5d:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.DefaultGuideKit.isValidGuideUrl(java.lang.String, x70.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // zendesk.guidekit.android.GuideKit
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: sendArticleStatsView-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo996sendArticleStatsViewBWLJW6A(@org.jetbrains.annotations.NotNull java.lang.String r8, long r9, @org.jetbrains.annotations.NotNull zendesk.guidekit.android.model.GuideLocale r11, @org.jetbrains.annotations.NotNull x70.c<? super u70.q<kotlin.Unit>> r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof zendesk.guidekit.android.internal.DefaultGuideKit$sendArticleStatsView$1
            if (r0 == 0) goto L14
            r0 = r12
            zendesk.guidekit.android.internal.DefaultGuideKit$sendArticleStatsView$1 r0 = (zendesk.guidekit.android.internal.DefaultGuideKit$sendArticleStatsView$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            zendesk.guidekit.android.internal.DefaultGuideKit$sendArticleStatsView$1 r0 = new zendesk.guidekit.android.internal.DefaultGuideKit$sendArticleStatsView$1
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.result
            y70.a r0 = y70.a.COROUTINE_SUSPENDED
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            ba0.g.M(r12)
            u70.q r12 = (u70.q) r12
            java.lang.Object r8 = r12.f40851a
            return r8
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r8)
            r8 = 0
            return r8
        L34:
            ba0.g.M(r12)
            java.lang.String r5 = zendesk.core.android.internal.StringKtxKt.parseUrl(r8)
            zendesk.guidekit.android.internal.data.GuideKitRepository r1 = r7.guideKitRepository
            r6.label = r2
            r2 = r9
            r4 = r11
            java.lang.Object r8 = r1.m999sendArticleStatsViewBWLJW6A(r2, r4, r5, r6)
            if (r8 != r0) goto L48
            return r0
        L48:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.guidekit.android.internal.DefaultGuideKit.mo996sendArticleStatsViewBWLJW6A(java.lang.String, long, zendesk.guidekit.android.model.GuideLocale, x70.c):java.lang.Object");
    }
}
