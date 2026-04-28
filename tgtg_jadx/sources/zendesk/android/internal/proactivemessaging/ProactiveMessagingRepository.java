package zendesk.android.internal.proactivemessaging;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v80.b0;
import v80.f0;
import v80.i1;
import y70.a;
import z70.c;
import z70.e;
import zendesk.android.internal.di.ZendeskInitializedComponentScope;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessageJwtDecoder;
import zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessageResponse;
import zendesk.android.internal.proactivemessaging.model.Campaign;
import zendesk.android.internal.proactivemessaging.model.Frequency;
import zendesk.android.settings.internal.SettingsRepository;
import zendesk.conversationkit.android.model.ProactiveMessage;
import zendesk.logger.Logger;

/* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
/* JADX INFO: loaded from: classes3.dex */
@ZendeskInitializedComponentScope
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 92\u00020\u0001:\u00019B1\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0010J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0086@¢\u0006\u0004\b\u0014\u0010\u0010J\u0018\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u001b\u001a\u0004\u0018\u00010\u001a2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020\u001d¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R.\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0000@\u0000X\u0081.¢\u0006\u0018\n\u0004\b)\u0010*\u0012\u0004\b/\u00100\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R.\u00102\u001a\b\u0012\u0004\u0012\u00020\u001d018\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b2\u0010*\u0012\u0004\b5\u00100\u001a\u0004\b3\u0010,\"\u0004\b4\u0010.R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository;", "", "Lzendesk/android/settings/internal/SettingsRepository;", "settingsRepository", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage;", "storage", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder;", "proactiveMessageJwtDecoder", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;", "proactiveMessagingService", "Lv80/b0;", "coroutineScope", "<init>", "(Lzendesk/android/settings/internal/SettingsRepository;Lzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage;Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder;Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;Lv80/b0;)V", "", "initializeFilterOutCampaigns", "(Lx70/c;)Ljava/lang/Object;", "", "Lzendesk/android/internal/proactivemessaging/model/Campaign;", "getLiveCampaigns", "getCampaignsForEvaluation", "campaign", "updateFilterOutCampaigns", "(Lzendesk/android/internal/proactivemessaging/model/Campaign;Lx70/c;)Ljava/lang/Object;", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CampaignPathDto;", "campaignPaths", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/CtsResponseDto;", "getProactiveMessage", "(Ljava/util/List;Lx70/c;)Ljava/lang/Object;", "", "campaignId", "getCampaign", "(Ljava/lang/String;)Lzendesk/android/internal/proactivemessaging/model/Campaign;", "jwt", "Lzendesk/conversationkit/android/model/ProactiveMessage;", "buildProactiveMessage", "(Ljava/lang/String;)Lzendesk/conversationkit/android/model/ProactiveMessage;", "Lzendesk/android/settings/internal/SettingsRepository;", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingStorage;", "Lzendesk/android/internal/proactivemessaging/campaigntriggerservice/model/jwt/ProactiveMessageJwtDecoder;", "Lzendesk/android/internal/proactivemessaging/ProactiveMessagingService;", "campaigns", "Ljava/util/List;", "getCampaigns$zendesk_zendesk_android", "()Ljava/util/List;", "setCampaigns$zendesk_zendesk_android", "(Ljava/util/List;)V", "getCampaigns$zendesk_zendesk_android$annotations", "()V", "", "filterOutCampaigns", "getFilterOutCampaigns$zendesk_zendesk_android", "setFilterOutCampaigns$zendesk_zendesk_android", "getFilterOutCampaigns$zendesk_zendesk_android$annotations", "Lv80/i1;", "initialiseCampaignsJob", "Lv80/i1;", "Companion", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProactiveMessagingRepository.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProactiveMessagingRepository.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,140:1\n774#2:141\n865#2,2:142\n1563#2:144\n1634#2,3:145\n1869#2,2:148\n774#2:150\n865#2,2:151\n774#2:153\n865#2,2:154\n827#2:156\n855#2,2:157\n827#2:159\n855#2,2:160\n295#2,2:162\n*S KotlinDebug\n*F\n+ 1 ProactiveMessagingRepository.kt\nzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository\n*L\n46#1:141\n46#1:142,2\n48#1:144\n48#1:145,3\n49#1:148,2\n65#1:150\n65#1:151,2\n68#1:153\n68#1:154,2\n69#1:156\n69#1:157,2\n84#1:159\n84#1:160,2\n111#1:162,2\n*E\n"})
public final class ProactiveMessagingRepository {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String LOG_TAG = "PM-Repository";
    public List<Campaign> campaigns;

    @NotNull
    private List<String> filterOutCampaigns;

    @NotNull
    private final i1 initialiseCampaignsJob;

    @NotNull
    private final ProactiveMessageJwtDecoder proactiveMessageJwtDecoder;

    @NotNull
    private final ProactiveMessagingService proactiveMessagingService;

    @NotNull
    private final SettingsRepository settingsRepository;

    @NotNull
    private final ProactiveMessagingStorage storage;

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getCampaignsForEvaluation$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository", f = "ProactiveMessagingRepository.kt", l = {82}, m = "getCampaignsForEvaluation")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class AnonymousClass1 extends c {
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
            return ProactiveMessagingRepository.this.getCampaignsForEvaluation(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getLiveCampaigns$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository", f = "ProactiveMessagingRepository.kt", l = {58, 64}, m = "getLiveCampaigns")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01961 extends c {
        int label;
        /* synthetic */ Object result;

        public C01961(x70.c<? super C01961> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveMessagingRepository.this.getLiveCampaigns(this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getProactiveMessage$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository", f = "ProactiveMessagingRepository.kt", l = {100}, m = "getProactiveMessage")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01971 extends c {
        int label;
        /* synthetic */ Object result;

        public C01971(x70.c<? super C01971> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveMessagingRepository.this.getProactiveMessage(null, this);
        }
    }

    /* JADX INFO: renamed from: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$initializeFilterOutCampaigns$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @e(c = "zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository", f = "ProactiveMessagingRepository.kt", l = {49, 51, 54}, m = "initializeFilterOutCampaigns")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class C01981 extends c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C01981(x70.c<? super C01981> cVar) {
            super(cVar);
        }

        @Override // z70.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ProactiveMessagingRepository.this.initializeFilterOutCampaigns(this);
        }
    }

    public ProactiveMessagingRepository(@NotNull SettingsRepository settingsRepository, @NotNull ProactiveMessagingStorage proactiveMessagingStorage, @NotNull ProactiveMessageJwtDecoder proactiveMessageJwtDecoder, @NotNull ProactiveMessagingService proactiveMessagingService, @NotNull b0 b0Var) {
        settingsRepository.getClass();
        proactiveMessagingStorage.getClass();
        proactiveMessageJwtDecoder.getClass();
        proactiveMessagingService.getClass();
        b0Var.getClass();
        this.settingsRepository = settingsRepository;
        this.storage = proactiveMessagingStorage;
        this.proactiveMessageJwtDecoder = proactiveMessageJwtDecoder;
        this.proactiveMessagingService = proactiveMessagingService;
        this.filterOutCampaigns = new ArrayList();
        this.initialiseCampaignsJob = f0.B(b0Var, null, null, new ProactiveMessagingRepository$initialiseCampaignsJob$1(this, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006d, code lost:
    
        if (r6 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getLiveCampaigns(x70.c<? super java.util.List<zendesk.android.internal.proactivemessaging.model.Campaign>> r6) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.getLiveCampaigns(x70.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object initializeFilterOutCampaigns(x70.c<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.initializeFilterOutCampaigns(x70.c):java.lang.Object");
    }

    @Nullable
    public final ProactiveMessage buildProactiveMessage(@NotNull String jwt) {
        List<zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessage> messages;
        zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessage proactiveMessage;
        jwt.getClass();
        try {
            ProactiveMessageResponse proactiveMessageResponseDecode = this.proactiveMessageJwtDecoder.decode(jwt);
            if (proactiveMessageResponseDecode == null || (messages = proactiveMessageResponseDecode.getMessages()) == null || (proactiveMessage = (zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.jwt.ProactiveMessage) CollectionsKt.firstOrNull(messages)) == null) {
                Logger.e(LOG_TAG, "Proactive message response doesn't contain enough information", new Object[0]);
                return null;
            }
            String displayName = proactiveMessage.getAuthor().getDisplayName();
            String text = proactiveMessage.getContent().getText();
            String id2 = proactiveMessageResponseDecode.getCampaign().getId();
            Campaign campaign = getCampaign(proactiveMessageResponseDecode.getCampaign().getId());
            return new ProactiveMessage(0, displayName, text, id2, campaign != null ? campaign.getVersion() : 0, jwt, 1, (DefaultConstructorMarker) null);
        } catch (Exception e5) {
            Logger.e(LOG_TAG, "Failed to build local notification", e5, new Object[0]);
            return null;
        }
    }

    @Nullable
    public final Campaign getCampaign(@NotNull String campaignId) {
        Object next;
        campaignId.getClass();
        Iterator<T> it = getCampaigns$zendesk_zendesk_android().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Campaign) next).getCampaignId(), campaignId)) {
                break;
            }
        }
        return (Campaign) next;
    }

    @NotNull
    public final List<Campaign> getCampaigns$zendesk_zendesk_android() {
        List<Campaign> list = this.campaigns;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("campaigns");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getCampaignsForEvaluation(@org.jetbrains.annotations.NotNull x70.c<? super java.util.List<zendesk.android.internal.proactivemessaging.model.Campaign>> r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r5
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getCampaignsForEvaluation$1 r0 = (zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getCampaignsForEvaluation$1 r0 = new zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getCampaignsForEvaluation$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            ba0.g.M(r5)
            goto L3c
        L27:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
            r5 = 0
            return r5
        L2e:
            ba0.g.M(r5)
            v80.i1 r5 = r4.initialiseCampaignsJob
            r0.label = r3
            java.lang.Object r5 = r5.B(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            java.util.List r5 = r4.getCampaigns$zendesk_zendesk_android()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L49:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L66
            java.lang.Object r1 = r5.next()
            r2 = r1
            zendesk.android.internal.proactivemessaging.model.Campaign r2 = (zendesk.android.internal.proactivemessaging.model.Campaign) r2
            java.util.List<java.lang.String> r3 = r4.filterOutCampaigns
            java.lang.String r2 = r2.getCampaignId()
            boolean r2 = r3.contains(r2)
            if (r2 != 0) goto L49
            r0.add(r1)
            goto L49
        L66:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.getCampaignsForEvaluation(x70.c):java.lang.Object");
    }

    @NotNull
    public final List<String> getFilterOutCampaigns$zendesk_zendesk_android() {
        return this.filterOutCampaigns;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object getProactiveMessage(@org.jetbrains.annotations.NotNull java.util.List<zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CampaignPathDto> r5, @org.jetbrains.annotations.NotNull x70.c<? super zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsResponseDto> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.C01971
            if (r0 == 0) goto L13
            r0 = r6
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getProactiveMessage$1 r0 = (zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.C01971) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getProactiveMessage$1 r0 = new zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository$getProactiveMessage$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            y70.a r1 = y70.a.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ba0.g.M(r6)     // Catch: java.lang.Exception -> L27
            goto L43
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            com.braze.h2.b(r5)
        L2e:
            r5 = 0
            return r5
        L30:
            ba0.g.M(r6)
            zendesk.android.internal.proactivemessaging.ProactiveMessagingService r6 = r4.proactiveMessagingService     // Catch: java.lang.Exception -> L27
            zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsRequestDto r2 = new zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsRequestDto     // Catch: java.lang.Exception -> L27
            r2.<init>(r5)     // Catch: java.lang.Exception -> L27
            r0.label = r3     // Catch: java.lang.Exception -> L27
            java.lang.Object r6 = r6.getProactiveMessage(r2, r0)     // Catch: java.lang.Exception -> L27
            if (r6 != r1) goto L43
            return r1
        L43:
            zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsResponseDto r6 = (zendesk.android.internal.proactivemessaging.campaigntriggerservice.model.CtsResponseDto) r6     // Catch: java.lang.Exception -> L27
            return r6
        L46:
            r6 = 0
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r0 = "PM-Repository"
            java.lang.String r1 = "Failed to get proactive message"
            zendesk.logger.Logger.e(r0, r1, r5, r6)
            goto L2e
        */
        throw new UnsupportedOperationException("Method not decompiled: zendesk.android.internal.proactivemessaging.ProactiveMessagingRepository.getProactiveMessage(java.util.List, x70.c):java.lang.Object");
    }

    public final void setCampaigns$zendesk_zendesk_android(@NotNull List<Campaign> list) {
        list.getClass();
        this.campaigns = list;
    }

    public final void setFilterOutCampaigns$zendesk_zendesk_android(@NotNull List<String> list) {
        list.getClass();
        this.filterOutCampaigns = list;
    }

    @Nullable
    public final Object updateFilterOutCampaigns(@NotNull Campaign campaign, @NotNull x70.c<? super Unit> cVar) throws Throwable {
        if (campaign.getSchedule().getFrequency() == Frequency.ONCE_PER_SESSION) {
            this.filterOutCampaigns.add(campaign.getCampaignId());
        } else if (campaign.getSchedule().getFrequency() == Frequency.SEND_ONCE) {
            this.filterOutCampaigns.add(campaign.getCampaignId());
            Object objAddSendOnceCampaign = this.storage.addSendOnceCampaign(campaign.getCampaignId(), cVar);
            return objAddSendOnceCampaign == a.COROUTINE_SUSPENDED ? objAddSendOnceCampaign : Unit.f26487a;
        }
        return Unit.f26487a;
    }

    /* JADX INFO: compiled from: r8-map-id-bad8e3e1b75e2d3fd72c92f1b960553adb24fef824cc9e98cee450b85845d4c2 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lzendesk/android/internal/proactivemessaging/ProactiveMessagingRepository$Companion;", "", "<init>", "()V", "LOG_TAG", "", "zendesk_zendesk-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public static /* synthetic */ void getCampaigns$zendesk_zendesk_android$annotations() {
    }

    public static /* synthetic */ void getFilterOutCampaigns$zendesk_zendesk_android$annotations() {
    }
}
